package com.example.kotlinexample.model


fun Entity.extensionFunction(){
    println("inside extension of Entity class ")
}

val Entity.extentionVaribale : String
    get() = " Extension variable value"