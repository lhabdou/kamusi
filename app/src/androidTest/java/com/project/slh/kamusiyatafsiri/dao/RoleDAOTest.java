package com.project.slh.kamusiyatafsiri.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.arch.*;

import com.project.slh.kamusiyatafsiri.config.DAOBase;
import com.project.slh.kamusiyatafsiri.entities.Role;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(AndroidJUnit4.class)
public class RoleDAOTest {

   // @Rule
    //public TestRule instantTaskExecutorRule = new android.arch.core.executor.testing.InstantTaskExecutorRule();
        private RoleDAO roleDAO;
        private DAOBase mDb;

        @Before
        public void createDb() {
            Context context = InstrumentationRegistry.getTargetContext();
            mDb = Room.inMemoryDatabaseBuilder(context, DAOBase.class).allowMainThreadQueries().build();
            roleDAO = mDb.roleDAO();
        }

        @After
        public void closeDb() throws IOException {
            mDb.close();
        }

        @Test
        public void writeRoleAndReadInListTest() {
            Role role = new Role();
            role.setId(1);
            role.setNom_role("Admin");
            List<Role> roles = new ArrayList<>();
            roles.add(role);

            roleDAO.ajouterRole(roles);

            LiveData<List<Role>> rolesResult = roleDAO.selectionnerLesRoles();
            Assert.assertEquals(rolesResult.getValue().get(0), role);
        }

}
