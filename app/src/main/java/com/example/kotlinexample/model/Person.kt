package com.example.kotlinexample.model

class Person (val firstName :String = "MOHAMMED", val _lastName : String){
    // For initializing this variable we can us Init {} or directly use constructor arguments
    val lastName : String = _lastName


    init {
        println("init called 1")
    }

    // but usually this will not be required as we can leverage default contructor by assigning default values to it
    constructor() : this("yousuff","Joseph")
    init {
        println("init called 2")
    }

    var nickName :String? = null

    set(value) {
        field = value
     println("setter called with value as $value")
    }

    get() {
        println("getter called with value as $field")
        return field
    }

    fun printInfo(){
        // TODO below is Elvis operator
        println("using Elvis operator ")

        var nameToBePrinted = nickName ?: "No nick name "
        println("$firstName <$nameToBePrinted> $lastName")
    }

}



// ()indicates constructr