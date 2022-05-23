package manifold.ext.props.rt.api;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Public Default is an annotation that can help you
 * automate complete public modifier in your code when compiling.
 * Normally you can not access defaultInt out of the package.
 * But now with annotation PublicDefault,
 * the compiler can complete public modifier
 * for you so you can access it anywhere.
 * Like:
 *  Example example = new Example();
 *  print(example.defaultInt);
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
public @interface PublicDefault {
}
