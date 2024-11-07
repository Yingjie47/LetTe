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
driver.find_element(By.XPATH, '//*[@id="mail"]').click()
driver.find_element(By.XPATH, '//*[@id="menu_item_messages_new_pm"]').click()
driver.find_element(By.XPATH, '//*[@id="msg_subject"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="msg_body"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="btn_send"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbarNav"]/ul/li[2]/a').click()
driver.close()
driver.quit()