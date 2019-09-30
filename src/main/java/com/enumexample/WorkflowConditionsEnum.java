package com.enumexample;

import java.util.*;
import java.util.stream.Collectors;

public enum WorkflowConditionsEnum {

    SHIPMENT_PENDING_TMO ( "SHIPMENT_PENDING", "SHIPMENT_PENDING_TMO" ),
    BCCD_MISSING_TMO ( "BCCD_MISSING", "BCCD_MISSING_TMO" ),
    ULID_MISSING_TMO ( "ULID_MISSING", "ULID_MISSING_TMO" ),
    JUMP_COMPLETE_TMO ( "JUMP_COMPLETE", "JUMP_COMPLETE_TMO" ),
    JUMP_PENDING_TMO ( "JUMP_PENDING", "JUMP_PENDING_TMO" ),
    JUMP_MANUAL_TMO ( "JUMP_MANUAL", "JUMP_MANUAL_TMO" ),
    JUMP_REVERSED_TMO ( "JUMP_REVERSED", "JUMP_REVERSED_TMO" ),
    BALXFER_PENDING_TMO ( "BALXFER_PENDING", "BALXFER_PENDING_TMO" ),
    COR_TMO ( "COR", "COR_TMO" ),
    BANTOBAN_TMO ( "BANTOBAN", "BANTOBAN_TMO" ),
    BALXFER_REVERSED_TMO ( "BALXFER_REVERSED", "BALXFER_REVERSED_TMO" ),
    FIRST_PARTY_FRAUD_TMO ( "FIRST_PARTY_FRAUD", "FIRST_PARTY_FRAUD_TMO" ),
    THIRD_PARTY_FRAUD_TMO ( "THIRD_PARTY_FRAUD", "THIRD_PARTY_FRAUD_TMO" ),
    BKRP ( "BKRP", "BKRP" ),
    BAN_CANCELLED_TMO ( "BAN_CANCELLED", "BAN_CANCELLED_TMO" ),
    ACCELERATE_PENDING_TMO ( "ACCELERATE_PENDING", "ACCELERATE_PENDING_TMO" ),
    ACCELERATED_TMO ( "ACCELERATED", "ACCELERATED_TMO" ),
    REMORSE_RETURN_TMO ( "REMORSE_RETURN", "REMORSE_RETURN_TMO" ),
    NEVER_RECEIVED_TMO ( "NEVER_RECEIVED", "NEVER_RECEIVED_TMO" ),
    MANUAL_CLOSE_TMO ( "MANUAL_CLOSE", "MANUAL_CLOSE_TMO" ),
    ORDER_CANCELLED_TMO ( "ORDER_CANCELLED", "ORDER_CANCELLED_TMO" ),
    POSTVOID_MANUAL_TMO ( "POSTVOID_MANUAL", "POSTVOID_MANUAL_TMO" ),
    POSTVOID_SYSTEMATIC_TMO ( "POSTVOID_SYSTEMATIC", "POSTVOID_SYSTEMATIC_TMO" ),
    DELQ ( "DELQ", "DELQ" ),
    ON_MLTRY_DUTY ( "ON_MLTRY_DUTY", "ON_MLTRY_DUTY" ),
    DONOTCHGOFF ( "DONOTCHGOFF", "DONOTCHGOFF" ),
    TIP ( "TIP", "TIP" ),
    CLOSED_TMO ( "CLOSED", "CLOSED_TMO" );


    private final String source;
    private final String target;

    private WorkflowConditionsEnum(String source, String target) {
        this.source = source;
        this.target = target;
    }


   public String getSource() {
        return this.source;
    }

    public String getTarget() {
        return this.target;
    }


    private static final Map<String, String> map = new HashMap<> ();

    static {
        for (WorkflowConditionsEnum s : WorkflowConditionsEnum.values ()) {
            map.put ( s.source, s.target );
        }
    }


    public static String getTarget(String source) {
        if (map.containsKey ( source )) {
            return map.get ( source );
        } else {
            return source;
        }
    }

    public static List<String> m2() {
      return  Arrays.asList ( WorkflowConditionsEnum.values ()).stream ().map(w->w.getTarget ()).collect ( Collectors.toList () ) ;
    }


    public static String getSource(String target) {
        for (Map.Entry<String, String> entry : map.entrySet ()) {
            if (entry.getValue ().equals ( target )) {
                return entry.getKey ();
            }
        }
        return target;
    }

    public static String m1(String source){
        Optional<WorkflowConditionsEnum> optional= Arrays.asList (WorkflowConditionsEnum.values ()).stream ().filter ( d->d.getSource ()==source ).findAny ();
        return optional.isPresent ()?optional.get ().getTarget ():"No source found" ;
    }

    public static void main(String[] args) {
        System.out.println (WorkflowConditionsEnum.m1 ("Akhil"));
    }

}



