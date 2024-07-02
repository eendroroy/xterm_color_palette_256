package io.github.eendroroy.xterm.color.palette.palette.rgb

import io.github.eendroroy.xterm.color.palette.color.ColorTable
import io.github.eendroroy.xterm.color.palette.color.RGB
import io.github.eendroroy.xterm.color.palette.palette.Palette

class RgbPaletteGreenPasteBlue : Palette {
    override fun generate(): Map<Int, String> {
        return ColorTable.COLOR_STEPS_ASC
            .asSequence()
            .map { RGB(ColorTable.DARKEST, it, ColorTable.DARKEST) }
            .plus(
                ColorTable.COLOR_STEPS_ASC
                    .map { RGB(ColorTable.DARKEST,ColorTable.BRIGHTEST, it) }
            )
            .plus(
                ColorTable.COLOR_STEPS_ASC
                    .map { RGB(it, ColorTable.BRIGHTEST, ColorTable.BRIGHTEST) }
            )
            .map { it.toString() }
            .map { ColorTable.COLOR_REVERSE_LOOKUP[it]!! to it }
            .toList()
            .toMap()
    }
}