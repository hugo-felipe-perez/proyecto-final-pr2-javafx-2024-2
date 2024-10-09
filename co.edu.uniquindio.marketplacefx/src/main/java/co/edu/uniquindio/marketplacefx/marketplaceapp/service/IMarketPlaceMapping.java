package co.edu.uniquindio.marketplacefx.marketplaceapp.service;

import co.edu.uniquindio.marketplacefx.marketplaceapp.mapping.dto.VendedorDTO;
import co.edu.uniquindio.marketplacefx.marketplaceapp.model.Vendedor;

import java.util.List;

public interface IMarketPlaceMapping {
    List<VendedorDTO> getVendedorDTO(List<Vendedor> listaVendedores);
    VendedorDTO  vendorToVendedorDto(Vendedor vendedor);
    Vendedor vendedorDtoToVendedor(VendedorDTO vendedorDTO);
}
