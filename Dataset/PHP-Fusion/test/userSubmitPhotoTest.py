from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/PHPFusion-9.03.90/")
driver.find_element(By.XPATH, '(//*[@name="user_name"])[2]').send_keys("admin")
driver.find_element(By.XPATH, '(//*[@name="user_pass"])[2]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="login"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navigation-user"]/ul/li[6]/a').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="uipcollapse"]/li[5]/a').click()
driver.find_element(By.XPATH, '//*[@id="photo_title"]').send_keys("test123")
driver.find_element(By.XPATH, '//*[@id="photo_image"]').send_keys(r"D:\MineResearch\datasets\mineDatasets\PHP-Fusion\test\aTestImg.png")
sleep(1)
driver.find_element(By.XPATH, '//*[@id="photo_description"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="submit_photo"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="user-menu"]').click()
driver.find_element(By.XPATH, '//*[@id="user-info"]/ul/li[7]/a').click()
driver.close()
driver.quit()