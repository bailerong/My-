class Base1{
    public int i=1;
}
class Deriver1 extends Base1{
    public int i=2;
        }
public class Test1 {
    public static void main(String[] args) {
        Base1 b = new Deriver1();
        System.out.println(b.i);
    }
}
