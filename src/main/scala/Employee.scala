
object Employee {

  def createEmployee(name: String, age: Int, salary: Double): String = {

    require(name != null && name.trim.nonEmpty, "Employee name cannot be empty")
    require(age > 18, "Employee age must be greater than 18")
    require(salary > 0, "Employee salary must be positive")

    s"Employee created: $name, Age: $age, Salary: $salary"
  }
}
