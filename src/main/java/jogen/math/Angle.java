package jogen.math;

public class Angle {
  // Quick-Reference
  public static final double PI = Math.PI;

  private double r;
  
  public double getDegrees() {return (r/PI)*180D;}
  public void setDegrees(double d) {this.r=(d/180D)*PI;}
  public double getRadians() {return r;}
  public void setRadians(double d) {this.r=d;}
  public double getGradians() {return (r/PI)*200D;}
  public double setGradians(double d) {this.r=(d/200D)*PI;}
  
  public Angle(double r) {this(r,'r');}
  public Angle(double v,char u) {
    switch(u) {
      case 'd':setDegrees(v);break;
      case 'g':setGradians(v);break;
      case 'r':setRadians(v);break;
    }
  }
  public Angle(Vector2 v) {
    this(Math.atan2(v.y,v.x));
  }
  
  public Vector2 toVector() {return this.toVector(1D);}
  public Vector2 toVector(double m) {
    return new Vector2(Math.cos(r)*m,Math.sin(r)*m);
  }
}
