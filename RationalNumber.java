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
    reduce() ;
  }

  public double getValue() {
    return super.getValue() ;
  }

  public int getNumerator() {
    return numerator ;
  }

  public int getDenominator() {
    return denominator ;
  }

  public RationalNumber reciprocal() {
    RationalNumber result = new RationalNumber(this.denominator, this.numerator) ;
    return result ;
  }

  public boolean equals(RationalNumber other){
    return ((this.getNumerator() == other.getNumerator())
    && (this.getDenominator() == other.getDenominator()));
  }

  public String toString(){
    return getNumerator() + "/" + getDenominator() ;
  }

  private static int gcd(int a, int b) {
    if (a < b) {
      int temp = a ;
      a = b ;
      b = temp ;
    }
    int result = a % b ;
    for (int i=b; b>0; b=result) {
      result = a % b ;
      a = b ;
      b = result ;

    }
    return a ;
  }

  private void reduce() {
    int gcd = gcd(numerator,denominator) ;
    numerator = numerator / gcd ;
    denominator = denominator / gcd ;
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber result = new RationalNumber((this.numerator * other.numerator),
    (this.denominator * other.denominator)) ;
    result.reduce() ;
    return result ;
  }
  public RationalNumber divide(RationalNumber other){
    RationalNumber result = new RationalNumber((this.numerator * other.denominator),
    (this.denominator * other.numerator)) ;
    result.reduce() ;
    return result ;
  }

}
