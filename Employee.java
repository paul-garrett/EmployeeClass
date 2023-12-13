// Data Fields:
// - Employee name
// - Department
// - Position
// - Pay
// - Years employed

class Employee {
  private String name;
  private String department;
  private String position;
  private int pay;
  private int yearsEmployed;

  public Employee() {};

  public Employee(String name, String department, String position,int pay, int yearsEmployed) {
    this.name = name;
    this.department = department;
    this.position = position;
    this.pay = pay;
    this.yearsEmployed = yearsEmployed;
  }

  public String getName() {
    return name;
  }

  public String getDepartment() {
    return department;
  }

  public String getPosition() {
    return position;
  }

  public double getPay() {
    return pay;
  }

  public double getYearsEmployed() {
    return yearsEmployed;
  }

  public void giveRaise(double percentage) {
    pay += pay*(percentage/100);
  }
}
