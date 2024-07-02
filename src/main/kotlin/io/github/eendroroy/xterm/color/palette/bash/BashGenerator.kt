package io.github.eendroroy.xterm.color.palette.bash

import io.github.eendroroy.xterm.color.palette.palette.Palette
import java.io.File

class BashGenerator(private val palettes: List<Palette>) {
    private fun generate(): String {
        return palettes.joinToString("\necho\n") { palette ->
            palette.generate().let { tableData ->
                val rgbF = tableData.entries.joinToString("\n") {
                    "printf \"\\033[38;5;${it.key}m ${it.value} \\033[0m\""
                }
                val indexF = tableData.entries.joinToString("\n") {
                    "printf \"\\033[38;5;${it.key}m ${it.key.toString().padStart(6, ' ')} \\033[0m\""
                }

                val rgbB = tableData.entries.joinToString("\n") {
                    "printf \"\\033[48;5;${it.key}m ${it.value} \\033[0m\""
                }
                val indexB = tableData.entries.joinToString("\n") {
                    "printf \"\\033[48;5;${it.key}m ${it.key.toString().padStart(6, ' ')} \\033[0m\""
                }

                """$rgbF
                |echo
                |$indexF
                |echo
                |$rgbB
                |echo
                |$indexB
            """.trimMargin()
            }

        }.let {
            """
            |#!/usr/bin/env bash   
            |
            |$it
            |echo
            """.trimMargin()
        }
    }

    fun print() {
        println(generate())
    }

    fun saveAsFile(file: String) {
        File(file).writer().apply {
            write(generate())
            flush()
            close()
        }
    }
}