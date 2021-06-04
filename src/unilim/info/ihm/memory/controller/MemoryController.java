package unilim.info.ihm.memory.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javax.naming.ldap.Control;
import java.io.File;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.sql.SQLTransactionRollbackException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MemoryController {
    ArrayList<String> images = new ArrayList<>();
    int tour = 0;
    Image img1;
    Image img2;

    public void remplirListe(ArrayList<String> images) {
        images.add("./images/Donald1.jpg");
        images.add("./images/Donald2.jpg");
        images.add("./images/Donald3.jpg");
        images.add("./images/Donald4.jpg");
        images.add("./images/Donald5.jpg");
        images.add("./images/Donald6.jpg");
        images.add("./images/Donald1.jpg");
        images.add("./images/Donald2.jpg");
        images.add("./images/Donald3.jpg");
        images.add("./images/Donald4.jpg");
        images.add("./images/Donald5.jpg");
        images.add("./images/Donald6.jpg");
    }

    @FXML
    private ChoiceBox<?> cbTheme;

    @FXML
    private Button btnStart;

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private ImageView image5;

    @FXML
    private ImageView image6;

    @FXML
    private ImageView image7;

    @FXML
    private ImageView image8;

    @FXML
    private ImageView image9;

    @FXML
    private ImageView image10;

    @FXML
    private ImageView image11;

    @FXML
    private ImageView image12;

    @FXML
    void commencerPartie(MouseEvent event) throws MalformedURLException {
        remplirListe(images);
        Collections.shuffle(images);
        if (tour == 2) {
            if (img1 == img2) {
                tour = 0;
                img1 = img2 = null;
            }
            else {
                tour = 0;
                img1 = img2 = null;
            }
        }
    }

    @FXML
    void retournerCarte1(MouseEvent event) throws MalformedURLException {
        if (tour < 2) {
            File file = new File(images.get(0));
            images.remove(0);
            String localUrl = file.toURI().toURL().toString();
            Image img = new Image(localUrl, false);
            this.image1.setImage(img);
            if (img1 == null) {
                img1 = image1.getImage();
            }
            else {
                img2 = image1.getImage();
            }
            tour = tour + 1;
        }
    }

    @FXML
    void retournerCarte2(MouseEvent event) throws MalformedURLException {
        if (tour < 2) {
            File file = new File(images.get(1));
            images.remove(1);
            String localUrl = file.toURI().toURL().toString();
            Image img = new Image(localUrl, false);
            this.image2.setImage(img);
            if (img1 == null) {
                img1 = image2.getImage();
            }
            else {
                img2 = image2.getImage();
            }
            tour = tour + 1;
        }
    }

    @FXML
    void retournerCarte3(MouseEvent event) throws MalformedURLException {
        if (tour < 2) {
            File file = new File(images.get(2));
            images.remove(2);
            String localUrl = file.toURI().toURL().toString();
            Image img = new Image(localUrl, false);
            this.image3.setImage(img);
            if (img1 == null) {
                img1 = image3.getImage();
            }
            else {
                img2 = image3.getImage();
            }
            tour = tour + 1;
        }
    }

    @FXML
    void retournerCarte4(MouseEvent event) throws MalformedURLException {
        if (tour < 2) {
            File file = new File(images.get(3));
            images.remove(3);
            String localUrl = file.toURI().toURL().toString();
            Image img = new Image(localUrl, false);
            this.image4.setImage(img);
            if (img1 == null) {
                img1 = image4.getImage();
            }
            else {
                img2 = image4.getImage();
            }
            tour = tour + 1;
        }
    }

    @FXML
    void retournerCarte5(MouseEvent event) throws MalformedURLException {
        if (tour < 2) {
            File file = new File(images.get(4));
            images.remove(4);
            String localUrl = file.toURI().toURL().toString();
            Image img = new Image(localUrl, false);
            this.image5.setImage(img);
            if (img1 == null) {
                img1 = image5.getImage();
            }
            else {
                img2 = image5.getImage();
            }
            tour = tour + 1;
        }
    }

    @FXML
    void retournerCarte6(MouseEvent event) throws MalformedURLException {
        if (tour < 2) {
            File file = new File(images.get(5));
            images.remove(5);
            String localUrl = file.toURI().toURL().toString();
            Image img = new Image(localUrl, false);
            this.image6.setImage(img);
            if (img1 == null) {
                img1 = image6.getImage();
            }
            else {
                img2 = image6.getImage();
            }
            tour = tour + 1;
        }
    }

    @FXML
    void retournerCarte7(MouseEvent event) throws MalformedURLException {
        if (tour < 2) {
            File file = new File(images.get(6));
            images.remove(6);
            String localUrl = file.toURI().toURL().toString();
            Image img = new Image(localUrl, false);
            this.image7.setImage(img);
            if (img1 == null) {
                img1 = image7.getImage();
            }
            else {
                img2 = image7.getImage();
            }
            tour = tour + 1;
        }
    }

    @FXML
    void retournerCarte8(MouseEvent event) throws MalformedURLException {
        if (tour < 2) {
            File file = new File(images.get(7));
            images.remove(7);
            String localUrl = file.toURI().toURL().toString();
            Image img = new Image(localUrl, false);
            this.image8.setImage(img);
            if (img1 == null) {
                img1 = image8.getImage();
            }
            else {
                img2 = image8.getImage();
            }
            tour = tour + 1;
        }
    }

    @FXML
    void retournerCarte9(MouseEvent event) throws MalformedURLException {
        if (tour < 2) {
            File file = new File(images.get(8));
            images.remove(8);
            String localUrl = file.toURI().toURL().toString();
            Image img = new Image(localUrl, false);
            this.image9.setImage(img);
            if (img1 == null) {
                img1 = image9.getImage();
            }
            else {
                img2 = image9.getImage();
            }
            tour = tour + 1;
        }
    }

    @FXML
    void retournerCarte10(MouseEvent event) throws MalformedURLException {
        if (tour < 2) {
            File file = new File(images.get(9));
            images.remove(9);
            String localUrl = file.toURI().toURL().toString();
            Image img = new Image(localUrl, false);
            this.image10.setImage(img);
            if (img1 == null) {
                img1 = image10.getImage();
            }
            else {
                img2 = image10.getImage();
            }
            tour = tour + 1;
        }
    }

    @FXML
    void retournerCarte11(MouseEvent event) throws MalformedURLException {
        if (tour < 2) {
            File file = new File(images.get(10));
            images.remove(10);
            String localUrl = file.toURI().toURL().toString();
            Image img = new Image(localUrl, false);
            this.image11.setImage(img);
            if (img1 == null) {
                img1 = image11.getImage();
            }
            else {
                img2 = image11.getImage();
            }
            tour = tour + 1;
        }
    }

    @FXML
    void retournerCarte12(MouseEvent event) throws MalformedURLException {
        if (tour < 2) {
            File file = new File(images.get(11));
            images.remove(11);
            String localUrl = file.toURI().toURL().toString();
            Image img = new Image(localUrl, false);
            this.image12.setImage(img);
            if (img1 == null) {
                img1 = image12.getImage();
            }
            else {
                img2 = image12.getImage();
            }
            tour = tour + 1;
        }
    }
}
