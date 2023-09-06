import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // put your code here
    int a=0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    if (n<10000&& n>0){
    if (k<10000 && k>0)
    a=k/n;
   System.out.println(a);
  }
  }
}