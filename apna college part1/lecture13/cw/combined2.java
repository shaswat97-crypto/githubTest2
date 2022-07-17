public class combined2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        //setCharAt
        sb.insert(0, 'i');
        sb.delete(1, 2);
        sb.append("ii");
        System.out.println(sb);
    }
}