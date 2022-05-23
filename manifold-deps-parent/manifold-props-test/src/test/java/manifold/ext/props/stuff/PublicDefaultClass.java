package manifold.ext.props.stuff;


import manifold.ext.props.rt.api.PublicDefault;

/**
 * Test class for {@link PublicDefault}.
 */
@PublicDefault
public class PublicDefaultClass {
  int defaultPublicVar;
  public int publicVar;
  protected int defaultProtectVar;

  /**
   * This is the constructor for {@link PublicDefaultClass}.
   *
   *  @param defaultPublicVar init defaultPublicVar.
   *
   *  @param defaultPrivateVar init privateVar.
   *
   *  @param publicVar init publicVar.
   *
   *  @param defaultProtectVar init defaultProtectVar.
   *
   */
  public PublicDefaultClass(
      int defaultPublicVar,
      int publicVar,
      int defaultProtectVar) {
    this.defaultPublicVar = defaultPublicVar;
    this.publicVar = publicVar;
    this.defaultProtectVar = defaultProtectVar;
  }

  int defaultAddFunction(int a, int b) {
    return a + b;
  }

  class DefaultClass {
    int unreachableDefaultVar;
    public int reachablePublicVar;
  }

  /**
   * a public nested class.
   */
  public class PublicClass {
    public int reachablePublicVar;
  }
}
