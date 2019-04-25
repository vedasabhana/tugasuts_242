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
public class komputer {
    private cpu cpu;
    public komputer(){
    }
    public komputer(cpu cpu){
        this.cpu = cpu;
    }
    public void memasang (cpu cpu){
        this.cpu = cpu;
        System.out.println("CPU         : "+this.cpu.getCPUData()+"Ghz"+" dipasang");
    }
    public void mencabut (cpu cpu){
        this.cpu = cpu;
        System.out.println("CPU         : "+this.cpu.getCPUData()+"Ghz"+" dicabut");
    }
    public void cetakInfo(){
        System.out.println("Spesifikasi : "+this.cpu.getCPUData()+"Ghz");
    }
}
