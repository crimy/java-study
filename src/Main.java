public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String plusOperate() {
        String result = "first";
        result += "second";
        result += "third";
        result += "forth";
        result += "fifth";
        return result;
    }
    public String forLoopPlus() {
        String result = "";

        for(int index = 0; index < 100; ++index) {
            result = result + index;
        }

        return result;
    }
    public String whileLoopPlus() {
        String result = "";
        int index = 0;
        while(index < 100) {
            result = result + index;
            index++;
        }

        return result;
    }
}