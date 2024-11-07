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
driver.find_element(By.XPATH, '//*[@id="photo"]').click()
driver.find_element(By.XPATH, '//*[@id="menu_item_photos_new_album"]').click()
driver.find_element(By.XPATH, '//*[@id="pho_name"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="pho_begin"]').send_keys("002023-11-14")
driver.find_element(By.XPATH, '//*[@id="pho_photographers"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="pho_description"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="btn_save"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbarNav"]/ul/li[2]/a').click()
driver.close()
driver.quit()