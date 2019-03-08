/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientele.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Royal
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(clientele.service.AddressDetailFacadeREST.class);
        resources.add(clientele.service.AdminFacadeREST.class);
        resources.add(clientele.service.BankFacadeREST.class);
        resources.add(clientele.service.CategoryFacadeREST.class);
        resources.add(clientele.service.CitiesFacadeREST.class);
        resources.add(clientele.service.CodDetailsFacadeREST.class);
        resources.add(clientele.service.CreditCardDetailsFacadeREST.class);
        resources.add(clientele.service.DebitCardDetailsFacadeREST.class);
        resources.add(clientele.service.DeliveryBoyFacadeREST.class);
        resources.add(clientele.service.MarketerFacadeREST.class);
        resources.add(clientele.service.OrderDetailFacadeREST.class);
        resources.add(clientele.service.OrderPaymentInfoFacadeREST.class);
        resources.add(clientele.service.PaymentModeFacadeREST.class);
        resources.add(clientele.service.PincodeFacadeREST.class);
        resources.add(clientele.service.ProductDetailsFacadeREST.class);
        resources.add(clientele.service.ProductFacadeREST.class);
        resources.add(clientele.service.ProductOrderFacadeREST.class);
        resources.add(clientele.service.RetailerTypeFacadeREST.class);
        resources.add(clientele.service.RetailersFacadeREST.class);
        resources.add(clientele.service.ReviewFacadeREST.class);
        resources.add(clientele.service.RouteFacadeREST.class);
        resources.add(clientele.service.SavedCardPaymentDetailsFacadeREST.class);
        resources.add(clientele.service.SubcategoryFacadeREST.class);
    }
    
}
