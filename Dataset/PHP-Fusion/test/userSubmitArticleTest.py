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
driver.find_element(By.XPATH, '//*[@id="uipcollapse"]/li[1]/a').click()
driver.find_element(By.XPATH, '//*[@id="article_subject"]').send_keys("test123")
driver.find_element(By.XPATH, '//*[@id="s2id_article_cat"]/a').click()
driver.find_element(By.XPATH, '//*[@id="select2-results-2"]/li[2]').click()
driver.find_element(By.XPATH, '//*[@id="article_snippet-field"]/div/div[1]/div/div/div[1]/button[1]').click()
driver.find_element(By.XPATH, '//*[@id="article_snippet-field"]/div/div[1]/div/div/div[1]/button[2]').click()
driver.find_element(By.XPATH, '//*[@id="article_snippet-field"]/div/div[1]/div/div/div[3]/button[2]').click()
driver.find_element(By.XPATH, '//*[@id="article_snippet"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="article_article"]').send_keys("test123")
driver.find_element(By.XPATH, '//*[@id="submit_article"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="user-menu"]').click()
driver.find_element(By.XPATH, '//*[@id="user-info"]/ul/li[7]/a').click()
driver.close()
driver.quit()