/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthias
 */
public class SkinGepanzert extends Skin{
    
    //NB: return "" wenn Skin mit Beschuetzer kompatibel ist
    @Override
    public String fromBeschuetzer(){
    return "";
    }

    @Override
    public String fromSchwerarbeiter() {
        return null;
    }

    @Override
    public String fromBediener() {
        return null;
    }
}
