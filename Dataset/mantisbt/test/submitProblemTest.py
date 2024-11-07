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
driver.find_element(By.LINK_TEXT, '提交问题').click()
driver.find_element(By.XPATH, '//*[@id="select-project-form"]/div/div[2]/div[2]/input').click()
driver.find_element(By.XPATH, '//*[@id="category_id"]').click()
driver.find_element(By.XPATH, '//*[@id="category_id"]/option[3]').click()
driver.find_element(By.XPATH, '//*[@id="reproducibility"]').click()
driver.find_element(By.XPATH, '//*[@id="reproducibility"]/option[2]').click()
driver.find_element(By.XPATH, '//*[@id="handler_id"]').click()
driver.find_element(By.XPATH, '//*[@id="handler_id"]/option[2]').click()
driver.find_element(By.XPATH, '//*[@id="summary"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="description"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="steps_to_reproduce"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="additional_info"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="report_bug_form"]/div/div[2]/div[2]/input').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbar-container"]/div[2]/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="navbar-container"]/div[2]/ul/li[3]/ul/li[4]/a').click()
driver.close()
driver.quit()