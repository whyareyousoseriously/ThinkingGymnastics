/**
 * 下午8:14:55
 * power
 */
package test.fun;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fun.MaxNumber2;
import junit.framework.Assert;

/**
 * 
 * @author cz
 * 2018年3月21日下午8:14:55
 */
class MaxNumber2Test {

	@Test
	void test() {
		Assert.assertEquals(false, MaxNumber2.comp("76", "863"));
	}

}
