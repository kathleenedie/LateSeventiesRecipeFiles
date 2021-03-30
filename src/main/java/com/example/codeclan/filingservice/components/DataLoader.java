package com.example.codeclan.filingservice.components;

import com.example.codeclan.filingservice.models.ExtensionType;
import com.example.codeclan.filingservice.models.File;
import com.example.codeclan.filingservice.models.Folder;
import com.example.codeclan.filingservice.repositories.FileRepository;
import com.example.codeclan.filingservice.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        Folder amuseBouche = new Folder("Amuse Bouche");
        folderRepository.save(amuseBouche);
        Folder starter = new Folder("Starter");
        folderRepository.save(starter);
        Folder main = new Folder("Main");
        folderRepository.save(main);
        Folder pudding = new Folder("Pudding");
        folderRepository.save(pudding);

        File canape = new File("Canape", ExtensionType.JAVA, 250, amuseBouche);
        fileRepository.save(canape);
        File nibbles = new File("Nibbles", ExtensionType.PPT, 650, amuseBouche);
        fileRepository.save(nibbles);
        File prawnCocktail = new File("Prawn Cocktail", ExtensionType.RB, 380, starter);
        fileRepository.save(prawnCocktail);
        File melbaToast = new File("Melba Toast", ExtensionType.TXT, 410, starter);
        fileRepository.save(melbaToast);
        File cassolet = new File("Cassolet", ExtensionType.TXT, 290, main);
        fileRepository.save(cassolet);
        File porkScallopini = new File("Pork Scallopini", ExtensionType.JAVA, 340, main);
        fileRepository.save(porkScallopini);
        File blackForestGateaux = new File("Black Forest Gateaux", ExtensionType.TXT, 240, pudding);
    }
}
