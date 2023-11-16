class Departure {
    // Write your code here
    int hour;
    int minutes;
    String destination;

    public Departure(int hour, int minutes, String destination) {
        this.hour = hour;
        this.minutes = minutes;
        this.destination = destination;
    }

    public String toString() {
        var str = this.hour + ":" + this.minutes + " " + this.destination;
        return str;
    }

    public boolean leavesBefore(Departure other) {
        return this.toString().equals(other.toString());
    }
    public void delay(int minutes) {
        this.minutes += minutes;
        this.hour += this.minutes / 60;
        this.minutes %= 60;
    }
    
}
