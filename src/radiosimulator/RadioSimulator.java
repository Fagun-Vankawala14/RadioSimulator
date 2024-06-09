/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radiosimulator;

/**
 *
 * @author fagun
 */
public class RadioSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio();
        radio.switchOn();
        radio.setVolume(Radio.MAX_VOLUME);//turn up your favourite song
        System.out.println("Is the radio on? " + radio.isOn());
        System.out.println("And playing at volume: " + radio.getVolume());
        Voice driver = new Voice();
        radio.registerDriversVoice(driver);//connect the Radio and the driver's voice
        driver.setKeyWord("Stop Music");
        //we need some sort of trigger for the volume lowering, for now
        //we simulate it with a check to the volume

        System.out.println("Now playing at volume: " + radio.getVolume());
    }

}
