package com.johnniesnow.firebasedemoshopping.services;

import android.app.ProgressDialog;
import android.app.SharedElementCallback;
import android.content.SharedPreferences;

import com.facebook.AccessToken;
import com.johnniesnow.firebasedemoshopping.infrastructure.ServiceResponse;

/**
 * Created by Jonathan on 12/06/17.
 */

public class AccountServices {

    public AccountServices() {
    }

    public static class RegisterUserRequest{
        public String userName;
        public String userEmail;
        public ProgressDialog progressDialog;

        public RegisterUserRequest(String userName, String userEmail, ProgressDialog progressDialog) {
            this.userName = userName;
            this.userEmail = userEmail;
            this.progressDialog = progressDialog;
        }
    }

    public static class RegisterUserResponse extends ServiceResponse{}

    public static class LogUserInRequest{
        public String userEmail;
        public String userPassword;
        public ProgressDialog progressDialog;
        public SharedPreferences sharedPreferences;

        public LogUserInRequest(String userEmail, String userPassword, ProgressDialog progressDialog, SharedPreferences sharedPreferences) {
            this.userEmail = userEmail;
            this.userPassword = userPassword;
            this.progressDialog = progressDialog;
            this.sharedPreferences = sharedPreferences;
        }
    }

    public static class LogUserInResponse extends ServiceResponse{}

    public static class LogUserFacebookRequest{
        public AccessToken accessToken;
        public String userName;
        public String userEmail;
        public ProgressDialog progressDialog;
        public SharedPreferences sharedPreferences;

        public LogUserFacebookRequest(AccessToken accessToken, String userName, String userEmail, ProgressDialog progressDialog, SharedPreferences sharedPreferences) {
            this.accessToken = accessToken;
            this.userName = userName;
            this.userEmail = userEmail;
            this.progressDialog = progressDialog;
            this.sharedPreferences = sharedPreferences;
        }
    }
}
