package com.prueba.Banitsmo.tasks;

import com.prueba.Banitsmo.userinterfaces.Paginatest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
public class Steps implements Task {
    public static Steps navigationpage() {
        return Tasks.instrumented(Steps.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Paginatest.BTNACEPTARCOOKIES),
                Click.on(Paginatest.BTNAPRENDERFACIL),
                Click.on(Paginatest.BTNLEGALES),
                Click.on(Paginatest.BTNFATCACRS),
                Click.on(Paginatest.BTNDESCARGARPDF));
    }
}