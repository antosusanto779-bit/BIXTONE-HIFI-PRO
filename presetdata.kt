object PresetData {
 data class Preset(
  val name: String, // Nama Standar Universal
  val style: String, // Style / Inspired by
  val useCase: String, // Penggunaan universal
  val desc: String
 )

 val list = listOf(
  Preset("Live Concert", "Style: Live Stage Legend", "For Dangdut, Koplo, Horeg", "High energy, bass boosted, loud"),
  Preset("Studio Vocal", "Style: Studio Classic", "For Karaoke, Recording", "Vocal forward, clear mid, airy high"),
  Preset("Bass Boost", "Style: Sub Horeg", "For DJ, Party Box", "Deep bass 60Hz, for 12/15/18 inch"),
  Preset("Acoustic Natural", "Style: Flat Reference", "For Acoustic, Kopi Sore", "Natural, flat, no color"),
  Preset("Speech Clarity", "Style: Radio Console", "For Ngaji, Pidato, Podcast", "Mid focused, noise gate on, -23 LUFS"),
  Preset("Worship Warm", "Style: Tower System", "For Hadroh, Sholawat, Masjid", "Warm, soft bass, clear vocal"),
  Preset("Dance Club", "Style: Club Master", "For Koplo Banteng, DJ", "Loud -6 LUFS, punchy"),
  Preset("Outdoor Festival", "Style: Line Array Pro", "For Hajatan Lapangan, Balai Desa", "Long throw, mid lantang, anti feedback"),
  Preset("HiFi Streaming", "Style: Spotify -14 LUFS", "For YouTube, Streaming", "Most HiFi, balanced, 24-bit output"),
  Preset("Warm Analog", "Style: Tape Machine", "For Dangdut Lawas, Vintage", "Warm analog, vinyl style"),
  Preset("Custom 1", "Style: custom 1", "For User Tuned 1", "User can save own EQ"),
  Preset("Custom 2", "Style: custom 2", "For User Tuned 2", "User can save own EQ")
 )
}
