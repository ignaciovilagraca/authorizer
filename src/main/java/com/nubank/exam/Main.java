package com.nubank.exam;

import com.nubank.exam.adapters.AccountStatusPresenter;
import com.nubank.exam.adapters.OperationsProcessor;
import com.nubank.exam.domain.output.AccountStatus;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = args[0];
        List<AccountStatus> output;

        try {
            output = new OperationsProcessor().process(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        new AccountStatusPresenter().present(output);
    }
}