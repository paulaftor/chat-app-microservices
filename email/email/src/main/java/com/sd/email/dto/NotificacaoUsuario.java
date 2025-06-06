package com.sd.email.dto;
import java.util.List;

public class NotificacaoUsuario {
    private String novoUsuario;
    private List<String> emailsUsuarios;

    // Construtor sem argumentos
    public NotificacaoUsuario() {}

    // Getters e Setters
    public String getNovoUsuario() {
        return novoUsuario;
    }

    public void setNovoUsuario(String novoUsuario) {
        this.novoUsuario = novoUsuario;
    }

    public List<String> getEmailsUsuarios() {
        return emailsUsuarios;
    }

    public void setEmailsUsuarios(List<String> emailsUsuarios) {
        this.emailsUsuarios = emailsUsuarios;
    }
}
