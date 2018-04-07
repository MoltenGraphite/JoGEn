package jogen.math;

public class Vector2 {
  public double x,y;
  
  public double getMagnitude() {
    return Math.sqrt((x*x)+(y*y));
  }
  public void setMagnitude(double d) {
    double m = d/getMagnitude();
    this.x*=m;this.y*=m;
  }
  public Angle getAngle() {
    return new Angle(this);
  }
  public void setAngle(double d) {setAngle(new Angle(d));}
  public void setAngle(Angle a) {
    double m = getMagnitude();
    this.x = a.cos()*d;this.y=a.sin()*d;
  }
  
  public Vector2(double x,double y) {
    this.x=x;this.y=y;
  }
  public Vector2(double m,Angle a) {
    this.x=1D;this.y=0D;
    setAngle(a);setMagnitude(m);
  }
  
  public Vector2 copy() {return new Vector2(x,y);}
  
  public Vector2 add(Vector2 b) {
    this.x+=b.x;this.y+=b.y;
    return this;
  }
  public Vector2 sum(Vector2 b) {
    return copy().add(b);
  }
  public Vector2 sub(Vector2 b) {
    this.x-=b.x;this.y-=b.y;
    return this;
  }
  public Vector2 dif(Vector2 b) {
    return copy().sub(b);
  }
  public Vector2 mul(double d) {
    this.x*=d;this.y*=d;
    return this;
  }
  public Vector2 prd(double d) {
    return copy().mul(d);
  }
}
