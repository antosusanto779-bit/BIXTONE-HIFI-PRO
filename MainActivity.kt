package com.bixtone.hifi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { BixtoneApp() }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BixtoneApp() {
    var eqMode by remember { mutableStateOf("30 Band") } // 10 / 20 / 30
    var selectedMic by remember { mutableStateOf(MicData.list[0]) }
    var selectedMixer by remember { mutableStateOf(MixerData.list[0]) }
    var selectedSpeaker by remember { mutableStateOf(SpeakerData.list[0]) }
    var selectedPreset by remember { mutableStateOf(PresetData.list[8]) } // Default HiFi Streaming
    var selectedMaster by remember { mutableStateOf(MasterData.list[0]) }

    Scaffold(
        topBar = { TopAppBar(title = { Text("BIXTONE-HIFI-PRO - Bixlabs Boyolali") }) }
    ) { pad ->
        LazyColumn(modifier = Modifier.padding(pad).padding(16.dp)) {
            
            item {
                Text("CHAIN: Input -> Gate -> PreAmp -> EQ -> Vocal FX -> Mixer -> Mastering -> HiFi Out", style = MaterialTheme.typography.labelSmall)
                Spacer(Modifier.height(12.dp))
                
                Text("EQ Mode (Standar Universal)", style = MaterialTheme.typography.titleMedium)
                Row {
                    listOf("10 Band", "20 Band", "30 Band").forEach {
                        FilterChip(selected = eqMode==it, onClick = { eqMode=it }, label = { Text(it) }, modifier = Modifier.padding(end=8.dp))
                    }
                }
                Text("Active: $eqMode HiFi 24-bit", color = MaterialTheme.colorScheme.primary)
                Divider(Modifier.padding(vertical=12.dp))
            }

            item { Text("MIC 10 - Style / Inspired by", style = MaterialTheme.typography.titleMedium) }
            items(MicData.list) { mic ->
                ElevatedCard(modifier = Modifier.fillMaxWidth().padding(vertical=4.dp), onClick = { selectedMic = mic }) {
                    Column(Modifier.padding(12.dp)) {
                        Text("${mic.type} - ${mic.style}", style = MaterialTheme.typography.titleSmall)
                        Text("${mic.inspiredBy} - ${mic.desc}", style = MaterialTheme.typography.bodySmall)
                    }
                }
            }

            item { 
                Spacer(Modifier.height(12.dp))
                Text("MIXER 8 - Style Universal", style = MaterialTheme.typography.titleMedium) 
            }
            items(MixerData.list) { mix ->
                Card(Modifier.fillMaxWidth().padding(vertical=4.dp)) {
                    Column(Modifier.padding(12.dp)) {
                        Text("${mix.type} - ${mix.style}")
                        Text("${mix.inspiredBy} - ${mix.desc}", style = MaterialTheme.typography.bodySmall)
                    }
                }
            }

            item { 
                Spacer(Modifier.height(12.dp))
                Text("PRESET 12 - Standar Universal", style = MaterialTheme.typography.titleMedium) 
            }
            items(PresetData.list) { pre ->
                Card(Modifier.fillMaxWidth().padding(vertical=4.dp), colors = CardDefaults.cardColors(containerColor = if(pre==selectedPreset) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surfaceVariant)) {
                    Column(Modifier.padding(12.dp)) {
                        Text(pre.name, style = MaterialTheme.typography.titleSmall)
                        Text("${pre.style} | ${pre.useCase}", style = MaterialTheme.typography.bodySmall)
                        Text(pre.desc, style = MaterialTheme.typography.labelSmall)
                    }
                }
            }

            item {
                Spacer(Modifier.height(12.dp))
                Text("SPEAKER 12 + MASTERING 8", style = MaterialTheme.typography.titleMedium)
                Text("Speaker: ${selectedSpeaker.type} - ${selectedSpeaker.style}")
                Text("Mastering: ${selectedMaster.type} - ${selectedMaster.style} - ${selectedMaster.lufs}")
                Spacer(Modifier.height(16.dp))
                Button(onClick = { /* TODO: Process Audio Chain to HiFi 24-bit Output */ }, modifier = Modifier.fillMaxWidth()) {
                    Text("PROCESS TO HiFi 24-BIT OUT - ${selectedPreset.name}")
                }
                Text("Output: ${selectedMaster.lufs} | EQ: $eqMode | Mic: ${selectedMic.style}", style = MaterialTheme.typography.labelSmall)
            }
        }
    }
}
