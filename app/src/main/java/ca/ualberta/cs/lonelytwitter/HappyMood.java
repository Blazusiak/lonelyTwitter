/**
 * HappyMood
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
 * Represents HappyMood
 */
public class HappyMood extends Mood{
    /**
     * Constructs a HappyMood Object.
     */
    public HappyMood(){
        super();
    }

    /**
     * Constructs a HappyMood Object.
     * @param date date
     */
    public HappyMood(Date date){
        super(date);
    }

    /**
     * Gets the String "Happy"
     * @return "Happy"
     */
    @Override
    public String getMood(){
        return "Happy";
    }
}
