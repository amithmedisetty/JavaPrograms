enum Operation{
    ADD,SUBTRACT, MULTIPLY,DIVIDE
}
class Evolution{
    void in5(int a){
        switch(a){
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            case 4:
                System.out.println("Case 4");
                break;
            default:
                System.out.println("Default case");

        }
    }
    void in7(String str){
        //from java 7 we can also have strings in switch statements
        switch(str){
            case "Hello":
                System.out.println("Hello case");
                break;
            case "World":
                System.out.println("World case");
                break;
            case "Java":
                System.out.println("Java case");
                break;
            default:
                System.out.println("Default string case");
        }
    }
    void in12(){
        //we can return the result and store in a variable ,
        // by using -> no fall through will happen,
        // if single expression it returns that if we use blocks by using yeild we can return the result
        int dayNum = 3;
        String dayName=switch (dayNum){
            case 1->"Moday";
            case 2->"Tuesday";
            case 3->"Wednesday";
            case 4->"Thursday";
            case 5->"friday";
            case 6->"saturday";
            case 7->"sunday";
            default -> "Invalid date";
        };
        System.out.println(dayName);

        //using yeild
        String yield;
        String dayName1=switch (5){
            case 1->"Moday";
            case 2->{
                System.out.println("checking for day 2");
                yield "Tuesday";
            }
            case 3->"wednesday";
            case 4->"Thurday";
            case 5->{
                System.out.println("looking for 5th day");
                yield "friday";
            }
            case 6->"saturday";
            default-> "invalid";
        };
        System.out.println(dayName1);
    }
    void in17(){

        Object obj = "Hello World";
        String result = switch (obj) {
            case Integer i -> "It's an Integer: " + i;
            case String s -> "It's a String: " + s.toUpperCase();
            case Double d -> "It's a Double: " + d;
            default -> "Unknown type";
        };
        System.out.println(result);
        Object item = "apple";
        String description = switch (item) {
            case String s when s.length() > 5 -> "Long string: " + s;
            case String s -> "Short string: " + s;
            case Integer i when i > 100 -> "Large integer: " + i;
            case Integer i -> "Small integer: " + i;
            default -> "Something else";
        };
        System.out.println(description); // Output: Short string: apple
    }
    void enumSwitch(String operation, int a, int b) {
        Operation op=Operation.valueOf(operation.toUpperCase());
        int result=switch (op) {
            case ADD->a + b;
            case SUBTRACT-> a - b;
            case MULTIPLY-> a * b;
            case DIVIDE->{
                yield a / b;
            }
        };
        System.out.println("Result: " + result);
    }
}
public class SwitchCase{
    public static void main(String[] args) {
        Evolution evolution = new Evolution();
        evolution.in5(2);
        evolution.in7("Hello");
        evolution.in12();
        evolution.in17();
        evolution.enumSwitch("ADD", 5, 3);
        evolution.enumSwitch("SUBTRACT", 10, 4);
    }
}