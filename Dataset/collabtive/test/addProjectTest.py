from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/collabtive-3.0/")
driver.find_element(By.XPATH, '//*[@id="username"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="pass"]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="loginform"]/fieldset/div[3]').click()
driver.find_element(By.XPATH, '//*[@id="loginform"]/fieldset/div[4]/button').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="name"]').send_keys("test")
driver.switch_to.frame(driver.find_element(By.XPATH, '//*[@id="desc_ifr"]'))
driver.find_element(By.XPATH, '//*[@id="tinymce"]').send_keys("test")
driver.switch_to.default_content()
driver.find_element(By.XPATH, '//*[@id="endP"]').clear()
driver.find_element(By.XPATH, '//*[@id="endP"]').send_keys("30.03.2024")
driver.find_element(By.XPATH, '//*[@id="add_project"]/table/tbody/tr[9]/td/a').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="budget"]').send_keys("100")
driver.find_element(By.XPATH, '//*[@id="company"]').click()
driver.find_element(By.XPATH, '//*[@id="company"]/option[2]').click()
driver.find_element(By.XPATH, '//*[@id="assignto"]/option[2]').click()
driver.find_element(By.XPATH, '//*[@id="addprojectform"]/fieldset/div[11]/button[1]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="mainmenue"]/li[4]/a').click()
driver.close()
driver.quit()