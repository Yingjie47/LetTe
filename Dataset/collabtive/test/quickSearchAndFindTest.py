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
driver.find_element(By.XPATH, '//*[@id="content-right"]').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="quickfinder"]/form/select').click()
driver.find_element(By.XPATH, '//*[@id="quickfinder"]/form/select/option[2]').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="content-right"]').click()
driver.find_element(By.XPATH, '//*[@id="query"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="search"]/fieldset/button').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="mainmenue"]/li[4]/a').click()
driver.close()
driver.quit()