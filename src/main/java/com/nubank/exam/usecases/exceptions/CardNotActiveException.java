package com.nubank.exam.usecases.exceptions;

public class CardNotActiveException extends Exception {
    public CardNotActiveException() {
        super("card-not-active");
    }
}