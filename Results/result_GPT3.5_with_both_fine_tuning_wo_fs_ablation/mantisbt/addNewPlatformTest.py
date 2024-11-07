from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/mantisbt-2.26.0/")
driver.find_element(By.XPATH, '//*[@id="username"]').send_keys("administrator")
driver.find_element(By.XPATH, '//*[@id="login-form"]/fieldset/input[2]').click()
driver.find_element(By.XPATH, '//*[@id="password"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="login-form"]/fieldset/input[3]').click()
# sleep(1)
driver.find_element(By.LINK_TEXT, '管理').click()
driver.find_element(By.XPATH, '//*[@id="main-container"]/div[2]/div[2]/div/ul/li[6]/a').click()
driver.find_element(By.XPATH, '//*[@id="platform"]').send_keys("Windows")
driver.find_element(By.XPATH, '//*[@id="os"]').send_keys("Windows11")
driver.find_element(By.XPATH, '//*[@id="os_build"]').send_keys("version 23H2")
driver.find_element(By.XPATH, '//*[@id="description"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="account-profile-form"]/fieldset/div/div[3]/button').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbar-container"]/div[2]/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="navbar-container"]/div[2]/ul/li[3]/ul/li[4]/a').click()
driver.close()
driver.quit()