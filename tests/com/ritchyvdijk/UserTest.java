package com.ritchyvdijk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class UserTest {

    @Test
    void itShouldValidatePhoneNumber() {
        // Given
        User gebruiker = new User("Ritchy", "van Dijk", "20148690@student.hhs.nl", "+3101234567");
        // When
        boolean isValid = gebruiker.validatePhonenumber();
        // Then
        Assertions.assertTrue(isValid);
    }

    @Test
    void itShouldValidateEMail() {
        // Given
        User gebruiker = new User("Ritchy", "van Dijk", "20148690@student.hhs.nl", "+3101234567");
        // When
        boolean isValid = gebruiker.validateEMail();
        // Then
        Assertions.assertTrue(isValid);
    }
}
