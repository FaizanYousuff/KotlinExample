package com.example.kotlinexample.model


fun printFilteredString (list : List<String>,predicate : (String)-> Boolean){

    list.forEach {
        if(predicate(it)){
            print("higher order function called ")
            println(it)
        }
    }
}

fun printFilteredString2 (list : List<String>,predicate : ((String)-> Boolean)?){

    list.forEach {
        if(predicate?.invoke(it) == true){
            print("higher order function called ")
            println(it)
        }
    }
}