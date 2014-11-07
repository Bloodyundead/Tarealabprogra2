package com.juego.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Principal extends ApplicationAdapter {
	SpriteBatch batch;
	private Music music;
	Texture img;
	Texture img2;
	Texture img3;
	Texture img4;
	Texture img5;
	Texture img6;
	Texture img10;
	Texture img11;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("nube.png");
		img2 = new Texture("plataforms.png");
		img3 = new Texture("plataform.png");
		img4 = new Texture("sol.png");
		img5 = new Texture("viento.png");
		img6 = new Texture("fireturtle.png");
		img10 = new Texture("zombie.png");
		img11 = new Texture("zombieup.png");
		music = Gdx.audio.newMusic(Gdx.files.getFileHandle("musica.wav", FileType.Internal));
		music.setLooping(true);
		music.play();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 29, 339);
		batch.draw(img, 390, 318);
		batch.draw(img2, 120, 50);
		batch.draw(img3, 400, 150);
		batch.draw(img4, 250, 350);
		batch.draw(img5, 35, 260);
		batch.draw(img5, 465, 250);
		batch.draw(img6, 350, 0);
		batch.draw(img6, 415, 0);
		batch.draw(img6, 480, 0);
		batch.draw(img10, 100, 0);
		batch.draw(img11, 478, 182);
		
		batch.end();
	}
}
