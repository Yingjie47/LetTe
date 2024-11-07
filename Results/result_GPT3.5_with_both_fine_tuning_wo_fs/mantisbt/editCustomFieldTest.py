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
driver.find_element(By.XPATH, '//*[@id="main-container"]/div[2]/div[2]/div/ul/li[5]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-container"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/table/tbody/tr/td[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="custom-field-name"]').send_keys("123")
driver.find_element(By.XPATH, '//*[@id="custom-field-type"]').click()
driver.find_element(By.XPATH, '//*[@id="custom-field-type"]/option[11]').click()
driver.find_element(By.XPATH, '//*[@id="custom-field-possible-values"]').send_keys("test1|test2|test3")
driver.find_element(By.XPATH, '//*[@id="custom-field-default-value-textarea"]').send_keys("test123")
driver.find_element(By.XPATH, '//*[@id="custom-field-access-level-r"]').click()
driver.find_element(By.XPATH, '//*[@id="custom-field-access-level-r"]/option[4]').click()
driver.find_element(By.XPATH, '//*[@id="custom-field-access-level-rw"]').click()
driver.find_element(By.XPATH, '//*[@id="custom-field-access-level-rw"]/option[4]').click()
driver.find_element(By.XPATH, '//*[@id="custom-field-length-min"]').send_keys(1)
driver.find_element(By.XPATH, '//*[@id="custom-field-length-max"]').send_keys(100)
driver.find_element(By.XPATH, '//*[@id="manage-custom-field-update-form"]/div/div[3]/button[1]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbar-container"]/div[2]/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="navbar-container"]/div[2]/ul/li[3]/ul/li[4]/a').click()
driver.close()
driver.quit()