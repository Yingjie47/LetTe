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
driver.find_element(By.XPATH, '//*[@id="trackerhead_toggle"]').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="ttday"]').clear()
driver.find_element(By.XPATH, '//*[@id="ttday"]').send_keys("14.03.2024")
driver.find_element(By.XPATH, '//*[@id="datepicker_addtt"]/table/tbody/tr[9]/td/a').click()
sleep(2)
driver.find_element(By.XPATH, '//*[@id="started"]').clear()
driver.find_element(By.XPATH, '//*[@id="started"]').send_keys("09:00")
driver.find_element(By.XPATH, '//*[@id="ended"]').clear()
driver.find_element(By.XPATH, '//*[@id="ended"]').send_keys("12:00")
driver.switch_to.frame(driver.find_element(By.XPATH, '//*[@id="trackcomm_ifr"]'))
driver.find_element(By.XPATH, '/html/body').send_keys("test")
driver.switch_to.default_content()
driver.find_element(By.XPATH, '//*[@id="ttask"]').click()
driver.find_element(By.XPATH, '//*[@id="ttask"]/option[2]').click()
driver.find_element(By.XPATH, '//*[@id="trackeradd"]/fieldset/div[9]/button').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="mainmenue"]/li[4]/a').click()
driver.close()
driver.quit()