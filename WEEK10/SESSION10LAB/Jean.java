public class Jean {

    public Jean() {

    }

    public String toString(){
        String st = "";
        st += super.toString();
        st += "      qsadkmsz";


        return st;
    }

    public static void main(String[] s) {

        Jean jean = new Jean();
        System.out.println(jean.toString());

    }

}
