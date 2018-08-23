package com.simple.jwt.dto;

import lombok.Data;

@Data
public class AuthDTO
{
    private String userName;
    private String passWord;

    public AuthDTO() {
    }

    public AuthDTO(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
