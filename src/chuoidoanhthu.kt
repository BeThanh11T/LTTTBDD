fun doanTotNhat(a: List<Int>) {
    var best = a[0]
    var bi = 0
    var bj = 0
    var cur = 0
    var start = 0
    for (i in a.indices) {
        if (cur < 0 || i == 0) {
            cur = a[i]
            start = i
        } else {
            cur += a[i]
        }
        if (cur > best) {
            best = cur
            bi = start
            bj = i
        }
    }
    println("Tong lon nhat: $best (ngay ${bi + 1} den ngay ${bj + 1})")
}

fun main() {
    doanTotNhat(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
}