package translator.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import translator.Application;
import translator.domain.TranslatedText;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TranslatorServiceTest {

    @Autowired
    TranslatorService translatorService;
    @Test
    public void translateTest() throws Exception {
        TranslatedText translatedText = translatorService.translate("en", "eo", "This is a test of translation service");
        assertEquals("Tio ĉi estas testo de traduk-servo",translatedText.getTranslation());
    }

}
