from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/mantisbt-2.24.3/")
driver.find_element(By.XPATH, '//*[@id="username"]').send_keys("administrator")
driver.find_element(By.XPATH, '//*[@id="login-form"]/fieldset/input[2]').click()
driver.find_element(By.XPATH, '//*[@id="password"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="login-form"]/fieldset/input[3]').click()
# sleep(1)
driver.find_element(By.LINK_TEXT, '管理').click()
driver.find_element(By.XPATH, '//*[@id="main-container"]/div[2]/div[2]/div/ul/li[6]/a').click()
driver.find_element(By.XPATH, '//*[@id="account-profile-update-form"]/div/div[2]/div[1]/div/table/tbody/tr[2]/td[2]/label').click()
driver.find_element(By.XPATH, '//*[@id="select-profile"]').click()
driver.find_element(By.XPATH, '//*[@id="select-profile"]/option[2]').click()
driver.find_element(By.XPATH, '//*[@id="account-profile-update-form"]/div/div[2]/div[2]/input').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbar-container"]/div[2]/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="navbar-container"]/div[2]/ul/li[3]/ul/li[4]/a').click()
driver.close()
driver.quit()