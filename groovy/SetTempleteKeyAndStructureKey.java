Código en groovy para editar el template key de la plantilla
------------------------------------
import com.liferay.dynamic.data.mapping.service.DDMTemplateLocalServiceUtil;
registro = DDMTemplateLocalServiceUtil.getDDMTemplate(40552);
registro.setTemplateKey("AQUI_VA_EL_NOMBRE");
DDMTemplateLocalServiceUtil.updateDDMTemplate(registro );



------------------------------------
Código en groovy para editar el structure key de la estructura
------------------------------------
import com.liferay.dynamic.data.mapping.service.DDMStructureLocalServiceUtil;
registro = DDMStructureLocalServiceUtil.getStructure(40552);
registro.setStructureKey("AQUI_VA_EL_NOMBRE");
DDMStructureLocalServiceUtil.updateDDMStructure(registro );