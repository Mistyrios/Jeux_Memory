package unilim.info.ihm.memory.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;

public class MemoryController {
    ArrayList<String> images = new ArrayList<>();
    ArrayList<String> imagesDos = new ArrayList<>();
    Boolean jouer = false;
    Boolean retourné1 = false;
    Boolean retourné2 = false;
    Boolean retourné3 = false;
    Boolean retourné4 = false;
    Boolean retourné5 = false;
    Boolean retourné6 = false;
    Boolean retourné7 = false;
    Boolean retourné8 = false;
    Boolean retourné9 = false;
    Boolean retourné10 = false;
    Boolean retourné11 = false;
    Boolean retourné12 = false;
    int tour = 0;
    ImageView img1;
    ImageView img2;

    public void remplirListe(ArrayList<String> images, String cbThème) {
        if (cbThème.equals("Couleur")) {
            images.add("./unilim/info/ihm/memory/assets/Couleur_1.jpg");
            images.add("./unilim/info/ihm/memory/assets/Couleur_2.jpg");
            images.add("./unilim/info/ihm/memory/assets/Couleur_3.jpg");
            images.add("./unilim/info/ihm/memory/assets/Couleur_4.jpg");
            images.add("./unilim/info/ihm/memory/assets/Couleur_5.jpg");
            images.add("./unilim/info/ihm/memory/assets/Couleur_6.jpg");
            images.add("./unilim/info/ihm/memory/assets/Couleur_1.jpg");
            images.add("./unilim/info/ihm/memory/assets/Couleur_2.jpg");
            images.add("./unilim/info/ihm/memory/assets/Couleur_3.jpg");
            images.add("./unilim/info/ihm/memory/assets/Couleur_4.jpg");
            images.add("./unilim/info/ihm/memory/assets/Couleur_5.jpg");
            images.add("./unilim/info/ihm/memory/assets/Couleur_6.jpg");
        } else {
            if (cbThème.equals("Fleur")) {
                images.add("./unilim/info/ihm/memory/assets/Fleur_1.jpg");
                images.add("./unilim/info/ihm/memory/assets/Fleur_2.jpg");
                images.add("./unilim/info/ihm/memory/assets/Fleur_3.jpg");
                images.add("./unilim/info/ihm/memory/assets/Fleur_4.jpg");
                images.add("./unilim/info/ihm/memory/assets/Fleur_5.jpg");
                images.add("./unilim/info/ihm/memory/assets/Fleur_6.jpg");
                images.add("./unilim/info/ihm/memory/assets/Fleur_1.jpg");
                images.add("./unilim/info/ihm/memory/assets/Fleur_2.jpg");
                images.add("./unilim/info/ihm/memory/assets/Fleur_3.jpg");
                images.add("./unilim/info/ihm/memory/assets/Fleur_4.jpg");
                images.add("./unilim/info/ihm/memory/assets/Fleur_5.jpg");
                images.add("./unilim/info/ihm/memory/assets/Fleur_6.jpg");
            }
            else if (cbThème.equals("Animaux")){
                images.add("./unilim/info/ihm/memory/assets/Animaux_1.jpg");
                images.add("./unilim/info/ihm/memory/assets/Animaux_2.jpg");
                images.add("./unilim/info/ihm/memory/assets/Animaux_3.jpg");
                images.add("./unilim/info/ihm/memory/assets/Animaux_4.jpg");
                images.add("./unilim/info/ihm/memory/assets/Animaux_5.jpg");
                images.add("./unilim/info/ihm/memory/assets/Animaux_6.jpg");
                images.add("./unilim/info/ihm/memory/assets/Animaux_1.jpg");
                images.add("./unilim/info/ihm/memory/assets/Animaux_2.jpg");
                images.add("./unilim/info/ihm/memory/assets/Animaux_3.jpg");
                images.add("./unilim/info/ihm/memory/assets/Animaux_4.jpg");
                images.add("./unilim/info/ihm/memory/assets/Animaux_5.jpg");
                images.add("./unilim/info/ihm/memory/assets/Animaux_6.jpg");
            }
        }
    }

    public void remplirListeDos(ArrayList<String> imagesDos) {
        imagesDos.add("./unilim/info/ihm/memory/assets/Dos.png");
    }

