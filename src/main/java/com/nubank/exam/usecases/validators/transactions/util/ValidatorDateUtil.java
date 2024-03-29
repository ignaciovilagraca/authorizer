package com.nubank.exam.usecases.validators.transactions.util;

import com.nubank.exam.domain.entities.input.transaction.Transaction;
import java.util.Calendar;
import java.util.List;

public class ValidatorDateUtil {
    public void filterLastTwoMinutesTransactions(Transaction transaction, List<Transaction> transactionHistory) {
        // remove date if it's before the past two minutes
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(transaction.getTime());
        calendar.add(Calendar.MINUTE, -2);

        transactionHistory.removeIf(t -> t.getTime().before(calendar.getTime()));
    }
}
