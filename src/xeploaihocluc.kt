fun xepLoai(diem: Double): String = when {
    diem >= 8.5 -> "Gioi"
    diem >= 7.0 -> "Kha"
    diem >= 5.0 -> "Trung binh"
    else -> "Yeu"
}

fun thongKeLop(ds: List<Double>) {
    val dem = ds.groupingBy { xepLoai(it) }.eachCount()
    for (loai in listOf("Gioi", "Kha", "Trung binh", "Yeu")) {
        val k = dem[loai] ?: 0
        println("$loai: $k (${k * 100 / ds.size}%)")
    }
}

fun main() {
    thongKeLop(listOf(9.0, 7.5, 6.0, 4.0, 8.5, 7.0, 5.5))
}