/*package com.sivalabs.mybatisdemo;
 
import org.springframework.util.Assert;

import com.sivalabs.mybatisdemo.domain.User;
import com.sivalabs.mybatisdemo.service.UserService;
 
public class UserServiceTest
{
    private static UserService userService;
 
    @BeforeClass
    public static void setup()
    {
        userService = new UserService();
    }
 
    @AfterClass
    public static void teardown()
    {
        userService = null;
    }
 
    @Test
    public void testGetUserById()
    {
        User user = userService.getUserById(1);
        Assert.assertNotNull(user);
        System.out.println(user);
    }
 
    @Test
    public void testGetAllUsers()
    {
        List&lt;User&gt; users = userService.getAllUsers();
        Assert.assertNotNull(users);
        for (User user : users)
        {
            System.out.println(user);
        }
 
    }
 
    @Test
    public void testInsertUser()
    {
        User user = new User();
        user.setEmailId("test_email_" + System.currentTimeMillis() + "@gmail.com");
        user.setPassword("secret");
        user.setFirstName("TestFirstName");
        user.setLastName("TestLastName");
 
        userService.insertUser(user);
        Assert.assertTrue(user.getUserId() != 0);
        User createdUser = userService.getUserById(user.getUserId());
        Assert.assertNotNull(createdUser);
        Assert.assertEquals(user.getEmailId(), createdUser.getEmailId());
        Assert.assertEquals(user.getPassword(), createdUser.getPassword());
        Assert.assertEquals(user.getFirstName(), createdUser.getFirstName());
        Assert.assertEquals(user.getLastName(), createdUser.getLastName());
 
    }
 
    @Test
    public void testUpdateUser()
    {
        long timestamp = System.currentTimeMillis();
        User user = userService.getUserById(2);
        user.setFirstName("TestFirstName" + timestamp);
        user.setLastName("TestLastName" + timestamp);
        userService.updateUser(user);
        User updatedUser = userService.getUserById(2);
        Assert.assertEquals(user.getFirstName(), updatedUser.getFirstName());
        Assert.assertEquals(user.getLastName(), updatedUser.getLastName());
    }
 
    @Test
    public void testDeleteUser()
    {
        User user = userService.getUserById(4);
        userService.deleteUser(user.getUserId());
        User deletedUser = userService.getUserById(4);
        Assert.assertNull(deletedUser);
 
    }
}*/