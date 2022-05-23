package manifold.ext.props;

import junit.framework.TestCase;
import manifold.ext.props.stuff.PublicDefaultClass;
import org.junit.Test;
/**
 * This is a test class for annotation: PublicDefault.
 */

public class PublicDefaultTest  extends TestCase {
  /**
   * Test for implement issue #261.
   * We test if we can access default variable defaultPublicVar.
   */
  @Test
  public void testPublicDefaultVarAccess() {
    final PublicDefaultClass defaultClass =
              new PublicDefaultClass(10, 0, 0);
    assertEquals("Test for default variable",
              defaultClass.defaultPublicVar, 10);
  }

  /**
   * Test for implement issue #261:
   * We test if we can access default function defaultAddFunction.
   */
  @Test
  public void testPublicDefaultFunctionAccess() {
    final PublicDefaultClass defaultClass =
            new PublicDefaultClass(10, 0, 0);
    assertEquals("Test for default function",
            defaultClass.defaultAddFunction(2, 3), 5);
  }

  /**
  * Test for implement issue #261:
  * Test if we can access default nested class PublicDefaultClass.publicClass.
  */
  @Test
  public void testPublicDefaultClassAccess() {
    final PublicDefaultClass.DefaultClass defaultClass =
            new PublicDefaultClass.DefaultClass();
    assertEquals("Test for default class generation and variable access",
            defaultClass.reachablePublicVar, 0);
    //static is auto added
    final PublicDefaultClass.PublicClass publicClass =
            new PublicDefaultClass.PublicClass();
    publicClass.reachablePublicVar = 1;
  }
}
