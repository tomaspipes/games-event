package hangman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;

public class DifficultyWordChosing {

    // Constructor initializes chosenWord to null
    public DifficultyWordChosing() {
        this.chosenWord = null;
    }
    
    // Lista de palavras possiveis para adivinhar
    private String[] easyWords = {
            "Cao", "Gato", "Sol", "Lua", "Casa", "Carro", "Livro", "Bola", "Peixe", "Arvore",
            "Agua", "Rua", "Maca", "Escola", "Amigo", "Festa", "Pao", "Chave", "Bebe", "Rato", "Pato"
    };

    private String[] mediumWords = {
            "Biblioteca", "Cadeira", "Viagem", "Janela", "Medico", "Jardim", "Montanha", "Lapis",
            "Sapatos", "Professor", "Relogio", "Filme", "Imagem", "Hospital", "Floresta", "Planeta",
            "Oceano", "Ciencia", "Pirata", "Circo"
    };

    private String[] hardWords = {
            "Questionario", "Arqueologia", "Pneumonia", "Refrigerador", "Enciclopedia", "Travesso",
            "Hipopotamo", "Excentrico", "Subterraneo", "Empreendedor", "Paralelepipedo", "Concentracao",
            "Pterodactilo", "Abacaxi", "Otorrinolaringologista", "Subjetividade", "Psicopedagogo",
            "Inconstitucional", "Esquizofrenia", "Subjetividade"
    };

    private String[] impossibleWords = {
            "Pneumoultramicroscopicossilicovulcanoconiotico", "Hipopotomonstrosesquipedaliofobia",
            "Anticonstitucionalissimamente", "Inconstitucionalissimamente", "Otorrinolaringologista",
            "Superextraordinarissimamente", "Paraclorobenzilpirrolidinilhidroxipirimidinol",
            "Hepaticocelularcarcinoma", "Hexafluorossilicofluoreto", "Desoxirribonucleico",
            "Eletromagneticamente", "Radioimunoeletroforese", "Demotécnicoentomofobista",
            "Disprosodicopeptídico", "Hipercorticismo", "Esquizofreniforme", "Clorofluorocarboneto",
            "Polirribonucleotídeo", "Pseudopseudohipoparatireoidismo", "Metodologicamente"
    };

    private String chosenWord; // String para a palavra escolhida de forma aleatória
    private String difficulty; // String para a dificuldade escolhida

    public void getRandomWord(String difficulty) {
        Random random = new Random();

        // Switch Case para determinar a dificuldade e em que array escolher a palavra aleatória
        switch(difficulty){
            case "Fácil" :
            this.chosenWord = easyWords[random.nextInt(easyWords.length)];
            break;

            case "Médio" :
            	this.chosenWord = mediumWords[random.nextInt(mediumWords.length)];
            break;

            case "Difícil" :
            	this.chosenWord = hardWords[random.nextInt(hardWords.length)];
            break;

            case "Impossivel" :
            	this.chosenWord = impossibleWords[random.nextInt(impossibleWords.length)];
            break;
        }
    }

    // Getters for chosen word and difficulty
    public String getChosenWord() {
        return chosenWord;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
