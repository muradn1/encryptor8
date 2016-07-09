package encryptor;


import java.util.ArrayList;
import java.util.Random;


public class App {
    public static void main( String[] args ) {
        ArrayList<myFile> myFiles = new ArrayList<myFile>();
        ArrayList<String> myFilesPaths = new ArrayList<String>();
        String act, encryptionAlgorithmChosen;
        int idx;


        Helper helper = new Helper();
        act = helper.getUserInput("enter E/e for Encryption or D/d for Decryption");
        idx = helper.getFilePathFromUser(myFiles,myFilesPaths,"please insert the path of the file");
        encryptionAlgorithmChosen = helper.ChooseEncryptionAlgorithm("enter C/c for Caesar, X/x for XOR, or M/m for Multiplication");
        helper.doActionOnFile(myFiles,idx,act,encryptionAlgorithmChosen); //encrypt/decrypt the file

    }
}
