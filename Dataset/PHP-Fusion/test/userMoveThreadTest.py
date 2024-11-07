from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/PHPFusion-9.03.90/")
driver.find_element(By.XPATH, '(//*[@name="user_name"])[2]').send_keys("admin")
driver.find_element(By.XPATH, '(//*[@name="user_pass"])[2]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="login"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="ddlink13"]').click()
driver.find_element(By.XPATH, '//*[@id="menu-13"]/li[1]/a').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/div/div[1]/a').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div[2]/div/div/div/div/div[1]/div[4]/div/div/div/div[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="s2id_step"]/a').click()
driver.find_element(By.XPATH, '//*[@id="select2-results-1"]/li[5]').click()
driver.find_element(By.XPATH, '//*[@id="go"]').click()
driver.find_element(By.XPATH, '//*[@id="move_thread"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="user-menu"]').click()
driver.find_element(By.XPATH, '//*[@id="user-info"]/ul/li[7]/a').click()
driver.close()
driver.quit()