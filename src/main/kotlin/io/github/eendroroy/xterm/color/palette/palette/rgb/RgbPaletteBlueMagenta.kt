package io.github.eendroroy.xterm.color.palette.palette.rgb

import io.github.eendroroy.xterm.color.palette.color.ColorTable
import io.github.eendroroy.xterm.color.palette.color.RGB
import io.github.eendroroy.xterm.color.palette.palette.Palette

class RgbPaletteBlueMagenta : Palette {
    override fun generate(): Map<Int, String> {
        return ColorTable.COLOR_STEPS_ASC
            .asSequence()
            .map { RGB(it, it, ColorTable.BRIGHTEST) }
            .plus(
                ColorTable.COLOR_STEPS_DESC
                    .map { RGB(ColorTable.BRIGHTEST, it, ColorTable.BRIGHTEST) }
            )
            .map { it.toString() }
            .map { ColorTable.COLOR_REVERSE_LOOKUP[it]!! to it }
            .toList()
            .toMap()
    }
}