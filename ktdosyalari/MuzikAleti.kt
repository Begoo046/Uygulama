package uygulamaHafta1
// MuzikAleti sınıfı
open class MuzikAleti {
    open fun sesCikar() {
        println("Bu müzik aletinden ses çıkıyor.")
    }
}
// Gitar sınıfı
class Gitar : MuzikAleti() {
    override fun sesCikar() {
        println("Gitar çalıyor: tın tın tın.")
    }
}
// Piyano sınıfı
class Piyano : MuzikAleti() {
    override fun sesCikar() {
        println("Piyano çalıyor: plink plink plink.")
    }
}
// MuzikDersi sınıfı
class MuzikDersi {
    fun sesCikar(muzikAleti: MuzikAleti) {
        muzikAleti.sesCikar()
    }
}
// Polymorphism örneği
fun main() {
    val muzikAleti1: MuzikAleti = Gitar()
    val muzikAleti2: MuzikAleti = Piyano()

    val muzikDersi = MuzikDersi()
    muzikDersi.sesCikar(muzikAleti1)  // Gitar çalıyor: tın tın tın.
    muzikDersi.sesCikar(muzikAleti2)  // Piyano çalıyor: plink plink plink.
}
