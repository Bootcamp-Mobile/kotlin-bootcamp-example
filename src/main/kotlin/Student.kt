class Student(var name : String,
              var surname : String = "",
              var age : Int = 18,
              private var email : String = ""){

    fun fullName() : String {
        return "$name $surname"
    }

    fun updateEmail(email : String) {
        if (email.contains("@")) {
            println("El email ${this.email} se ha actualizado a $email")
            this.email = email
        } else {
            println("El email es incorrecto. No se ha actualizado")
        }
    }

    fun isOlderThan25():Boolean {
        return age > 22
    }
}
