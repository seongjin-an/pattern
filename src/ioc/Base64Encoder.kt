package ioc

import java.util.*

class Base64Encoder: IEncoder {
    override fun encode(message: String): String {
        return Base64.getEncoder().encodeToString(message.toByteArray())
    }
}