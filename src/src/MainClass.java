public class MainClass {
    String name;
    int age;
    public static void main(String[] args) {
        System.out.println("Hello Worl");
        System.out.println("Commit and Push this changes");
        //Add an comment below
        int total = 0;
        int [] arr = {5,1,7,2,7};
        for (int i =0; i < arr.length; i++){
           total += i;
        }
        System.out.println("Sum of array is: " + total);
        System.out.println("Sum of array + 10 is:" + total + 10);

        MainClass mainClass = new MainClass();
        mainClass.name = "Andrew";
        mainClass.age = 26;
        System.out.println("Our client is " + mainClass.name + " and he have " + mainClass.age);
    }
public String name (String name){
        this.name = name;
        return name;
}
    public int age (int age){
        this.age = age;
        return age;
    }

}
