import java.util.*;

public class Main {
    public static void main(String[] args) {


        LinkedList<Integer> a = new LinkedList<>();
        TreeSet<Integer> b = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 200000; i++) {
            int i1 = random.nextInt();
            a.add(i1);
            b.add(i1);
        }

        System.out.println(checkTime(a,b));

    }

    public static String checkTime(Collection<Integer> a, Collection<Integer> b){

        double start1 = System.currentTimeMillis();
        Iterator<Integer> iterator = a.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            if(next%2==0){
                iterator.remove();
            }
        }
        double end1 = System.currentTimeMillis();
        double time1 = (end1-start1)/1000;

        double start2 = System.currentTimeMillis();
        Iterator<Integer> iterator1 = b.iterator();
        while(iterator1.hasNext()){
            Integer next = iterator1.next();
            if(next%2==0){
                iterator1.remove();
            }
        }
        double end2 = System.currentTimeMillis();
        double time2=(end2-start2)/1000;


        return time1 + "\n" + time2;
    }
}