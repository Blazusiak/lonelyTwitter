/**
 * NormalTweet
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
 * Represents a NormalTweet
 */
public class NormalTweet extends Tweet{
    /**
     * Constructs NormalTweet Object
     * @param message message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs a NormalTweet Object.
     * @param message message
     * @param date date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Returns False if isImportant
     * @return False
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
