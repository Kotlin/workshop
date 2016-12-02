package _6Reified.typeErasure

// Erasure of Generic Types

// Erasure of Generic Methods

class Node<T>(val data: T, val next: Node<T>)

/*
public final class Node {

  private final Ljava/lang/Object; data

  public final getData()Ljava/lang/Object;

  private final LNode; next

  public final getNext()LNode;

  public <init>(Ljava/lang/Object;LNode;)V
}

 */

fun <T> foo(t: T) {}
fun <T: Comparable<T>> bar(t: T) {}

/*
  public final static foo(Ljava/lang/Object;)V

  public final static bar(Ljava/lang/Comparable;)V
 */
