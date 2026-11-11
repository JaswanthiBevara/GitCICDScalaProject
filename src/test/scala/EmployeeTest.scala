
import org.scalatest.funsuite.AnyFunSuite

class EmployeeTest extends AnyFunSuite {

  test("Should create employee with valid details") {

    val result = Employee.createEmployee("Rahul", 25, 30000)

    assert(result.contains("Employee created: Rahul"))
  }

  test("Should reject empty employee name") {

    intercept[IllegalArgumentException] {
      Employee.createEmployee("", 25, 30000)
    }
  }

  test("Should reject invalid employee age") {

    intercept[IllegalArgumentException] {
      Employee.createEmployee("Rahul", 18, 30000)
    }
  }

  test("Should reject invalid salary") {

    intercept[IllegalArgumentException] {
      Employee.createEmployee("Rahul", 25, 0)
    }
  }
}
