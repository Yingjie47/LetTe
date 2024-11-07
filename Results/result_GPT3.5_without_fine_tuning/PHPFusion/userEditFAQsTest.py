from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/PHPFusion-9.10.30/")
driver.find_element(By.XPATH, '(//*[@name="user_name"])[2]').send_keys("admin")
driver.find_element(By.XPATH, '(//*[@name="user_pass"])[2]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="login"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]/ul/li[5]/a').click()  # Updated XPath
driver.find_element(By.XPATH, '//a[contains(text(),"atest123")]').click()  # Updated XPath
driver.find_element(By.XPATH, '//*[@id="faq-accordion"]//a[contains(text(),"test123")]').click()  # Updated XPath
sleep(1)
driver.find_element(By.XPATH, '//*[@id="faq-accordion"]//a[text()="Edit"]').click()  # Updated XPath
driver.find_element(By.XPATH, '//*[@id="faq_answer"]').send_keys("123")
driver.find_element(By.XPATH, '//*[@id="s2id_faq_answer-insertimage"]/a').click()
driver.find_element(By.XPATH, '//*[@id="select2-results-1"]/li[3]').click()
driver.find_element(By.XPATH, '//*[@id="save_and_close-formend"]').click()
driver.find_element(By.XPATH, '//*[@id="main-menu"]/div/div/button').click()  # Added to return to homepage
driver.find_element(By.XPATH, '//*[@id="user-menu"]').click()
driver.find_element(By.XPATH, '//*[@id="user-info"]/ul/li[3]/a').click()  # Updated XPath
driver.close()
driver.quit()