package oneweek

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(
            Person("자바지기", age = 45),
            Person("산지기"),
            Person("루팡", 46))

    val oldest = persons.maxBy { it.age ?: 0 }
    println("나이가 가장 많은 사람 : $oldest")
}