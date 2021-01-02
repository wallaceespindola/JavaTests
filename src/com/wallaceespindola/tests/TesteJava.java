package com.wallaceespindola.tests;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilePermission;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;

public class TesteJava {

	public static void main(String[] args) throws UnsupportedEncodingException {

		// testeEnconding();

		// testeSplit();

		// testeFormatDataException();

		// readOnlyFileOperation();

		// testeFile();

		// testeURL();
		// testeURL2();
		// testeURL3();
		// ClientExecuteProxy();

		// ClientWithResponseHandler();

		// removeJpgDuplicadosNef();

		// testeStringIndexOf();

		//(new TesteJava()).testeHeranca();;
		
		testReverse();
	}

	public static void testeEnconding() throws UnsupportedEncodingException {

		System.out.println("1) " + "\\");
		System.out.println("2) " + "'");
		System.out.println("3) " + "\'");
		System.out.println("4) " + "//");
		System.out.println("5) " + "/");

		String caracteres = "������";
		// byte[] latin1 = caracteres.getBytes("UTF-8");
		// byte[] utf8 = new String(latin1, "ISO-8859-1").getBytes("UTF-8");
		// System.out.println("latin1: " + new String(latin1, "UTF-8"));
		// System.out.println("utf8: " + new String(utf8, "ISO-8859-1"));
		String utf8 = new String(caracteres.getBytes("UTF-8"), "UTF-8");
		String latin1 = new String(caracteres.getBytes("ISO-8859-1"), "ISO-8859-1");
		String utf8Latin1 = new String(caracteres.getBytes("UTF-8"), "ISO-8859-1");
		String latin1Utf8 = new String(caracteres.getBytes("ISO-8859-1"), "UTF-8");
		System.out.println("utf8: " + utf8);
		System.out.println("latin1: " + latin1);
		System.out.println("utf8Latin1: " + utf8Latin1);
		System.out.println("latin1Utf8: " + latin1Utf8);
	}

	public static void testeSplit() {
		String a = "aaa";
		String b = "bbb/ccc";
		String c = "ddd/eee/fff";
		String d = "/ggg";
		String e = "/hhh/";
		String f = "/";

		System.out.println("##### String a #####");
		List a1 = Arrays.asList(a.split("/"));
		for (Iterator iterator = a1.iterator(); iterator.hasNext();) {
			String a2 = (String) iterator.next();
			System.out.println(a2);
		}

		System.out.println("##### String b #####");
		List b1 = Arrays.asList(b.split("/"));
		for (Iterator iterator = b1.iterator(); iterator.hasNext();) {
			String b2 = (String) iterator.next();
			System.out.println(b2);
		}

		System.out.println("##### String c #####");
		List c1 = Arrays.asList(c.split("/"));
		for (Iterator iterator = c1.iterator(); iterator.hasNext();) {
			String c2 = (String) iterator.next();
			System.out.println(c2);
		}

		System.out.println("##### String d #####");
		List d1 = Arrays.asList(d.split("/"));
		for (Iterator iterator = d1.iterator(); iterator.hasNext();) {
			String d2 = (String) iterator.next();
			System.out.println(d2);
		}
		System.out.println("##### String e #####");
		List e1 = Arrays.asList(e.split("/"));
		for (Iterator iterator = e1.iterator(); iterator.hasNext();) {
			String e2 = (String) iterator.next();
			System.out.println(e2);
		}
		System.out.println("##### String f #####");
		List f1 = Arrays.asList(f.split("/"));
		for (Iterator iterator = f1.iterator(); iterator.hasNext();) {
			String f2 = (String) iterator.next();
			System.out.println(f2);
		}
	}

	public static void testeFormatDataException() {

		String a = new SimpleDateFormat("yyyyMMddHHmmssS").format(new java.util.Date());

		System.out.println(a);
	}

	public static void testeFile() {
		File teste = new File("D:\\java\\teste2.txt");
		System.out.println(teste);
		System.out.println(teste.exists());
	}

