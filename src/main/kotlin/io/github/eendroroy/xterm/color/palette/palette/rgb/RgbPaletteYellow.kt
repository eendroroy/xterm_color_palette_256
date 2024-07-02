package io.github.eendroroy.xterm.color.palette.palette.rgb

import io.github.eendroroy.xterm.color.palette.color.ColorTable
import io.github.eendroroy.xterm.color.palette.color.RGB
import io.github.eendroroy.xterm.color.palette.palette.Palette
import java.awt.Color

class RgbPaletteYellow : Palette {
    override fun generate(): Map<Int, String> {
        return ColorTable.COLOR_STEPS_DESC
            .asSequence()
            .map { RGB(ColorTable.BRIGHTEST, ColorTable.BRIGHTEST, it) }
            .plus(
                ColorTable.COLOR_STEPS_DESC
                    .map { RGB(it, it, ColorTable.DARKEST) }
            )
            .map { it.toString() }
            .map { ColorTable.COLOR_REVERSE_LOOKUP[it]!! to it }
            .toList()
            .reversed()
            .toMap()
    }
}