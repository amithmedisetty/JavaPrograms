public class InstanceInitializer {
    InstanceInitializer() {
        print("Constructor executed");
    }
    static int staticVar = print("Static variable initialized");
    int instanceVar = print("Instance variable initialized");
    static {
        print("Static block executed");
    }
    {
        print("Instance block executed");
    }

    void instanceMethod() {
        print("Instance method called");
    }
    static void staticMethod() {
        print("Static method called");
    }
    static int print(String msg) {
        System.out.println(msg);
        return 0;
    }
    public static void main(String[] args) {
        print("Main method started");
        InstanceInitializer obj = new InstanceInitializer();
        obj.instanceMethod();
        staticMethod();
    }
}
