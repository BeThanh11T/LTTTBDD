
class Student(val name: String, val score: Int) {
val passed: Boolean

init {
    println("Dang khoi tao $name")
    passed = score >= 5
}
    val label = if (passed) "Dat" else "Truot"

    init {
        println("Sau khi tính label $label")
    }
}

fun main() {
val s = Student("Binh", 7)
    println("Ket qua: ${s.label}")
}