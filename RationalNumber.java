public class RationalNumber extends Number {
  private int numerator, denominator ;

  public RationalNumber(int nume, int deno) {
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
    return (numerator / denominator) ;
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
    String result = getNumerator() + "/" + getDenominator() ;
    if ((getNumerator() == 0) || (getDenominator() == 1)) result = getNumerator() + "" ;
    return result ;
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
    if (numerator != 0 ) {
      int gcd = gcd(numerator,denominator) ;
      numerator = numerator / gcd ;
      denominator = denominator / gcd ;
    }
    if (numerator == 0 ) denominator = 1 ;
  }

  public RationalNumber multiply(RationalNumber other) {
    RationalNumber result = new RationalNumber((this.numerator * other.numerator),
    (this.denominator * other.denominator)) ;
    result.reduce() ;
    return result ;
  }

  public RationalNumber divide(RationalNumber other) {
    RationalNumber result = new RationalNumber((this.numerator * other.denominator),
    (this.denominator * other.numerator)) ;
    result.reduce() ;
    return result ;
  }

  public RationalNumber add(RationalNumber other) {
    int lcm = ((this.denominator * other.denominator)
    / gcd(this.denominator,other.denominator)) ;
    int nume = ((lcm/this.denominator*this.numerator)
    + (lcm/other.denominator*other.numerator)) ;
    int deno = lcm ;
    RationalNumber result = new RationalNumber(nume,deno) ;
    result.reduce() ;
    return result ;
  }

  public RationalNumber subtract(RationalNumber other) {
    int lcm = ((this.denominator * other.denominator)
    / gcd(this.denominator,other.denominator)) ;
    int nume = ((lcm/this.denominator*this.numerator)
    - (lcm/other.denominator*other.numerator)) ;
    int deno = lcm ;
    RationalNumber result = new RationalNumber(nume,deno) ;
    result.reduce() ;
    return result ;
  }

}
