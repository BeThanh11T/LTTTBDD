class HinhChuNhat(val dai: Double, val rong: Double) {
    val dienTich: Double get() = dai * rong
    val chuVi:    Double get() = (dai + rong) * 2
    val laHinhVuong: Boolean get() = dai == rong

    fun moTa(): String {
        return "HCN $dai x $rong".replace(" ", "") +
                ": S = $dienTich, P = $chuVi, hinh vuong: $laHinhVuong"
    }
}


fun main() {
    val h = HinhChuNhat(4.0, 2.5)
    println(h.moTa())
}
