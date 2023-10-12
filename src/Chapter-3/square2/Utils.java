class Utils {
    static String createSquare(int size) {
        // Write your code here
        var m = "#";
        String s = "";
        
        for(var i = 1; i <= size; i++ ) {
            s = s + m.repeat(size) + System.lineSeparator();
            
        }
        return s;
    }
}
