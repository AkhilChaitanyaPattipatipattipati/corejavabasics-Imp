package com.collection.map;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) throws IOException {
        Map<String,Object> map=new HashMap<> (  );
        map.put ( "_id","12345" );
        map.put ( "AutoPwner","Akhil" );
        map.put ( "timeStamp","20181006" );

        ByteArrayOutputStream out= new ByteArrayOutputStream (  );
        ObjectOutputStream s=new ObjectOutputStream ( out );
        s.writeObject ( map );

        byte[] data=  out.toByteArray ();
    }

}
