import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collection<String> collections = new ArrayList<>();
        list.add("Khánh");
        list.add("Bình");
        // thêm mới vào danh sách
        collections.add("Hùng");
        collections.add("Nam");
        collections.add("Hiếu");
        // hiển thị
        System.out.println(collections);
        // thêm mới 1 danh sách
        collections.addAll(list);
        // xóa toàn bộ phần tử hiện có
//        collections.clear();
        // hiển thị
        System.out.println(collections);
        // kiểm tra tồn tại của 1 phần tử
        System.out.println(collections.contains("Hùng"));
        // kiểm tra tồn tại của 1  collection
        list.add("Phúc");
        System.out.println(list);
        System.out.println(collections.containsAll(list));


        // Danh sách học sinh
        Collection<Student> students = new ArrayList<>();
        Student st1 = new Student(1,"Hùng");
        Student st2 = new Student(2,"Anh");
        Student st3 = new Student(3,"Phương");
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st3);
        System.out.println(students);
        System.out.println(st1.equals(st2));
        System.out.println(collections.hashCode());
        System.out.println(students.hashCode());
        System.out.println(students.isEmpty());
//        students.clear();
//        System.out.println(students.isEmpty());
        // xóa phần tử
        students.remove(st1);
        System.out.println(students);
        // size() - số lượng phần tử có trong mảng
        System.out.println("sô lượng phần tử mảng là "+ students.size());
        // chuyển thành array
        Object[] arr = students.toArray();
        System.out.println(Arrays.toString(arr));

        // duyệt danh sách bằng iterator củ interface Iterable
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student element = iterator.next();
            System.out.println(element.getName());
        }
        // List
        System.out.println(list);
        // thêm phần tử
        list.add(1,"Quốc");
        list.add("Khánh");
        System.out.println(list);
        // lấy ra phần tử theo vị trí
        System.out.println(list.get(2));
        // Lấy ra vị trí theo dội tượng
        System.out.println(list.lastIndexOf("Khánh"));
        list.sort(new StringComparator());
        System.out.println(list);
        // xóa theo vị trí
        list.remove(2);
        System.out.println(list);
        // sửa theo vị trí
        list.set(1,"Kevin");
        System.out.println(list);
        List<String> subString = list.subList(1,3);
        System.out.println(subString);
        System.out.println(list);
        // Array list
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add("Hùng");
        arrayList.add("Nam");
        System.out.println(arrayList.size());
        // tìm kiếm phần tử
        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        // Thêm vào node head
        linkedList.addFirst("Đi học");
        linkedList.addFirst("Đi chơi");
        linkedList.addLast("Đi ngủ");
        System.out.println(linkedList);
        // lấy ra phân tử
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        // Xóa phần tử đầu/ cuối
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        // Set  - xét trung lặp
        Set<Student> set = new HashSet<>();
        set.add(st1);
        set.add(st2);
        set.add(st3);
//        set.add(st1);
//        for (Student s:set
//             ) {
//            System.out.println(s.getName());
//        }
    }
}