	public static void readOnlyFileOperation() {
		String name = "D:/Java/tmp/ANEXOS/_teste_readonly.pdf";

		File f = new File(name);
		System.out.println("File " + name + " existe: " + f.exists());
		if (f.setReadOnly()) {
			System.out.println("File " + name + ": is now read-only");
		} else {
			System.out.println("File " + name + ": is NOT read-only");
		}

		System.out.println("File " + name + " existe: " + f.exists());
		if (f.setWritable(false)) {
			System.out.println("File " + name + ": is now no-writeable");
		} else {
			System.out.println("File " + name + ": is NOT no-writeable");
		}

		FilePermission fp = new FilePermission(name, "read");
		System.out.println("File permissions: " + fp.getActions());

		// FileUtils.

		// System.out.println( "ReadOnly File " + name +": " + f.exists() );
		// System.out.print( "The file is " + (f.delete() ? "DELETED" : "NOT
		// DELETED") );
		// System.out.println( "ReadOnly File " + name +": " + f.exists() );
	}

	// /*
	// * Licensed to the Apache Software Foundation (ASF) under one or more
	// * contributor license agreements. See the NOTICE file distributed with
	// * this work for additional information regarding copyright ownership.
	// * The ASF licenses this file to You under the Apache License, Version 2.0
	// * (the "License"); you may not use this file except in compliance with
	// * the License. You may obtain a copy of the License at
	// *
	// * http://www.apache.org/licenses/LICENSE-2.0
	// *
	// * Unless required by applicable law or agreed to in writing, software
	// * distributed under the License is distributed on an "AS IS" BASIS,
	// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
	// implied.
	// * See the License for the specific language governing permissions and
	// * limitations under the License.
	// */
	//
	// import java.io.FileInputStream;
	// import java.io.InputStream;
	// import java.security.cert.CertificateFactory;
	// import java.security.cert.X509Certificate;
	//
	// import org.apache.pdfbox.pdmodel.PDDocument;
	// import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
	// import org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy;
	// import org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient;
	// import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
	//
	// /**
	// * This will read a document from the filesystem, encrypt it and and then
	// write
	// * the results to the filesystem. <br/><br/>
	// *
	// * @author <a href="mailto:ben@benlitchfield.com">Ben Litchfield</a>
	// * @version $Revision: 1.9 $
	// */
	// public class Encrypt
	// {
	// private Encrypt()
	// {
	// }
	//
	// /**
	// * This is the entry point for the application.
	// *
	// * @param args The command-line arguments.
	// *
	// * @throws Exception If there is an error decrypting the document.
	// */
	// public static void main( String[] args ) throws Exception
	// {
	// Encrypt encrypt = new Encrypt();
	// encrypt.encrypt( args );
	// }
	//
	// private void encrypt( String[] args ) throws Exception
	// {
	// if( args.length < 1 )
	// {
	// usage();
	// }
	// else
	// {
	// AccessPermission ap = new AccessPermission();
	//
	// String infile = null;
	// String outfile = null;
	// String certFile = null;
	// String userPassword = "";
	// String ownerPassword = "";
	//
	// int keyLength = 40;
	//
	// PDDocument document = null;
	//
	// try
	// {
	// for( int i=0; i<args.length; i++ )
	// {
	// String key = args[i];
	// if( key.equals( "-O" ) )
	// {
	// ownerPassword = args[++i];
	// }
	// else if( key.equals( "-U" ) )
	// {
	// userPassword = args[++i];
	// }
	// else if( key.equals( "-canAssemble" ) )
	// {
	// ap.setCanAssembleDocument(args[++i].equalsIgnoreCase( "true" ));
	// }
	// else if( key.equals( "-canExtractContent" ) )
	// {
	// ap.setCanExtractContent( args[++i].equalsIgnoreCase( "true" ) );
	// }
	// else if( key.equals( "-canExtractForAccessibility" ) )
	// {
	// ap.setCanExtractForAccessibility( args[++i].equalsIgnoreCase( "true" ) );
	// }
	// else if( key.equals( "-canFillInForm" ) )
	// {
	// ap.setCanFillInForm( args[++i].equalsIgnoreCase( "true" ) );
	// }
	// else if( key.equals( "-canModify" ) )
	// {
	// ap.setCanModify( args[++i].equalsIgnoreCase( "true" ) );
	// }
	// else if( key.equals( "-canModifyAnnotations" ) )
	// {
	// ap.setCanModifyAnnotations( args[++i].equalsIgnoreCase( "true" ) );
	// }
	// else if( key.equals( "-canPrint" ) )
	// {
	// ap.setCanPrint( args[++i].equalsIgnoreCase( "true" ) );
	// }
	// else if( key.equals( "-canPrintDegraded" ) )
	// {
	// ap.setCanPrintDegraded( args[++i].equalsIgnoreCase( "true" ) );
	// }
	// else if( key.equals( "-certFile" ) )
	// {
	// certFile = args[++i];
	// }
	// else if( key.equals( "-keyLength" ) )
	// {
	// try
	// {
	// keyLength = Integer.parseInt( args[++i] );
	// }
	// catch( NumberFormatException e )
	// {
	// throw new NumberFormatException(
	// "Error: -keyLength is not an integer '" + args[i] + "'" );
	// }
	// }
	// else if( infile == null )
	// {
	// infile = key;
	// }
	// else if( outfile == null )
	// {
	// outfile = key;
	// }
	// else
	// {
	// usage();
	// }
	// }
	// if( infile == null )
	// {
	// usage();
	// }
	// if( outfile == null )
	// {
	// outfile = infile;
	// }
	// document = PDDocument.load( infile );
	//
	// if( !document.isEncrypted() )
	// {
	// if( certFile != null )
	// {
	// PublicKeyProtectionPolicy ppp = new PublicKeyProtectionPolicy();
	// PublicKeyRecipient recip = new PublicKeyRecipient();
	// recip.setPermission(ap);
	//
	//
	// CertificateFactory cf = CertificateFactory.getInstance("X.509");
	// InputStream inStream = new FileInputStream(certFile);
	// X509Certificate certificate =
	// (X509Certificate)cf.generateCertificate(inStream);
	// inStream.close();
	//
	// recip.setX509(certificate);
	//
	// ppp.addRecipient(recip);
	//
	// ppp.setEncryptionKeyLength(keyLength);
	//
	// document.protect(ppp);
	// }
	// else
	// {
	// StandardProtectionPolicy spp =
	// new StandardProtectionPolicy(ownerPassword, userPassword, ap);
	// spp.setEncryptionKeyLength(keyLength);
	// document.protect(spp);
	// }
	// document.save( outfile );
	// }
	// else
	// {
	// System.err.println( "Error: Document is already encrypted." );
	// }
	// }
	// finally
	// {
	// if( document != null )
	// {
	// document.close();
	// }
	// }
	// }
	// }
	//
	// /**
	// * This will print a usage message.
	// */
	// private static void usage()
	// {
	// System.err.println( "usage: java org.apache.pdfbox.Encrypt [options]
	// <inputfile> [outputfile]" );
	// System.err.println( " -O <password> " +
	// "Set the owner password(ignored if cert is set)" );
	// System.err.println( " -U <password> " +
	// "Set the user password(ignored if cert is set)" );
	// System.err.println( " -certFile <path to cert> Path to X.509 certificate"
	// );
	// System.err.println( " -canAssemble <true|false> Set the assemble
	// permission" );
	// System.err.println( " -canExtractContent <true|false> Set the extraction
	// permission" );
	// System.err.println( " -canExtractForAccessibility <true|false> Set the
	// extraction permission" );
	// System.err.println( " -canFillInForm <true|false> Set the fill in form
	// permission" );
	// System.err.println( " -canModify <true|false> Set the modify permission"
	// );
	// System.err.println( " -canModifyAnnotations <true|false> Set the modify
	// annots permission" );
	// System.err.println( " -canPrint <true|false> Set the print permission" );
	// System.err.println( " -canPrintDegraded <true|false> Set the print
	// degraded permission" );
	// System.err.println( " -keyLength <length> The length of the key in
	// bits(40)" );
	// System.err.println( "\nNote: By default all permissions are set to true!"
	// );
	// System.exit( 1 );
	// }
	//
	// }

