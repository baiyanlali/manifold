package manifold.ext.props.stuff;


import manifold.ext.props.rt.api.PublicDefault;

@PublicDefault
public class PublicDefaultClass {
    int defaultPublicVar;
    private int defaultPrivateVar;
    public int PublicVar;
    protected int defaultProtectVar;

    public PublicDefaultClass(int defaultPublicVar, int defaultPrivateVar, int publicVar, int defaultProtectVar){
        this.defaultPublicVar = defaultPublicVar;
        this.defaultPrivateVar = defaultPrivateVar;
        this.PublicVar = publicVar;
        this.defaultProtectVar = defaultProtectVar;
    }
}
