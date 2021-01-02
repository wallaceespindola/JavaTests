package com.wallaceespindola.tests;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BancoHorasImportExport {

	public static void main(String[] args) {

		BancoHorasImportExport obj = new BancoHorasImportExport();
		obj.run();
	}

	public void run() {

		String csvFile = "D:/Desktop/Export Banco de Horas Merged.csv";
		String bkpFile = "D:/Desktop/backup_20151215234600.bkp";

		Set<Long> horas = new TreeSet<>();

		System.out.println("########## Iniciando processo ##########");
		
		readCSV(horas, csvFile);

		System.out.println("########## CSV Lido ##########");

		File bkpArq = writeFile(horas, bkpFile);

		System.out.println("########## Arquivo bkp gerado ##########");

		readFileAndPrint(bkpArq);

		System.out.println("########## Finalizado ##########");
	}

	private void readCSV(Set<Long> horas, String csvFile) {

		String line = "";
		String cvsSplitBy = ",";
		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader(csvFile));

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] linhaBancoHora = line.split(cvsSplitBy);

				System.out.println("Linha [hora1=" + linhaBancoHora[0] + " , hora2=" + linhaBancoHora[1]
						+ " , totalBloco=" + linhaBancoHora[2] + "]");

				try {
					horas.add(new Date().parse(linhaBancoHora[0]));
					horas.add(new Date().parse(linhaBancoHora[1]));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private File writeFile(Set<Long> horas, String bkpFile) {

		File file = new File(bkpFile);

		try {

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			} else {
				file.delete();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			int count = 0;
			for (Iterator iterator = horas.iterator(); iterator.hasNext();) {
				Long horaTimestamp = (Long) iterator.next();

				if (count != 0) {
					bw.newLine();
				}
				String timestamp = horaTimestamp.toString();
				bw.write(timestamp);
				System.out.println("Timestamp " + (count+1) + ": " + timestamp);
				
				count++;
			}
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return file;
	}

	private void readFileAndPrint(File file) {

		BufferedReader br = null;
		String line = "";
		try {

			br = new BufferedReader(new FileReader(file));

			while ((line = br.readLine()) != null) {

				String linhaBancoHora = line;

				try {
					System.out.println("Linha [hora=" + new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date (Long.parseLong(linhaBancoHora))) + "]");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}