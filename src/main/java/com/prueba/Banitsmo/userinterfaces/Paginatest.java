package com.prueba.Banitsmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;



@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")

public class Paginatest extends PageObject {

    public static final Target BTNACEPTARCOOKIES = Target.the("boton cookies").located(By.xpath("//*[@id=\"btn-aceptar-cookies\"]/strong"));
    public static final Target BTNAPRENDERFACIL = Target.the("boton de identificacion aprender facil ").located(By.xpath("//*[@id=\"footer-content\"]/div[2]/div/div/div[2]/div/ul/li[7]/a"));
    public static final Target BTNLEGALES = Target.the("boton de identificacion legal").located(By.xpath("//*[@id=\"layoutContainers\"]/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/section/div[2]/div[2]/div/div/div/div[6]/div/div/div[3]/a"));
    public static final Target BTNFATCACRS = Target.the("boton de identificacion Fatca y Crs").located(By.xpath("//*[@id=\"layoutContainers\"]/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/section/div[2]/div[2]/div/div/div/div[2]/div/div/div[3]/a"));
    public static final Target BTNDESCARGARPDF = Target.the("Documentos").located(By.xpath("//*[@id=\"tab1\"]/table/tbody/tr[3]/td[2]/span/a/img"));

}
