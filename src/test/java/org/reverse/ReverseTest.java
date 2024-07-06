package org.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {

    @Test
    void test00() {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // a -> b -> c -> d -> e -> f

        Node<String> r=Source.reverseList(a); // f -> e -> d -> c -> b -> a
        assertEquals("f",r.val);
        r=r.next;
        assertEquals("e",r.val);
        r=r.next;
        assertEquals("d",r.val);
        r=r.next;
        assertEquals("c",r.val);
        r=r.next;
        assertEquals("b",r.val);
        r=r.next;
        assertEquals("a",r.val);
    }

    @Test
    void test01() {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
        x.next = y;
        // x -> y

        Node<String> r=Source.reverseList(x); // y -> x
        assertEquals("y",r.val);
        r=r.next;
        assertEquals("x",r.val);
        r=r.next;
        assertEquals(null,r);
    }

    @Test
    void test02() {
        Node<String> p = new Node<>("p");

        // p

        assertEquals("p",Source.reverseList(p).val); // p
    }

}
