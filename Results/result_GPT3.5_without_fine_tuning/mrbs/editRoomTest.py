from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/mrbs-1.11.4/")
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[2]/form/input[4]').click()
driver.find_element(By.XPATH, '//*[@id="username"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="password"]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="logon"]/fieldset[2]/div/input').click()
# sleep(1)
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[1]/a[4]').click()
driver.find_element(By.XPATH, '//*[@id="rooms_table"]/tbody/tr/td/div/a').click()
driver.find_element(By.XPATH, '//*[@id="description"]').clear()
driver.find_element(By.XPATH, '//*[@id="description"]').send_keys("Updated Room Description")
driver.find_element(By.XPATH, '//*[@id="invalid_types[]"]/option[2]').click()
driver.find_element(By.XPATH, '//*[@id="edit_room"]/fieldset/fieldset[2]/div[9]/input').click()
# sleep(1)
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[2]/form[2]/input[6]').click()
driver.close()
driver.quit()