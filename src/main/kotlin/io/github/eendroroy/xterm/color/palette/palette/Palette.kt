package io.github.eendroroy.xterm.color.palette.palette

interface Palette {
    fun generate(): Map<Int, String>
}