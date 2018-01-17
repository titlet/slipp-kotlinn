package oneweek

fun main(ars : Array<String>) {
    infix fun Int.max(x: Int):
            Int = if (this > x) this else x

    print(1 max 15)
}