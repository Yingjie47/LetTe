from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/collabtive-3.0/")
driver.find_element(By.XPATH, '//*[@id="username"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="pass"]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="loginform"]/fieldset/div[3]').click()
driver.find_element(By.XPATH, '//*[@id="loginform"]/fieldset/div[4]/button').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="mainmenue"]/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="contentwrapper"]/div[1]/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="add_butn_member"]').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="name"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="pass"]').clear()
driver.find_element(By.XPATH, '//*[@id="pass"]').send_keys("12345")
driver.find_element(By.XPATH, '//*[@id="roleselect"]').click()
driver.find_element(By.XPATH, '/html/body/div[1]/div[2]/div[2]/div/div[1]/div[4]/div[1]/div/form/fieldset/div[3]/select/option[2]').click()
driver.find_element(By.XPATH, '//*[@id="email"]').clear()
driver.find_element(By.XPATH, '//*[@id="email"]').send_keys("test@gmail.com")
driver.find_element(By.XPATH, '//*[@id="company"]').send_keys("test")
driver.find_element(By.XPATH, '/html/body/div[1]/div[2]/div[2]/div/div[1]/div[4]/div[1]/div/form/fieldset/div[6]/input').send_keys("123")
driver.find_element(By.XPATH, '//*[@id="form_member"]/div/form/fieldset/div[8]/div/button').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="mainmenue"]/li[4]/a').click()
driver.close()
driver.quit()