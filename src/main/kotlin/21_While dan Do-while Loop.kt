fun main(args: Array<String>) {
    //while lopp
    var x:Int = 0
    println("Example of while loop--")
    while (x <= 10) {
        print("$x")
        x++
    }
    print('\n')
    //do-while loop
    var y:Int = 0
    do {
        y = y + 10
        println("I am inside Do Block---" + y)
    }while (y <=50)
}