package oneweek

import java.util.*

data class Car(val name: String, var position: String = "")



fun main (args: Array<String>) {
    val MAX_RANDOM_VALUE = 10
    val POSITION_MOVED: String = "-"

    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val cars = readLine()!!.split(',').map {Car(it)}

    println("시도할 회수는 몇회인가요?")
    val tryCount: Int = readLine()!!.toInt()
    check(tryCount is Number && tryCount > 0) { "시도 할 회수는 1이상의 숫자를 입력 하여 주세요"}
    val random: Random = Random()

    for (idx in 0 until tryCount) {
        println("${idx+1} 회 시도 :")
        cars.forEach {
            if(random.nextInt(MAX_RANDOM_VALUE) >= 4) it.position = it.position.plus(POSITION_MOVED)
            println("${it.name} : ${it.position}")
        }
    }

    val aWinner: Car = cars.sortedBy { it.position.length }.last()
    val winnerNames = cars.filter { it.position.length == aWinner.position.length }.map { it.name}

    println("${winnerNames.joinToString(",")} (이)가 최종 우승했습니다.")
}
