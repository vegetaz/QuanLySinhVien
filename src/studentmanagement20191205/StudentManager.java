package studentmanagement20191205;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    private List<Student> studentList;

    public StudentManager(List<Student> studentList) {
        this.studentList = studentList;
    }

    // Tạo dữ liệu ban đầu
    public List<Student> createStudentList(Student student) {
        this.studentList.add(student);
        return studentList;
    }

    // Thêm mới sinh viên
    public void addStudent() {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Thêm mới sinh viên");
        System.out.print("Nhập vào mã sinh viên: ");
        String idS = sc.nextLine();
        student.setId(idS);
        System.out.print("Nhập vào tên sinh viên: ");
        String nameS = sc.nextLine();
        student.setName(nameS);
        System.out.print("Nhập vào tuổi sinh viên: ");
        int oldS = sc.nextInt();
        sc.nextLine();
        student.setOld(oldS);
        System.out.print("Nhập vào điểm của sinh viên: ");
        float gpaS = sc.nextFloat();
        sc.nextLine();
        student.setGpa(gpaS);
        studentList.add(student);
        System.out.println("Thêm mới sinh viên thành công!");
    }

    // Sửa sinh viên
    public void editStudent() {
        boolean isExisted = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào mã sinh viên của sinh viên cần cập nhật: ");
        String idS = sc.nextLine();
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId().equals(idS)) {
                isExisted = true;
                System.out.print("Nhập vào tên sinh viên: ");
                String nameS = sc.nextLine();
                System.out.print("Nhập vào tuổi sinh viên: ");
                int oldS = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập vào điểm của sinh viên: ");
                float gpaS = sc.nextFloat();
                sc.nextLine();
                studentList.get(i).setId(idS);
                studentList.get(i).setName(nameS);
                studentList.get(i).setOld(oldS);
                studentList.get(i).setGpa(gpaS);
                break;
            }
        }
        if (!isExisted) {
            System.out.println("Mã sách " + idS + " không tồn tại!");
        } else {
            System.out.println("Cập nhật sinh viên " + idS + " thành công!");
        }
    }

    // Hiển thị danh sách sinh viên
    public void printStudentList() {
        System.out.println("Danh sách sinh viên");
        System.out.printf("%-12s%-15s%-9s%-7s", "Mã SV", "Tên SV", "Tuổi", "Điểm");
        System.out.println("");
//        for (Student s : this.studentList) {
//            System.out.println(s.toString());
//        }
        this.studentList.forEach((s) -> {
            System.out.println(s.toString());
        });
    }

    // Sắp xếp sinh viên theo điểm
    public void sortStudent() {
        Collections.sort(studentList, (Student o1, Student o2) -> {
            if (o1.getGpa() > o2.getGpa()) {
                return 1;
            }
            return -1;
        });
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.getGpa() > o2.getGpa()) {
//                    return 1;
//                }
//                return -1;
//            }
//
//        });
        System.out.println("Danh sách sinh viên sau khi sắp xếp");
        System.out.printf("%-12s%-15s%-9s%-7s", "Mã SV", "Tên SV", "Tuổi", "Điểm");
        System.out.println("");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }
    
    // Tìm kiếm sinh viên theo tên
    public void studentFound() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên sinh viên cần tìm: ");
        String nameS = sc.nextLine();
        List<Student> studentFound = new ArrayList<>();
        studentList.stream().filter((s) -> (s.getName().equals(nameS))).forEachOrdered((s) -> {
            studentFound.add(s);
        });
        System.out.println("Danh sách sinh viên sau khi tìm kiếm");
        System.out.printf("%-12s%-15s%-9s%-7s", "Mã SV", "Tên SV", "Tuổi", "Điểm");
        System.out.println("");
        for (int i = 0; i < studentFound.size(); i++) {
            System.out.println(studentFound.get(i).toString());
        }
    }
}
