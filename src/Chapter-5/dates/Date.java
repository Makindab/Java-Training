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
        //target.d
        //this.d
        return null;
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

    public static void main(String[] args) {
        var d1 = new Date(1998, 6, 19);
        var d2 = new Date(1998, 6, 20);
        var d3 = new Date(1998, 7, 1);
        var d4 = new Date(1999, 1, 1);
        var d5 = new Date(2003, 1, 1);
        var d6 = new Date(2004, 1, 1);
        var d7 = new Date(2005, 1, 1);
        var d8 = new Date(2008, 8, 8);

        System.out.println("There are" + d1.daysUntil(d2) + " day(s) from Date(1998, 6, 19) to Date(1998, 6, 20)");
        System.out.println("There are" + d1.daysUntil(d3) + " day(s) from Date(1998, 6, 19) to Date(1998, 7, 1)");
        System.out.println("There are" + d1.daysUntil(d4) + " day(s) from Date(1998, 6, 19) to Date(1999, 1, 1)");
        System.out.println("There are" + d5.daysUntil(d6) + " day(s) from Date(2003, 1, 1) to Date(2004, 1, 1)");
        System.out.println("There are" + d6.daysUntil(d7) + " day(s) from Date(2004, 1, 1) to Date(2005, 1, 1)");
        System.out.println("There are" + d7.daysUntil(d8) + " day(s) from Date(2005, 1, 1) to Date(2008, 8, 8)");
        System.out.println("There are" + d8.daysUntil(d8) + " day(s) from Date(2008, 8, 8) to Date(2008, 8, 8)");
    }
}
