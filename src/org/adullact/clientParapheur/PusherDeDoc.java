package org.adullact.clientParapheur;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.adullact.clientParapheur.MesOptions;

public class PusherDeDoc{

	static String ECHO_STRING = "Hello iParapheur, I am the gentle bot.";
    static ProxyParapheur proxy;
    static ConfigLoader configLoader;
    
   public static void main( String[] args ){

     MesOptions options = new MesOptions();
     CmdLineParser parser = new CmdLineParser(options);

     try {  parser.parseArgument(args);    }
     catch (CmdLineException e) {
     	parser.setUsageWidth(80);
        parser.printUsage(System.out);
        return;
     }
     
      //  ##### Chargement de la configuration
     configLoader = new ConfigLoader(options.getConfFile().getAbsolutePath());

     //  ##### Initialisation du proxy java
     proxy = new ProxyParapheur(configLoader.getendPoint(),
             configLoader.getUser(),
             configLoader.getPass(),
             configLoader.getTrustStorePath(),
             configLoader.getTrustStorePass(),
             configLoader.getKeyStorePath(),
             configLoader.getKeyStorePass());

     // ##### SANITY CHECK
     if (!ProxyParapheur.appelEcho(ECHO_STRING).contains(ECHO_STRING))
         System.out.println("Connexion impossible vers iParapheur, attention au contenu du fichier de configuration");
    
     // ##### Envoi simple du document
     String retour = ProxyParapheur.appelCreerDossier(options.getType(), options.getsType(), options.getEmailEmetteur(), options.getIdDossier(),options.getDocumentPrincipal().getAbsolutePath(),options.getDocumentVisu().getAbsolutePath(),options.getVisibilite()); 
     System.out.println(retour);
   }
}