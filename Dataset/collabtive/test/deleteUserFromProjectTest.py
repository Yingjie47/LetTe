from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

driver = webdriver.Chrome()
driver.get("http://localhost/collabtive-3.0/")
driver.find_element(By.XPATH, '//*[@id="username"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="pass"]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="loginform"]/fieldset/div[3]').click()
driver.find_element(By.XPATH, '//*[@id="loginform"]/fieldset/div[4]/button').click()
sleep(1)
driver.find_element(By.XPATH, '/html/body/div[1]/div[2]/div[2]/div/div[4]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/a').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="contentwrapper"]/div[1]/ul/li[6]/a').click()
sleep(1)
ActionChains(driver).move_to_element(driver.find_element(By.XPATH, '//*[@id="iw_1"]')).perform()
driver.find_element(By.XPATH, '//*[@id="iw_1"]/table/tbody/tr[1]/td[3]/div/a[1]').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="assignto"]').click()
driver.find_element(By.XPATH, '//*[@id="assignto"]/option[2]').click()
driver.find_element(By.XPATH, '//*[@id="content-left-in"]/div/div[1]/h2[2]/form/fieldset/div[3]/button[1]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="mainmenue"]/li[4]/a').click()
driver.close()
driver.quit()