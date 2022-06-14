/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huyle.mathutil.test.core;

import com.huyle.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author dell
 */
// cau lech nay cua JUnit bao hieu rang se can loop qua cac tap data de
// lay cap data input/expected
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    // ta se tra ve mang 2 chieu gom nhieu cap Expected/Return
    @Parameterized.Parameters  ///Junit se ngam chay loop qua tung dong cua 
                               // mang de lay ratung cap input/expected
    // ten ham khogn quan trong, @ quan trong
    public static Object[] initData() {
        return new Integer[][]{
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
        };
    }
    
   // gia su loop qua tung dong cua mang, ta van can gan tung value cua cot
   // vao bien tuong ung input/ expected de lat hoi feed cho ham
    @Parameterized.Parameter(value = 0)     // value = 0 la map voi mang data
    public int n;   // bien map voi value cua cot 0 cua mang
    @Parameterized.Parameter(value = 1)
    public long expected;                   // kieu long vi gia trij cua ham getF() la long
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
       Assert.assertEquals(MathUtil.getFactorial(n),expected );
    }
}
