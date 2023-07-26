package uygulamaHafta1

fun main() {
    val numbers = ArrayList<Int>()

    // Kullanıcıdan 5 adet sayı alınması
    for (i in 1..5) {
        print("Lütfen $i. sayıyı girin: ")
        val input = readLine()?.toIntOrNull()
        if (input != null) {
            numbers.add(input)
        } else {
            println("Geçerli bir sayı girmediniz. Tekrar deneyin.")
            return
        }
    }

    // Toplama fonksiyonu
    fun toplam(numbers: ArrayList<Int>): Int {
        var sum = 0
        for (number in numbers) {
            sum += number
        }
        return sum
    }

    // Toplamı ekrana yazdırma
    val result = toplam(numbers)
    println("Girilen sayıların toplamı: $result")
}