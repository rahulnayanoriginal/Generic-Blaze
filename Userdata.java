package com.example.parasajmera.genericfire;

/**
 * Created by Paras ajmera on 09-09-2017.
 */

public class Userdata {
    String userid;
    String userfname;
    String userlname;
    String userEmail;
    String userpass;
    String usermobile;
    String usercity;

    public Userdata(){

    }

    public Userdata(String userid, String userfname, String userlname, String userEmail, String userpass, String usermobile, String usercity) {
        this.userid = userid;
        this.userfname = userfname;
        this.userlname = userlname;
        this.userEmail = userEmail;
        this.userpass = userpass;
        this.usermobile = usermobile;
        this.usercity = usercity;
    }

    public String getUserid() {
        return userid;
    }

    public String getUserfname() {
        return userfname;
    }

    public String getUserlname() {
        return userlname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserpass() {
        return userpass;
    }

    public String getUsermobile() {
        return usermobile;
    }

    public String getUsercity() {
        return usercity;
    }
}
