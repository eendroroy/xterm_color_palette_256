package io.github.eendroroy.xterm.color.palette.color

class RGB(var red: Int, var green: Int, var blue: Int) {
    constructor(red: String, green: String, blue: String) : this(red.toInt(16), green.toInt(16), blue.toInt(16))

    override fun toString(): String {
        return listOf(
            this.red.toString(16).padStart(2, '0'),
            this.green.toString(16).padStart(2, '0'),
            this.blue.toString(16).padStart(2, '0'),
        ).joinToString("")
    }
}