fun main() {
    // Deklarasi variabel
    val nama = "Alex"
    var nama2 = "Akif"

    val number: Int = 23
    val numberString: String = "23"


    // Tipe data
    String
//    val text: String = "Halo"
//    val firstChar = text[0]
//    println(firstChar)

    Int
    val angka: Int = 2

    Long
    val angkaLong: Long = 20000L

    Char
    val karakter: Char = 'A'

    Boolean
    val bool: Boolean = false

    Float
    //7 angka desimal
    val angkaFloat: Float = 232.24222F

    Double
    //15 angka desimal
    val angkaDouble: Double = 22.232323224232324


    // Output
    print("Nama: ")
    println("Akif")

//    Log.d("Debug")
//    Log.e("Error")
//    Log.i("Informasi")
//    Log.wtf("Wtf")

    // Kondisi
    val equalTo = 1 == 2
    val greaterThan = 1 > 2
    val less = 2 < 1
    val lessOrEqual = 2 <= 1
    val and = true && true
    val or = true || true
    val not = !true

    // Percabangan
    if (true) {

    } else if (true) {

    } else {

    }

    // When
    val result = 4
    when (result) {
        0 -> println("Hasilnya 0")
        1 -> println("Hasilnya 1")
        2 -> println("Hasilnya 2")
        3 -> println("Hasilnya 3")
        in 1..20 -> println("Hasilnya antara range 1 sampai 20")
        else -> println("Ga dapat hasilnya")
    }


    // Perulangan
//    val start = 1
//    val end = 20
//    for (x in start..end){
//        println(x)
//    }

//    var i = 1
//    while (i <= end){
//        println(i)
//        i++
//    }

    // Array/List (Collection)
    val listFibonacci: ArrayList<Int> = arrayListOf()
    listFibonacci.add(0)
    listFibonacci.add(1)
    listFibonacci.add(2)
    listFibonacci.add(3)
    listFibonacci.add(4)
    listFibonacci.remove(4)
    val listSize = listFibonacci.size
    println("List size = $listSize")
    println(listFibonacci[0])

//    listFibonacci.forEach { item ->
//        println(item)
//    }

    val listFix: List<String> = listOf("Udin", "Alex", "Jack")
//    listFix.forEach {
//        println("nama $it")
//    }

    val mutableList = mutableListOf<Int>() // Sama dengan ArrayList beda schema
    mutableList.add(90)
    mutableList.add(1, 60)
    mutableList.add(20)
    mutableList.add(1, 100)
//    mutableList.forEach {
//        println(it)
//    }

    val listConvert = listFix.toMutableList()
    val mutableListConvert = mutableList.toList()


    // Function
    println(doSomething(umur = 23, alamat = "Bandung", nama = "Alex"))
    hitung(
            value = 23,
            sum = { angkaValue ->
                angkaValue + angkaValue
            }
    )

    val sum = { i: Int -> i + 1 }
    //println(sum(5))

    // Nullable
    val text: String? = "Alex"
    val textLength: Int = text?.length ?: 7
    val textLengthMaksa = text!!.length

    println(textLength)

    // OOP (Object Oriented Programming)
    val motorHonda = Motor("Honda", "Putih")

//    motorHonda.Gass()
//    println(motorHonda.warna)
//    println("Merek motor = ${motorHonda.getMerek()}")
//    motorHonda.setWarna("Merah")
//    println("Warna Motor = ${motorHonda.getWarna()}")
//
//    val motorYamaha = Motor(warna = "Hijau")
//    motorYamaha.Gass()

    val user1 = User(firstName = "John", lastName = "Doe")
    val user2 = User(fullName = "John Alex")

    user1.GetNama()
    user2.GetNama()

    val Person1 = Person("Alex", 23)


    val Dog1 = Dog("Dog1", 2)
    val Cat1 = Cat("Cat1", 2)

    Dog1.MakeSound()

    Cat1.MakeSound()
}

fun doSomething(nama: String = "User", umur: Int, alamat: String): String {
    return "Halo $nama! dengan umur $umur dan alamat $alamat"
}

fun hitung(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

class Motor(private var merek: String, private var warna: String) {

    fun gass() {
        println("Motor dengan merek ${this.merek} dengan warna ${this.warna} sedang di gass")
    }

    fun getMerek(): String {
        return this.merek
    }

    fun getWarna(): String {
        return this.warna
    }

    fun setMerek(merekBaru: String) {
        this.merek = merekBaru
    }

    fun setWarna(warnaBaru: String) {
        this.warna = warnaBaru
    }
}

class User(firstName: String, lastName: String) {

    constructor(fullName: String) : this(fullName.split(" ").first(), fullName.split(" ").last())

    val fullName = "$firstName $lastName"

    fun GetNama() {
        println("Full name = $fullName")
    }
}

data class Person(val name: String, val age: Int)

abstract class Animal(val name: String) {
    abstract fun MakeSound()
}

class Dog(name: String, val umur: Int) : Animal(name) {
    override fun MakeSound() {
        println("Woof!")
    }
}

class Cat(name: String, val umur: Int) : Animal(name) {
    override fun MakeSound() {
        println("Meow!")
    }

}
