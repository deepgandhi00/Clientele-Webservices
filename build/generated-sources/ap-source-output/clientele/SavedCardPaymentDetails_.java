package clientele;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-23T12:26:26")
@StaticMetamodel(SavedCardPaymentDetails.class)
public class SavedCardPaymentDetails_ { 

    public static volatile SingularAttribute<SavedCardPaymentDetails, String> bankNumber;
    public static volatile SingularAttribute<SavedCardPaymentDetails, Integer> bankId;
    public static volatile SingularAttribute<SavedCardPaymentDetails, Date> expiryMonth;
    public static volatile SingularAttribute<SavedCardPaymentDetails, Integer> savedCardPaymentDetailsId;
    public static volatile SingularAttribute<SavedCardPaymentDetails, Date> expiryYear;
    public static volatile SingularAttribute<SavedCardPaymentDetails, String> bankHolderName;

}