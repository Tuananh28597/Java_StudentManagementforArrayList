package com.codegym;

public class BorrowCard {
    private String id;
    private String createDate;
    private String expiredDate;
    private String bookId;
    private Student student;

    public BorrowCard(String id, String createDate, String expiredDate, String bookId, Student student) {
        this.id = id;
        this.createDate = createDate;
        this.expiredDate = expiredDate;
        this.bookId = bookId;
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "BorrowCard{" +
                "id='" + id + '\'' +
                ", createDate='" + createDate + '\'' +
                ", expiredDate='" + expiredDate + '\'' +
                ", bookId='" + bookId + '\'' +
                ", student=" + student +
                '}';
    }
}
