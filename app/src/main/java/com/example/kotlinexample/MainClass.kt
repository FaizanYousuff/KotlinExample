@file:JvmName("Mainkotlin")

package com.example.kotlinexample


import com.example.kotlinexample.interfaces.PersonInfoProvider
import com.example.kotlinexample.model.*
import java.lang.NumberFormatException
import java.util.*


fun main(args: Array<String>) {



    println("Single expression function")
    println(getGreetings())

    println("Collections")
    var interestOfThings = arrayOf("Kotlin","JAVA","ReactJS")

    println(interestOfThings.size)
    println(interestOfThings[2])

    for (thing in interestOfThings){
        println(thing)
    }

    println("iterating using ForEach higher order function")

    interestOfThings.forEach {
        println(it)
    }

    println("iterating using ForEachIndexed higher order function")

    interestOfThings.forEachIndexed { index, s ->
        println("Position $index  value $s ")
    }

    println("iterating MAPS using ForEach higher order function")
    // TODO by default all collections are immutable
    //  ,if mutable collections have to be created we need to call Mutable collections api
    var maps = mutableMapOf(1 to "ONE" ,2 to "TWO")

    maps.put(3,"Three")
    maps.forEach { key, value ->
        println("KEY $key and its Value is $value")
    }



    println("varArg parameter , its array of string of variable size")

    sayhello("HI ","Mohammed", "FAIZAN" )

    // here using spread operator so that collection can be passed to var arg
    sayhello("HI ",*interestOfThings )


    println("Classes")

    var person = Person("mohammed","Faizan")

    println("person first name ${person.lastName} and last name ${person.firstName}")

    println("Creating secondary constructor and calling ");
    person = Person()


    println("using default values in contructor so that multipl contrucors will not be required ");

    person = Person()
    println("person first name ${person.lastName} and last name ${person.firstName}")


    println("Getter and setters ");
    println("Default Getter and setters will be generated for VAR");
    println("Default Getter ONLY will be generated for VAL");

    println("Overriding default setters and getters");
   // person.nickName =" new Nick name"
    println("printing new Nick name ${person.nickName}")

    person.printInfo()
    println("Access specifiers ");
    println("By default its public in kotlin for all methods and variables , we modify as private , protected and internal(Default)");


    println("INTERFACES ");

    println("is  keyword is used as equivalent of instance of ");
    println("as  keyword is used as equivalent type casting ");

    println("Inheritance");


    println("by default classes are closed / final hence cannot be inheritated , ");

    println("open key word must be added if class has to be inherited , samme applies for methods and vraiables also ");


    println()
    println()
    println("Object Expression");

    var personInfoProvider = object  : PersonInfoProvider{
        override val providerInfo: String
            get() = TODO("Not yet implemented")

        override fun printInfo(person: Person) {

        }

        fun printInfo(){
            println("inside annonymous inner class created using object keyword ")

        }
    }
    personInfoProvider.printInfo()


    println()
    println()
    println("Companion Objects");
    println("Companion Objects has access to private members of enclosing class");

    // here wer are suing companion object to access private constructor
    var entity = Entity.Companion.create()


    println("Accessing Companion Object property just like static variable");
    Entity.id
    println("Companion Object are just like classes and implement interfaces ");


    println()
    println()
    println("Extension Functions");
    entity.extensionFunction()
    println("Extension variable "+entity.extentionVaribale);

    println()
    println()
    println("Advanced Functions");

    println("higer order functions either return FUNCTIONS or take functions as PARAMETERS ");

    var listOflangs = listOf("Kotlin","Java","React","xamarin")
    printFilteredString(listOflangs,{it.startsWith("J")})
    println("As per lamda rules if last parmeter is function it can be written outside ");
    printFilteredString(listOflangs){
        it.startsWith("K")
    }
    println("passing null as parameter for higher order function ");

    printFilteredString2(listOflangs,null)




    println("Hello Faizan Telusko");

    /**
     * adding todo hust for sake of colours
     */


    //TODO
    // OBJECT CREATION
    println()
    println("#### CLASS AND OBJECT ####")

    var user = User();

    user.name = "Faizan"

    println("printing user name " + user.name)
    println("printing using $ and {} ${user.name}")

    // user.org = ""; Since or was created using val keyword

    println("#### use of var and val ####")
    println("printing org created using val keyword ${user.org}")


    println()
    println("#### Kotlin and JAVA Interoperable ####")

    var userJava = UserJava();

    userJava.name = "YOUSUFF"

    println("printing userJava name " + userJava.name)
    println("printing using $ and {} ${userJava.name}")

    // userJava.org = ""; Since or was created using val keyword
    println()

    println("printing static keyword org ${UserJava.org}")


    println()
    println("#### Addition of 2 Integers ####")

    var num1: Int = 11
    var num2: Int = 10

    // braces after $ not required for single variables
    println("Addition of $num1 and $num2 is ${num1+num2}")




    println()
    println("#### if Else expressions ####")
    var res = if (num1 > num2) {
        num1
    } else {
        num2
    }
    println("Greater number between  $num1 and $num2 is $res")




    println()
    println("#### String comparisons ####")
    var str1: String = "Faizan"
    var str2: String = "faizan"

    if (str1.equals(str2, true)) {
        println("$str1 and $str2 are same")
    } else {
        println("$str1 and $str2 are not same ")

    }


    println()
    println("#### String comparisons ####")
    var str: String? = null;
    println("? question marks allows us to instantaiute with null")

    var obj: User? = User()
    obj = null;
    println("If ? question mark in not used compiler will not allow us to intantiate with null value")

    println("printing name using null reference to user object ${obj?.name}")
    println("Ass seen above null pointer exception are handled")






    println()
    println("#### When expression alternative to switch ####")

    // here WHEN is alternative to SWITCH and else is for DEFAULT
    var s = when (num2) {
        10 -> println("number is $num2")
        12 -> println("number is $num2")
        13 -> println("number is $num2")
        else -> print("please enter valid number")
    }
    println(s)

    var s1 = when (11) {
        10 -> println("number is $num2")
        10 -> println("number is $num2")
        10 -> println("number is $num2")
        else -> "whne returning expression 11"
    }
    println(s1)


    println("using when operator for comparing objects")

    when(user){
        is User -> println("it is instance of user")
        else ->println("it is NOT instance of user")
    }





    println()
    println("#### Loop and Ranges ####")

    // While and Do while same as JAVA

    var nums = 1..6;

    println("nums.reversed()  ${nums.reversed()}")
    println("nums.count()  ${nums.count()}")

    var nums2 = 1 until 6; //6 will b eexcluded


    for (n in nums.reversed()) {
        println("printing 1 .. 6(Range) using For each loop without step(increment) $n")
    }

    for (n in nums2 step 2) {
        println("printing 1 until 6 (Range)using For each loop with step value as  2 $n")
    }

    var nums1 = 6 downTo 1;

    //var nums1 = 6.downTo(1)


    for (n in nums1) {
        println("printing 6 downTo 1 using For each loop without step(increment) $n")
    }














    println()
    println("#### List and Maps  ####")

    var list = listOf(1, 2, 3, 4, 5)

    for ((i, value) in list.withIndex()) {
        println("interating list $i : $value")
    }

    var treeMap = TreeMap<String, Int>()

    // treeMap["KEYS"] = VALUE
    treeMap["Faizan"] = 743;
    treeMap["Mohammed"] = 776

    for ((name, id) in treeMap) {
        println("Interating in Map name $name and id $id")
    }




    println()
    println("#### Function and Expression  ####")

    println("addition of two number using  In line functions " + add(4, 6))
    println("Max of two number using  In line  + if else expression functions " + max(11, 6))


    println()
    println("#### Calling Fucntions from JAVA ####")

    UserJava.calcAmt()
    println("calling calcAmt from kotlin by passing 2 parmeters" + calcAmt(100, 0.02))
    println("calling calcAmt from kotlin by passing 1 parmeters " + calcAmt(100))
    println(
        "calling calcAmt from kotlin by interchnaging parameter order " + calcAmt(
            interest = 0.08,
            amt = 100
        )
    )


    println()
    println("#### Try catch as Expression ####")

    var str4: String = "4A"

    var i: Int = try {
        str4.toInt()
        // this will internally call Integer.parseInt()
    } catch (e: NumberFormatException) {
        -1
    }
    i++;
    println("value of I $i")







    println()
    println("####  Extension Functions ####")

    var u1 = User();
    u1.name = "Mohammed"
    u1.printName()

    var u2 = User();
    u2.name = "Faizan"
    u2.printName()

    var u3 = u1.plus(u2);

    println("printing name by combining two user object using Function Extension ${u3.name}")

    var u4 = User();
    u4.name = "Yousuff"
    u4.printName()
    var u5 = u3 plus1 u4;

    println("printing name by combining two user object using Function Extension witn INFIX  ${u5.name}")





    println()
    println("####  Operator OverLoading ####")
    // https://kotlinlang.org/docs/reference/operator-overloading.html

    var u6 = u3 + u4;// Using Operator keyword

    println("Adding two object using operator overloading   ${u6.name}")


    println()
    println("####  Recurrsion ####")

    var factNum :Int = 7

    var factRes = 1
    for (i in 1 .. factNum){
        factRes = factRes * i;
    }
    println("Factorial of $factNum  is $factRes"  )


    println()
    println("####  Constructor  ####")

    var u = User("FAIZAN")
    println( "Calling primary constructor ")
    u.printName()
    u = User("FAIZAN",26)
    println( "Calling Secondary contructor with 2 params  ")
    u.printName()




    println()
    println("####  INHERITANCE  ####")
    var h = Human(24 );
    println("Human think method called")
    h.think()
    var f : Faizan = Faizan(); // type casting
    println("Faizan think method called ")
    f.think()

    println("Abstract there is no difference when compared to JAVA ")

    println()
    println("#### USE OF DATA AND OBJECT KEYWORD  ####")

    println("Data keyword will override toString(), hasCode() and clone() methods example Books class")

    println("OBJECT keyword will make class as SINGLETON and we can access using class name example BooksShelf class" )
    Bookshelf.books.add(Books("JAVA",2000))
    Bookshelf.books.add(Books(price = 2500,title = "KOTLIN"))
    Bookshelf.showBooks()


    println()
    println("#### USE OF COMPANION(STATIC) AND OBJECT KEYWORD  ####")
    A.staticMethod()

    println()
    println("#### ARRAYS In Kotlin  ####")

    var array1 = intArrayOf(11,12,13,14)
    println("Initilaized array using intArrayOf(11,12,13,14) ")
    for (i in array1){
        println(i)
    }
    var array2 = IntArray(4);// If we dont know any values of array

    // Different ways of updating element in Array
    array2[0] = 21;
    array2[1] = 22

    array2.set(2,23)
    array2.set(3,24)
    println("Initilaized array using IntArray(4) and updated value  ")

    for (i in array2){
        println(i)
    }

    println("Creating array of string or any object using  arrayOfNulls<String>(2)")

    var strArray = arrayOfNulls<String>(2)
    strArray.set(0,"MOHAMMED")
    strArray.set(1,"FAIZAN")
    for (i in strArray){
        println(i)
    }



    println()
    println("#### LIST In Kotlin  ####")

    println("Creating List using  arrayOfNulls<String>(2)")

    var list1 = listOf<Int>(1,2,3,4) // this list we cannot modify later or ReadOnly

    println("printin using forEach()")
    // TODO below is example that Kotlin support fucntionla programming as forEach function is accepting Print function
    list1.forEach({ println(it) })
    // here forEach accept Consumer time object which is fucntional interface
    // henve using Lamda here


    var list12 = mutableListOf<Int>(3,4,5,6,7)//
    list12.add(0,2)

    println("printing using normal for loop")
    for (list in list12 ){
        println(list)
    }








/*

    println()
    println("#### USE OF BACKTIDCK and Accepting Input  ####")
    println("pleas enter first number for addition (here Using scanner class)")

    var scanner = Scanner(System.`in`) // using back tic for in since by default in plain in has seprate meaning
    var num11 = scanner.nextInt()

    // ANOTHER and eay way of accepting Input is
    println("pleas enter Second  number for addition (here  readLine() class)")
    var num12 = readLine()

    var num13 = num11.toInt()+  num12.toString().toInt()
    println("Addition of two entered number is $num13")
*/

}


