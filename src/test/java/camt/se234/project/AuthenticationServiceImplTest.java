package camt.se234.project;

import camt.se234.project.dao.UserDao;
import camt.se234.project.entity.User;
import camt.se234.project.service.AuthenticationServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.isNull;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthenticationServiceImplTest {
    AuthenticationServiceImpl authenticationService;
    UserDao userDao;

    @Before
    public void setup() {
        userDao = mock(UserDao.class);
        authenticationService = new AuthenticationServiceImpl();
        authenticationService.setUserDao(userDao);
    }

    @Test
    public void testAuthenticate() {
        when(userDao.getUser("Pumipat", "12345")).thenReturn(
                new User("Pumipat", "12345", "Student"));
        when(userDao.getUser("Ponpol", "password")).thenReturn(
                new User("Ponpol", "password", "Manager"));
        assertThat(authenticationService.authenticate("Pumipat", "12345"),
                is(new User("Pumipat", "12345", "Student")));
        assertThat(authenticationService.authenticate("Ponpol", "password"),
                is(new User("Ponpol", "password", "Manager")));

    }


}
