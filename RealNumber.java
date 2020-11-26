public class RealNumber extends Number {
  private double value;

  public RealNumber(double v) {
    value = v ;
  }

  public double getValue() {
    return value ;
  }

  public String toString() {
    return getValue() + "" ;
  }

  public boolean equals(RealNumber other) {
    return super.equals(other) ;
  }

  public RealNumber add(RealNumber other) {
    RealNumber result = new RealNumber(this.getValue() + other.getValue()) ;
    return result ;
  }

  public RealNumber multiply(RealNumber other) {
    RealNumber result = new RealNumber(this.getValue() * other.getValue()) ;
    return result ;
  }

  public RealNumber divide(RealNumber other) {
    RealNumber result = new RealNumber(this.getValue() / other.getValue()) ;
    return result ;
  }

  public RealNumber subtract(RealNumber other) {
    RealNumber result = new RealNumber(this.getValue() - other.getValue()) ;
    return result ;
  }

}
