package studentmanagement20191205;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NguVV
 */
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        List<Student> ls = new ArrayList<>();
        StudentManager sm = new StudentManager(ls);
        Student s1 = new Student("SV001", "Sứt", 2, 8.9f);
        Student s2 = new Student("SV002", "Lem", 1, 7.9f);
        sm.createStudentList(s1);
        sm.createStudentList(s2);
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    sm.printStudentList();
                    break;
                case 2:
                    sm.addStudent();
                    break;
                case 3:
                    sm.editStudent();
                    break;
                case 4:
                    sm.sortStudent();
                    break;
                case 5:
                    sm.studentFound();
                    break;
                case 6:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không có!");
                    System.out.println("Mời bạn chọn lại!");
                    showMenu();
            }
        } while (choose != 5);

    }

    public static void showMenu() {
        System.out.println("Quản lý sinh viên");
        System.out.println("Danh sách chức năng");
        System.out.println("1. Hiển thị danh sách sinh viên");
        System.out.println("2. Thêm mới sinh viên");
        System.out.println("3. Sửa sinh viên");
        System.out.println("4. Sắp xếp sinh viên theo điểm");
        System.out.println("5. Tìm kiếm sinh viên theo tên");
        System.out.println("6. Thoát chương trình");
        System.out.print("Bạn chọn?!?: ");
    }
}
