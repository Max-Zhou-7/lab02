package distance;

/**
 * beginning of a class.
 */

public class Physics {
  /**
   * get velocity.
   * @param one point one location
   * @param two point two location
   * @param elapsedTime time
   * @return velocity
   */
  public static double velocity(Point3D one, Point3D two, double elapsedTime) {
    if (elapsedTime <= 0) {
      throw new IllegalArgumentException("Time cannot be 0 or less");
    }
    return one.distanceTo(two) / elapsedTime;
  }
}
