fun main() {
    val itemPrice = 200 //цена 1-ой песни
    val itemCount = 10 //кол-во песен
    val discount = 100 //скидка
    val totalPrice = itemPrice * itemCount //стоимость покупки
    val discount2 = totalPrice * 5 / 100 ////5% скидка от покупки
    val discount3 = (totalPrice - discount) * 1 / 100 // 1% скидка
    val discount4 = totalPrice * 1 / 100
    val discount5 = discount2 * 1 / 100
    val regularCustomer: Boolean = false


    val result1 = if (totalPrice <= 1_000) 0
    else if (totalPrice >= 1_001 && totalPrice <= 10_000) discount
    else discount2

    val result2 = if (totalPrice <= 1_000 && regularCustomer == true) discount4
    else if (totalPrice >= 1_001 && totalPrice <= 10_000 && regularCustomer == true)
        discount3
    else discount5

    val totalResult = result1 + result2
    val totalSum = totalPrice - totalResult


    println("""Скидка составит $totalResult руб. | Сумма $totalSum руб.""")
}
