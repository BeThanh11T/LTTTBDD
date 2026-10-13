class HinhChuNhat(val dai: Double, val rong: Double) {
    val dienTich: Double get() = dai * rong
    val chuVi:    Double get() = (dai + rong) * 2
    val laHinhVuong: Boolean get() = dai == rong

    fun moTa(): String 
        ="HCN $dai x $rong : S = $dienTich, P = $chuVi, hinh vuong: $laHinhVuong"
}

fun main() {
    val h = HinhChuNhat(12.5, 3.0)
    println(h.moTa())
}
