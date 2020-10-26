public class MainClass {
   private String name;
   private int age;

    String name;
    int age;
  
    public static void main(String[] args) {
        System.out.println("Hello Worl");
        System.out.println("Commit and Push this changes");
        System.out.println("Hello Worl");
        System.out.println("Commit and Push this changes");
        //Add an comment below

        int total = 0;
        int [] arr = {5,1,7,2,7};
        for (int i =0; i < arr.length; i++){
           total += i;
        }
        System.out.println("Sum of array is: " + total);

        System.out.println(findIndex(arr,5));
    }
 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
  
    public static int findIndex(int arr[], int t)
    {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
}
