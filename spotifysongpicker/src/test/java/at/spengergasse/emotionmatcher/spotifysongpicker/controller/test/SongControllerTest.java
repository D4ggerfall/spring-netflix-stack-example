package at.spengergasse.emotionmatcher.spotifysongpicker.controller.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;

import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class SongControllerTest {

    protected final MediaType CONTENTTYPE = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

    protected MockMvc mockMvc;

    @Autowired
    protected WebApplicationContext webApplicationContext;

    @Before
    public void setup(){
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testRandomSongGetsPicked() throws Exception{
        mockMvc.perform(get("/songs/random/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(CONTENTTYPE))
                .andExpect(jsonPath("$.artist",notNullValue()))
                .andExpect(jsonPath("$.songName",notNullValue()))
                .andExpect(jsonPath("$.songLink",notNullValue()))
                .andExpect(jsonPath("$.emotionLevel",notNullValue()));
    }

}
