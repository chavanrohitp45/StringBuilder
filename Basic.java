class Basic{
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // //char at index 0
        // System.out.println(sb.charAt(0));

        // //Set char at index
        // sb.setCharAt(0, 'P'); //T will be deleted
        // System.out.println(sb);

        // //Insert at index 0 and shift the other string to right side
        // sb.insert(0, 'R');
        // System.out.println(sb);

        // sb.insert(2, 'n');
        // System.out.println(sb);

        // //Deletion
        // sb.delete(2, 3);
        // System.out.println(sb);

        // sb.delete(0, 2);
        // sb.insert(0, 'T');
        // System.out.println(sb);

        //Append
        // StringBuilder sb = new StringBuilder("h");
        // sb.append('e');
        // sb.append('l');
        // sb.append('l');
        // sb.append('o');
        // System.out.println(sb); //ae same string

        // System.out.println(sb.length());

        StringBuilder sb = new StringBuilder("hello");
        int si = 0;
        int ei = sb.length() - 1;
        while(si <= ei){
            char temp = sb.charAt(si);
            sb.setCharAt(si, sb.charAt(ei));
            sb.setCharAt(ei, temp);
            si++;
            ei--;
        }
        System.out.println(sb);
    }
}