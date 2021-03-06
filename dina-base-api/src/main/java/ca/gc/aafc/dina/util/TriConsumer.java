package ca.gc.aafc.dina.util;

/**
 * An operation that accepts three input arguments and returns no result.
 *
 * @param <K>
 *          first argument type
 * @param <V>
 *          second argument type
 * @param <S>
 *          third argument type
 */
public interface TriConsumer<A, B, C> {
  void accept(A a, B b, C c);
}
