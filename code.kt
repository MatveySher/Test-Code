import java.util.Scanner

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    // Declaring balance and cost of product
    print("Please, enter the cost of product: ")
    val cost = scan.nextInt()
    print("Please, enter amount of money: ")
    val balance = scan.nextInt()

    var change = balance - cost

    var coinFive = 0
    var coinTen = 0
    var coinTwo = 0
    var coinOne = 0

    while (change != 0) {

        if (change < 0) {
            println("You don't have enough money!")
            break
        }
        // Use to count a quantity of each type of coins
        when {
            change >= 10 -> {
                change -= 10
                coinTen += 1
            }
            change >= 5 -> {
                change -= 5
                coinFive += 1
            }
            change >= 2 -> {
                change -= 2
                coinTwo += 1
            }
            change >= 1 -> {
                change -= 1
                coinOne += 1
            }
            else -> break
        }
    }
    // If balance is enough, print quantity each type of coins
    if (balance > cost){
        println("Your change consists of the following coins: \n" +
                "Ten --> $coinTen \n" +
                "Five --> $coinFive \n" +
                "Two --> $coinTwo \n" +
                "One --> $coinOne \n")
    }

}
