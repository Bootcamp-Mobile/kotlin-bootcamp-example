class Bootcamp(
    var studentList : MutableList<Student>,
    var teacherList : MutableList<Teacher>) {


    var name : String

    init {
        println("Introduce el nombre del bootcamp:")
        name = readLine().toString()
    }

    fun printParticipant() {
        print("TEACHERS: ")
        teacherList.forEach {
            print("${it.name},")
        }
        println()
        print("STUDENTS: ")
        studentList.forEach {
            print("${it.name},")
        }
        println()
    }

    fun printParticipantWithNoComma() {
        var text = "TEACHERS: "
        teacherList.forEach {
            // += añade el name al final de text
            text += "${it.name},"
        }
        text = text.substring(0, text.length-1)
        println(text)
        text = "STUDENTS: "
        studentList.forEach {
            // += añade el name al final de text
            text += "${it.name},"
        }
        text = text.substring(0, text.length-1)
        println(text)
    }

    fun printParticipantOlderThan25() {
        studentList.forEach {
            if (it.isOlderThan25()){
                print(it.name)
            }
        }
    }

}