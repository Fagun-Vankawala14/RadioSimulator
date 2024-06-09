/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radiosimulator;

/**
 *
 * @author fagun
 */
public class Voice {

    public static final String KEY_WORD_STOP = "Stop Music";
    private String keyWord = "";

    public boolean equals(Object other) {
        if (((Voice) other).getKeyWord().equals(KEY_WORD_STOP)) {
            return true;
        }
        return false;
    }

    /**
     * @return the keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    /**
     * @param keyWord the keyWord to set
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
}
