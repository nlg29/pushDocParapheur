package org.adullact.clientParapheur;

import java.io.File;
import java.util.List;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

public class MesOptions {
    


	@Option(name = "-h", aliases = {"--help"}, usage = "Affiche l'aide")
    private boolean help;

    @Option(name = "-c", aliases = {"--config"}, metaVar = "File", usage = "fichier de configuration. Par defaut conf.cf")
    private File confFile;

    @Option(name = "-d", aliases = {"--documentPrincipal"}, metaVar = "path", usage = "Document principal", required = true)
    private File documentPrincipal;
    
    @Option(name = "-v", aliases = {"--visuelPdf"}, metaVar = "FILE", usage = "Document PDF de visualisation", required = true)
    private File documentVisu;
  
    @Option(name = "-T", aliases = {"--Type"}, metaVar = "String", usage = "Type de dossier", required = true)
    private String type;
    
    @Option(name = "-t", aliases = {"--Sous Type"}, metaVar = "String", usage = "Sous Type de dossier", required = true)
    private String sType;
    
    @Option(name = "-V", aliases = {"--visibilite"}, metaVar = "String", usage = "Visibilité du dossier", required = true)
    private String visibilite;
    
    @Option(name = "-i", aliases = {"--id"}, metaVar = "String", usage = "Identification du dossier", required = true)
    private String idDossier;
    
    @Option(name = "-e", aliases = {"--email"}, metaVar = "String", usage = "eMail de l'emetteur", required = true)
    private String emailEmetteur;
   


	@Argument
    private List<String> arguments;
    
	public boolean isHelp() {
		return help;
	}

	public String getIdDossier() {
			return idDossier;
	}

	public String getEmailEmetteur() {
		return emailEmetteur;
	}
		
	public File getConfFile() {
		return confFile;
	}

	public File getDocumentPrincipal() {
		return documentPrincipal;
	}

	public File getDocumentVisu() {
		return documentVisu;
	}

	public String getType() {
		return type;
	}

	public String getsType() {
		return sType;
	}

	public String getVisibilite() {
		return visibilite;
	}

	public List<String> getArguments() {
		return arguments;
	}
}
