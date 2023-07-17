package sg.edu.rp.c346.id22023330.demotodolist;

import java.util.Calendar;

public class todo {

    private String title;
    private Calendar date;

    public todo (String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDay() {
        String[] dayOfWeekStrings = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        return dayOfWeekStrings[dayOfWeek - 1];
    }

    @Override
    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
                +"/"+date.get(Calendar.YEAR) + " (" + date.get(Calendar.DAY_OF_WEEK) + ")";

        return str;
    }
}