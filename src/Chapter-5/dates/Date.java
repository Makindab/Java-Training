class Date {
    // Write your code here
    int y;
    int m;
    int d;
    int[] k = { 1, 3, 5, 7, 8, 10, 12 };
    int[] l = { 4, 6, 9, 11 };

    public Date(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public String toISO() {
        if (m < 10 && d < 10) {
            return this.y + "-0" + this.m + "-0" + this.d;
        } else if (m < 10) {
            return this.y + "-0" + this.m + "-" + this.d;
        } else if (d < 10) {
            return this.y + "-" + this.m + "-0" + this.d;
        } else {
            return this.y + "-" + this.m + "-" + this.d;
        }
    }

    public boolean isValid() {
        if (m >= 1 && m <= 12) {
            if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d >= 1 && d <= 31)) {
                return true;
            } else if ((m == 4 || m == 6 || m == 9 || m == 11) && (d >= 1 && d <= 30)) {
                return true;
            } else if (m == 2) {
                if (!isLeapYear(y) && (d < 1 || d > 28)) {
                    return false;
                } else if (isLeapYear(y) && (d < 1 || d > 29)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public int daysUntil(Date target) {
        int thisDayOfYear = dayOfYear(this.y, this.m, this.d);
        int targetDayOfYear = dayOfYear(target.y, target.m, target.d);

        int thisdays = this.y * 365 + thisDayOfYear + countLeapYears(this.y);
        int targetdays = target.y * 365 + targetDayOfYear + countLeapYears(target.y);

        return Math.abs(targetdays - thisdays);
    }
    
    private int countLeapYears(int year) {
        int count = 0;
        for (int i = 1; i < year; i++) {
            if (isLeapYear(i)) {
                count++;
            }
        }
        return count;
    }

    private int dayOfYear(int year, int month, int day) {
        int days = day;

        for (int i = 1; i < month; i++) {
            days += DaysInMonth(i, year);
        }
        if (isLeapYear(year) && month > 2) {
            days++;
        }
        return days;
    }
       

    private int DaysInMonth(int month, int day) {
        if (month == 2) {
            return isLeapYear(y) ? 29 : 28;
        } else if (Has(k, month)) {
            return 31;
        } else if (Has(l, month)) {
            return 30;
        }
        return 0;
    }

    private boolean Has(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check whether the given year is a leap year.
     * 
     * @param y the year to check
     * @return true if 'y' is a leap year, false otherwise
     */
    static boolean isLeapYear(int y) {
        return ((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0);
    }
}