package com.example.kotlinexample.model

// todo constructor is optional if dont specify any access specifier
// todo this is primary CONSTRUCTOR CREATIOn
class User constructor( n :String = "no name") {

    var name :String = n
    var age :Int = 18;

    // todo  if we need to write any block of code in CONSTRUCTOR we can use INIT
    init {
        name  = n
        println("init called or contructor block called")
    }
    // TODO SECONDARY CONSTRUCTOR
    // when ever we use secondary contructor its mandatory to call primary contructor
    constructor(name :String ,age :Int ) : this(name) {
       this.age =  age;
    }






    // todo Creating constants(Final)
    val org : String = "Girmiti"

    fun printName(){
        println("name is $name and Age is $age")
    }

}