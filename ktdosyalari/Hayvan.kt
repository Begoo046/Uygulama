package uygulamaHafta1

// Hayvan sınıfı
open class Hayvan {
    open fun sesCikar() {
        println("Bu hayvanın sesi çıkıyor.")
    }
}

// Kedi sınıfı
class Kedi : Hayvan() {
    override fun sesCikar() {
        println("Kedi miyavlıyor: Miyav!")
    }
}

// Köpek sınıfı
class Kopek : Hayvan() {
    override fun sesCikar() {
        println("Köpek havlıyor: Hav hav!")
    }
}

// HayvanBarinagi sınıfı
class HayvanBarinagi {
    fun sesCikar(hayvan: Hayvan) {
        hayvan.sesCikar()
    }
}

// Polymorphism örneği
fun main() {
    val kedi: Hayvan = Kedi()
    val kopek: Hayvan = Kopek()

    val hayvanBarinagi = HayvanBarinagi()
    hayvanBarinagi.sesCikar(kedi)   // Kedi miyavlıyor: Miyav!
    hayvanBarinagi.sesCikar(kopek)  // Köpek havlıyor: Hav hav!
}