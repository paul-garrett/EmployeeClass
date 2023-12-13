// Write a Main.java program that does the following:
// - Instantiates an Employee object
// - Checks to see if the employee is a member of the “Tech Department”
// - Checks to see if the employee has been employed 5 years or more
// - If both cases are true, the program should give the employee a 5% raise
// - The Employee pay data field should be updated to reflect the increase.
// - Print the employee’s previous salary and their newly calculated salary. Print using the getter method for the pay data field.

class Main {
  public static void main(String[] args) {
    Employee e1 = new Employee("Paul", "Tech Department", "peon", 50000, 7);
    System.out.println("Name: "+e1.getName());
    System.out.println("Department: "+e1.getDepartment());
    System.out.println("Position: "+e1.getPosition());
    System.out.println("Pay: $"+e1.getPay());
    System.out.println("Years Employed: "+e1.getYearsEmployed());
  
  if (e1.getDepartment().equals("Tech Department") && e1.getYearsEmployed() >= 5) {
  // System.out.println(e1.getPay()*1.05);
    e1.giveRaise(5);
    System.out.println("Previous salary: $"+e1.getPay());
    System.out.println("New salary: $"+e1.getPay());
  } else {
    System.out.println("Employee is not eligible for a raise.");
  }
}
}
