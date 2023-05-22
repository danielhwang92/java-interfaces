/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.gob.bomberosquito.java.interfaces;

/**
 *
 * @author danielhwang
 */
public class JavaInterfaces {

    public static void main(String[] args) {
       Dog dog = new Dog();
       dog.makeNoise();
       
       Cat cat = new Cat();
       noise(cat);
    }
    
    private static void noise(MakesNoise makesNoise) {
        makesNoise.makeNoise();
    }
}
