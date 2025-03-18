git checkoutpackage FitnessTracker;

import java.time.LocalDate;

public class FitnessTracker {
    private String activity;
    private int minutes;
    private LocalDate date;

    // Default constructor
    public FitnessTracker() {
        this("running", 0, LocalDate.of(LocalDate.now().getYear(), 1, 1));
    }

    // Overloaded constructor
    public FitnessTracker(String activity, int minutes, LocalDate date) {
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