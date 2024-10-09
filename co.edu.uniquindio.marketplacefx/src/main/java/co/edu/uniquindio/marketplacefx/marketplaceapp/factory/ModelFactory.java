package co.edu.uniquindio.marketplacefx.marketplaceapp.factory;

import co.edu.uniquindio.marketplacefx.marketplaceapp.mapping.dto.VendedorDTO;
import co.edu.uniquindio.marketplacefx.marketplaceapp.mapping.mappers.MarketPlaceMapping;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Marketplace;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Vendedor;
import co.edu.uniquindio.marketplacefx.marketplaceapp.service.IMarketPlaceMapping;
import co.edu.uniquindio.marketplacefx.marketplaceapp.service.IModelFactoryService;
import co.edu.uniquindio.marketplacefx.marketplaceapp.utils.DataUtil;

import java.util.List;

public class ModelFactory implements IModelFactoryService {

    private static ModelFactory modelFactory;

    private Marketplace marketPlace; // Almacena la instancia de Marketplace
    private IMarketPlaceMapping mapper; // Interfaz para el mapeo

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private ModelFactory() {
        mapper = new MarketPlaceMapping();
        marketPlace = DataUtil.inicializarDatos(); // Inicializa los datos
    }

    @Override
    public List<VendedorDTO> obtenerVendedores() {
        return mapper.getVendedorDTO(marketPlace.getListaVendedores());
    }

    // Método para agregar un vendedor
    public void agregarVendedor(VendedorDTO vendedorDTO) {
        Vendedor vendedor = mapper.vendedorDtoToVendedor(vendedorDTO); // Convierte DTO a modelo
        if (marketPlace.getListaVendedores() != null) {
            marketPlace.getListaVendedores().add(vendedor); // Agrega el vendedor a la lista de Marketplace
        } else {
            throw new IllegalStateException("La lista de vendedores no está inicializada");
        }
    }
    // Método para actualizar un vendedor
    public void actualizarVendedor(VendedorDTO vendedorActualizadoDTO) {
        List<Vendedor> vendedores = marketPlace.getListaVendedores(); // Obtiene la lista de vendedores

        if (vendedores != null) {
            boolean encontrado = false; // Variable para verificar si se encontró el vendedor

            for (int i = 0; i < vendedores.size(); i++) {
                Vendedor vendedor = vendedores.get(i);
                // Compara la cédula del vendedor actual con la cédula del DTO
                if (vendedor.getCedula().equals(vendedorActualizadoDTO.cedula())) {
                    // Actualiza el vendedor con los datos del DTO
                    vendedores.set(i, mapper.vendedorDtoToVendedor(vendedorActualizadoDTO));
                    encontrado = true; // Marca que se encontró y actualizó
                    break; // Sale del bucle una vez que se actualiza el vendedor
                }
            }

            // Verifica si no se encontró el vendedor
            if (!encontrado) {
                throw new IllegalArgumentException("No se encontró un vendedor con la cédula: " + vendedorActualizadoDTO.cedula());
            }
        } else {
            throw new IllegalStateException("La lista de vendedores no está inicializada");
        }
    }
    // Método para eliminar un vendedor por cédula
    public void eliminarVendedor(String cedula) {
        List<Vendedor> vendedores = marketPlace.getListaVendedores();
        if (vendedores != null) {
            vendedores.removeIf(vendedor -> vendedor.getCedula().equals(cedula)); // Elimina el vendedor que coincide con la cédula
        } else {
            throw new IllegalStateException("La lista de vendedores no está inicializada");
        }
    }
}
