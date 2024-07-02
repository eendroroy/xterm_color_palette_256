package io.github.eendroroy.xterm.color.palette.palette.rgb

import io.github.eendroroy.xterm.color.palette.color.ColorTable
import io.github.eendroroy.xterm.color.palette.color.RGB
import io.github.eendroroy.xterm.color.palette.palette.Palette
import java.awt.Color

class RgbPaletteRed : Palette {
    override fun generate(): Map<Int, String> {
        return ColorTable.COLOR_STEPS_ASC
            .asSequence()
            .map { RGB(it, ColorTable.DARKEST, ColorTable.DARKEST) }
            .plus(
                ColorTable.COLOR_STEPS_ASC
                    .map { RGB(ColorTable.BRIGHTEST, it, it) }
            )
            .map { it.toString() }
            .map { ColorTable.COLOR_REVERSE_LOOKUP[it]!! to it }
            .toList()
            .toMap()
    }
}