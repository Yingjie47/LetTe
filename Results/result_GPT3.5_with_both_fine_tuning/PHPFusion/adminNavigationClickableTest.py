from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/PHPFusion-9.10.30/")
driver.find_element(By.XPATH, '(//*[@name="user_name"])[2]').send_keys("admin")
driver.find_element(By.XPATH, '(//*[@name="user_pass"])[2]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="login"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navigation-user"]/ul/li[5]/a').click()
driver.find_element(By.XPATH, '//*[@id="admin_password"]').send_keys("root1234")
driver.find_element(By.XPATH, '//*[@id="admin-login-form"]/div/div/button').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[2]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[4]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[5]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[6]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[7]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[8]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[9]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[10]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[11]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[12]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[13]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[3]/a').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="adl"]/li[3]/ul/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[3]/ul/li[2]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[3]/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[3]/ul/li[4]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[3]/ul/li[5]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[3]/ul/li[6]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[3]/ul/li[7]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[3]/ul/li[8]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[2]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[4]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[5]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[6]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[7]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[8]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[9]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[10]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[11]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[12]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[4]/ul/li[13]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[5]/a').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="adl"]/li[5]/ul/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[5]/ul/li[2]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[5]/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[5]/ul/li[4]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[5]/ul/li[5]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[5]/ul/li[6]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[5]/ul/li[7]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[5]/ul/li[8]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[5]/ul/li[9]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[6]/a').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[6]/ul/li/a').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="dduser"]').click()
driver.find_element(By.XPATH, '(//a[contains(text(),"Logout")])[2]').click()
driver.close()
driver.quit()