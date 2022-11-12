import com.liferay.asset.entry.rel.service.AssetEntryAssetCategoryRelLocalServiceUtil;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.model.JournalFolder;
import com.liferay.journal.service.JournalArticleServiceUtil;
import com.liferay.journal.service.JournalFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;



long groupId = 4071273;
long folderId= 4071434;
long idCategory = 4088807;

	JournalArticleServiceUtil journalService = new JournalArticleServiceUtil();
	Locale locale = new Locale("en");
	AssetEntryLocalServiceUtil _assetEntryLocalService = new AssetEntryLocalServiceUtil();
	List<JournalArticle> journals = journalService.getArticles(groupId, folderId, locale);
	List<AssetEntry> listAssetEntries = new ArrayList<AssetEntry>();
	AssetEntry assetEntry = null;
	for (int i = 0; i < journals.size(); i++) {
		JournalArticle journal = journals.get(i);
		assetEntry =assignAssetCategory2(JournalArticle.class.getName(), journal.getResourcePrimKey(),_assetEntryLocalService,idCategory);
		listAssetEntries.add(assetEntry);
	}
	_assetEntryLocalService.reindex(listAssetEntries);
	 
	 
	private AssetEntry assignAssetCategory2(String className, Long primaryKey, AssetEntryLocalServiceUtil _assetEntryLocalService, long idCategory) {
	
		AssetEntry assetEntry = _assetEntryLocalService.fetchEntry(className, primaryKey);
		if (Validator.isNotNull(assetEntry)) {
				AssetEntryAssetCategoryRelLocalServiceUtil _assetEntryAssetCategoryRelLocalService = new AssetEntryAssetCategoryRelLocalServiceUtil();
					_assetEntryAssetCategoryRelLocalService.addAssetEntryAssetCategoryRel(assetEntry.getEntryId(), idCategory);
		}
		return assetEntry;
	}