public class RealNumber {
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
    boolean result = false ;
    if ((getValue() == 0.0) && (other.getValue() == 0.0)) {
      result = true ;
    }
    if ((getValue() != 0.0) && (other.getValue() != 0.0)) {
      if (Math.abs(getValue() - other.getValue()) < 0.00001) {
        result = true ;
      }
    }
    return result ;
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
