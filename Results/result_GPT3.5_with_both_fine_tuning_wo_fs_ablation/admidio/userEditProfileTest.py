from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/admidio-4.2.13/")
driver.find_element(By.XPATH, '//*[@id="plg_usr_login_name"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="plg_usr_password"]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="next_page"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="admidio-overview"]/div[1]/div').click()
driver.find_element(By.XPATH, '//*[@id="navbarNav"]/ul/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="menu_item_profile_edit"]').click()
driver.find_element(By.XPATH, '//*[@id="usf-3"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="usf-4"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="usf-5"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="usf-6"]').click()
driver.find_element(By.XPATH, '//*[@id="usf-6"]/option[4]').click()
driver.find_element(By.XPATH, '//*[@id="usf-7"]').send_keys("86-10-66778899")
driver.find_element(By.XPATH, '//*[@id="usf-8"]').send_keys("+8615812345678")
driver.find_element(By.XPATH, '//*[@id="usf-18"]').send_keys("www.test.com")
driver.find_element(By.XPATH, '//*[@id="usf-14"]').send_keys("https://www.xing.com/profile/test")
driver.find_element(By.XPATH, '//*[@id="usf-13"]').click()
driver.find_element(By.XPATH, '//*[@id="usf-9"]').send_keys("2000-01-01")
driver.find_element(By.XPATH, '//*[@id="usf-10_1"]').click()
driver.find_element(By.XPATH, '//*[@id="btn_save"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbarNav"]/ul/li[2]/a').click()
driver.close()
driver.quit()