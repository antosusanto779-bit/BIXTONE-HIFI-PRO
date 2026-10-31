object MasterData {
 data class Master(val type: String, val style: String, val lufs: String, val desc: String)
 val list = listOf(
  Master("HiFi Streaming", "Spotify", "-14 LUFS", "Buat YouTube (Paling HiFi)"),
  Master("CD Loud", "CD Master", "-9 LUFS", "Buat hajatan keras"),
  Master("Broadcast", "Radio", "-23 LUFS", "Buat ceramah jelas"),
  Master("Warm Analog", "Tape Machine", "Analog", "Suara hangat vinyl"),
  Master("Ultra Loud", "Club Master", "-6 LUFS", "Buat sound horeg"),
  Master("Acoustic", "Natural", "Dynamic", "Dinamis, tidak di-compress"),
  Master("Podcast Voice", "Voice Enhance", "Voice", "Vokal di depan"),
  Master("Custom Manual", "Manual Pro", "Manual", "Atur sendiri compressor/limiter")
 )
}
