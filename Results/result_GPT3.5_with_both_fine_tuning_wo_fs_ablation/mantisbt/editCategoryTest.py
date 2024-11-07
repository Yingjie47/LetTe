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
driver.find_element(By.XPATH, '//*[@id="sidebar"]/ul/li[7]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-container"]/div[2]/div[2]/div/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="categories"]/div/div[2]/div/div/table/tbody/tr[2]/td[3]/div/div[1]/form/button[1]').click()
driver.find_element(By.XPATH, '//*[@id="proj-category-name"]').send_keys("123")
driver.find_element(By.XPATH, '//*[@id="proj-category-assigned-to"]').click()
driver.find_element(By.XPATH, '//*[@id="proj-category-assigned-to"]/option[2]').click()
driver.find_element(By.XPATH, '//*[@id="manage-proj-category-update-form"]/div/div[3]/button').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbar-container"]/div[2]/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="navbar-container"]/div[2]/ul/li[3]/ul/li[4]/a').click()
driver.close()
driver.quit()