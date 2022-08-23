package com.example.peoplecounter

fun main() {
    var moduloVar = moduloFun(5,3)
    print("result is $moduloVar")
}

fun moduloFun(num1: Int, num2: Int): Int{
    return num1%num2
}
