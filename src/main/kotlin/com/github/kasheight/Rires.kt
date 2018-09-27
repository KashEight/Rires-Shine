package com.github.kasheight

fun getString(s_a: Array<String>) = s_a[(0..4).shuffled().first()]

fun main(args: Array<String>) {
    val strs = arrayOf("り", "れ", "す", "し", "ね")
    val regex = Regex("りれすしね")
    var i = -4
    var s = ""

    while (!regex.containsMatchIn(s)) {
        i++
        val c: String = getString(strs)
        print(c)
        s += c
    }

    println("")
    println("${i}回目でりれすしねが見つかりました！")
}