public abstract class Number {

    public abstract double getValue() ;

    public boolean equals(Number other) {
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

    public int compareTo(Number other) {
      int result = 0 ;
      if (this.getValue() == other.getValue()) result = 0 ;
      if (this.getValue() > other.getValue()) result = 1 ;
      if (this.getValue() < other.getValue()) result = -1 ;
      return result ;
  }

}
