import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        //adiciona em ordem numerica ou alfabetica
        Set<Integer> lis = new TreeSet<>();

        lis.add(100);
        lis.add(1);
        lis.add(2);
        lis.add(43);

        for (Integer integer : lis) {
            System.out.println(integer);
        }


        System.out.println();
        //adiciona, mas não garante ordem alguma
         Set<Integer> hash = new HashSet<>();

        hash.add(100);
        hash.add(1);
        hash.add(3000);

        for (Integer integer : hash) {
            System.out.println(integer);
        }

        System.out.println();
        //outro
        Set<String> haha = new LinkedHashSet<>();

        haha.add("Luciana");
        haha.add("Gui");

        for (String string : haha) {
            System.out.println(string);
            
        }

        //metodo de remoção com predicado
        System.out.println();
        haha.removeIf(x -> x.length() <= 3);

        //mostrando novamente
         for (String string : haha) {
            System.out.println(string);
            
        }







    }
}
