package org.demo.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class EmailAddressTests {
    @Test
    fun parsing() {
        Assertions.assertEquals(
            EmailAddress("fred", "example.com"),
            EmailAddress.parse("fred@example.com")
        )
    }

    @Test
    fun parsingFailures() {
        Assertions.assertThrows(
            IllegalArgumentException::class.java
        ) { EmailAddress.parse("@") }
    }
}