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
driver.find_element(By.XPATH, '//*[@id="announcements"]').click()
driver.find_element(By.XPATH, '//*[@id="menu_item_announcement_categories"]').click()
driver.find_element(By.XPATH, '/html/body/div[3]/div/div[2]/div/div[2]/table/tbody/tr[3]/td[6]/a[1]').click()
driver.find_element(By.XPATH, '//*[@id="cat_name"]').send_keys("123")
driver.find_element(By.XPATH, '//*[@id="adm_categories_view_right_group"]/div/span/span[1]/span/ul/li[4]/input').click()
driver.find_element(By.XPATH, '/html/body/span/span/span/ul/li[1]').click()
driver.find_element(By.XPATH, '//*[@id="btn_save"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbarNav"]/ul/li[2]/a').click()
driver.close()
driver.quit()