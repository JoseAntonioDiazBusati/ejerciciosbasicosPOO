class Rectangulo(val base:Double,val altura: Double) {

    var area: Double = 0.0
        get() = (base * altura)
    var perimetro: Double = 0.0
        get() = (base * 2) + (altura * 2)

    init {
        require(altura > 0 && base > 0) { "base y altura no puedesn ser <= 0" }
    }

}