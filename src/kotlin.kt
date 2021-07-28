//my first program in kotlin
fun main(){
    println("hello world")

    var name="Peter Nyangon"
    print(name)
    var number=34
    println(number)
    number=56
    println(number)
    number=400
    println(number)

    val index =55
    println(index)
    sum()
    println(area())
    println(area1(40,50))

}
fun sum(){
    var a=4
    var b=5
    println("sum id ${a+b}")

}


fun area(): Boolean{
    return true
}

fun area1(a:Int,b:Int):Int{
    return a*b;
}