object MicData {
 data class Mic(val type: String, val style: String, val inspiredBy: String, val desc: String)
 val list = listOf(
  Mic("Dynamic Vocal", "Live Stage Legend", "Inspired by SM58", "Tebal, anti feedback, buat hajatan"),
  Mic("Dynamic Vocal", "Broadcast Pro", "Inspired by SM7B", "Vokal radio, podcast"),
  Mic("Condenser Studio", "Gold Studio", "Inspired by BM800", "Jernih, buat rekaman"),
  Mic("Condenser Large", "Studio Classic", "Inspired by U87", "Vokal mahal, airy"),
  Mic("Headset HP", "Mobile Mic", "Style: Mobile Mic", "Buat HP biasa"),
  Mic("Clip Wireless", "Lavalier Pro", "Style: Lavalier Pro", "Buat ceramah"),
  Mic("Shotgun", "Video Mic", "Style: Video Mic", "Buat YouTube"),
  Mic("Ribbon", "Vintage Warm", "Style: Vintage Warm", "Suara hangat analog"),
  Mic("USB Podcast", "Gamer Mic", "Style: Gamer Mic", "Buat live streaming"),
  Mic("Custom", "User Tuned", "Style: User Tuned", "Setting manual")
 )
}
