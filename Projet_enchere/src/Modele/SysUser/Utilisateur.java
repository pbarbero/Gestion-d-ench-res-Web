/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.SysUser;

import Modele.SysEnchere.Enchere;
import java.util.ArrayList;

/**
 *
 * @author ETD-P\boulkrinat
 */
public abstract class Utilisateur {
    
    String nom;
    String prenom;
    String login;
    ArrayList <Enchere>listEnchere;
    ArrayList <Enchere>listOffre;
    
}
