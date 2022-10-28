package dev.tricht.gamesense.model

data class SongInformation(
    val fullSongName: String
) {
    if (length(fullSongName.split(" - ")[0]) >= 12) {
        private val artistText = ScrollingText(fullSongName.split(" - ")[0] + "      ")
    }
    else {
        private val artistText = ScrollingText(fullSongName.split(" - ")[0])
    }
    if (length(fullSongName.split(" - ")[1]) >= 12) {
        private val songText = ScrollingText(fullSongName.split(" - ")[1] + "        ")
    }
    else {
        private val songText = ScrollingText(fullSongName.split(" - ")[1])
    }
    fun artist() = artistText.text
    fun song() = songText.text
}
