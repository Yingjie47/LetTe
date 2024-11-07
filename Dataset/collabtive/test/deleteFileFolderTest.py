from time import sleep
from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/collabtive-3.0/")
driver.find_element(By.XPATH, '//*[@id="username"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="pass"]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="loginform"]/fieldset/div[3]').click()
driver.find_element(By.XPATH, '//*[@id="loginform"]/fieldset/div[4]/button').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="proj_1"]/tr[1]/td[2]/div/a').click()
driver.find_element(By.XPATH, '//*[@id="contentwrapper"]/div[1]/ul/li[5]/a').click()
sleep(1)
ActionChains(driver).move_to_element(driver.find_element(By.XPATH, '/html/body/div[1]/div[2]/div[2]/div/div/div[3]/div[3]/div[2]/div/div/ul/li/div')).perform()
driver.find_element(By.XPATH, '/html/body/div[1]/div[2]/div[2]/div/div/div[3]/div[3]/div[2]/div/div/ul/li/div/table/tbody/tr[1]/td[3]/div/a').click()
driver.switch_to.alert.accept()
driver.switch_to.default_content()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="mainmenue"]/li[4]/a').click()
driver.close()
driver.quit()