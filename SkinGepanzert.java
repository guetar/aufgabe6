/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthias
 */
public class SkinGepanzert extends Skin{
    //VB: b!=null
    //NB: return "" wenn Skin mit b kompatibel ist
    @Override
    public String fromBeschuetzer(Beschuetzer b){
    return "";
    }

    @Override
    public String fromSchwerarbeiter(Schwerarbeiter s) {
        return null;
    }

    @Override
    public String fromBediener(Bediener b) {
        return null;
    }
}
