package com.spotifriends.server.dao;

import com.spotifriends.server.model.NewUser;

import java.util.ArrayList;

public interface NewUserDao {

    String addNewUser(NewUser nu);

    String getNewUsers();

}
