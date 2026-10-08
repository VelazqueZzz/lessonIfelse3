//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val winningNumber1 = 7
    val winningNumber2 = 21
    print("Введите первое число (от 0 до 42): ")
    val guess1 = readln().toInt()
    print("Введите второе число (от 0 до 42): ")
    val guess2 = readln().toInt()
    println("Для победы нужно было угадать: $winningNumber1 и $winningNumber2")
    val firstMatches = guess1 == winningNumber1 || guess1 == winningNumber2
    val secondMatches = guess2 == winningNumber1 || guess2 == winningNumber2
    val result = if (firstMatches && secondMatches) {
        "Поздравляем! Вы выиграли главный приз!"
    } else if (firstMatches || secondMatches) {
        "Вы выиграли утешительный приз!"
    } else {
        "Неудача!"
    }
    println(result)
}




