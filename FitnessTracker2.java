 package FitnessTracker;

import java.time.LocalDate;

public class FitnessTracker2 {
    private String activity;
    private int minutes;
    private LocalDate date;

    // Default constructor
    public FitnessTracker2() {
        this("running", 0, LocalDate.of(LocalDate.now().getYear(), 1, 1));
    }

    // Overloaded constructor
    public FitnessTracker2(String activity, int minutes, LocalDate date) {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }

    // Getter methods
    public String getActivity() {
        return activity;
    }

    public int getMinutes() {
        return minutes;
    }

    public LocalDate getDate() {
        return date;
    }
}