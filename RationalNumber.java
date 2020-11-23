public class RationalNumber extends RealNumber {
  private int numerator, denominator ;

  public RationalNumber(int nume, int deno) {
    super((nume+0.0) / deno) ;
    numerator = nume ;
    denominator = deno ;
    if (deno == 0) {
      numerator = 0 ;
      denominator = 1 ;
    }
    if (deno < 0) {
      numerator = (nume * -1) ;
      denominator = (deno * -1) ;
    }
  }

  public double getValue() {
    return super.getValue() ;
  }

}
