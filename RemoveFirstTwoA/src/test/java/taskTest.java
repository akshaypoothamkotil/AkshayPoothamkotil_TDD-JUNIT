import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import com.Function.*;
public class taskTest {

	removingA obj=new removingA();
	@Test
	public void test1() {
		//removingA.removeAFunction("ABCD")
		Assert.assertEquals("BCD", obj.removeAFunction("ABCD"));
	}
	
	@Test
	public void test2() {
		//removingA.removeAFunction("ABCD")
		Assert.assertEquals("CD", obj.removeAFunction("AACD"));
	}
	
	@Test
	public void test3() {
		//removingA.removeAFunction("ABCD")
		Assert.assertEquals("BCD", obj.removeAFunction("BACD"));
	}
	
	@Test
	public void test4() {
		//removingA.removeAFunction("ABCD")
		Assert.assertEquals("BBAA", obj.removeAFunction("BBAA"));
	}
	
	@Test
	public void test5() {
		//removingA.removeAFunction("ABCD")
		Assert.assertEquals("BAA", obj.removeAFunction("AABAA"));
	}

}
