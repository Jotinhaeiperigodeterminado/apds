package dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Retangulo {

	private int retangulo1X;
	private int retangulo1Y;
	private int retangulo2X;
	private int retangulo2Y;
	private int colisaoRet1X;
	private int colisaoRet1Y;
	private int colisaoRet2X;
	private int colisaoRet2Y;

	public void detectarColisao() {

		String path = System.getProperty("user.dir") + "\\listaAPDS.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while ((line = br.readLine()) != null) {

				String[] dados = line.split(" ");

				retangulo1X = Integer.parseInt(dados[0]);
				retangulo1Y = Integer.parseInt(dados[1]);
				retangulo2X = Integer.parseInt(dados[2]);
				retangulo2Y = Integer.parseInt(dados[3]);

				line = br.readLine();
				String[] dados2 = line.split(" ");
				colisaoRet1X = Integer.parseInt(dados2[0]);
				colisaoRet1Y = Integer.parseInt(dados2[1]);
				colisaoRet2X = Integer.parseInt(dados2[2]);
				colisaoRet2Y = Integer.parseInt(dados2[3]);

				if (retangulo2X < colisaoRet1X || colisaoRet2X < retangulo1X || retangulo2Y < colisaoRet1Y || colisaoRet2Y < retangulo1Y || retangulo1X > colisaoRet2X || colisaoRet1X > retangulo2X || retangulo1Y > colisaoRet2Y || colisaoRet1Y > retangulo2Y) {
					System.out.println("0");

				} else {
					System.out.println("1");
				}

			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
