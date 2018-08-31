package com.project.slh.kamusiyatafsiri.dao;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.test.InstrumentationRegistry;

import com.project.slh.kamusiyatafsiri.config.DAOBase;
import com.project.slh.kamusiyatafsiri.entities.Role;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        public void writeRoleAndReadInListTest() {
            Role role = new Role();
            role.setId(1);
            role.setNom_role("Admin");
            List<Role> roles = new ArrayList<>();
            roles.add(role);

            roleDAO.ajouterRole(roles);

            List<Role> rolesResult = roleDAO.selectionnerLesRoles();
            Assert.assertEquals(rolesResult.get(0), role);
        }

}
