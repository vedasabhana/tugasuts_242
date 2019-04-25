/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasuts_242;

/**
 *
 * @author IFV
 */
public class rakitan {


    public static void main(String[] args) {
        intel intel1 = new intel(2);
        amd amd1 = new amd(3);
        komputer komputer1 = new komputer(intel1);
        
        komputer1.cetakInfo();
        komputer1.memasang(intel1);
        komputer1.mencabut(amd1);
        komputer1.cetakInfo();
    }
    
}
