package com.peterstev.fairmoney

import com.google.common.truth.Truth.assertThat
import com.peterstev.fairmoney.utilities.capitalizeFirstCharacter
import com.peterstev.fairmoney.utilities.formatDate
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder


@TestMethodOrder(OrderAnnotation::class)
class UtilsTest {

    private val title = "miss"
    private val titleResult = "Miss"
    private val titleCapitalized = "MISS"
    private val date = "1949-09-09T06:22:16.422Z"
    private val dateLowerCase = "1949-09-09t06:22:16.422z"
    private val dateNoLetterT = "1949-09-0906:22:16.422z"
    private val dateResult = "1949-09-09"

    @Test
    @Order(1)
    fun `test_capitalizeFirstCharacter assert empty entry returns empty string`() {
        assertThat("".capitalizeFirstCharacter()).isEqualTo("")
    }

    @Test
    @Order(2)
    fun `test_capitalizeFirstCharacter assert Capitalized entry returns same string`() {
        assertThat(titleCapitalized.capitalizeFirstCharacter()).isEqualTo(titleCapitalized)
    }

    @Test
    @Order(3)
    fun `test_capitalizeFirstCharacter assert Capitalized value does not return lowercase string`() {
        assertThat(titleCapitalized.capitalizeFirstCharacter()).isNotEqualTo(title)
    }

    @Test
    @Order(4)
    fun `test_capitalizeFirstCharacter assert lowercase value returns capitalized string`() {
        assertThat(title.capitalizeFirstCharacter()).isEqualTo(titleResult)
    }

    @Test
    @Order(5)
    fun `test_formatDate assert correct entry returns split date`() {
        assertThat(date.formatDate()).isEqualTo(dateResult)
    }

    @Test
    @Order(6)
    fun `test_formatDate assert lowercase t entry returns split date`() {
        assertThat(dateLowerCase.formatDate()).isEqualTo(dateResult)
    }

    @Test
    @Order(7)
    fun `test_formatDate assert entry without t returns same entry`() {
        assertThat(dateNoLetterT.formatDate()).isEqualTo(dateNoLetterT)
    }

    @Test
    @Order(8)
    fun `test_formatDate assert empty entry returns empty string`() {
        assertThat("".formatDate()).isEqualTo("")
    }
}