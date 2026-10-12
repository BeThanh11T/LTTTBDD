fun chuanHoa(ten: String): String =
    ten.trim().split(" ").filter { it.isNotEmpty() }
        .joinToString(" ") { w -> w.lowercase().replaceFirstChar { it.uppercase() } }

fun vietTat(ten: String): String =
    chuanHoa(ten).split(" ").joinToString("") { it.first().toString() }

fun inTen(ten: String) {
    println("Ho ten: ${chuanHoa(ten)}")
    println("Viet tat: ${vietTat(ten)}")
}

fun main() {
    inTen("  nGUYEN   van   an ")
}