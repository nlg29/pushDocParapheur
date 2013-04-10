/**
 * Copyright 2012 Nicolas LE GRAND
 *
 * This file is part of PushDocParapheur.
 *
 * GetDocParapheur is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * GetDocParapheur is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * GetDocParapheur. If not, see http://www.gnu.org/licenses/.
 */
package org.adullact.clientParapheur;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Nicolas LE GRAND
 * @author Stephane Vast
 */
public class ConfigLoader {

    Properties cf;
    private static String typeTechnique, sousType, emailEmetteur, visibilite, datelimite, outputPath, endPoint, user, pass, trustStorePass, trustStorePath, keyStorePath, keyStorePass, dossierID;

    public ConfigLoader(String path) {
     
    	cf = new Properties();
        FileInputStream in;
        try {
            in = new FileInputStream(path);
            cf.load(in);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Impossible de trouver le fichier " + System.getProperty("user.dir") + "/" + path);
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Problème lors de l'ouverture du fichier " + System.getProperty("user.dir") + "/" + path);
            System.exit(0);
        }

        endPoint = cf.getProperty("endPoint");
        user = cf.getProperty("user");
        pass = cf.getProperty("pass");
        trustStorePass = cf.getProperty("trustStorePass");
        trustStorePath = cf.getProperty("trustStorePath");
        keyStorePass = cf.getProperty("keyStorePass");
        keyStorePath = cf.getProperty("keyStorePath");
        
        //Vérification présence des fichiers
        File f = new File("./iparapheur.wsdl");
        if (!f.exists()) {
            System.out.println("Impossible de trouver le fichier " + System.getProperty("user.dir") + "/iparapheur.wsdl");
            System.exit(0);
        }

        f = new File(trustStorePath);
        if (!f.exists()) {
            System.out.println("Impossible de trouver le fichier " + trustStorePath);
            System.exit(0);
        }

        f = new File(keyStorePath);
        if (!f.exists()) {
            System.out.println("Impossible de trouver le fichier " + keyStorePath);
            System.exit(0);
        }
    }

    public String getType() {
        return typeTechnique;
    }

    public String getOutputPath() {
        return outputPath;
    }

    public String getendPoint() {
        return endPoint;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getTrustStorePass() {
        return trustStorePass;
    }

    public String getTrustStorePath() {
        return trustStorePath;
    }

    public String getKeyStorePath() {
        return keyStorePath;
    }

    public String getKeyStorePass() {
        return keyStorePass;
    }

	public static String getDatelimite() {
		return datelimite;
	}

	public static String getDossierID() {
		return dossierID;
	}

	public static String getSousType() {
		return sousType;
	}

	public static String getEmailEmetteur() {
		return emailEmetteur;
	}

	public static String getVisibilite() {
		return visibilite;
	}
    
    
}
