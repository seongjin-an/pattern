package ioc

class Encoder(private val iEncoder: IEncoder) {

    fun encode(message: String): String{
        return iEncoder.encode(message)
    }

}