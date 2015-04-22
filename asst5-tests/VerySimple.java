// prints out the literal 3 to the terminal, using 'super' so that dynamic
// dispatch is not necessary
class Main extends Lib {
    public void main() {
	    super.printInt(3);
        int a = 5;
        int b = 3;
        int c = 18;

        String x = "string";
        super.printStr(x);
        
        int[] myArr = new int[10];
        
        int finalInt = c - b - a;
        super.printInt(finalInt);
    }
}
