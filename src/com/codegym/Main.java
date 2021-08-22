package com.codegym;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        BorrowCardManagement borrowCardManagement = new BorrowCardManagement();
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            scanner.nextLine();
            chooseMenu(choice, borrowCardManagement);
        } while (choice != 0);

    }

    private static void chooseMenu(int choice, BorrowCardManagement borrowCardManagement) {
        switch (choice) {
            case 1: {
                showAllBorrowCard(borrowCardManagement);
                break;
            }
            case 2: {
                scanner.nextLine();
                createNewBorowcard(borrowCardManagement);
                break;
            }
            case 3: {
                updateBorrowCard(borrowCardManagement);
                break;
            }
            case 4: {
                deleteBorrowCard(borrowCardManagement);
                break;
            }
            case 5: {
                getBorrowCardById(borrowCardManagement);
                break;
            }
            case 0: {
                System.exit(0);
                break;
            }
        }
    }

    private static void getBorrowCardById(BorrowCardManagement borrowCardManagement) {
        System.out.println("Nhập mã phiếu cần tìm: ");
        String id = scanner.nextLine();
        int index = borrowCardManagement.findBorrowCardById(id);
        if (index != -1) {
            System.out.println(borrowCardManagement.getBorrowCards().get(index));
        } else {
            System.out.println("Không tồn tại ID này!!");
        }
    }

    private static void deleteBorrowCard(BorrowCardManagement borrowCardManagement) {
        System.out.println("Xóa thông tin phiếu mượn");
        System.out.println("Nhập mã id muốn xóa: ");
        String id = scanner.nextLine();
        int index = borrowCardManagement.findBorrowCardById(id);
        if (index != -1) {
            BorrowCard borrowCard = inputCardInfo();
            borrowCardManagement.deleteBorrowCard(id, borrowCard);
        } else {
            System.out.println("Không tìm thấy mã phiếu mượn này!!!");
        }
    }

    private static void updateBorrowCard(BorrowCardManagement borrowCardManagement) {
        System.out.println("Chỉnh sửa thông tin phiếu mượn: ");
        System.out.println("Nhập mã phiếu mượn cần chỉnh sửa thông tin: ");
        String id = scanner.nextLine();
        int index = borrowCardManagement.findBorrowCardById(id);
        if (index != -1) {
            BorrowCard borrowCard = inputCardInfo();
            borrowCardManagement.updateBorrowCardInfo(id, borrowCard);
        } else {
            System.out.println("Không tồn tại id này!!!");
        }
    }

    private static void createNewBorowcard(BorrowCardManagement borrowCardManagement) {
        System.out.println("Thêm thông tin phiếu mượn");
        BorrowCard borrowCard = inputCardInfo();
        borrowCardManagement.addNewBorrowCard(borrowCard);

    }

    private static BorrowCard inputCardInfo() {

        Student student = inputStudentInfo();
        System.out.println("Nhập mã phiếu mượn: ");
        String id = scanner.nextLine();
        System.out.println("Nhập ngày mượn: ");
        String createDate = scanner.nextLine();
        System.out.println("Nhập ngày tới hạn: ");
        String expiredDate = scanner.nextLine();
        System.out.println("Nhập mã sách: ");
        String bookId = scanner.nextLine();
        return new BorrowCard(id, createDate, expiredDate, bookId, student);
    }

    private static Student inputStudentInfo() {
        System.out.println("Nhập mã sinh viên: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String birthday = scanner.nextLine();
        System.out.println("Nhập tên lớp: ");
        String className = scanner.nextLine();
        return new Student(id, name, birthday, className);
    }

    private static void showAllBorrowCard(BorrowCardManagement borrowCardManagement) {
        System.out.println("Danh sách phiếu mượn đang có");
        borrowCardManagement.showAll();
    }

    private static void menu() {
        System.out.println(("MENU"));
        System.out.println("1.Hiển thị danh sách phiếu mượn.");
        System.out.println("2.Thêm thông tin phiếu mượn.");
        System.out.println("3.Chỉnh sửa thông tin phiếu mượn");
        System.out.println("4.Xoá phiếu mượn");
        System.out.println("5.Tìm kiếm theo mã phiếu mượn.");
        System.out.println("0.Thoát");
    }
}
