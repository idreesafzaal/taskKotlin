package com.commscope.codingchallengekt

fun validatePassword(input: String): Boolean {
    return input.contains(Regex("_"+"(?<=.{6,})$"))


}