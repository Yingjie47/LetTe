from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/PHPFusion-9.03.90/")
driver.find_element(By.XPATH, '(//*[@name="user_name"])[2]').send_keys("admin")
driver.find_element(By.XPATH, '(//*[@name="user_pass"])[2]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="login"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[2]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[3]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[4]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[5]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[6]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[7]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[8]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[9]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[10]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[11]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[12]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[13]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[14]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[15]/a').click()
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]//*[contains(text(),"News ")]').click()
driver.find_element(By.XPATH, '//*[@id="news-cats"]').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div/div[2]/div[1]/div/ul/li[16]/a').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="user-menu"]').click()
driver.find_element(By.XPATH, '//*[@id="user-info"]/ul/li[7]/a').click()
driver.close()
driver.quit()