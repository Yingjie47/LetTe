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
driver.find_element(By.XPATH, '//*[@id="profile_picture_links"]/li/a').click()
driver.find_element(By.XPATH, '//*[@id="foto_upload_file_group"]/div/input[2]').send_keys(r"D:\MineResearch\datasets\mineDatasets\admidio\test\aTestImg.png")
driver.find_element(By.XPATH, '//*[@id="btn_upload"]').click()
driver.find_element(By.XPATH, '//*[@id="btn_update"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navbarNav"]/ul/li[2]/a').click()
driver.close()
driver.quit()