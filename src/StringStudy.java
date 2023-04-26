public class StringStudy {
    public String plusOperate() {
        String result = "first";
        result += "second";
        result += "third";
        result += "forth";
        result += "fifth";
        return result;
    }

    public String builder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("first");
        stringBuilder.append("second");
        stringBuilder.append("third");
        stringBuilder.append("forth");
        stringBuilder.append("fifth");
        return stringBuilder.toString();
    }

    public String forLoopPlus() {
        String result = "";
        for (int index = 0; index < 100; index++) {
            result += index;
        }
        return result;
    }

    public String whileLoopPlus() {
        String result = "";

        for (int index = 0; index < 100; ++index) {
            result = result + index;
        }

        return result;
    }
}
