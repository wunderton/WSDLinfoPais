/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsdlinfopais;

/**
 *
 * @author Wunderton <your.name at your.org>
 */
public class WSDLinfoPais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String busqueda = "ES";
        System.out.println("Capital del Pais: " + capitalCity(busqueda));
        System.out.println("Lenguaje Pais: " + languageName(busqueda));
    }

    private static String capitalCity(java.lang.String sCountryISOCode) {
        org.oorsprong.websamples.CountryInfoService service = new org.oorsprong.websamples.CountryInfoService();
        org.oorsprong.websamples.CountryInfoServiceSoapType port = service.getCountryInfoServiceSoap();
        return port.capitalCity(sCountryISOCode);
    }

    private static String languageName(java.lang.String sISOCode) {
        org.oorsprong.websamples.CountryInfoService service = new org.oorsprong.websamples.CountryInfoService();
        org.oorsprong.websamples.CountryInfoServiceSoapType port = service.getCountryInfoServiceSoap();
        return port.languageName(sISOCode);
    }
    
}
