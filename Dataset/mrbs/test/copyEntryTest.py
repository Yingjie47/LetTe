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
driver.find_element(By.XPATH, '//*[@id="day_main"]/tbody/tr[1]/td/div/a').click()
driver.find_element(By.XPATH, '//*[@id="view_entry_nav"]/div[3]/div[2]/form/input[6]').click()
driver.find_element(By.XPATH, '//*[@id="name"]').send_keys("2")
driver.find_element(By.XPATH, '//*[@id="all_day"]').click()
driver.find_element(By.XPATH, '//*[@id="end_seconds"]').click()
driver.find_element(By.XPATH, '//*[@id="end_seconds"]/option[4]').click()
driver.find_element(By.XPATH, '//*[@id="rep_day"]/div/label[2]/input').click()
driver.find_element(By.XPATH, '//*[@id="rep_day"]/div/label[6]/input').click()
driver.find_element(By.XPATH, '//*[@id="main"]/fieldset[4]/div/div/input').click()
# sleep(1)
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[2]/form[2]/input[6]').click()
driver.close()
driver.quit()