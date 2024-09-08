package base;

public class BaseApITest {


    @Value("$(api.base.url)")
    private String baseUrl;


    @BeforeClass
    public void setUpAPI(){

    }
}
