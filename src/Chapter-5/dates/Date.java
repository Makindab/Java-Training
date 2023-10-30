class Date {
    // Write your code here

    /** Check whether the given year is a leap year.
     * 
     * @param y the year to check
     * @return true if 'y' is a leap year, false otherwise
     */
    static boolean isLeapYear(int y) {
        return ((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0);
    }
}
