package org.sagittarius.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemo {
	static int a;
	
	@BeforeClass
	public static void boforeClass() {
		System.out.println("== JunitDemo ==");
		a = 1;
	}

	@Before
	public void bofore() {
		System.out.println("bofore");
	}

	@After
	public void after() {
		System.out.println("after");
	}

	@Test
	public void test1() {
		System.out.println("test1");
		Assert.assertEquals(1, 2);
	}

	@Test
	public void test2() {
		System.out.println("test2");
		Assert.assertEquals(1, 1);
	}

	@Test
	public void test3() {
		System.out.println("test3");
		Integer.valueOf("aede21");
	}

}
