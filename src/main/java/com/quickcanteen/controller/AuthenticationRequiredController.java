package com.quickcanteen.controller;


import com.quickcanteen.dto.Token;


public abstract class AuthenticationRequiredController {

    private ThreadLocal<Token> token = new ThreadLocal<>();

    public void setToken(Token token) {
        this.token.set(token);
    }

    public Token getToken() {
        return this.token.get();
    }

}
