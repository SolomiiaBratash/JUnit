package com.bratash.task2;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Sample {
    private String str = null;
    private static final boolean privateB = false;
    private List lstUsers = new ArrayList<>();

    public String getStr() {
        return str;
    }

    public int sum(int n){
        int rezult = 0;
        for(int i = 0; i < n; i++){
            rezult+=i;
        }
        return rezult;
    }

    public String returnNullString(){
        String str1 = "String";
        return str1;
    }

    public void add(String user){
        lstUsers.add(user);
    }

    public int size(){
        return lstUsers.size();
    }

    public void remove(String user) {
        if (!lstUsers.contains(user)) {
            throw new NoSuchElementException();
        }
        lstUsers.remove(user);
    }
}
