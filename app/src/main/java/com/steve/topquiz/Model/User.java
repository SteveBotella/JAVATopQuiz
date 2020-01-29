package com.steve.topquiz.Model;

public class User {
    private String mFirstname;

    public String getmFirstname() {
        return mFirstname;
    }

    public void setmFirstname(String mFirstname) {
        this.mFirstname = mFirstname;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstname='" + mFirstname + '\'' +
                '}';
    }
//item_top
    //TODO ajouter l'attribut score


}
