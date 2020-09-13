
open class Employee(var builder: Builder){

    var firstName: String = ""
    var lastName: String = ""
    var id: String = ""
    var managerId: String = ""
    var isManager: Boolean = false

    init {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.id = builder.id;
        this.isManager = builder.isManager;
        this.managerId = builder.managerId;
    }


        class Builder{
            var firstName: String = ""
            var lastName: String = ""
            var id: String = ""
            var managerId: String = ""
            var isManager: Boolean = false

            fun build(): Employee {
                return Employee(this)
            }

            fun setFirstName(firstName: String):Builder{
                this.firstName = firstName
             return  this
            }

            fun setLastName(lastName: String): Builder {
                this.lastName = lastName
                return this
            }
            fun setId(id: String): Builder {
                this.id = id
                return this
            }

            fun setIsManager(manager: Boolean): Builder {
                isManager = manager
                return this
            }

            fun setManagerId(managerId: String): Builder{
                this.managerId = managerId
                return this
            }
        }

    }
fun main(){
    var employee =Employee.Builder()
            .setFirstName("Wafaa")
            .setLastName("Al_selwi")
            .setManagerId("1123")
            .setIsManager(true)
    println("My First Name is ${employee.firstName} , ${employee.lastName},${employee.managerId}")
}