	public static void testeURL2() {

		HttpClient httpclient = new DefaultHttpClient();
		// HttpGet httpget = new HttpGet("http://s5700as85:7095/stats.jsp");
		// HttpGet httpget = new
		// HttpGet("http://ltp.petrobras.com.br/main/index.htm");

		HttpGet httpGet = new HttpGet("http://s5700wb08/sso-servico-simulacao/servicoSimulador.svlt");
		// HttpGet httpGet = new HttpGet("http://www.google.com.br");

		// HttpPost httpPost = new
		// HttpPost("http://s5700wb08/sso-servico-simulacao/servicoSimulador.svlt");

		HttpResponse response = null;

		try {
			response = httpclient.execute(httpGet);

			// response = httpclient.execute(httpPost);

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		HttpEntity entity = response.getEntity();

		if (entity != null) {
			InputStream inputStream = null;

			try {
				inputStream = entity.getContent();

			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Call the method to convert the stream to string
			try {
				System.out.println("==> SAIDA NOVA: \n");
				System.out.println(convertStreamToString(inputStream));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("==> FINAL SAIDA.");
	}

	public static String convertStreamToString(InputStream is) throws IOException {
		//
		// To convert the InputStream to String we use the
		// Reader.read(char[] buffer) method. We iterate until the
		// Reader return -1 which means there's no more data to
		// read. We use the StringWriter class to produce the string.
		//
		if (is != null) {
			Writer writer = new StringWriter();

			char[] buffer = new char[1024];
			try {
				// Reader reader = new BufferedReader(new InputStreamReader(is,
				// "UTF-8")); // ENCODING / CHARSET OPTIONAL
				Reader reader = new BufferedReader(new InputStreamReader(is)); // ENCODING
																				// /
																				// CHARSET
																				// OPTIONAL
				int n;
				while ((n = reader.read(buffer)) != -1) {
					writer.write(buffer, 0, n);
				}
			} finally {
				is.close();
			}
			return writer.toString();
		} else {
			return "";
		}
	}

	public static void testeURL() {

		DefaultHttpClient httpclient = new DefaultHttpClient();
		// HttpGet httpget = new HttpGet("http://s5700as85:7095/stats.jsp");
		// HttpGet httpget = new
		// HttpGet("http://ltp.petrobras.com.br/main/index.htm");
		// HttpGet httpget = new HttpGet("http://www.a.com");

		// HttpGet httpGet = new HttpGet("http://www.google.com.br/");
		// HttpPost httpPost = new HttpPost("http://www.google.com.br/");
		HttpGet httpGet = new HttpGet("http://tudogostoso.uol.com.br/busca.php?q=alho+vinagre+sal");

		// HttpGet httpGet = new
		// HttpGet("http://s5700wb08/sso-servico-simulacao/servicoSimulador.svlt");

		// HttpPost httpPost = new
		// HttpPost("http://s5700wb08/sso-servico-simulacao/servicoSimulador.svlt");

		// ProxySelectorRoutePlanner routePlanner = new
		// ProxySelectorRoutePlanner(
		// httpclient.getConnectionManager().getSchemeRegistry(),
		// ProxySelector.getDefault());
		// httpclient.setRoutePlanner(routePlanner);

		// HttpHost proxy = new HttpHost("proxy.petrobras.com.br/inet-rj.pac",
		// 80);

		// HttpHost proxy = new HttpHost("inetstd.petrobras.com.br", 80,
		// "http");
		// httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY,
		// proxy);

		HttpResponse response = null;

		try {
			response = httpclient.execute(httpGet);
			// response = httpclient.execute(httpPost);

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		HttpEntity entity = response.getEntity();

		StatusLine statusLine = response.getStatusLine();

		int httpStatusCode = statusLine.getStatusCode();

		System.out.println("==> HTTP Status Code: " + httpStatusCode);

		if (httpStatusCode >= 300) {
			System.out.println("==> ERRO CHAMADA HTTP!!!");
			try {
				throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
			} catch (HttpResponseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (entity == null) {
			try {
				throw new ClientProtocolException("##### Response contains no content #####");
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// ELSE PARA ENTITY AKI!!!!

		if (entity != null) {
			InputStream inputStream = null;

			try {
				inputStream = entity.getContent();

			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				// do something useful
				System.out.println("==> SAIDA inputStream: \n" + inputStream.toString());

				StringWriter writer = new StringWriter();
				try {
					// IOUtils.copy(inputStream, writer, "UTF-8");
					// IOUtils.copy(inputStream, writer, "ISO-8859-1"); //
					// ENCODING / CHARSET OPTIONAL
					IOUtils.copy(inputStream, writer); // ENCODING / CHARSET
														// OPTIONAL
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				String theString = writer.toString();

				System.out.println("==> SAIDA NOVA: \n" + theString);

				System.out.println("==> FINAL SAIDA.");
			} finally {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println("==> FINAL FIM.");

	}

	public static void testeURL3() {

		DefaultHttpClient httpclient = new DefaultHttpClient();

		// httpclient.getCredentialsProvider().setCredentials(
		// new AuthScope("PROXY HOST", 8080),
		// new UsernamePasswordCredentials("username", "password"));

		HttpHost targetHost = new HttpHost("www.google.com.br", 80, "http");
		HttpHost proxy = new HttpHost("inet-rj.petrobras.com.br", 8080);

		httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);

		httpclient.getCredentialsProvider().setCredentials(
				new AuthScope(proxy.getHostName(), proxy.getPort(), AuthScope.ANY_REALM, "basic"),
				new UsernamePasswordCredentials("user", "password"));

		httpclient.getCredentialsProvider().setCredentials(
				new AuthScope(targetHost.getHostName(), targetHost.getPort(), AuthScope.ANY_REALM, "basic"),
				new UsernamePasswordCredentials("user", "password"));

		// Create AuthCache instance
		AuthCache authCache = new BasicAuthCache();
		// Generate BASIC scheme object and add it to the local auth cache
		BasicScheme basicAuth = new BasicScheme();
		authCache.put(targetHost, basicAuth);

		// Add AuthCache to the execution context
		BasicHttpContext localcontext = new BasicHttpContext();
		localcontext.setAttribute(ClientContext.AUTH_CACHE, authCache);

		HttpGet httpget = new HttpGet("/");

		for (int i = 0; i < 3; i++) {

			HttpResponse response = null;
			try {
				response = httpclient.execute(targetHost, httpget, localcontext);
			} catch (ClientProtocolException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			HttpEntity entity = response.getEntity();

			try {
				EntityUtils.consume(entity);
				System.out.println(EntityUtils.toString(entity));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void ClientExecuteProxy() {

		// HttpHost proxy = new HttpHost("localhost", 7001, "http");
		// HttpHost proxy = new HttpHost("inetstdrj.petrobras.com.br", 8080,
		// "http");
		// HttpHost proxy = new HttpHost("inetstd.petrobras.com.br");
		HttpHost proxy = new HttpHost("proxy.petrobras.com.br", 80);

		DefaultHttpClient httpclient = new DefaultHttpClient();
		try {
			httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);

			HttpHost target = new HttpHost("http://www.google.com.br", 8080, "http");
			HttpGet request = new HttpGet("/");

			// HttpGet httpGet = new
			// HttpGet("http://s5700wb08:7095/sso-servico-simulacao/servicoSimulador.svlt");
			HttpGet httpGet = new HttpGet("http://www.google.com.br");

			System.out.println("executing request to " + target + " via " + proxy);
			HttpResponse response = null;
			try {
				// response = httpclient.execute(target, req);
				response = httpclient.execute(httpGet);
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpEntity entity = response.getEntity();

			System.out.println("----------------------------------------");
			System.out.println(response.getStatusLine());
			Header[] headers = response.getAllHeaders();
			for (int i = 0; i < headers.length; i++) {
				System.out.println(headers[i]);
			}
			System.out.println("----------------------------------------");

			if (entity != null) {
				// try {
				// System.out.println(EntityUtils.toString(entity));
				// } catch (ParseException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// } catch (IOException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				//

				StatusLine statusLine = response.getStatusLine();

				int httpStatusCode = statusLine.getStatusCode();

				System.out.println("==> HTTP Status Code: " + httpStatusCode);

				if (httpStatusCode >= 300) {
					System.out.println("==> ERRO CHAMADA HTTP!!!");
					try {
						throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
					} catch (HttpResponseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (entity == null) {
					try {
						throw new ClientProtocolException("##### Response contains no content #####");
					} catch (ClientProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				// ELSE PARA ENTITY AKI!!!!

				if (entity != null) {
					InputStream inputStream = null;

					try {
						inputStream = entity.getContent();

					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						// do something useful
						System.out.println("==> SAIDA inputStream: \n" + inputStream.toString());

						StringWriter writer = new StringWriter();
						try {
							// IOUtils.copy(inputStream, writer, "UTF-8");
							IOUtils.copy(inputStream, writer, "ISO-8859-1"); // ENCODING
																				// /
																				// CHARSET
																				// OPTIONAL
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						String theString = writer.toString();

						System.out.println("==> SAIDA NOVA: \n" + theString);

						System.out.println("==> FINAL SAIDA.");
					} finally {
						try {
							inputStream.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

				System.out.println("==> FINAL FIM.");

			}

		} finally {
			// When HttpClient instance is no longer needed,
			// shut down the connection manager to ensure
			// immediate deallocation of all system resources
			httpclient.getConnectionManager().shutdown();
		}
	}

	public final static void ClientWithResponseHandler() {

		HttpClient httpclient = new DefaultHttpClient();
		try {
			// HttpGet httpget = new HttpGet("http://www.google.com/");
			HttpGet httpget = new HttpGet("http://tudogostoso.uol.com.br/busca.php?q=alho+vinagre+sal");

			System.out.println("executing request " + httpget.getURI());

			// Create a response handler
			ResponseHandler<String> responseHandler = new BasicResponseHandler();
			String responseBody = null;
			try {
				responseBody = httpclient.execute(httpget, responseHandler);
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("----------------------------------------");
			System.out.println(responseBody);
			System.out.println("----------------------------------------");

		} finally {
			// When HttpClient instance is no longer needed,
			// shut down the connection manager to ensure
			// immediate deallocation of all system resources
			httpclient.getConnectionManager().shutdown();
		}
	}

	private static void removeJpgDuplicadosNef() {

		String caminhoArquivos = "F:\\2013-08-24_Aniversario_3_Anos_Gabi_Fabiane\\2013-08-24_Fotos_3_Anos_Gabi_ORIGINAIS";

		File dir = new File(caminhoArquivos);

		if (dir.isDirectory()) {
			System.out.println("� um diret�rio");
		}

		File[] arquivos = dir.listFiles();

		if (arquivos != null) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		Set<String> set = new HashSet<String>();
		for (int i = 0; i < arquivos.length; i++) {
			File arq = arquivos[i];
			System.out.println(arq.getName());

			set.add(arq.getName().toUpperCase());
		}

		Collection<String> col = new ArrayList<String>();

		int cont = 0;
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {

			String fileName = (String) iterator.next();
			String extensao = FilenameUtils.getExtension(fileName);

			System.out.println(extensao);

			if (extensao.equalsIgnoreCase("JPEG") || extensao.equalsIgnoreCase("JPG")) {
				String arqNef = fileName.toUpperCase().replaceFirst(".JPEG", ".NEF").replaceFirst(".JPG", ".NEF");

				if (set.contains(arqNef)) {
					col.add(arqNef);
					cont++;
				}
			}
		}

		for (Iterator iterator = col.iterator(); iterator.hasNext();) {
			String ArqNef = (String) iterator.next();
			System.out.println(ArqNef);
		}

		System.out.println("##### Total de arquivos duplicados: " + cont);
	}

	private static void testeStringIndexOf() {

		String txt = "Hoje é o tempo para todos os homens bons virem para ajudar o seu amado pais.";
		System.out.println("txt.indexOf(o) = " + txt.indexOf("o"));
		System.out.println("txt.lastIndexOf(o) = " + txt.lastIndexOf("o"));
		System.out.println("txt.indexOf(para) = " + txt.indexOf("para"));
		System.out.println("txt.lastIndexOf(para) = " + txt.lastIndexOf("para"));
		System.out.println("txt.indexOf(o, 10) = " + txt.indexOf("o", 10));
		System.out.println("txt.lastIndexOf(o, 60) = " + txt.lastIndexOf("o", 60));
		System.out.println("txt.indexOf(para, 10) = " + txt.indexOf("para", 10));
		System.out.println("txt.lastIndexOf(para, 60) = " + txt.lastIndexOf("para", 60));
		System.out.println("txt.indexOf(.) = " + txt.indexOf("."));
	}

	private ArrayList testeHeranca() {

		new Botton("C");
		
		//Botton a = (Botton) new Top("S");
		Top b = new Botton("S");
		System.out.println("   ");
		
		//try {int x = Integer.parseInt ("two");} finally { System.out.println(" try-catch-finally ");}
		
		return new ArrayList<Object>();
	}
	
	ArrayList<Botton> getAll() {
		return new ArrayList<Botton>();
	}
	
	class Top {
		public Top(String s) {
			System.out.println("B");
		}
	}
	
	public class Botton extends Top {
		public Botton(String s) {
			super(s);
			System.out.println("D");
		}
	}
	
	public class Bot extends Botton {
		public Bot(String s) {
			super(s);
			System.out.println("J");
		}
	}

	public static void testReverse() {
		
		String s = "abcd";

		StringBuilder sb = new StringBuilder("");
		
		// First way
		for (int j = s.length()-1; j>=0; j--) {
			System.out.println(j);
			sb.append(s.charAt(j));
		}
		System.out.println(sb);
		
		// Sencond way
		StringBuilder sb2 = new StringBuilder(s);
		sb2.reverse();
		System.out.println(sb2);
	}
	
}
