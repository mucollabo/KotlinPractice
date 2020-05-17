package ex_destructuring_object

data class Employee(val name: String, val age: Int, val salary: Int)

fun main(args: Array<String>)
{
    val(name, age, salary) = Employee("John", 30, 3300)
    println(name); println(salary); println(age)
}