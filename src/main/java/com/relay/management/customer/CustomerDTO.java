package com.relay.management.customer;

import com.relay.management.common.Criteria;
import lombok.Data;

@Data
public class CustomerDTO  extends Criteria {

    int C_Num;
    String C_Name;
    String C_Gender;
    int C_Age;
    String C_Tel;
    String C_Content;
    String C_Form;
    int[] C_Nums;

    public CustomerDTO(){

    }

}
