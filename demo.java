public class Person {

    private int age;

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative!");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String checkEligibility() {
        if (age >= 18) {
            return "Eligible to vote.";
        } else {
            return "Not eligible to vote.";
        }
    }

    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(19);

        System.out.println("Age: " + person.getAge());

        System.out.println(person.checkEligibility());
    }
}
