package io.github.eendroroy.xterm.color.palette

import io.github.eendroroy.xterm.color.palette.bash.BashGenerator
import io.github.eendroroy.xterm.color.palette.palette.rgb.*

fun main() {
    BashGenerator(
        listOf(
            RgbPaletteRed(),
            RgbPaletteGreen(),
            RgbPaletteBlue(),
            RgbPaletteYellow(),
            RgbPalettePurple(),
            RgbPaletteCyan(),
            RgbPaletteRedYellow(),
            RgbPaletteGreenBlue(),
            RgbPaletteBlueMagenta(),
            RgbPaletteRedOrangeYellow(),
            RgbPaletteGreenPasteBlue(),
            RgbPaletteBlue3(),
        )
    ).also {
        it.print()
    }
}