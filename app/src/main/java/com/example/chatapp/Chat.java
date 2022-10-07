package com.example.chatapp;

public class Chat {
    private String userEmail;
    private String mensagem;
    private String dateTime;

    //Para o firebase retornar a data novamente.
    public Chat() {

    }

    public Chat(String userEmail, String mensagem, String dateTime) {
        this.userEmail = userEmail;
        this.mensagem = mensagem;
        this.dateTime = dateTime;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
