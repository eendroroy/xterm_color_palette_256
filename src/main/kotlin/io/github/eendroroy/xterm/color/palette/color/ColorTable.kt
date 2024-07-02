package io.github.eendroroy.xterm.color.palette.color

object ColorTable {
    const val DARKEST = "00"
    const val BRIGHTEST = "FF"

    val RGB_GREEN = RGB(green = BRIGHTEST.toInt(16), blue = DARKEST.toInt(16), red = DARKEST.toInt(16))
    val RGB_BLUE = RGB(green = DARKEST.toInt(16), blue = BRIGHTEST.toInt(16), red = DARKEST.toInt(16))
    val RGB_RED = RGB(green = DARKEST.toInt(16), blue = DARKEST.toInt(16), red = BRIGHTEST.toInt(16))

    val COLOR_LOOKUP = mapOf(
        0 to "000000", 1 to "800000", 2 to "008000", 3 to "808000", 4 to "000080", 5 to "800080",
        6 to "008080", 7 to "c0c0c0", 8 to "808080", 9 to "ff0000", 10 to "00ff00", 11 to "ffff00",
        12 to "0000ff", 13 to "ff00ff", 14 to "00ffff", 15 to "ffffff",

         16 to "000000",  17 to "00005f",  18 to "000087",  19 to "0000af",  20 to "0000d7",  21 to "0000ff",
         22 to "005f00",  23 to "005f5f",  24 to "005f87",  25 to "005faf",  26 to "005fd7",  27 to "005fff",
         28 to "008700",  29 to "00875f",  30 to "008787",  31 to "0087af",  32 to "0087d7",  33 to "0087ff",
         34 to "00af00",  35 to "00af5f",  36 to "00af87",  37 to "00afaf",  38 to "00afd7",  39 to "00afff",
         40 to "00d700",  41 to "00d75f",  42 to "00d787",  43 to "00d7af",  44 to "00d7d7",  45 to "00d7ff",
         46 to "00ff00",  47 to "00ff5f",  48 to "00ff87",  49 to "00ffaf",  50 to "00ffd7",  51 to "00ffff",
         52 to "5f0000",  53 to "5f005f",  54 to "5f0087",  55 to "5f00af",  56 to "5f00d7",  57 to "5f00ff",
         58 to "5f5f00",  59 to "5f5f5f",  60 to "5f5f87",  61 to "5f5faf",  62 to "5f5fd7",  63 to "5f5fff",
         64 to "5f8700",  65 to "5f875f",  66 to "5f8787",  67 to "5f87af",  68 to "5f87d7",  69 to "5f87ff",
         70 to "5faf00",  71 to "5faf5f",  72 to "5faf87",  73 to "5fafaf",  74 to "5fafd7",  75 to "5fafff",
         76 to "5fd700",  77 to "5fd75f",  78 to "5fd787",  79 to "5fd7af",  80 to "5fd7d7",  81 to "5fd7ff",
         82 to "5fff00",  83 to "5fff5f",  84 to "5fff87",  85 to "5fffaf",  86 to "5fffd7",  87 to "5fffff",
         88 to "870000",  89 to "87005f",  90 to "870087",  91 to "8700af",  92 to "8700d7",  93 to "8700ff",
         94 to "875f00",  95 to "875f5f",  96 to "875f87",  97 to "875faf",  98 to "875fd7",  99 to "875fff",
        100 to "878700", 101 to "87875f", 102 to "878787", 103 to "8787af", 104 to "8787d7", 105 to "8787ff",
        106 to "87af00", 107 to "87af5f", 108 to "87af87", 109 to "87afaf", 110 to "87afd7", 111 to "87afff",
        112 to "87d700", 113 to "87d75f", 114 to "87d787", 115 to "87d7af", 116 to "87d7d7", 117 to "87d7ff",
        118 to "87ff00", 119 to "87ff5f", 120 to "87ff87", 121 to "87ffaf", 122 to "87ffd7", 123 to "87ffff",
        124 to "af0000", 125 to "af005f", 126 to "af0087", 127 to "af00af", 128 to "af00d7", 129 to "af00ff",
        130 to "af5f00", 131 to "af5f5f", 132 to "af5f87", 133 to "af5faf", 134 to "af5fd7", 135 to "af5fff",
        136 to "af8700", 137 to "af875f", 138 to "af8787", 139 to "af87af", 140 to "af87d7", 141 to "af87ff",
        142 to "afaf00", 143 to "afaf5f", 144 to "afaf87", 145 to "afafaf", 146 to "afafd7", 147 to "afafff",
        148 to "afd700", 149 to "afd75f", 150 to "afd787", 151 to "afd7af", 152 to "afd7d7", 153 to "afd7ff",
        154 to "afff00", 155 to "afff5f", 156 to "afff87", 157 to "afffaf", 158 to "afffd7", 159 to "afffff",
        160 to "d70000", 161 to "d7005f", 162 to "d70087", 163 to "d700af", 164 to "d700d7", 165 to "d700ff",
        166 to "d75f00", 167 to "d75f5f", 168 to "d75f87", 169 to "d75faf", 170 to "d75fd7", 171 to "d75fff",
        172 to "d78700", 173 to "d7875f", 174 to "d78787", 175 to "d787af", 176 to "d787d7", 177 to "d787ff",
        178 to "d7af00", 179 to "d7af5f", 180 to "d7af87", 181 to "d7afaf", 182 to "d7afd7", 183 to "d7afff",
        184 to "d7d700", 185 to "d7d75f", 186 to "d7d787", 187 to "d7d7af", 188 to "d7d7d7", 189 to "d7d7ff",
        190 to "d7ff00", 191 to "d7ff5f", 192 to "d7ff87", 193 to "d7ffaf", 194 to "d7ffd7", 195 to "d7ffff",
        196 to "ff0000", 197 to "ff005f", 198 to "ff0087", 199 to "ff00af", 200 to "ff00d7", 201 to "ff00ff",
        202 to "ff5f00", 203 to "ff5f5f", 204 to "ff5f87", 205 to "ff5faf", 206 to "ff5fd7", 207 to "ff5fff",
        208 to "ff8700", 209 to "ff875f", 210 to "ff8787", 211 to "ff87af", 212 to "ff87d7", 213 to "ff87ff",
        214 to "ffaf00", 215 to "ffaf5f", 216 to "ffaf87", 217 to "ffafaf", 218 to "ffafd7", 219 to "ffafff",
        220 to "ffd700", 221 to "ffd75f", 222 to "ffd787", 223 to "ffd7af", 224 to "ffd7d7", 225 to "ffd7ff",
        226 to "ffff00", 227 to "ffff5f", 228 to "ffff87", 229 to "ffffaf", 230 to "ffffd7", 231 to "ffffff",


        232 to "080808", 233 to "121212", 234 to "1c1c1c", 235 to "262626", 236 to "303030", 237 to "3a3a3a",
        238 to "444444", 239 to "4e4e4e", 240 to "585858", 241 to "626262", 242 to "6c6c6c", 243 to "767676",
        244 to "808080", 245 to "8a8a8a", 246 to "949494", 247 to "9e9e9e", 248 to "a8a8a8", 249 to "b2b2b2",
        250 to "bcbcbc", 251 to "c6c6c6", 252 to "d0d0d0", 253 to "dadada", 254 to "e4e4e4", 255 to "eeeeee",
    )

