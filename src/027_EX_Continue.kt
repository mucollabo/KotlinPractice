fun main(args: Array<String>): Unit
{
    var i = 0
    while (i < 10)
    {
        i += 1
        if(i % 2 == 0)//짝수이면
            continue//continue 아래의 문장들은 모두 skip 한다.
        print(i)
    }
}
