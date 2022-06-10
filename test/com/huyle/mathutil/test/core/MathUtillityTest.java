/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huyle.mathutil.test.core;

import com.huyle.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author HPMT233
 */
public class MathUtillityTest {
    //đây là class sẽ sử dụng các hàm của thư viện JUnit
    //để kiểm thử/kiểm tra code chính - hàm tínhGiaiThừa() bên
    //class core.MathUnil
    //viết cide để test code chính bên kia
    
    //có nhiều quy tắc dặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại!!!
    
    //hàm dưới đây là tình huống test hàm chạy thành công,trả về ngon
    //ta sẽ xài hàm kiểu well - đưa 5!,6!, ko chơi đưa -5!,30!
    
    //@Test Junit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main() 
    //Có nhìu @Test ứng với nhìu case khác nhau để kiểm thử hàm tình giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test thử tình hyong61 tử tế đầu vào,mày phải chạy đúng
        long expected = 1; //hy vọng 0! = 1
        //long actual = ; // gọi hàm cần test bên core/app chính/code chính
        long actual = MathUtil.getFactorial(n);
        
        //so sánh expected vs actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);
        
        
        //gộp thêm vài case thành công/đưa đầu vào ngon!! hàm phải tính ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1)); // tui mún 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); // tui mún 2! == 2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); // tui mún 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); // tui mún 4! == 24
        Assert.assertEquals(120, MathUtil.getFactorial(5)); // tui mún 5! == 120
        Assert.assertEquals(720, MathUtil.getFactorial(6)); // tui mún 6! == 720
        
        
        //hàm giúp so sánh 2 giá trị nào đó có giống nhau ko
        //nếu giống nhau -> thảy màu xanh đèn đường - đường thông, code ngon
        //                  ít nhất cho case đang test
        //nếu KO giống nhau -> thảy màu đỏ đèn đường
        //                      hàm ý expected và actual ko giống nhau
    }
    
    //hàm getF() ta thiết kế có 2 tình huống xử lí
    //1. đưa data tử tu61 trong [0..20] -> tính đúng đc n! - done
    //2. đưa data vào cà chớn, âm, >20; Thiết kế của hàm là ném ra ngoại lệ
    //tao kì vọng ngoại lệ xuất hiện khi n < 0 || n > 20
    //rất mong ngoại lệ xuất hiện với n cà chớn
    
    //nếu hàm nhận vào n<0 or n>20 và hàm ném ra ngoại lệ
    //HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> xanh phải xuất hiện
    
    //nếu hàm nhận vào n<0 or n>20 và hàm éo ném ra ngoại lệ
    //sure, HÀM CHẠY SAI THIẾT KẾ, SAI KÌ VỌNG, MÀU ĐỎ
    
    //Test case:
    //input : -5
    //expected : IllegalArgumentException xuất hiện
    //tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu
    //là những thứ ko thể đo lường so sánh theo kiểu value
    //mà chỉ có thể đo lường = cách chúng có xuất hiện hay ko
    //assertEquals() ko dùng để so sánh 2 ngoại lệ
    //      equals() là bằng nhau hay ko trên value
    
    
    //MÀU ĐỎ, DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT SỰ
    // NHƯNG KO PHỈA LÀ NGOẠI LỆ NHƯ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI
    // KO PHẢI HÀM NÉM SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5); //hàm @test chạy, hay hàm getF() chạy
//                                  // sẽ ném về ngoại lệ NumberFormat
//    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5); //hàm @test chạy, hay hàm getF() chạy
                                  // sẽ ném về ngoại lệ NumberFormat
    }
    
    //cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn!!!
    // xài lambda]
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //Tui cần thấy màu xanh khi chơi với 21!
    //@Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        
        //Assert.assertThrows(IllegalArgumentException.class,
                           //     () -> MathUtil.getFactorial(-5);
                          //  );
        try{
            MathUtil.getFactorial(-5); //hàm @test chạy, hay hàm getF() chạy
                                  // sẽ ném về ngoại lệ NumberFormat
        }catch(Exception e){
            //bắt try-catch là Junit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
            //nhưng ko chắc ngoại lệ mình cần có xuất hiện hay ko
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xh
            Assert.assertEquals("Invalid argument. N must be between 0..20", e.getMessage());
        }
        
        
    }
}
