data class SanPham(val ten: String, val gia: Long, val soLuong: Int)

class GioHang {
    private val ds = mutableListOf<SanPham>()
    fun them(sp: SanPham) { ds.add(sp) }
    fun xoa(ten: String) { ds.removeAll { it.ten == ten } }
    fun soMatHang() = ds.size
    fun thanhToan(ma: String?): Long {
        val tong = ds.sumOf { it.gia * it.soLuong }
        val phanTram = when (ma) {
"UHL10" -> 10
"SV5" -> 5
else -> 0
}
return tong * (100 - phanTram) / 100
}
}

fun muaHang(lenh: List<String>, ma: String?) {
    val gio = GioHang()
    for (l in lenh) {
        if (l.startsWith("+")) {
            val (ten, gia, sl) = l.drop(1).split(":")
            gio.them(SanPham(ten, gia.toLong(), sl.toInt()))
        } else {
            gio.xoa(l.drop(1))
        }
    }
    println("So mat hang: ${gio.soMatHang()}")
    println("Thanh toan: ${gio.thanhToan(ma)}")
}

fun main() {
    muaHang(listOf("+But:5000:10", "+Vo:12000:5", "+Tui:150000:1", "-Tui"), "UHL10")
}