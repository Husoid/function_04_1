fun main() {
    println(myPay("MasterCard", amountTransfer = 7000))
}

fun myPay(typeCard: String = "VK pay", amountTransfersInMonth: Int = 0, amountTransfer: Int): String {
    var commission: Int

    when (typeCard) {
        "MasterCard", "Maestro" ->
            if (amountTransfersInMonth + amountTransfer > 75000) {
                commission = ((75000 - amountTransfersInMonth + amountTransfer) * 60 / 100 + 20)
            } else {
                commission = 0
            }
        "VK pay" -> commission = 0
        else -> commission = 0
    }
    return "Ваш перевод на карту $typeCard в сумме $amountTransfer рублей будет с коммиссией $commission рублей"
}