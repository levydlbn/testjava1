/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testdocker1;


/**
 *
 * @author 84965
 */
public class TestDocker1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        int count = 0;
        try {
            while(true) {
                Thread.sleep( 2000);
                System.out.println("Helo sdfsdfdsf" + count++);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