fun add(a: Int, b: Int): Int = a + b;
fun max(a: Int, b: Int): Int = if (a > b) a else b

@JvmOverloads
// this annotation allows us to pass single paramter formJ JAVA CLASS ALSO
fun calcAmt(amt: Int, interest: Double = 0.04): Int {

    return amt + (amt * interest).toInt()
}


// TODO FUNCTION EXTENSION EXAMPLE
operator fun User.plus(u: User): User {
    var newUser = User();
    newUser.name = this.name + " " + u.name;
    return newUser
}

// infix with only work with 1 parameter only
infix fun User.plus1(u: User): User {
    var newUser = User();
    newUser.name = this.name + " " + u.name;
    return newUser
}


// TODO Inheritance Example
// By Defauly all classes and methods are final hence open should be added if it has to be inherited by other classes
open class Human constructor(age :Int){
    // Init is like code block of primary constructor
    init {
        println("HUMAN primary constructor or init block called and age is $age")
    }

    open fun think(){
        println(" Human is thinking ")
    }
}


class Faizan (age: Int = 18) : Human(age) {

    init {
        println("Faizan primary constructor or init block called and age is $age")
    }
    override fun think(){
        println(" Faizan is thinking ")

    }
}
// TODO DATA and OBJECT uses
// DATA key workd will give toString, HashCode ,copy methods
data class Books(var title :String , var price :Int){

}

object Bookshelf{

    var books = arrayListOf<Books>()

    fun showBooks(){

        for (b in books){
            println(b)
        }
    }
}


// Todo COMPANION OBJECT


class A{

    companion object{
        @JvmStatic
        fun staticMethod(){
            println("This is static  Method")
        }
    }

}

fun getGreetings() :String = "Hello Faizan"

fun sayhello(greetings :String , vararg itemsToGreet :String){

    itemsToGreet.forEach {
        println("$greetings $it")
    }
}



