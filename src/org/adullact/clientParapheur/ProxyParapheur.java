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
import java.util.Map;
import javax.xml.ws.BindingProvider;
import org.adullact.spring_ws.iparapheur._1.*;

/**
 * Facilitateur d'interaction avec les web-services i-Parapheur
 *
 * @author Nicolas LE GRAND - CG Finistere
 * @author Stephane Vast - Adullact Projet
 */
public class ProxyParapheur {

    static InterfaceParapheur service;

    public ProxyParapheur(String endpoint, String username, String password, String trustStorePath, String trustStorePass, String keyStorePath, String keyStorePass) {
        //Initialisation du contexte et du service d'acces
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", trustStorePass);
        System.setProperty("javax.net.ssl.keyStore", keyStorePath);
        System.setProperty("javax.net.ssl.keyStorePassword", keyStorePass);

        InterfaceParapheurService serviceLocator = new InterfaceParapheurService();
        service = serviceLocator.getInterfaceParapheurSoap11();
        Map<String, Object> requestContext = ((BindingProvider) service).getRequestContext();

        requestContext.put(BindingProvider.SESSION_MAINTAIN_PROPERTY, Boolean.TRUE);
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
        requestContext.put(BindingProvider.USERNAME_PROPERTY, username);
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, password);
    }

    public static GetListeTypesResponse appelGetTypes() {
        GetListeTypesResponse getListeTypesResponse = service.getListeTypes("");
        return getListeTypesResponse;
    }

    public static GetListeSousTypesResponse appelGetSousTypes(String stype) {
        return service.getListeSousTypes(stype);
    }

    public static String appelEcho(String str) {
        return service.echo(str);
    }

    public static GetHistoDossierResponse appelGetHistogramme(String id) {
        return (service.getHistoDossier(id));
    }

    public static GetDossierResponse appelGetDossier(String id) {
        return (service.getDossier(id));
    }
	
    public static RechercherDossiersResponse appelRechercheDossier(String type, String status) {
        RechercherDossiersRequest rechercherDossiersRequest = new RechercherDossiersRequest();
        if (type != null) {
            rechercherDossiersRequest.setTypeTechnique(type);
        }
        rechercherDossiersRequest.setStatus(status);
        return service.rechercherDossiers(rechercherDossiersRequest);
    }
	
    public static String appelArchiverDossier(String id) {
        ArchiverDossierRequest archiverDossierRequest = new ArchiverDossierRequest();
        archiverDossierRequest.setArchivageAction(ArchivageAction.ARCHIVER);
        archiverDossierRequest.setDossierID(id);
        ArchiverDossierResponse res = service.archiverDossier(archiverDossierRequest);
        return res.getMessageRetour().getMessage();
    }

    public static String appelPurgerDossier(String id) {
        ArchiverDossierRequest archiverDossierRequest = new ArchiverDossierRequest();
        archiverDossierRequest.setArchivageAction(ArchivageAction.EFFACER);
        archiverDossierRequest.setDossierID(id);
        ArchiverDossierResponse res = service.archiverDossier(archiverDossierRequest);
        return res.getMessageRetour().getMessage();
    }
    
    public static String appelCreerDossier(String type, String sType, String emailEmetteur, String dossierID, String docPrincipal, String visuelPdf, String visibilite){
    	CreerDossierRequest creerDossierRequest = new CreerDossierRequest();
    	creerDossierRequest.setTypeTechnique(type);
    	creerDossierRequest.setSousType(sType);
    	creerDossierRequest.setEmailEmetteur(emailEmetteur);
    	creerDossierRequest.setDossierID(dossierID);
    	creerDossierRequest.setDocumentPrincipal(GetTypeDoc(docPrincipal, "application/pdf"));
    	creerDossierRequest.setVisuelPDF(GetTypeDoc(visuelPdf, "application/pdf"));
    	creerDossierRequest.setVisibilite(Visibilite.fromValue(visibilite));
    	
    	CreerDossierResponse res = service.creerDossier(creerDossierRequest);
    	return res.getMessageRetour().getMessage();
    }
    
    public static TypeDoc GetTypeDoc(String path, String contentType){
    	TypeDoc doc = new TypeDoc();
    	doc.setContentType(contentType);
    	try {
    	    File fileIn = new File(path);
    	    FileInputStream fis = new FileInputStream(fileIn);
    	    byte[] buffer = new byte[fis.available()];
    	    fis.read(buffer);
    	    doc.setValue(buffer);
    	    fis.close();
    	} catch(Exception e) {
    	    e.printStackTrace();
    	}
    	return doc;
    }
}
