/**
 * SadMood
 *
 * Version 1.0
 *
 * September 27, 2017
 *
 * Copyright © 2017 Jacob Blazusiak, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact jblazusi@ualberta.ca
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a SadMood
 */

public class SadMood extends Mood{
    /**
     * Constructs the SadMood object
     */
    public SadMood(){
        super();
    }

    /**
     * Constructs the SadMood object
     * @param date date
     */
    public SadMood(Date date){
        super(date);
    }

    /**
     * Get the mood
     * @return mood
     */
    @Override
    public String getMood(){
        return "Sad";
    }
}
