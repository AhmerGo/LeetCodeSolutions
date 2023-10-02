public class Real{
    public static void main(String[] args)  {

        List<WebElement> messages = Driver.findElements(By.xpath("//div[contains(@id,'message-content')]"))

        WebElement enter = Driver.findElement(By.xpath("//div[@data-slate-node='element']"));

        for(int i = 0; i < messages.size(); i++) { 
            if(message.get(i).getText().toLowerCase().equals("real")){ 
                element.click().sendKeys(Keys.CONTROL+"v")
                Utils.majorWait(driver,element,10);
                element.sendKeys(Keys.ENTER);
            }
        }
    }
}