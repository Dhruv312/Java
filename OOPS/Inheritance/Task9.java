// 9. Static Final Variables in Hierarchical Inheritance:
//    - Problem Statement: Implement a hierarchical inheritance setup with classes 'Building', 'Office', and 'Residence'. The 'Building' class should have a static final variable 'BUILDING_TYPE', and a method 'showType()'. The 'Office' and 'Residence' classes should override 'showType()' to display specific information. Ensure correct use of static final variables and method overriding.
class Building{
   protected static final String building_type="Generic Building";
   
    public void showType(){
        System.out.println("Building Type: "+building_type);
    }
}

class Office extends Building{

    public void showType(){
        System.out.println("Building Type: Office");
        System.out.println("Details: This is an office building");
    }
}

class Residence extends Building{
    public void showType(){
        System.out.println("Building Type: Residence");
        System.out.println("Details: This is an residence building");
    }
}


public class Task9 {
    public static void main(String[] args){
        Building building=new Building();
        Office office=new Office();
        Residence residence= new Residence();

        System.out.println("Generic Building: ");
        building.showType();

        System.out.println("Office Building: ");
        office.showType();

        System.out.println("Residence Building: ");
        residence.showType();
    }
}
