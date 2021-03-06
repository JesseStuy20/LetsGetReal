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
    System.out.println(a.divide(b)) ;
    System.out.println(a.subtract(b)) ;
    RationalNumber f = new RationalNumber(2,5) ;
    System.out.println(f.toString()) ;
    System.out.println(f.getNumerator()) ;
    System.out.println(f.getDenominator()) ;
    System.out.println(f.reciprocal()) ;
    RationalNumber g = new RationalNumber(2,9) ;
    System.out.println(f.equals(g)) ;
    System.out.println(f.equals(f)) ;
    RationalNumber h = new RationalNumber(6,18) ;
    System.out.println(h.toString()) ;
    System.out.println(f.multiply(g)) ;
    System.out.println(f.divide(g)) ;
    System.out.println(f.add(g)) ;
    System.out.println(f.subtract(g)) ;
    RationalNumber i = new RationalNumber(14,1) ;
    System.out.println(i.toString()) ;
    RationalNumber j = new RationalNumber(0,5) ;
    System.out.println(j.toString()) ;
  }

}
