from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/PHPFusion-9.03.90/")
driver.find_element(By.XPATH, '(//*[@name="user_name"])[2]').send_keys("admin")
driver.find_element(By.XPATH, '(//*[@name="user_pass"])[2]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="login"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]/ul[2]/li[3]/a').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[2]/div/div/div[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="s2id_rating"]/a').click()
driver.find_element(By.XPATH, '//*[@id="select2-results-1"]/li[1]').click()
driver.find_element(By.XPATH, '//*[@id="post_rating"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="user-menu"]').click()
driver.find_element(By.XPATH, '//*[@id="user-info"]/ul/li[7]/a').click()
driver.close()
driver.quit()