class CopartBenifits{
    public int gymBenifits(int val){
        return Math.min(5000,val);
    }
    public int medicalBenifits(int val){
        return Math.min(10000,val);
    }
}
class Oopsteam extends CopartBenifits{
    int id;
    String role;
    String name;
    Oopsteam(int id, String role, String name){
        this.id = id;
        this.role = role;
        this.name = name;
    }
    public String toString(){
        return "Employee ID: " + id + ", Role: " + role + ", Name: " + name;
    }
}
public class InheritanceExample{
    public static void main(String[] args){
        Oopsteam emp1 = new Oopsteam(101, "tech lead", "Gopi");
        Oopsteam emp2 = new Oopsteam(102, "tech_lead", "Nagendra");
        CopartBenifits obj1=new Oopsteam(103,"intern","amith");//what happens here how it works?
        if(obj1 instanceof Oopsteam){
            Oopsteam obj2=(Oopsteam) obj1;
            System.out.println(obj2.id+" "+obj2.role);
        }
        System.out.println(emp1);
        System.out.println("Gym Benefits: " + emp1.gymBenifits(6000));
        System.out.println("Medical Benefits: " + emp1.medicalBenifits(12000));
        System.out.println(emp2);
        System.out.println("Gym Benefits: " + emp2.gymBenifits(4000));
        System.out.println("Medical Benefits: " + emp2.medicalBenifits(8000));

    }
}