package com.lawcase.app.dtos;

public class PasswordDTO {

    private String email;
    private String existingPassword;
    private String newPassword;
    private String newPasswordConfirm;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExistingPassword() {
        return existingPassword;
    }

    public void setExistingPassword(String existingPassword) {
        this.existingPassword = existingPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPasswordConfirm() {
        return newPasswordConfirm;
    }

    public void setNewPasswordConfirm(String newPasswordConfirm) {
        this.newPasswordConfirm = newPasswordConfirm;
    }
}
