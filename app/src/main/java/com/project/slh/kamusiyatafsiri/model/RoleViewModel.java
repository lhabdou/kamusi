package com.project.slh.kamusiyatafsiri.model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.project.slh.kamusiyatafsiri.Repostitory.DictionnaireRepository;
import com.project.slh.kamusiyatafsiri.controllers.DictionnaireActivity;
import com.project.slh.kamusiyatafsiri.entities.Role;

import java.util.List;

public class RoleViewModel extends AndroidViewModel {

    private DictionnaireRepository dictionnaireRepository;

    private LiveData<List<Role>> allRoles;

    public RoleViewModel (Application application) {
        super(application);
        dictionnaireRepository = new DictionnaireRepository(application);
        allRoles = dictionnaireRepository.getAllRoles();

    }

    public LiveData<List<Role>> getAllRoles() { return allRoles; }

    public void insertRole(Role role) {
        dictionnaireRepository.insert(role);
    }
}
