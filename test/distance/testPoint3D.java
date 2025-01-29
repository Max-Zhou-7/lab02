package distance;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


/**
 * beginning of test class.
 */
public class testPoint3D {
  Point3D a;
  Point3D b;
  Point3D c;

  /**
   * set up variable.
   */
  @Before
  public void setup() {
    a = new Point3D();
    b = new Point3D(1,2,3);
    c = new Point3D(a);
  }

  /**
   * test get x.
   */
  @Test
  public void testGetX() {
    assertEquals(0, a.getX());
    assertEquals(1, b.getX());
    assertEquals(0, c.getX());
  }

  /**
   * test get y.
   */
  @Test
  public void testGetY() {
    assertEquals(0, a.getY());
    assertEquals(2, b.getY());
    assertEquals(0, c.getY());
  }

  /**
   * test get z.
   */
  @Test
  public void testGetZ() {
    assertEquals(0, a.getZ());
    assertEquals(3, b.getZ());
    assertEquals(0, c.getZ());
  }

  /**
   * test the get distance.
   */
  @Test
  public void testDistance() {
    assertEquals(0,a.distanceTo(c),0);
    assertEquals(Math.sqrt(14), b.distanceTo(a),0.01);
  }

  /**
   * test the equal function.
   */
  @Test
  public void testEqual() {
    assertEquals(true, a.equals(c));
    assertEquals(false, b.equals(c));
  }

}
