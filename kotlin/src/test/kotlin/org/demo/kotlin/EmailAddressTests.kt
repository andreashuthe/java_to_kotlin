package org.demo.kotlin

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.fail

class EmailAddressTests {
    @Test
    fun parsing() {
        assertEquals(
            EmailAddress("fred", "example.com"),
            EmailAddress.parse("fred@example.com")
        )
    }

    @Test
    fun parsingFailures() {
        assertFails { EmailAddress.parse("@") }
    }
}