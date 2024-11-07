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
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[1]/a[5]').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="users_table"]/tbody/tr[2]/td/form/input[3]').click()
driver.find_element(By.XPATH, '//*[@id="f_display_name"]').send_keys("123")
driver.find_element(By.XPATH, '//*[@id="password0"]').send_keys("test001")
driver.find_element(By.XPATH, '//*[@id="password1"]').send_keys("test001")
driver.find_element(By.XPATH, '//*[@id="update_button"]').click()
# sleep(1)
driver.find_element(By.XPATH, '/html/body/header/nav/nav[1]/nav[2]/form[2]/input[6]').click()
driver.close()
driver.quit()