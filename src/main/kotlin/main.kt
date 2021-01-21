fun main(args: Array<String>) {

    val student1 = Student("Perico", "Gala", 25, "p@a.com")
    val student2 = Student("Paquita", "Galo", 26, "gdfgspa@ca.com")
    val student3 = Student("Rodolfo", "Lara", 29, "bfgspa@ca.com")
    val student4 = Student("Elena", "Marca", 30, "fvvpa@ca.com")
    val student5 = Student("Juan", "Galo", 31, "qwertpa@ca.com")
    val student6 = Student("Alfredo", "Galo", 56, "adsfpa@ca.com")
    val student7 = Student("Roberta", "Galo", 76, "pasdaf@ca.com")
    val student8 = Student("Roberta", "Lolailo", 6, "pasdfghfsdaf@ca.com")

    val studentList = mutableListOf(student1, student2, student3, student4, student5, student6, student7, student8)
    val teacherList = mutableListOf(
        Teacher("Carlos", "de Tena", 10),
        Teacher("David", "Jardón", 10),
        Teacher("María", "Antón", 11),
        Teacher("Daniela", "Hidalgo", 11)
    )

    val bootcamp1 = Bootcamp(studentList.subList(0, 4), teacherList.subList(0, 2), "Mobile")
    val bootcamp2 = Bootcamp(studentList.subList(4, studentList.size), teacherList.subList(2, 4), "Fullstack")
    val bootcamp3 = Bootcamp(studentList.subList(2, 5), teacherList.subList(1, 3), "Data Science")

    val bootcampList = mutableListOf(bootcamp1, bootcamp2, bootcamp3)

    println("El bootcamp creado se llamará ${bootcamp1.name}")

    bootcamp1.printParticipantWithNoComma()

    // Quiero que me digas cuantos alumnos mayores de 25 años tiene el bootcamp
    bootcamp1.printParticipantOlderThan25()
    println()

    printStudentsName(bootcampList)
    printTeachersName(bootcampList)
    printBootcampWithMoreThan3Students(bootcampList)
    printBootcampWithMoreThan1Teacher(bootcampList)
    printStudentsWithAInName(studentList)
    printStudentsWithNoAInName(studentList)
    printStudentNameWhenSurnameStartsWithG(studentList)


    printBootcampByStudentName(bootcampList, "Carlos")
    printBootcampByStudentName(bootcampList, "Roberta")
    printBootcampByStudentNameOnlyOnce(bootcampList, "Roberta")
    printStudentsInMoreThanXBootcamp(studentList, bootcampList, 2)
}

// Imprimir todos los nombres de los student que están apuntados a un bootcamp
fun printStudentsName(bootcampList: List<Bootcamp>) {
    println("******Ejercicio 10.1********")
    println("Los nombres de los student que están apuntados a cada bootcamp son: ")
    // A lo bruto sería así
    /*bootcampList.forEach { bootcamp ->
        println("${bootcamp.name.toUpperCase()}:")
        bootcamp.studentList.forEach { student ->
            println(student.name)
        }
    }*/
    // A lo refinado
    bootcampList.forEach { bootcamp ->
        println("${bootcamp.name.toUpperCase()}:")
        bootcamp.printStudents()
    }
}

// Imprimir todos los nombres de los teacher que están apuntados a cada bootcamp
fun printTeachersName(bootcampList: List<Bootcamp>) {
    println("******Ejercicio 10.2********")

    println("Los nombres de los teacher que están apuntados a cada bootcamp son: ")
    bootcampList.forEach { bootcamp ->
        println("${bootcamp.name.toUpperCase()}:")
        bootcamp.printTeachers()
    }
}

// Escribir en consola el nombre de los bootcamps que tengan más de 2 estudiantes
fun printBootcampWithMoreThan3Students(bootcampList: List<Bootcamp>){
    println("******Ejercicio 10.3********")

    println("Los bootcamps que tienen más de 3 estudiantes son: ")
    bootcampList.forEach {
        if (it.studentList.size > 3){
            println(it.name)
        }
    }
}

// Escribir en consola el nombre de los bootcamps que tengan más de 1 profesor
fun printBootcampWithMoreThan1Teacher(bootcampList: List<Bootcamp>){
    println("******Ejercicio 10.4********")

    println("Los bootcamps que tienen más de un profesor son: ")
    bootcampList.forEach {
        if (it.teacherList.size > 1){
            println(it.name)
        }
    }
}


