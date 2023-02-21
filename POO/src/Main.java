public class Main {
    public static void main(String args[]) {
        // Pagina 23
        String s = "Hola";
        int x = s.length(); // retorna 4

        String s1 = "Hola";
        boolean b1 = s1.isEmpty(); // retorna false

        String s2 = "";
        boolean b2 = s2.isEmpty(); // retorna true

        String t = "Hola";
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            System.out.println(c); // Salida hola
        }

        String x1 = "Hola";
        String y = "Hola";

        // Pagina 24
        if (x1.equals(y)) { // Compara contenidos,retorna true
            System.out.println("Si pasa por aqui!");
        }

        String s3 = "Hola, como estas?";
        int p1 = s3.indexOf('a'); // retorna 3
        int p2 = s3.lastIndexOf('a'); // retorna 14

        String s4 = "Hola, como estas? Estas como querias?";
        int p3 = s4.indexOf("como"); // retorna 6
        int p4 = s4.indexOf("estas"); // retorna 11
        int p5 = s4.lastIndexOf("como"); // retorna 24

        String s5 = "Hola, como estas?";
        String may = s5.toUpperCase(); // Retorna HOLA, COMO ESTAS?
        String min = s5.toLowerCase(); // retorna hola, como estas?

        // pagina 25

        String s6 = "Hola; como estas?";
        String s7 = s6.substring(0, 4); // retorna Hola
        String s8 = s6.substring(6, 10); // retorna como
        String s9 = s6.substring(11); // retorna estas?

        // enteros
        String s10 = "1234";
        int i = Integer.parseInt(s10); // retorna 1234
        String t1 = Integer.toString(i); // retorna "1234"

        // flotantes
        String s11 = "1234.56";
        double d = Double.parseDouble(s11); // retorna 1234.56
        String t2 = Double.toString(d); // retorna"1234.56"

        String s12 = "Hola, ";
        String t3 = "que tal?";
        String u = s12 + t3; // retorna "hola que tal?"

        // Pagina 26
        String s13 = "Hola";
        s13 = "chau";
        System.out.println(s13); // Salida chau

        String s14 = "Hola";
        s14 += ", chau"; // concatenamos
        System.out.println(s14); // Salida HOLA, CHAU;

        // pagina 27
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hola, ");
        sb1.append("Chau");
        System.out.println(sb1); // Salida Hola,chau

        StringBuilder sb2 = new StringBuilder("Hola");
        sb2.setCharAt(2, 'X');
        System.out.println(sb2); // Salida:HoXa

        //Ejemplo stringbuilder
        StringBuilder sb3= new StringBuilder("Buenas");
        sb3.setCharAt(4,'@');
        System.out.println(sb3);//Salida Buen@s
    }
}



