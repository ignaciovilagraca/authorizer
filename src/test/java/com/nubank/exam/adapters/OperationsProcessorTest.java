package com.nubank.exam.adapters;

import java.io.IOException;
import org.junit.jupiter.api.Test;

class OperationsProcessorTest extends BaseTest {

    @Test
    void accountCreationSuccess() throws IOException {
        baseTest("./src/test/resources/input/account_creation_success.json",
                "./src/test/resources/expected/account_creation_success_response.json");
    }

    @Test
    void accountCreationError() throws IOException {
        baseTest("./src/test/resources/input/account_creation_error.json",
                "./src/test/resources/expected/account_creation_error_response.json");
    }

    @Test
    void processTransactionSuccess() throws IOException {
        baseTest("./src/test/resources/input/process_transaction_success.json",
                "./src/test/resources/expected/process_transaction_success_response.json");
    }

    @Test
    void processTransactionAccountNotInitializedError() throws IOException {
        baseTest("./src/test/resources/input/process_transaction_account_not_initialized_error.json",
                "./src/test/resources/expected/process_transaction_account_not_initialized_error_response.json");
    }

    @Test
    void processTransactionCardNotActiveError() throws IOException {
        baseTest("./src/test/resources/input/process_transaction_card_not_active_error.json",
                "./src/test/resources/expected/process_transaction_card_not_active_error_response.json");
    }

    @Test
    void processTransactionInsufficientLimitError() throws IOException {
        baseTest("./src/test/resources/input/process_transaction_insufficient_limit_error.json",
                "./src/test/resources/expected/process_transaction_insufficient_limit_error_response.json");
    }

    @Test
    void processTransactionHighFrequencySmallIntervalError() throws IOException {
        baseTest("./src/test/resources/input/process_transaction_high_frequency_small_interval_error.json",
                "./src/test/resources/expected/process_transaction_high_frequency_small_interval_error_response.json");
    }

    @Test
    void processTransactionDoubledTransactionError() throws IOException {
        baseTest("./src/test/resources/input/process_transaction_doubled_transaction_error.json",
                "./src/test/resources/expected/process_transaction_doubled_transaction_error_response.json");
    }

    @Test
    void processTransactionMultipleErrors() throws IOException {
        baseTest("./src/test/resources/input/process_transaction_multiple_errors.json",
                "./src/test/resources/expected/process_transaction_multiple_errors_response.json");
    }
}