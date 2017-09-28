/**
 * Mood
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
 * Represents Mood
 */
public abstract class Mood {
    private Date date;

    /**
     * Constructs a Mood Object.
     */
    public Mood() {
        date = new Date();
    }

    /**
     * Constructs a Mood Object.
     * @param date date
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * Get the Date.
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the Date
     * @param date date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Get the mood
     * @return mood
     */
    public abstract String getMood();
}
