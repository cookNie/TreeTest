import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",23,90,92,86);
        Student s2 = new Student("lisi",24,80,82,63);
        Student s3 = new Student("wangwu",23,60,72,99);
        Student s4 = new Student("zhaoliu",22,99,93,76);
        Student s5 = new Student("qianqi",26,96,99,65);

        TreeSet<Student> list = new TreeSet<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        for (Student student : list) {
            System.out.println(student);
        }


        System.out.println("-------------");

        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length()-o2.length();

                i = i==0?o1.compareTo(o2):i;
                return i;
            }
        });

        ts.add("a");
        ts.add("abc");
        ts.add("ca");
        ts.add("dad");
        ts.add("agh");
        ts.add("def");
        ts.add("asfg");
        ts.add("ert");

        System.out.println(ts);

        System.out.println("-------------");
        List<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("baa");
        list1.add("caa");
        list1.add("dada");
        list1.add("eaaa");

        Iterator<String> it = list1.iterator();

        while(it.hasNext()){
            String str = it.next();
            if ("aaa".equals(str)){
                it.remove();
            }else {
                System.out.println(str);
            }

        }
        System.out.println("-------------");
        ListIterator<String> itl = list1.listIterator();
        while(itl.hasNext()){
            String str = itl.next();
            if ("baa".equals(str)){
                itl.add("bbb");
            }


        }
        System.out.println(list1);


    }
}