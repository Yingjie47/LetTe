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
driver.find_element(By.XPATH, '/html/body/div[1]/div[2]/div[2]/div/div[4]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/a').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="openall"]').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="sprojectTree5"]').click()
driver.find_element(By.XPATH, '//*[@id="edit_butn"]').click()
sleep(1)
driver.switch_to.frame(driver.find_element(By.XPATH, '//*[@id="msgtext_ifr"]'))
driver.find_element(By.XPATH, '/html/body').send_keys("test")
driver.switch_to.default_content()
driver.find_element(By.XPATH, '//*[@id="form_edit"]/div[2]/form/fieldset/div[3]/button[1]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="mainmenue"]/li[4]/a').click()
driver.close()
driver.quit()