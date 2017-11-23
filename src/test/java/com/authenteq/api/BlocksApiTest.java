package com.authenteq.api;

import java.io.IOException;

import com.authenteq.AbstractTest;
import org.junit.BeforeClass;
import org.junit.Test;

import com.authenteq.api.AssetsApi;
import com.authenteq.builders.BigchainDbConfigBuilder;


/**
 * The Class BlocksApiTest.
 */
public class BlocksApiTest extends AbstractTest
{
	/**
	 * Inits the.
	 */
	@BeforeClass
	public static void init() {
		BigchainDbConfigBuilder
			.baseUrl( get( "test.api.url", "https://test.ipdb.io" ) )
			.addToken("app_id", "2bbaf3ff")
			.addToken("app_key", "c929b708177dcc8b9d58180082029b8d").setup();
	}
	
	/**
	 * Test asset search.
	 */
	@Test
	public void testAssetSearch() {
		try {
			AssetsApi.getAssets("John Smith -CV -doe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
