import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun myPayVK() {
        val typeCard: String = "VK pay"
        val amountTransfersInMonth: Int = 0
        val amountTransfer: Int = 7000

        val result = myPay(typeCard, amountTransfersInMonth, amountTransfer)

        assertEquals("Ваш перевод на карту VK pay в сумме 7000 рублей будет с коммиссией 0 рублей", result)
    }

    @Test
    fun myPayMasterCard() {
        val typeCard: String = "MasterCard"
        val amountTransfersInMonth: Int = 0
        val amountTransfer: Int = 7000

        val result = myPay(typeCard, amountTransfersInMonth, amountTransfer)

        assertEquals("Ваш перевод на карту MasterCard в сумме 7000 рублей будет с коммиссией 0 рублей", result)
    }

    @Test
    fun myPayMaestro() {
        val typeCard: String = "Maestro"
        val amountTransfersInMonth: Int = 0
        val amountTransfer: Int = 7000

        val result = myPay(typeCard, amountTransfersInMonth, amountTransfer)

        assertEquals("Ваш перевод на карту Maestro в сумме 7000 рублей будет с коммиссией 0 рублей", result)
    }
    @Test
    fun myPayVKAmountTransfersInMonth() {
        val typeCard: String = "VK pay"
        val amountTransfersInMonth: Int = 75000
        val amountTransfer: Int = 7000

        val result = myPay(typeCard, amountTransfersInMonth, amountTransfer)

        assertEquals("Ваш перевод на карту VK pay в сумме 7000 рублей будет с коммиссией 0 рублей", result)
    }

    @Test
    fun myPayMasterCardAmountTransfersInMonth() {
        val typeCard: String = "MasterCard"
        val amountTransfersInMonth: Int = 75000
        val amountTransfer: Int = 7000

        val result = myPay(typeCard, amountTransfersInMonth, amountTransfer)

        assertEquals("Ваш перевод на карту MasterCard в сумме 7000 рублей будет с коммиссией 4220 рублей", result)
    }

    @Test
    fun myPayMaestroAmountTransfersInMonth() {
        val typeCard: String = "Maestro"
        val amountTransfersInMonth: Int = 75000
        val amountTransfer: Int = 7000

        val result = myPay(typeCard, amountTransfersInMonth, amountTransfer)

        assertEquals("Ваш перевод на карту Maestro в сумме 7000 рублей будет с коммиссией 4220 рублей", result)
    }
}