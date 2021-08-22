package com.codegym;

import java.util.ArrayList;
import java.util.List;


public class BorrowCardManagement {
    private List<BorrowCard> borrowCards = new ArrayList<>();

    public List<BorrowCard> getBorrowCards() {
        return borrowCards;
    }

    public void setBorrowCards(List<BorrowCard> borrowCards) {
        this.borrowCards = borrowCards;
    }

    public void addNewBorrowCard(BorrowCard borrowCard){
        this.borrowCards.add(borrowCard);
    }
    public void showAll(){
        for (BorrowCard borrowCard : borrowCards){
            System.out.println(borrowCard);
        }
    }
    public void updateBorrowCardInfo(String id, BorrowCard borrowCard){

        int index=findBorrowCardById(id);
        borrowCards.set(index,borrowCard);

    }

    public void deleteBorrowCard(String id, BorrowCard borrowCard){
        int index=findBorrowCardById(id);
        borrowCards.remove(index);
    }

    public int findBorrowCardById(String id){
        int index=-1;
        for (int i = 0; i < borrowCards.size(); i++) {
            if(id.equals(borrowCards.get(i).getId())){
                index=i;
                break;
            }
        }
        return index;
    }










}
