package clientele;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-23T12:26:26")
@StaticMetamodel(ProductOrder.class)
public class ProductOrder_ { 

    public static volatile SingularAttribute<ProductOrder, Date> date;
    public static volatile SingularAttribute<ProductOrder, Integer> paymentModeId;
    public static volatile SingularAttribute<ProductOrder, Integer> orderId;
    public static volatile SingularAttribute<ProductOrder, Date> time;
    public static volatile SingularAttribute<ProductOrder, Integer> deliveryBoyId;
    public static volatile SingularAttribute<ProductOrder, Integer> retailerId;
    public static volatile SingularAttribute<ProductOrder, String> status;

}