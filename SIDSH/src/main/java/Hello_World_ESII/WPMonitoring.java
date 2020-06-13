package Hello_World_ESII;

/*
 * SELENIUM WEBDRIVER
 * */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * XML 
 * */

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class WPMonitoring extends Thread{

	public WPMonitoring() {		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		System.out.println("Reading xml file...");
	}
	
	public static void main(String[] args) {
		
		String xmlPath;
		
		
		/*
		ArrayList <TipoTeste> testesLista = new ArrayList <TipoTeste>();
		
		
		try {
			xmlPath = args[0]; //argumento 0 para escolher o path do xml file
			
			ObjectMapper mapper = new XmlMapper();
			InputStream inputStream = new FileInputStream(new File(xmlPath));
			TypeReference<List<TipoTeste>> typeReference = new TypeReference<List<TipoTeste>>() {
			};
			List<TipoTeste> testes = mapper.readValue(inputStream, typeReference);
			for (TipoTeste p : testes) {
				
				testesLista.add(p);
				
				//System.out.println("Page " + p.getPage() + " city is " + p.getAddress().getCity()+ " first car is " + p.getCars()[0] + " age is " + p.getAge());
							
			}
			
			inputStream.close();
		
		
		} catch (Exception e) {
			System.out.println("Ficheiro XML em falta. Exemplo: java -jar <ficheiro.jar> <c:\\config.xml>");
			System.exit(1);
		}
		*/

		//new WPMonitoring().start();//reading xml file Thread
		
		
		int x = 1;
		//while(true) {		
		while(x !=0) {
		x--;
		//System.setProperty("webdriver.chrome.driver","E:\\ISCTE\\GoogleDrive-Materia\\3ano\\EI_3ano_Semestre2\\ES2_(ENGENHARIA_DE_SOFTWARE_II)\\Projecto\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","E:\\ISCTE\\GoogleDrive-Materia\\3ano\\EI_3ano_Semestre2\\ES2_(ENGENHARIA_DE_SOFTWARE_II)\\Projecto\\geckodriver.exe");

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
				
		
		/* CONTACT FORM */
		driver.get("http://192.168.99.100:8000/contact/");
		WebElement contact1 = driver.findElement(By.id("wpforms-77-field_3"));
		contact1.sendKeys("Assunto desta mensagem de contacto");
		
		WebElement contact2 = driver.findElement(By.id("wpforms-77-field_2"));
		contact2.sendKeys("Texto do contacto");
		
		WebElement contact3 = driver.findElement(By.id("wpforms-77-field_1"));
		contact3.sendKeys("iccco@iscte-iul.pt");
				
		WebElement contact6 = driver.findElement(By.id("wpforms-submit-77"));
		contact6.submit();
		

		/* LOGIN */
		driver.get("http://192.168.99.100:8000/wp-login.php");
		//driver.manage().window().maximize();
		WebElement login1 = driver.findElement(By.name("log"));
		login1.sendKeys("Administrator");
		WebElement login2 = driver.findElement(By.name("pwd"));
		login2.sendKeys("Administrator");		
		WebElement login3 = driver.findElement(By.name("wp-submit"));
		login3.submit();
		
		
		driver.close(); // close the tab it has opened
		driver.quit(); // close the browser
		
		
		/* TEST THRESHOLD */
		long seconds = 2;
		long ms = seconds*1000;
			try {
				sleep(ms);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
