open class TrainingClass(var name:String,var age:Int) {

    fun nameAge(){
        println("student name is ${name.capitalize()} and he/she is $age years old")
    }

    override fun toString(): String {
        return "Student name is $name and age is $age"
    }

     fun equals(other: TrainingClass?): Boolean {
        return this.name.contentEquals(other?.name)&&this.age==other?.age
    }

    fun copy(student:TrainingClass){
        this.name = student.name
        this.age = student.age
    }

}