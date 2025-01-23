public class VariableTypes {
    int instanceVariable = 10;
    static int staticVariable = 20;

    public void display() {
        int localVariable = 30;
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        obj.display();
    }
}
