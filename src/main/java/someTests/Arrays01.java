package someTests;

public class Arrays01 {
    public static void main(String[] args) {

/*
        int a[]={100,200,300,400,500};
        System.out.println(a.length);
        System.out.println(a[2]);

        for (int i = 0; i <= a.length-1; i++) {
            System.out.println(a[i]);
        }

        for (int i:a){
            System.out.println(i);
        }

        int a[][]=new int[3][2];
        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;
        a[2][0]=500;
        a[2][1]=600;


      int a[][]={{100,200}, {300,400}, {500,600}};

        System.out.println("Number of rows:" + a.length);
        System.out.println("Number of columns:" +a[0].length);


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                System.out.println(a[i][j]);
            }
        }

        for (int r[]:a){
            for (int i:r)
            System.out.println(i);
        }
        */
        String s1="Welcome";
        String s2="  To Java   ";
        System.out.println(s1.concat(" " + s2.trim()));
        System.out.println(s1.length() + " " + s2.length());
        System.out.println(s1.length() + s2.length());
        System.out.println(s1.concat(s2.replaceAll(" ", "")));
        System.out.println(s2.length());
        String s3 = s2.replaceAll(" ", "");
System.out.println(s3.length());

    }
}
