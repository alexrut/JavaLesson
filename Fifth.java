public class Fifth {
  public static void main (String [] arg) {
    int b = 5;
    int a = 12;
    int c =++b + a++;           // 6+12+1=19 true answer is 18 b=b+1(6) c=b+a(18) a=a+1(13)
    System.out.println(c);
    System.out.println(a);
    int d =b++ * 2;             //12 Its true
    System.out.println(d);
  }
}