package com.innerclass;

import org.apache.log4j.Logger;

public class MultipleBlocksDemo {

	static Logger log= Logger.getLogger(MultipleBlocksDemo.class.getClass());
	public static void main(String[] args) {

		MultipleBlocks blocks = new MultipleBlocks();
		log.info("=====================================================================================");
		MultipleBlocks blocks2 = new MultipleBlocks();
		
		log.info("=====================================================================================");
		MultipleBlocks blocks3 = new MultipleBlocks();
	}

}
