from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/mrbs-1.11.1/")
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[2]/form/input[4]').click()
driver.find_element(By.XPATH, '//*[@id="username"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="password"]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="logon"]/fieldset[2]/div/input').click()
# sleep(1)
driver.find_element(By.XPATH, '/html/body/div[2]/div[2]/nav[1]/nav[1]/a[1]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div[2]/nav[1]/nav[1]/a[2]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div[2]/nav[1]/nav[1]/a[3]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div[2]/nav[1]/nav[2]/form/div/span').click()
driver.find_element(By.XPATH, '/html/body/span/span/span[2]/ul/li[2]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div[2]/nav[1]/nav[3]/div/a[2]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div[2]/nav[1]/nav[3]/div/a[3]').click()
# sleep(1)
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[2]/form[2]/input[6]').click()
driver.close()
driver.quit()