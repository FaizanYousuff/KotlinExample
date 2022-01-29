package com.example.kotlinexample.interfaces

import com.example.kotlinexample.model.Person

interface PersonInfoProvider {

    // here it cannot be initialized here
    val providerInfo : String
    fun printInfo(person : Person)

    fun printInfoDefault(person :Person){
        println("inside default implementation methods of interface ")
        person.printInfo()
    }
}

class BasicInfoProvider : PersonInfoProvider{

    override val providerInfo: String
        get() = "BasicInfoProvider "

    override fun printInfo(person: Person) {
        println("inside  implementation methods of BasicInfoProvider")

    }
}

fun main(){
    var basicInfoProvider = BasicInfoProvider()
    basicInfoProvider.printInfo(Person())
    basicInfoProvider.printInfoDefault(Person())
}