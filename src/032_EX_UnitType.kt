fun main(args: Array<String>): Unit
{
    celsiusToFah(27)
}

//이전 예제의 cToF 함수와 이름이 겹치지 않도록 함수의 이름을 변경했다.
fun celsiusToFah(celsius: Int): Unit
{
    println(celsius * 1.8 + 32)
}