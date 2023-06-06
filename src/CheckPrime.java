public class CheckPrime {

     public void check(int input){
        if(input<=1){
            System.out.println("enter value is not Prime");
        }
        
     }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter : ");
        int input=sc.nextInt();
        CheckPrime c=new CheckPrime();
        c.check(input);
    }
    
}
