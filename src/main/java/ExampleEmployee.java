public class ExampleEmployee {

    public static void main(String[] args) {

        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Ivnov Ivan Ivanovich", "Director", "ivan@mail.com",
                "89999999999", 100000, 43);
        employeeArr[1] = new Employee("Petrov Petr Petrovich", "Manager", "petrov@mail.com",
                "89111111111", 70000, 41);
        employeeArr[2] = new Employee("Victorov Victor Victorovich", "Accountant",
                "victor@mail.com", "89222222222", 40000, 31);
        employeeArr[3] = new Employee("Ivanova Anna Nikolayevna", "Secretary",
                "anna@gmail.com", "89333333333", 30000, 25);
        employeeArr[4] = new Employee("Borisova Olga Borisovna", "Cleaning manager",
                "olga@gmail.com", "89444444444", 20000, 64);

        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].age > 40) {
                employeeArr[i].printEmployee();
                System.out.println();
            }
        }
    }


}
