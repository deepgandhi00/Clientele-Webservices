package clientele;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-23T12:26:26")
@StaticMetamodel(Bank.class)
public class Bank_ { 

    public static volatile SingularAttribute<Bank, Boolean> isNetBanking;
    public static volatile SingularAttribute<Bank, Integer> bankId;
    public static volatile SingularAttribute<Bank, Boolean> isCreditCard;
    public static volatile SingularAttribute<Bank, Boolean> isDebitCard;
    public static volatile SingularAttribute<Bank, String> bankName;
    public static volatile SingularAttribute<Bank, String> bankLogo;

}