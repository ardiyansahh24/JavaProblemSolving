/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class BagiNol2 {
    public static void main(String [] args){
        System.out.println("sebelum pembagian");
        try{
            System.out.println(5/0);
        }
        catch (Throwable t){
            System.err.println("Terjadi pembagian nol");
        }
        System.err.println("Sesudah pembagian");
    }
}
