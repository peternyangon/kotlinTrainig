fun main() {
    println("hello world ")
    println("Welcome to kenya")
    var peter:String
    peter="my name"
    println(peter)
    println("welcome to planet earth\r $peter i hope you love it here")
   println( names("peter","nyangon"))
    for (i in 1..5){
        println(i)
    }
    val rawCrawl = """|a long time ago in a distance world
        |there existed a powerful man called God
    """.trimMargin("|")
    println(rawCrawl)
//    for (k in rawCrawl){
//        print(k)
//    }

    val contentEquals = peter.contentEquals("my name")
    val contains = peter.contains("my", ignoreCase = true)
    println(contains)
    println(peter.uppercase())
    val first="peter"
    var isTrue=true

    var x=1

    when  (x){
        1 -> {
            println("come home")
            println("you are a bright student")
        }
        2 -> {
            println("have no idea where you belong")
        }


    }



    println(contentEquals)

}

fun names(name1:String,name2:String):String{
    return "$name1 $name2"
}
