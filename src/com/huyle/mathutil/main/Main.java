/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huyle.mathutil.main;

import com.huyle.mathutil.core.MathUtil;

/**
 *
 * @author HPMT233
 */
public class Main {
    public static void main(String[] args) {
        
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế ko
        //ta phải đưa các tình huống sử dụng hàm trong thực tế
        //ví dụ: -5 coi tính đc ko
        //        0 coi tính mấy
        //        20 coi tính mấy
        //        21 coi tính ra mấy!!!
        //TEST CASE: Một tình huống hàm/app/màn hình/tính năng đc đưa vào sử dụng
        //giả lập hành vi xài của ai đó!!!
        
        //TEST CASE: LÀ 1 TÍNH HUỐNG SỪ DỤNG, XÀI APP (HÀM) MÀ NÓ BAO HÀM
        //INPUT: DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        //OUTPUT: ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM/CHỨC NĂNG CỦA APP,DĨ NHIÊN DÙNG ĐẦU VÀO
        //ĐỂ XỬ LÝ
        //KỲ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT
        //SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY KO
        
        long expected = 120; //tao kỳ vọng hàm ói về 120 nếu tính 5!
        int n = 5;             //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");

    }
}
