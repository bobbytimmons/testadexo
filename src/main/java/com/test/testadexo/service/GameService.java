package com.test.testadexo.service;

import com.test.testadexo.model.GameContent;

import java.security.NoSuchAlgorithmException;

public interface GameService {


    GameContent getGameContent() throws NoSuchAlgorithmException;
}