    @FXML
    private ComboBox<String> cbThème;

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
    void commencerPartie(MouseEvent event) {
        jouer = true;
        remplirListe(images, cbThème.getValue());
        remplirListeDos(imagesDos);
        Collections.shuffle(images);
        retourné1 = false;
        retourné2 = false;
        retourné3 = false;
        retourné4 = false;
        retourné5 = false;
        retourné6 = false;
        retourné7 = false;
        retourné8 = false;
        retourné9 = false;
        retourné10 = false;
        retourné11 = false;
        retourné12 = false;
    }

    public void setImageDos(ImageView image) throws MalformedURLException {
        File file = new File(imagesDos.get(0));
        String localUrl = file.toURI().toURL().toString();
        Image img = new Image(localUrl, false);
        image.setImage(img);
    }

    @FXML
    void initialize() throws MalformedURLException {
        String[] choix = {"Couleur", "Fleur", "Animaux"}
        cbThème.getItems().addAll(choix);
        cbThème.setValue(choix[0]);
    }

    @FXML
    void retournerCarte1(MouseEvent event) throws MalformedURLException {
        if (jouer == true) {
            if (retourné1 == false) {
                if (tour < 2) {
                    retourné1 = true;
                    File file = new File(images.get(0));
                    String localUrl = file.toURI().toURL().toString();
                    Image img = new Image(localUrl, false);
                    this.image1.setImage(img);
                    if (img1 == null) {
                        img1 = image1;
                    } else {
                        img2 = image1;
                    }
                    tour = tour + 1;
                } else if (tour == 2) {
                    if (img1.getImage().getPixelReader().getColor(1, 1).equals(img2.getImage().getPixelReader().getColor(1, 1))) {
                        tour = 0;
                        img1 = img2 = null;
                        retourné1 = true;
                    } else {
                        tour = 0;
                        if (image1.equals(img1) || (image1.equals(img2))) {
                            setImageDos(image1);
                            retourné1 = false;
                        }
                        if (image2.equals(img1) || (image2.equals(img2))) {
                            setImageDos(image2);
                            retourné2 = false;
                        }
                        if (image3.equals(img1) || (image3.equals(img2))) {
                            setImageDos(image3);
                            retourné3 = false;
                        }
                        if (image4.equals(img1) || (image4.equals(img2))) {
                            setImageDos(image4);
                            retourné4 = false;
                        }
                        if (image5.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image5);
                            retourné5 = false;
                        }
                        if (image6.equals(img1) || (image6.equals(img2))) {
                            setImageDos(image6);
                            retourné6 = false;
                        }
                        if (image7.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image7);
                            retourné7 = false;
                        }
                        if (image8.equals(img1) || (image8.equals(img2))) {
                            setImageDos(image8);
                            retourné8 = false;
                        }
                        if (image9.equals(img1) || (image9.equals(img2))) {
                            setImageDos(image9);
                            retourné9 = false;
                        }
                        if (image10.equals(img1) || (image10.equals(img2))) {
                            setImageDos(image10);
                            retourné10 = false;
                        }
                        if (image11.equals(img1) | (image11.equals(img2))) {
                            setImageDos(image11);
                            retourné11 = false;
                        }
                        if ((image12.equals(img1) || (image12.equals(img2)))) {
                            setImageDos(image12);
                            retourné12 = false;
                        }
                        img1 = img2 = null;
                    }
                }
            }
        }
    }

    @FXML
    void retournerCarte2(MouseEvent event) throws MalformedURLException {
        if (jouer == true) {
            if (retourné2 == false) {
                if (tour < 2) {
                    retourné2 = true;
                    File file = new File(images.get(1));
                    String localUrl = file.toURI().toURL().toString();
                    Image img = new Image(localUrl, false);
                    this.image2.setImage(img);
                    if (img1 == null) {
                        img1 = image2;
                    } else {
                        img2 = image2;
                    }
                    tour = tour + 1;
                } else if (tour == 2) {
                    if (img1.getImage().getPixelReader().getColor(1, 1).equals(img2.getImage().getPixelReader().getColor(1, 1))) {
                        img1 = img2 = null;
                        tour = 0;
                        retourné2 = true;
                    } else {
                        tour = 0;
                        if (image1.equals(img1) || (image1.equals(img2))) {
                            setImageDos(image1);
                            retourné1 = false;
                        }
                        if (image2.equals(img1) || (image2.equals(img2))) {
                            setImageDos(image2);
                            retourné2 = false;
                        }
                        if (image3.equals(img1) || (image3.equals(img2))) {
                            setImageDos(image3);
                            retourné3 = false;
                        }
                        if (image4.equals(img1) || (image4.equals(img2))) {
                            setImageDos(image4);
                            retourné4 = false;
                        }
                        if (image5.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image5);
                            retourné5 = false;
                        }
                        if (image6.equals(img1) || (image6.equals(img2))) {
                            setImageDos(image6);
                            retourné6 = false;
                        }
                        if (image7.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image7);
                            retourné7 = false;
                        }
                        if (image8.equals(img1) || (image8.equals(img2))) {
                            setImageDos(image8);
                            retourné8 = false;
                        }
                        if (image9.equals(img1) || (image9.equals(img2))) {
                            setImageDos(image9);
                            retourné9 = false;
                        }
                        if (image10.equals(img1) || (image10.equals(img2))) {
                            setImageDos(image10);
                            retourné10 = false;
                        }
                        if (image11.equals(img1) | (image11.equals(img2))) {
                            setImageDos(image11);
                            retourné11 = false;
                        }
                        if ((image12.equals(img1) || (image12.equals(img2)))) {
                            setImageDos(image12);
                            retourné12 = false;
                        }
                        img1 = img2 = null;
                    }
                }
            }
        }
    }

    @FXML
    void retournerCarte3(MouseEvent event) throws MalformedURLException {
        if (jouer == true) {
            if (retourné3 == false) {
                if (tour < 2) {
                    retourné3 = true;
                    File file = new File(images.get(2));
                    String localUrl = file.toURI().toURL().toString();
                    Image img = new Image(localUrl, false);
                    this.image3.setImage(img);
                    if (img1 == null) {
                        img1 = image3;
                    } else {
                        img2 = image3;
                    }
                    tour = tour + 1;
                } else if (tour == 2) {
                    if (img1.getImage().getPixelReader().getColor(1, 1).equals(img2.getImage().getPixelReader().getColor(1, 1))) {
                        tour = 0;
                        img1 = img2 = null;
                        retourné3 = true;
                    } else {
                        tour = 0;
                        if (image1.equals(img1) || (image1.equals(img2))) {
                            setImageDos(image1);
                            retourné1 = false;
                        }
                        if (image2.equals(img1) || (image2.equals(img2))) {
                            setImageDos(image2);
                            retourné2 = false;
                        }
                        if (image3.equals(img1) || (image3.equals(img2))) {
                            setImageDos(image3);
                            retourné3 = false;
                        }
                        if (image4.equals(img1) || (image4.equals(img2))) {
                            setImageDos(image4);
                            retourné4 = false;
                        }
                        if (image5.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image5);
                            retourné5 = false;
                        }
                        if (image6.equals(img1) || (image6.equals(img2))) {
                            setImageDos(image6);
                            retourné6 = false;
                        }
                        if (image7.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image7);
                            retourné7 = false;
                        }
                        if (image8.equals(img1) || (image8.equals(img2))) {
                            setImageDos(image8);
                            retourné8 = false;
                        }
                        if (image9.equals(img1) || (image9.equals(img2))) {
                            setImageDos(image9);
                            retourné9 = false;
                        }
                        if (image10.equals(img1) || (image10.equals(img2))) {
                            setImageDos(image10);
                            retourné10 = false;
                        }
                        if (image11.equals(img1) | (image11.equals(img2))) {
                            setImageDos(image11);
                            retourné11 = false;
                        }
                        if ((image12.equals(img1) || (image12.equals(img2)))) {
                            setImageDos(image12);
                            retourné12 = false;
                        }
                        img1 = img2 = null;
                    }
                }
            }
        }
    }

    @FXML
    void retournerCarte4(MouseEvent event) throws MalformedURLException {
        if (jouer == true) {
            if (retourné4 == false) {
                if (tour < 2) {
                    retourné4 = true;
                    File file = new File(images.get(3));
                    String localUrl = file.toURI().toURL().toString();
                    Image img = new Image(localUrl, false);
                    this.image4.setImage(img);
                    if (img1 == null) {
                        img1 = image4;
                    } else {
                        img2 = image4;
                    }
                    tour = tour + 1;
                } else if (tour == 2) {
                    if (img1.getImage().getPixelReader().getColor(1, 1).equals(img2.getImage().getPixelReader().getColor(1, 1))) {
                        tour = 0;
                        img1 = img2 = null;
                        retourné4 = true;
                    } else {
                        tour = 0;
                        if (image1.equals(img1) || (image1.equals(img2))) {
                            setImageDos(image1);
                            retourné1 = false;
                        }
                        if (image2.equals(img1) || (image2.equals(img2))) {
                            setImageDos(image2);
                            retourné2 = false;
                        }
                        if (image3.equals(img1) || (image3.equals(img2))) {
                            setImageDos(image3);
                            retourné3 = false;
                        }
                        if (image4.equals(img1) || (image4.equals(img2))) {
                            setImageDos(image4);
                            retourné4 = false;
                        }
                        if (image5.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image5);
                            retourné5 = false;
                        }
                        if (image6.equals(img1) || (image6.equals(img2))) {
                            setImageDos(image6);
                            retourné6 = false;
                        }
                        if (image7.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image7);
                            retourné7 = false;
                        }
                        if (image8.equals(img1) || (image8.equals(img2))) {
                            setImageDos(image8);
                            retourné8 = false;
                        }
                        if (image9.equals(img1) || (image9.equals(img2))) {
                            setImageDos(image9);
                            retourné9 = false;
                        }
                        if (image10.equals(img1) || (image10.equals(img2))) {
                            setImageDos(image10);
                            retourné10 = false;
                        }
                        if (image11.equals(img1) | (image11.equals(img2))) {
                            setImageDos(image11);
                            retourné11 = false;
                        }
                        if ((image12.equals(img1) || (image12.equals(img2)))) {
                            setImageDos(image12);
                            retourné12 = false;
                        }
                        img1 = img2 = null;
                    }
                }
            }
        }
    }

    @FXML
    void retournerCarte5(MouseEvent event) throws MalformedURLException {
        if (jouer == true) {
            if (retourné5 == false) {
                if (tour < 2) {
                    retourné5 = true;
                    File file = new File(images.get(4));
                    String localUrl = file.toURI().toURL().toString();
                    Image img = new Image(localUrl, false);
                    this.image5.setImage(img);
                    if (img1 == null) {
                        img1 = image5;
                    } else {
                        img2 = image5;
                    }
                    tour = tour + 1;
                } else if (tour == 2) {
                    if (img1.getImage().getPixelReader().getColor(1, 1).equals(img2.getImage().getPixelReader().getColor(1, 1))) {
                        tour = 0;
                        img1 = img2 = null;
                        retourné5 = true;
                    } else {
                        tour = 0;
                        if (image1.equals(img1) || (image1.equals(img2))) {
                            setImageDos(image1);
                            retourné1 = false;
                        }
                        if (image2.equals(img1) || (image2.equals(img2))) {
                            setImageDos(image2);
                            retourné2 = false;
                        }
                        if (image3.equals(img1) || (image3.equals(img2))) {
                            setImageDos(image3);
                            retourné3 = false;
                        }
                        if (image4.equals(img1) || (image4.equals(img2))) {
                            setImageDos(image4);
                            retourné4 = false;
                        }
                        if (image5.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image5);
                            retourné5 = false;
                        }
                        if (image6.equals(img1) || (image6.equals(img2))) {
                            setImageDos(image6);
                            retourné6 = false;
                        }
                        if (image7.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image7);
                            retourné7 = false;
                        }
                        if (image8.equals(img1) || (image8.equals(img2))) {
                            setImageDos(image8);
                            retourné8 = false;
                        }
                        if (image9.equals(img1) || (image9.equals(img2))) {
                            setImageDos(image9);
                            retourné9 = false;
                        }
                        if (image10.equals(img1) || (image10.equals(img2))) {
                            setImageDos(image10);
                            retourné10 = false;
                        }
                        if (image11.equals(img1) | (image11.equals(img2))) {
                            setImageDos(image11);
                            retourné11 = false;
                        }
                        if ((image12.equals(img1) || (image12.equals(img2)))) {
                            setImageDos(image12);
                            retourné12 = false;
                        }
                        img1 = img2 = null;
                    }
                }
            }
        }
    }

    @FXML
    void retournerCarte6(MouseEvent event) throws MalformedURLException {
        if (jouer == true) {
            if (retourné6 == false) {
                if (tour < 2) {
                    retourné6 = true;
                    File file = new File(images.get(5));
                    String localUrl = file.toURI().toURL().toString();
                    Image img = new Image(localUrl, false);
                    this.image6.setImage(img);
                    if (img1 == null) {
                        img1 = image6;
                    } else {
                        img2 = image6;
                    }
                    tour = tour + 1;
                } else if (tour == 2) {
                    if (img1.getImage().getPixelReader().getColor(1, 1).equals(img2.getImage().getPixelReader().getColor(1, 1))) {
                        tour = 0;
                        img1 = img2 = null;
                        retourné6 = true;
                    } else {
                        tour = 0;
                        if (image1.equals(img1) || (image1.equals(img2))) {
                            setImageDos(image1);
                            retourné1 = false;
                        }
                        if (image2.equals(img1) || (image2.equals(img2))) {
                            setImageDos(image2);
                            retourné2 = false;
                        }
                        if (image3.equals(img1) || (image3.equals(img2))) {
                            setImageDos(image3);
                            retourné3 = false;
                        }
                        if (image4.equals(img1) || (image4.equals(img2))) {
                            setImageDos(image4);
                            retourné4 = false;
                        }
                        if (image5.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image5);
                            retourné5 = false;
                        }
                        if (image6.equals(img1) || (image6.equals(img2))) {
                            setImageDos(image6);
                            retourné6 = false;
                        }
                        if (image7.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image7);
                            retourné7 = false;
                        }
                        if (image8.equals(img1) || (image8.equals(img2))) {
                            setImageDos(image8);
                            retourné8 = false;
                        }
                        if (image9.equals(img1) || (image9.equals(img2))) {
                            setImageDos(image9);
                            retourné9 = false;
                        }
                        if (image10.equals(img1) || (image10.equals(img2))) {
                            setImageDos(image10);
                            retourné10 = false;
                        }
                        if (image11.equals(img1) | (image11.equals(img2))) {
                            setImageDos(image11);
                            retourné11 = false;
                        }
                        if ((image12.equals(img1) || (image12.equals(img2)))) {
                            setImageDos(image12);
                            retourné12 = false;
                        }
                        img1 = img2 = null;
                    }
                }
            }
        }
    }

    @FXML
    void retournerCarte7(MouseEvent event) throws MalformedURLException {
        if (jouer == true) {
            if (retourné7 == false) {
                if (tour < 2) {
                    retourné7 = true;
                    File file = new File(images.get(6));
                    String localUrl = file.toURI().toURL().toString();
                    Image img = new Image(localUrl, false);
                    this.image7.setImage(img);
                    if (img1 == null) {
                        img1 = image7;
                    } else {
                        img2 = image7;
                    }
                    tour = tour + 1;
                } else if (tour == 2) {
                    if (img1.getImage().getPixelReader().getColor(1, 1).equals(img2.getImage().getPixelReader().getColor(1, 1))) {
                        tour = 0;
                        img1 = img2 = null;
                        retourné7 = true;
                    } else {
                        tour = 0;
                        if (image1.equals(img1) || (image1.equals(img2))) {
                            setImageDos(image1);
                            retourné1 = false;
                        }
                        if (image2.equals(img1) || (image2.equals(img2))) {
                            setImageDos(image2);
                            retourné2 = false;
                        }
                        if (image3.equals(img1) || (image3.equals(img2))) {
                            setImageDos(image3);
                            retourné3 = false;
                        }
                        if (image4.equals(img1) || (image4.equals(img2))) {
                            setImageDos(image4);
                            retourné4 = false;
                        }
                        if (image5.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image5);
                            retourné5 = false;
                        }
                        if (image6.equals(img1) || (image6.equals(img2))) {
                            setImageDos(image6);
                            retourné6 = false;
                        }
                        if (image7.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image7);
                            retourné7 = false;
                        }
                        if (image8.equals(img1) || (image8.equals(img2))) {
                            setImageDos(image8);
                            retourné8 = false;
                        }
                        if (image9.equals(img1) || (image9.equals(img2))) {
                            setImageDos(image9);
                            retourné9 = false;
                        }
                        if (image10.equals(img1) || (image10.equals(img2))) {
                            setImageDos(image10);
                            retourné10 = false;
                        }
                        if (image11.equals(img1) | (image11.equals(img2))) {
                            setImageDos(image11);
                            retourné11 = false;
                        }
                        if ((image12.equals(img1) || (image12.equals(img2)))) {
                            setImageDos(image12);
                            retourné12 = false;
                        }
                        img1 = img2 = null;
                    }
                }
            }
        }
    }

    @FXML
    void retournerCarte8(MouseEvent event) throws MalformedURLException {
        if (jouer == true) {
            if (retourné8 == false) {
                if (tour < 2) {
                    retourné8 = true;
                    File file = new File(images.get(7));
                    String localUrl = file.toURI().toURL().toString();
                    Image img = new Image(localUrl, false);
                    this.image8.setImage(img);
                    if (img1 == null) {
                        img1 = image8;
                    } else {
                        img2 = image8;
                    }
                    tour = tour + 1;
                } else if (tour == 2) {
                    if (img1.getImage().getPixelReader().getColor(1, 1).equals(img2.getImage().getPixelReader().getColor(1, 1))) {
                        tour = 0;
                        img1 = img2 = null;
                        retourné8 = true;
                    } else {
                        tour = 0;
                        if (image1.equals(img1) || (image1.equals(img2))) {
                            setImageDos(image1);
                            retourné1 = false;
                        }
                        if (image2.equals(img1) || (image2.equals(img2))) {
                            setImageDos(image2);
                            retourné2 = false;
                        }
                        if (image3.equals(img1) || (image3.equals(img2))) {
                            setImageDos(image3);
                            retourné3 = false;
                        }
                        if (image4.equals(img1) || (image4.equals(img2))) {
                            setImageDos(image4);
                            retourné4 = false;
                        }
                        if (image5.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image5);
                            retourné5 = false;
                        }
                        if (image6.equals(img1) || (image6.equals(img2))) {
                            setImageDos(image6);
                            retourné6 = false;
                        }
                        if (image7.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image7);
                            retourné7 = false;
                        }
                        if (image8.equals(img1) || (image8.equals(img2))) {
                            setImageDos(image8);
                            retourné8 = false;
                        }
                        if (image9.equals(img1) || (image9.equals(img2))) {
                            setImageDos(image9);
                            retourné9 = false;
                        }
                        if (image10.equals(img1) || (image10.equals(img2))) {
                            setImageDos(image10);
                            retourné10 = false;
                        }
                        if (image11.equals(img1) | (image11.equals(img2))) {
                            setImageDos(image11);
                            retourné11 = false;
                        }
                        if ((image12.equals(img1) || (image12.equals(img2)))) {
                            setImageDos(image12);
                            retourné12 = false;
                        }
                        img1 = img2 = null;
                    }
                }
            }
        }
    }

    @FXML
    void retournerCarte9(MouseEvent event) throws MalformedURLException {
        if (jouer == true) {
            if (retourné9 == false) {
                if (tour < 2) {
                    retourné9 = true;
                    File file = new File(images.get(8));
                    String localUrl = file.toURI().toURL().toString();
                    Image img = new Image(localUrl, false);
                    this.image9.setImage(img);
                    if (img1 == null) {
                        img1 = image9;
                    } else {
                        img2 = image9;
                    }
                    tour = tour + 1;
                } else if (tour == 2) {
                    if (img1.getImage().getPixelReader().getColor(1, 1).equals(img2.getImage().getPixelReader().getColor(1, 1))) {
                        tour = 0;
                        img1 = img2 = null;
                        retourné9 = true;
                    } else {
                        tour = 0;
                        if (image1.equals(img1) || (image1.equals(img2))) {
                            setImageDos(image1);
                            retourné1 = false;
                        }
                        if (image2.equals(img1) || (image2.equals(img2))) {
                            setImageDos(image2);
                            retourné2 = false;
                        }
                        if (image3.equals(img1) || (image3.equals(img2))) {
                            setImageDos(image3);
                            retourné3 = false;
                        }
                        if (image4.equals(img1) || (image4.equals(img2))) {
                            setImageDos(image4);
                            retourné4 = false;
                        }
                        if (image5.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image5);
                            retourné5 = false;
                        }
                        if (image6.equals(img1) || (image6.equals(img2))) {
                            setImageDos(image6);
                            retourné6 = false;
                        }
                        if (image7.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image7);
                            retourné7 = false;
                        }
                        if (image8.equals(img1) || (image8.equals(img2))) {
                            setImageDos(image8);
                            retourné8 = false;
                        }
                        if (image9.equals(img1) || (image9.equals(img2))) {
                            setImageDos(image9);
                            retourné9 = false;
                        }
                        if (image10.equals(img1) || (image10.equals(img2))) {
                            setImageDos(image10);
                            retourné10 = false;
                        }
                        if (image11.equals(img1) | (image11.equals(img2))) {
                            setImageDos(image11);
                            retourné11 = false;
                        }
                        if ((image12.equals(img1) || (image12.equals(img2)))) {
                            setImageDos(image12);
                            retourné12 = false;
                        }
                        img1 = img2 = null;
                    }
                }
            }
        }
    }

    @FXML
    void retournerCarte10(MouseEvent event) throws MalformedURLException {
        if (jouer == true) {
            if (retourné10 == false) {
                if (tour < 2) {
                    retourné10 = true;
                    File file = new File(images.get(9));
                    String localUrl = file.toURI().toURL().toString();
                    Image img = new Image(localUrl, false);
                    this.image10.setImage(img);
                    if (img1 == null) {
                        img1 = image10;
                    } else {
                        img2 = image10;
                    }
                    tour = tour + 1;
                } else if (tour == 2) {
                    if (img1.getImage().getPixelReader().getColor(1, 1).equals(img2.getImage().getPixelReader().getColor(1, 1))) {
                        tour = 0;
                        img1 = img2 = null;
                        retourné10 = true;
                    } else {
                        tour = 0;
                        if (image1.equals(img1) || (image1.equals(img2))) {
                            setImageDos(image1);
                            retourné1 = false;
                        }
                        if (image2.equals(img1) || (image2.equals(img2))) {
                            setImageDos(image2);
                            retourné2 = false;
                        }
                        if (image3.equals(img1) || (image3.equals(img2))) {
                            setImageDos(image3);
                            retourné3 = false;
                        }
                        if (image4.equals(img1) || (image4.equals(img2))) {
                            setImageDos(image4);
                            retourné4 = false;
                        }
                        if (image5.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image5);
                            retourné5 = false;
                        }
                        if (image6.equals(img1) || (image6.equals(img2))) {
                            setImageDos(image6);
                            retourné6 = false;
                        }
                        if (image7.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image7);
                            retourné7 = false;
                        }
                        if (image8.equals(img1) || (image8.equals(img2))) {
                            setImageDos(image8);
                            retourné8 = false;
                        }
                        if (image9.equals(img1) || (image9.equals(img2))) {
                            setImageDos(image9);
                            retourné9 = false;
                        }
                        if (image10.equals(img1) || (image10.equals(img2))) {
                            setImageDos(image10);
                            retourné10 = false;
                        }
                        if (image11.equals(img1) | (image11.equals(img2))) {
                            setImageDos(image11);
                            retourné11 = false;
                        }
                        if ((image12.equals(img1) || (image12.equals(img2)))) {
                            setImageDos(image12);
                            retourné12 = false;
                        }
                        img1 = img2 = null;
                    }
                }
            }
        }
    }

    @FXML
    void retournerCarte11(MouseEvent event) throws MalformedURLException {
        if (jouer == true) {
            if (retourné11 == false) {
                if (tour < 2) {
                    retourné11 = true;
                    File file = new File(images.get(10));
                    String localUrl = file.toURI().toURL().toString();
                    Image img = new Image(localUrl, false);
                    this.image11.setImage(img);
                    if (img1 == null) {
                        img1 = image11;
                    } else {
                        img2 = image11;
                    }
                    tour = tour + 1;
                } else if (tour == 2) {
                    if (img1.getImage().getPixelReader().getColor(1, 1).equals(img2.getImage().getPixelReader().getColor(1, 1))) {
                        tour = 0;
                        img1 = img2 = null;
                        retourné11 = true;
                    } else {
                        tour = 0;
                        if (image1.equals(img1) || (image1.equals(img2))) {
                            setImageDos(image1);
                            retourné1 = false;
                        }
                        if (image2.equals(img1) || (image2.equals(img2))) {
                            setImageDos(image2);
                            retourné2 = false;
                        }
                        if (image3.equals(img1) || (image3.equals(img2))) {
                            setImageDos(image3);
                            retourné3 = false;
                        }
                        if (image4.equals(img1) || (image4.equals(img2))) {
                            setImageDos(image4);
                            retourné4 = false;
                        }
                        if (image5.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image5);
                            retourné5 = false;
                        }
                        if (image6.equals(img1) || (image6.equals(img2))) {
                            setImageDos(image6);
                            retourné6 = false;
                        }
                        if (image7.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image7);
                            retourné7 = false;
                        }
                        if (image8.equals(img1) || (image8.equals(img2))) {
                            setImageDos(image8);
                            retourné8 = false;
                        }
                        if (image9.equals(img1) || (image9.equals(img2))) {
                            setImageDos(image9);
                            retourné9 = false;
                        }
                        if (image10.equals(img1) || (image10.equals(img2))) {
                            setImageDos(image10);
                            retourné10 = false;
                        }
                        if (image11.equals(img1) | (image11.equals(img2))) {
                            setImageDos(image11);
                            retourné11 = false;
                        }
                        if ((image12.equals(img1) || (image12.equals(img2)))) {
                            setImageDos(image12);
                            retourné12 = false;
                        }
                        img1 = img2 = null;
                    }
                }
            }
        }
    }

    @FXML
    void retournerCarte12(MouseEvent event) throws MalformedURLException {
        if (jouer == true) {
            if (retourné12 == false) {
                if (tour < 2) {
                    retourné12 = true;
                    File file = new File(images.get(11));
                    String localUrl = file.toURI().toURL().toString();
                    Image img = new Image(localUrl, false);
                    this.image12.setImage(img);
                    if (img1 == null) {
                        img1 = image12;
                    } else {
                        img2 = image12;
                    }
                    tour = tour + 1;
                } else if (tour == 2) {
                    if (img1.getImage().getPixelReader().getColor(1, 1).equals(img2.getImage().getPixelReader().getColor(1, 1))) {
                        tour = 0;
                        img1 = img2 = null;
                        retourné12 = true;
                    } else {
                        tour = 0;
                        if (image1.equals(img1) || (image1.equals(img2))) {
                            setImageDos(image1);
                            retourné1 = false;
                        }
                        if (image2.equals(img1) || (image2.equals(img2))) {
                            setImageDos(image2);
                            retourné2 = false;
                        }
                        if (image3.equals(img1) || (image3.equals(img2))) {
                            setImageDos(image3);
                            retourné3 = false;
                        }
                        if (image4.equals(img1) || (image4.equals(img2))) {
                            setImageDos(image4);
                            retourné4 = false;
                        }
                        if (image5.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image5);
                            retourné5 = false;
                        }
                        if (image6.equals(img1) || (image6.equals(img2))) {
                            setImageDos(image6);
                            retourné6 = false;
                        }
                        if (image7.equals(img1) || (image7.equals(img2))) {
                            setImageDos(image7);
                            retourné7 = false;
                        }
                        if (image8.equals(img1) || (image8.equals(img2))) {
                            setImageDos(image8);
                            retourné8 = false;
                        }
                        if (image9.equals(img1) || (image9.equals(img2))) {
                            setImageDos(image9);
                            retourné9 = false;
                        }
                        if (image10.equals(img1) || (image10.equals(img2))) {
                            setImageDos(image10);
                            retourné10 = false;
                        }
                        if (image11.equals(img1) | (image11.equals(img2))) {
                            setImageDos(image11);
                            retourné11 = false;
                        }
                        if ((image12.equals(img1) || (image12.equals(img2)))) {
                            setImageDos(image12);
                            retourné12 = false;
                        }
                        img1 = img2 = null;
                    }
                }
            }
        }
    }

    @FXML
    void arreterPartie(MouseEvent event) throws MalformedURLException {
        jouer = false;
        setImageDos(image1);
        setImageDos(image2);
        setImageDos(image3);
        setImageDos(image4);
        setImageDos(image5);
        setImageDos(image6);
        setImageDos(image7);
        setImageDos(image8);
        setImageDos(image9);
        setImageDos(image10);
        setImageDos(image11);
        setImageDos(image12);
    }
}
