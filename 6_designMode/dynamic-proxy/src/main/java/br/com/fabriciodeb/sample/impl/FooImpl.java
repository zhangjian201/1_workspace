package br.com.fabriciodeb.sample.impl;

import br.com.fabriciodeb.sample.Foo;

public class FooImpl implements Foo {

	public void foo() {
		System.out.println("say foo");		
	}
    public void fooInt(int i) {
        System.out.println("say fooInt");
    }

    public void fooString(String i) {
        System.out.println("say fooString");
    }
}
