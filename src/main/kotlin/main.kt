fun main(args: Array<String>) {

    val student1 = Student("Perico", "Gala", 25, "p@a.com")
    val student2 = Student("Paquita", "Galo", 26, "pa@ca.com")
    val studentList = mutableListOf(student1, student2)

    val teacherList = mutableListOf(Teacher("Carlos", "de Tena", 10), Teacher("David", "Jardón", 10))

    val bootcamp1 = Bootcamp(studentList, teacherList)

    println("El bootcamp creado se llamará ${bootcamp1.name}")

    bootcamp1.printParticipantWithNoComma()

    // Quiero que me digas cuantos alumnos mayores de 25 años tiene el bootcamp
    bootcamp1.printParticipantOlderThan25()

}

// Clase Student
// Clase Teacher
// Clase Bootcamp
