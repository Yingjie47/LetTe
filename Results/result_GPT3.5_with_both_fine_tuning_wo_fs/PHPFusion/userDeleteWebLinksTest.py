from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/PHPFusion-9.10.30/")
driver.find_element(By.XPATH, '(//*[@name="user_name"])[2]').send_keys("admin")
driver.find_element(By.XPATH, '(//*[@name="user_pass"])[2]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="login"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"Web Links")]').click()
driver.find_element(By.XPATH, '//*/h3/a').click()
driver.find_element(By.XPATH, '//*[@id="weblink-2"]/div/div[2]/a[2]').click()
driver.find_element(By.XPATH, '//*[@id="admin_password"]').send_keys("root1234")
driver.find_element(By.XPATH, '//*[@id="admin-login-form"]/div/div/button').click()
# sleep(1)
driver.find_element(By.XPATH, '/html/body/div[1]/header/nav/div/ul/li[3]/a').click()
driver.find_element(By.XPATH, '(//a[contains(text(),"Logout")])[2]').click()
driver.close()
driver.quit()