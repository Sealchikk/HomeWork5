public class Employee {
    private String fullName;
    private String post;
    private String mail;
    private String numberPhone;
    private int salary;
    public int age;

    public Employee() {

    }

    public Employee(String fullName, String post, String mail, String numberPhone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.mail = mail;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee() {
        System.out.printf(" fullName - %s\n post - %s\n mail - %s\n number phone - %s\n salary - %d\n age - %d\n",
                fullName, post, mail, numberPhone, salary, age);
    }



}