// Escribir el nombre de todos los students que tenga una letra "a"
fun printStudentsWithAInName(studentList: List<Student>){
    println("******Ejercicio Extra 1********")
    println("Los estudiantes cuyo nombre contiene una \"a\" son: ")
    // Forma 1 de hacerlo
    println("Forma 1")
    studentList.forEach { student ->
        if (student.name.contains("a") || student.name.contains("A")){
            println(student.name)
        }
    }
    // Forma 2 de hacerlo
    println("Forma 2")
    studentList.forEach { student ->
        if (student.name.toUpperCase().contains("A")){
            println(student.name)
        }
    }
    // Forma 3 de hacerlo
    println("Forma 3")
    studentList.forEach { student ->
        if (student.name.toLowerCase().contains("a")){
            println(student.name)
        }
    }

}

// Escribir el nombre de todos los students que no tengan una letra "a" en el nombre
fun printStudentsWithNoAInName(studentList: List<Student>){
    println("****** Ejercicio Extra 2 ********")
    println("Los estudiantes cuyo nombre contiene una \"a\" son: ")
    // Forma 1 de hacerlo
    println("Forma 1")
    studentList.forEach { student ->
        if (!student.name.contains("a") || !student.name.contains("A")){
            println(student.name)
        }
    }
    // Forma 2 de hacerlo
    println("Forma 2")
    studentList.forEach { student ->
        if (!student.name.toUpperCase().contains("A")){
            println(student.name)
        }
    }
    // Forma 3 de hacerlo
    println("Forma 3")
    studentList.forEach { student ->
        if (!student.name.toLowerCase().contains("a")){
            println(student.name)
        }
    }
}

// Escribir el nombre de los alumnos cuyo apellido empieza por G
fun printStudentNameWhenSurnameStartsWithG(studentList: List<Student>){
    println("****** Ejercicio Extra 3 ********")

    studentList.forEach {
        if (it.surname.startsWith("G")) {
            println(it.name)
        }
    }
}
// Imprimir el nombre de todos los bootcamp en los que el nombre de X persona aparece como estudiante
fun printBootcampByStudentName(bootcampList: List<Bootcamp>, name: String){
    println("****** Ejercicio Extra 4 con $name ********")

    bootcampList.forEach { bootcamp ->
        bootcamp.studentList.forEach { student ->
            if (name == student.name) {
                println(bootcamp.name)
            }
        }
    }
}

// Imprimir el nombre de todos los bootcamp en los que el nombre de X persona aparece como estudiante, asegurandonos
// de que el nombre del bootcamp solo saldrá una vez por bootcamp.
fun printBootcampByStudentNameOnlyOnce(bootcampList: List<Bootcamp>, name: String){
    println("****** Ejercicio Extra 5 con $name ********")
    for (bootcamp in bootcampList) {
        var encontrado = false
        for (student in bootcamp.studentList) {
            if (name == student.name) {
                encontrado = true
            }
        }
        if (encontrado == true)
            println(bootcamp.name)
    }
}

// Imprimir el nombre de los bootcamp que tienen más de X alumnos
fun printBootcampNameIfMoreThanXStudents(bootcampList: List<Bootcamp>, studentNumber : Int){
    println("****** Ejercicio Extra 6 ********")
    bootcampList.forEach {
        if (it.studentList.size > studentNumber) {
            println(it.name)
        }
    }
}

// Imprimir el nombre de los alumnos que están en matriculados en X bootcamps a la vez
fun printStudentsInMoreThanXBootcamp(studentList: List<Student>, bootcampList: List<Bootcamp>, bootcampNumber : Int){
    println("****** Ejercicio Extra 7 ********")
    studentList.forEach { student ->
        var contador = 0
        bootcampList.forEach { bootcamp ->
            if (bootcamp.studentList.contains(student)) {
                contador++
            }
        }
        if (contador == bootcampNumber){
            println("${student.name} está apuntando en $bootcampNumber bootcamp(s)")
        }
    }
}



// Imprimir por cada alumno su nombre junto con los bootcamp en los que están apuntados.


// Imprimir el nombre de todos los alumnos que tenga un profesor.

// Imprimir el nombre de todos los profesores que tenga un alumno.

// Clase Student
// Clase Teacher
// Clase Bootcamp
