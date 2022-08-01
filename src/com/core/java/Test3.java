package com.core.java;

import com.core.java.dell.AnswerValue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {


    public static void formNameFiltering() {

      /*  AnswerValue av1 = new AnswerValue(null, "gcrsm_type_1");
        AnswerValue av2 = new AnswerValue("private_form_2", "gcrsm_type_2");
        AnswerValue av3 = new AnswerValue("private_form_3", null);
        AnswerValue av4 = new AnswerValue(null, "gcrsm_type_4");
        AnswerValue av5 = new AnswerValue("", "gcrsm_type_5");
        AnswerValue av6 = new AnswerValue("private_form_6", "");
        AnswerValue av7 = new AnswerValue("private_form_7", "gcrsm_type_7");
        AnswerValue av8 = new AnswerValue(null, "gcrsm_type_8");*/
        // for each of above objects let's:

        List<AnswerValue> answerValueList = Arrays.asList(new AnswerValue[]{
                new AnswerValue(null, "gcrsm_type_1")});
        new AnswerValue("private_form_2", "gcrsm_type_2");
        new AnswerValue(null, "gcrsm_type_8");
        new AnswerValue("private_form_7", "gcrsm_type_7");
        new AnswerValue("", "gcrsm_type_5");

        Stream.of(answerValueList);

        List<String> names = answerValueList.stream().map(s->s.getStringValue())
                .collect(Collectors.toList());
                 System.out.println(names);
        }
    }


        // FIRST STEP: execute 'getCustomValue' method and let's display custom value.

        // SECOND STEP: display combined value (stringValue + '' + optionValue)

        // THIRD STEP: let's filter out all values which has more then 13 characters

        // FOURTH STEP: let's count all of objects





        // get 'stringValue' or 'optionValue' optionaly (if the first one does not exist).








