package com.steve.topquiz.Model;

public class User {
    private String mFirstname;
    private Integer mTopScore;

    public String getmFirstname() {
        return mFirstname;
    }

    public void setmFirstname(String mFirstname) {
        this.mFirstname = mFirstname;
    }

    //item_top
    //TODO ajouter l'attribut score
    public Integer getmTopScore() {
        return mTopScore;
    }

    public void setmTopScore(Integer mTopScore) {
        this.mTopScore = mTopScore;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstname='" + mFirstname + '\'' +
                '}';
    }

}
