package ioc

import java.io.UnsupportedEncodingException
import java.net.URLEncoder

class UrlEncoder: IEncoder {
    override fun encode(message: String): String {
        return try{
            URLEncoder.encode(message, "UTF-8")
        }catch(error: UnsupportedEncodingException){
            error.printStackTrace()
            "error"
        }
    }
}