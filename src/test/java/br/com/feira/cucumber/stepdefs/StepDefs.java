package br.com.feira.cucumber.stepdefs;

import br.com.feira.FeiraApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = FeiraApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
