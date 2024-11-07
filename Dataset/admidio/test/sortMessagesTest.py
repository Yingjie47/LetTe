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
driver.find_element(By.XPATH, '//*[@id="adm_message_table"]/thead/tr/th[1]').click()
driver.find_element(By.XPATH, '//*[@id="adm_message_table"]/thead/tr/th[2]').click()
driver.find_element(By.XPATH, '//*[@id="adm_message_table"]/thead/tr/th[4]').click()
driver.find_element(By.XPATH, '//*[@id="adm_message_table"]/thead/tr/th[5]').click()
driver.find_element(By.XPATH, '//*[@id="adm_message_table_length"]/label/select').click()
driver.find_element(By.XPATH, '//*[@id="adm_message_table_length"]/label/select/option[3]').click()
driver.find_element(By.XPATH, '//*[@id="adm_message_table_filter"]/label/input').send_keys("贺卡")
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbarNav"]/ul/li[2]/a').click()
driver.close()
driver.quit()