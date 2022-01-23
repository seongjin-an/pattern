package ioc

fun main() {
    val url: String = "www.naver.com/books/it?page=10&size=20&name=spring-boot"

    val encoder: Encoder = Encoder(UrlEncoder())
//    val encoder: Encoder = Encoder(Base64Encoder())
    val result:String = encoder.encode(url)
    print(result)
}