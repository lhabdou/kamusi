package com.project.slh.kamusiyatafsiri.dao;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.project.slh.kamusiyatafsiri.config.DAOBase;
import com.project.slh.kamusiyatafsiri.entities.Role;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(AndroidJUnit4.class)
public class RoleDAOTest {

    private RoleDAO roleDAO;
    private DAOBase mDb;

    @Before
    public void createDb() {
        Context context = InstrumentationRegistry.getTargetContext();
        mDb = Room.inMemoryDatabaseBuilder(context, DAOBase.class).build();
        roleDAO = mDb.roleDAO();
    }

    @After
    public void closeDb() throws IOException {
        mDb.close();
    }

    @Test
    public void writeRoleAndReadInList() throws Exception {
        Role role = new Role();
        role.setId(1);
        role.setNom_role("Admin");
        List<Role> roles = new ArrayList<>();
        roleDAO.ajouterRole(roles);

        List<Role> rolesResult = roleDAO.selectionnerLesRoles();
       Assert.assertSame(rolesResult.get(0),role);
    }
}
