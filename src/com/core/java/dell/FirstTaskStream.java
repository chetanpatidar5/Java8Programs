package com.core.java.dell;

import java.util.LinkedList;
import java.util.List;

public class FirstTaskStream {
    public static void formNameFiltering() {

        AnswerValue av1 = new AnswerValue(null, "gcrsm_type_1");
        AnswerValue av2 = new AnswerValue("private_form_2", "gcrsm_type_2");
        AnswerValue av3 = new AnswerValue("private_form_3", null);
        AnswerValue av4 = new AnswerValue(null, "gcrsm_type_4");
        AnswerValue av5 = new AnswerValue("", "gcrsm_type_5");
        AnswerValue av6 = new AnswerValue("private_form_6", "");
        AnswerValue av7 = new AnswerValue("private_form_7", "gcrsm_type_7");
        AnswerValue av8 = new AnswerValue(null, "gcrsm_type_8");
        // for each of above objects let's:

        LinkedList<AnswerValue> ansValue=new LinkedList<>();
        ansValue.add(new AnswerValue(null, "gcrsm_type_1"));
        ansValue.add(new AnswerValue(null, "gcrsm_type_1"));
        ansValue.add(new AnswerValue(null, "gcrsm_type_1"));
        ansValue.add(new AnswerValue(null, "gcrsm_type_1"));
        ansValue.add(new AnswerValue("private_form_7", "gcrsm_type_7"));

        for (AnswerValue answerValue:ansValue) {
            System.out.println(answerValue.getOptionValue()+" "+answerValue.getStringValue());
            ansValue.add(answerValue);
        }





        // FIRST STEP: execute 'getCustomValue' method and let's display custom value.

        // SECOND STEP: display combined value (stringValue + '' + optionValue)

        // THIRD STEP: let's filter out all values which has more then 13 characters

        // FOURTH STEP: let's count all of objects


    }

        // get 'stringValue' or 'optionValue' optionaly (if the first one does not exist).
        public static AnswerValue getCustomValue(AnswerValue answerValue) {




            return answerValue;
        }

    }


