package com.example.kotlinexample.model

class Entity private constructor(id :String){

    companion object{
        val id ="ID"
        fun create() = Entity(id)
    }
    }