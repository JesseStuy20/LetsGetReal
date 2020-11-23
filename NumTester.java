public class NumTester {

  public static void main(String[] args) {
    RealNumber a = new RealNumber(5.9) ;
    RealNumber b = new RealNumber(5.9) ;
    RealNumber c = new RealNumber(5.912) ;
    RealNumber d = new RealNumber(0.0) ;
    RealNumber e = new RealNumber(0.000000000000001) ;
    System.out.println(a.toString()) ;
    System.out.println(a.equals(b)) ;
    System.out.println(a.equals(c)) ;
    System.out.println(d.equals(a)) ;
    System.out.println(d.equals(e)) ;
    System.out.println(d.equals(d)) ;
    System.out.println(a.add(b)) ;
    System.out.println(a.multiply(b)) ;
  }

}
