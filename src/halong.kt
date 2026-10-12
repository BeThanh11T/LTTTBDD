fun haLong(n: Int): String =
    (1..4).joinToString(" ") { i ->
        when {
            i % 15 == 0 -> "HaLong"   // chia hết cho cả 3 và 5 → xét TRƯỚC
            i % 3  == 0 -> "Ha"
            i % 5  == 0 -> "Long"
            else        -> i.toString()
        }
    }

fun main() {
    println(haLong(15))
}
