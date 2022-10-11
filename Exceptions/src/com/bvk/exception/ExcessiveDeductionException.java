package com.bvk.exception;

public class ExcessiveDeductionException extends Exception {

 

           private static final long serialVersionUID = 1L;

 

           public ExcessiveDeductionException() {

           }

 

           public ExcessiveDeductionException(String message) {

                      super(message);
           }
}
