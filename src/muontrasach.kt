class ThuVien(khoBanDau: List<String>) {
    private val kho: MutableSet<String> = khoBanDau.toMutableSet()
    private val dangMuon: MutableMap<String, MutableSet<String>> = mutableMapOf()

    fun muon(maSV: String, maSach: String) {
        // 1) sách phải còn trong kho
        if (maSach !in kho) {
            println("Loi: sach khong co san")
            return
        }
        // 2) sinh viên phải đang mượn ÍT HƠN 2 cuốn
        if ((dangMuon[maSV]?.size ?: 0) >= 2) {
            println("Loi: vuot gioi han")
            return
        }
        // thành công: chuyển sách từ kho -> giỏ mượn của SV
        kho.remove(maSach)
        dangMuon.getOrPut(maSV) { mutableSetOf() }.add(maSach)
        println("OK")
    }

    fun tra(maSV: String, maSach: String) {
        // đúng sinh viên đó mới đang mượn cuốn đó?
        val tap = dangMuon[maSV]
        if (tap == null || maSach !in tap) {
            println("Loi: khong muon sach nay")
            return
        }
        tap.remove(maSach)
        kho.add(maSach)                 // trả sách về kho
        println("OK")
    }

    fun inKho() {
        val ds = kho.toList().sorted().joinToString(", ")
        println("Con trong kho: $ds")
    }
}

fun main() {
    val kho = listOf("X1");
    val lenh = listOf(
        "TRA S1 X1",
        "MUON S1 X1",
        "MUON S2 X1"
    )

    val tv = ThuVien(kho)
    for (l in lenh) {
        val p = l.split(" ")
        when (p[0]) {
            "MUON" -> tv.muon(p[1], p[2])
            "TRA"  -> tv.tra(p[1], p[2])
        }
    }
    tv.inKho()
}