    val COLOR_REVERSE_LOOKUP = COLOR_LOOKUP.entries.associate { (k, v) -> v to k }

    val SYSTEM_COLOR_LOOKUP = mapOf(
        0 to "000000", 1 to "800000", 2 to "008000", 3 to "808000", 4 to "000080", 5 to "800080",
        6 to "008080", 7 to "c0c0c0",
        8 to "808080", 9 to "ff0000", 10 to "00ff00", 11 to "ffff00", 12 to "0000ff", 13 to "ff00ff",
        14 to "00ffff", 15 to "ffffff",
    )

    val SYSTEM_COLOR_REVERSE_LOOKUP = SYSTEM_COLOR_LOOKUP.entries.associate { (k, v) -> v to k }

    val GRAY_COLOR_LOOKUP = mapOf(
        232 to "080808", 233 to "121212", 234 to "1c1c1c", 235 to "262626", 236 to "303030", 237 to "3a3a3a",
        238 to "444444", 239 to "4e4e4e", 240 to "585858", 241 to "606060", 242 to "666666", 243 to "767676",
        244 to "808080", 245 to "8a8a8a", 246 to "949494", 247 to "9e9e9e", 248 to "a8a8a8", 249 to "b2b2b2",
        250 to "bcbcbc", 251 to "c6c6c6", 252 to "d0d0d0", 253 to "dadada", 264 to "e4e4e4", 255 to "eeeeee",
    )

    val GRAY_COLOR_REVERSE_LOOKUP = GRAY_COLOR_LOOKUP.entries.associate { (k, v) -> v to k }

