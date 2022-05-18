package manifold.ext.props;

import junit.framework.TestCase;
import manifold.ext.props.stuff.PublicDefaultClass;


public class PublicDefaultTest  extends TestCase {
    public void testPublicDefaultAccess()
    {
        PublicDefaultClass defaultClass = new PublicDefaultClass(10,0,0,0);
        assertEquals(defaultClass.PublicVar, 0);
        assertEquals(defaultClass.defaultPublicVar, 10);
    }
}
