import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import com.Function.*;
public class taskTest {

	removingA obj=new removingA();
	@Test
	public void test1() {
		Assert.assertEquals("BCD", obj.removeAFunction("ABCD"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("CD", obj.removeAFunction("AACD"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("BCD", obj.removeAFunction("BACD"));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals("BBAA", obj.removeAFunction("BBAA"));
	}
	
	@Test
	public void test5() {
		Assert.assertEquals("BAA", obj.removeAFunction("AABAA"));
	}

}