    val XTERM_COLOR_LOOKUP = mapOf(
        16 to "000000", 17 to "00005f", 18 to "000087", 19 to "0000af", 20 to "0000d7", 21 to "0000ff",
        22 to "005f00", 23 to "005f5f", 24 to "005f87", 25 to "005faf", 26 to "005fd7", 27 to "005fff",
        28 to "008700", 29 to "00875f", 30 to "008787", 31 to "0087af", 32 to "0087d7", 33 to "0087ff",
        34 to "00af00", 35 to "00af5f", 36 to "00af87", 37 to "00afaf", 38 to "00afd7", 39 to "00afff",
        40 to "00d700", 41 to "00d75f", 42 to "00d787", 43 to "00d7af", 44 to "00d7d7", 45 to "00d7ff",
        46 to "00ff00", 47 to "00ff5f", 48 to "00ff87", 49 to "00ffaf", 50 to "00ffd7", 51 to "00ffff",
        52 to "5f0000", 53 to "5f005f", 54 to "5f0087", 55 to "5f00af", 56 to "5f00d7", 57 to "5f00ff",
        58 to "5f5f00", 59 to "5f5f5f", 60 to "5f5f87", 61 to "5f5faf", 62 to "5f5fd7", 63 to "5f5fff",
        64 to "5f8700", 65 to "5f875f", 66 to "5f8787", 67 to "5f87af", 68 to "5f87d7", 69 to "5f87ff",
        70 to "5faf00", 71 to "5faf5f", 72 to "5faf87", 73 to "5fafaf", 74 to "5fafd7", 75 to "5fafff",
        76 to "5fd700", 77 to "5fd75f", 78 to "5fd787", 79 to "5fd7af", 80 to "5fd7d7", 81 to "5fd7ff",
        82 to "5fff00", 83 to "5fff5f", 84 to "5fff87", 85 to "5fffaf", 86 to "5fffd7", 87 to "5fffff",
        88 to "870000", 89 to "87005f", 90 to "870087", 91 to "8700af", 92 to "8700d7", 93 to "8700ff",
        94 to "875f00", 95 to "875f5f", 96 to "875f87", 97 to "875faf", 98 to "875fd7", 99 to "875fff",
        100 to "878700", 101 to "87875f", 102 to "878787", 103 to "8787af", 104 to "8787d7", 105 to "8787ff",
        106 to "87af00", 107 to "87af5f", 108 to "87af87", 109 to "87afaf", 110 to "87afd7", 111 to "87afff",
        112 to "87d700", 113 to "87d75f", 114 to "87d787", 115 to "87d7af", 116 to "87d7d7", 117 to "87d7ff",
        118 to "87ff00", 119 to "87ff5f", 120 to "87ff87", 121 to "87ffaf", 122 to "87ffd7", 123 to "87ffff",
        124 to "af0000", 125 to "af005f", 126 to "af0087", 127 to "af00af", 128 to "af00d7", 129 to "af00ff",
        130 to "af5f00", 131 to "af5f5f", 132 to "af5f87", 133 to "af5faf", 134 to "af5fd7", 135 to "af5fff",
        136 to "af8700", 137 to "af875f", 138 to "af8787", 139 to "af87af", 140 to "af87d7", 141 to "af87ff",
        142 to "afaf00", 143 to "afaf5f", 144 to "afaf87", 145 to "afafaf", 146 to "afafd7", 147 to "afafff",
        148 to "afd700", 149 to "afd75f", 150 to "afd787", 151 to "afd7af", 152 to "afd7d7", 153 to "afd7ff",
        154 to "afff00", 155 to "afff5f", 156 to "afff87", 157 to "afffaf", 158 to "afffd7", 159 to "afffff",
        160 to "d70000", 161 to "d7005f", 162 to "d70087", 163 to "d700af", 164 to "d700d7", 165 to "d700ff",
        166 to "d75f00", 167 to "d75f5f", 168 to "d75f87", 169 to "d75faf", 170 to "d75fd7", 171 to "d75fff",
        172 to "d78700", 173 to "d7875f", 174 to "d78787", 175 to "d787af", 176 to "d787d7", 177 to "d787ff",
        178 to "d7af00", 179 to "d7af5f", 180 to "d7af87", 181 to "d7afaf", 182 to "d7afd7", 183 to "d7afff",
        184 to "d7d700", 185 to "d7d75f", 186 to "d7d787", 187 to "d7d7af", 188 to "d7d7d7", 189 to "d7d7ff",
        190 to "d7ff00", 191 to "d7ff5f", 192 to "d7ff87", 193 to "d7ffaf", 194 to "d7ffd7", 195 to "d7ffff",
        196 to "ff0000", 197 to "ff005f", 198 to "ff0087", 199 to "ff00af", 200 to "ff00d7", 201 to "ff00ff",
        202 to "ff5f00", 203 to "ff5f5f", 204 to "ff5f87", 205 to "ff5faf", 206 to "ff5fd7", 207 to "ff5fff",
        208 to "ff8700", 209 to "ff875f", 210 to "ff8787", 211 to "ff87af", 212 to "ff87d7", 213 to "ff87ff",
        214 to "ffaf00", 215 to "ffaf5f", 216 to "ffaf87", 217 to "ffafaf", 218 to "ffafd7", 219 to "ffafff",
        220 to "ffd700", 221 to "ffd75f", 222 to "ffd787", 223 to "ffd7af", 224 to "ffd7d7", 225 to "ffd7ff",
        226 to "ffff00", 227 to "ffff5f", 228 to "ffff87", 229 to "ffffaf", 230 to "ffffd7", 231 to "ffffff",
    )

    val XTERM_COLOR_REVERSE_LOOKUP = XTERM_COLOR_LOOKUP.entries.associate { (k, v) -> v to k }

    val COLOR_STEPS_ASC = listOf("00", "5f", "87", "af", "d7", "ff")
    val COLOR_STEPS_DESC = listOf("ff", "d7", "af", "87", "5f", "00")
}