/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radiosimulator;

/**
 *
 * @author fagun
 */
public class Radio {

    private int channel = 1;
    private int volume = 0;
    private boolean on;
    private Voice driverVoice;
    public static final int MAX_VOLUME = 10;

    /**
     * @return the channel
     */
    public int getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(int channel) {
        this.channel = channel;
    }

    /**
     * A getter for volume that also checks whether the driver is available (i.e has said something since the driver
     * gets initialized when they speak Will call lowerVolume if the driver says the "magic words"
     *
     * @return the volume
     */
    public int getVolume() {
        //put in a call to lower the volume if the driver is talking
        if (driverVoice != null) {
            lowerVolumeWhenTalking();//note that we can create a timer here
            //to check for the driver's magic keyword every 10 seconds
        }
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the on
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param on will switch on or off
     */
    public void power(boolean on) {
        this.on = on;
    }

    /**
     * Method under construction, used to simulate the reaction to a key word when the volume is turned up, it should
     * lower itself to half the max.
     */
    public void lowerVolumeWhenTalking() {
        if (driverVoice.getKeyWord().equals(Voice.KEY_WORD_STOP)) {
            volume = MAX_VOLUME / 2;//can simplify this
            System.out.println("Lowering volume in response to voice....");
        }
    }

    /**
     * A method to get the current driver's voice
     *
     * @return the voice object for the driver
     */
    public Voice getDriversVoice() {
        return driverVoice;
    }

    /**
     * a method to link the driver's voice to this particular Radio Object.
     *
     * @param driversVoice
     */
    public void registerDriversVoice(Voice driversVoice) {
        this.driverVoice = driversVoice;
    }

    /**
     * A method to switch the power to the on position.
     */
    public void switchOn() {
        on = true;
    }
}
