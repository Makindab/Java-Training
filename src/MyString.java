public class MyString {
    public static void main(String[] args) {
        var str = "Hello!";
        var len = str.length();
        var char0 = str.charAt(0);
        var char3 = str.charAt(3);
        String errMessage = null;
        try {
            var errstr = str.charAt(str.length()); // This will throw an exception
        } catch (StringIndexOutOfBoundsException e) {
            errMessage = "Errstr: Since character positions are counted from 0, the last character of str is at position str.length() - 1";
        }
        var corstr = str.charAt(str.length() - 1);
        System.out.println("Len: " + len + "\n" + "Char0: " + char0 + "\n" + "Char3: " + char3 + "\n" + errMessage + "\n" + "Corstr: " + corstr);
    }
}
