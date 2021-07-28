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
    val numbers = listOf<String>("peter","simon","sifa")
    println(numbers.size)

    println(numbers.get(0))

    println(numbers.stream())
   println( numbers.first())
    println(numbers.contains("peter"))

    val namesis= arrayListOf<String>("peter","simon","joshua")
    namesis.add("millicent")
    namesis.add("paul")
    namesis.add("elizabeth")
    println(namesis)
    namesis.add(0,"fredrick")
    println(namesis)
    namesis.sort()
    println(namesis)

    var integetNum = mutableListOf<String>("Chon","jacky","andriana","lume","victoria")
    integetNum.add("simon")
    integetNum.add("peter")
    integetNum.add("juan")
    println(integetNum)

    integetNum.sort()
    println(integetNum)

    println(integetNum[1])

    println(numbers[1])

    var mapOfNames= mapOf<String,String>("peter" to "nyangon","simon" to "nyangon","joshua" to "nyangon")
    println(arrayListOf(mapOfNames.values))
    println(arrayListOf(mapOfNames.keys))

    println(mapOfNames.getOrDefault("fredrick","this name doesnt exist"))
    
//null operation in kotlin
    var name1 ="peter"
    name1= null.toString()
    var name2:String?="simon"


    println(name2?.length)
    var name3=name2?.length?:"name doest exist"
    println(name3)

    println(name2!!.length)

    name3 = if (name2!=null) name2.length else -1

    println(name3)



    println(contentEquals)
    var student = TrainingClass("peter nyangon",34)

    println(student.age)
    println(student.name)
    println(student.nameAge())

    println(student.toString())

    val student2 = TrainingClass("simon Nyangon",55)
    println(student.equals(student2))

    var student3=student
    println(student3)

    student3.copy(student)
    println(student3)


}

fun names(name1:String,name2:String):String{
    return "$name1 $name2"
}
