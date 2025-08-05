package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MockitoTests {
    @Test
    void testSuccessfulUserSignUp(){
        EmailSender mock = mock(EmailSender.class);
        UserService service = new UserService(mock);
        boolean res = service.registerUser("qwe@qwe.ua");
        assertTrue(res,"The user is registered!");

        verify(mock, times(1)).send("qwe@qwe.ua","Welcome!");
    }
}
