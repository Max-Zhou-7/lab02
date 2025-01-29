package distance;

import java.lang.Math;
import java.util.Objects;

/**
 * beginning of a class.
 */
public class Point3D {
  private final int x;
  private final int y;
  private final int z;

  /**
   * non-parameter constructor.
   */
  public Point3D() {
    this.x = 0;
    this.y = 0;
    this.z = 0;

  }

  /**
   * constructor with three integers.
   * @param x value x
   * @param y value y
   * @param z value z
   */
  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * get value of x.
   * @return x
   */
  public int getX() {
    return this.x;
  }

  /**
   * get value of y.
   * @return y
   */
  public int getY() {
    return this.y;
  }

  /**
   * get value of z.
   * @return z
   */
  public int getZ() {
    return this.z;
  }

  /**
   * copy constructor.
   * @param other other point
   */
  public Point3D(Point3D other) {
    this.x = other.x;
    this.y = other.y;
    this.z = other.z;
  }

  /**
   * get the distance between two points.
   * @param other point
   * @return the distance
   */
  public double distanceTo(Point3D other) {
    return Math.sqrt(Math.pow((other.getX() - getX()),2) + Math.pow((other.getY() - getY()),2)
            + Math.pow((other.getZ() - getZ()),2));
  }

  /**
   * test if two points are equal.
   * @param other point
   * @return a boolean value
   */
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null || getClass() != other.getClass()) return false;
    Point3D point3D = (Point3D) other;
    return Double.compare(x, point3D.x) == 0 && Double.compare(y, point3D.y) == 0
            &&  Double.compare(z, point3D.z) == 0;
  }

  /**
   * convert the data into integer.
   * @return integer
   */
  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

}