from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/admidio-4.2.0/")
driver.find_element(By.XPATH, '//*[@id="plg_usr_login_name"]').send_keys("admin")
driver.find_element(By.XPATH, '//*[@id="plg_usr_password"]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="next_page"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="admidio-overview"]/div[1]/div').click()
driver.find_element(By.XPATH, '//*[@id="navbarNav"]/ul/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="menu_item_profile_user_relation_types"]').click()
driver.find_element(By.XPATH, '//*[@id="usr_id2_group"]/div/span/span[1]/span').click()
driver.find_element(By.XPATH, '//*[@id="select2-usr_id2-results"]').click()
driver.find_element(By.XPATH, '//*[@id="urt_id"]').click()
driver.find_element(By.XPATH, '//*[@id="urt_id"]/option[4]').click()
driver.find_element(By.XPATH, '//*[@id="btn_save"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbarNav"]/ul/li[2]/a').click()
driver.close()
driver.quit()