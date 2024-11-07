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
driver.find_element(By.XPATH, '//*[@id="dates"]').click()
driver.find_element(By.XPATH, '//*[@id="menu_item_event_add"]').click()
driver.find_element(By.XPATH, '//*[@id="dat_headline"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="date_to"]').send_keys("002024-11-14")
driver.find_element(By.XPATH, '//*[@id="cat_uuid"]').click()  # Updated xpath to match the new version
driver.find_element(By.XPATH, '//*[@id="cat_uuid"]/option[2]').click()  # Updated xpath to match the new version
driver.find_element(By.XPATH, '//*[@id="cke_15"]').click()
driver.find_element(By.XPATH, '//*[@id="cke_22"]').click()
driver.switch_to.frame(driver.find_element(By.XPATH, '//*[@id="cke_1_contents"]/iframe'))
driver.find_element(By.XPATH, '/html/body').send_keys("test")
driver.switch_to.default_content()
driver.find_element(By.XPATH, '//*[@id="btn_save"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbarNav"]/ul/li[2]/a').click()
driver.close()
driver.quit()