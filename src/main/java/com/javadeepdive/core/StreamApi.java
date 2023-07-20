package com.javadeepdive.core;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;

public class StreamApi {

	public static void main(String[] args) {
	
         List<String>games=Array.asList("Residents","battlefields","horizon");
         List<String>games2=games.stream().filter(s->s.endsWith("s")).collect(Collectors.toList());
         List<String>games3=games.stream().map(x->x.touppercase(x)).sorted().collect(Collectors.toList());
         
        
         }
		// TODO Auto-generated method stub

	}


