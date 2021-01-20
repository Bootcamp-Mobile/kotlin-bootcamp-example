fun main(args: Array<String>) {

    val student1 = Student("Perico", "Gala", 25, "p@a.com")
    val student2 = Student("Paquita", "Galo", 26, "gdfgspa@ca.com")
    val student3 = Student("Rodolfo", "Lara", 29, "bfgspa@ca.com")
    val student4 = Student("Elena", "Marca", 30, "fvvpa@ca.com")
    val student5 = Student("Juan", "Galo", 31, "qwertpa@ca.com")
    val student6 = Student("Alfredo", "Galo", 56, "adsfpa@ca.com")
    val student7 = Student("Roberta", "Galo", 76, "pasdaf@ca.com")

    val studentList = mutableListOf(student1, student2, student3, student4, student5, student6, student7)
    val teacherList = mutableListOf(Teacher("Carlos", "de Tena", 10), Teacher("David", "Jardón", 10), Teacher("María", "Antón", 11), Teacher("Daniela", "Hidalgo", 11))

    val bootcamp1 = Bootcamp(studentList.subList(0, 4), teacherList.subList(0,2), "Mobile")
    val bootcamp2 = Bootcamp(studentList.subList(4, studentList.size), teacherList.subList(2,4), "Fullstack")
    val bootcamp3 = Bootcamp(studentList.subList(2,5), teacherList.subList(1,3), "Data Science")

    val bootcampList = mutableListOf(bootcamp1, bootcamp2, bootcamp3)

    println("El bootcamp creado se llamará ${bootcamp1.name}")

    bootcamp1.printParticipantWithNoComma()

    // Quiero que me digas cuantos alumnos mayores de 25 años tiene el bootcamp
    bootcamp1.printParticipantOlderThan25()

}

// Clase Student
// Clase Teacher
// Clase Bootcamp
