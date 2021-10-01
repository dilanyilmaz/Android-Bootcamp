package com.android.odevler.dilanyilmaz


import junit.framework.TestCase
import org.junit.Assert
import org.junit.Test

class BookTest {
    val book = Book(
        name = "suc ve ceza",
        page = "200",
        writer = "dostoyevski",
        year= "1866"
    )
    @Test
    fun bookTest(){
        //success
        Assert.assertTrue(book.name=="suc ve ceza")
        Assert.assertTrue(book.page=="200")
        Assert.assertTrue(book.writer=="dostoyevski")
        Assert.assertTrue(book.writer=="1866")
        // fail
        Assert.assertFalse(book.name=="sefiller")
        Assert.assertFalse(book.page == "")
        Assert.assertFalse(book.writer=="hugo")
        Assert.assertFalse(book.year == "1877")

    }
}