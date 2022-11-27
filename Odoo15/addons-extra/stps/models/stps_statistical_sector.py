from odoo import models, fields, api



class stps(models.Model):
    _name = 'stps.statistical_sector'
    _description = 'Polígonos STPS- Estadísticas del Sector Laboral'
    _rec_name = 'statistical_sector_number'

    statistical_sector_number = fields.Char(
        string='Folio', default=lambda self: self.env['ir.sequence'].next_by_code('stps.statistical_sector'))
    year = fields.Selection(
        string='Año',
        selection=[('2021', '2021'), ('2022', '2022'), ('2023', '2023')],required=True   
    )

    month = fields.Selection(
        string='Mes',
        selection=[('enero', 'ENERO'),
                   ('febrero', 'FEBRERO'),
                   ('marzo', 'MARZO'),
                   ('abril', 'ABRIL'),
                   ('mayo', 'MAYO'),
                   ('junio', 'JUNIO'),
                   ('julio', 'JULIO'),
                   ('agosto', 'AGOSTO'),
                   ('septiembre', 'SEPTIEMBRE'),
                   ('octubre', 'OCTUBRE'),
                   ('noviembre', 'NOVIEMBRE'),
                   ('diciembre', 'DICIEMBRE')
                   ],required=True)
    salary = fields.Float(string='Salario Mensual Libre de Impuestos',required=True)
    age = fields.Integer(string='Edad',required=True)
    gender = fields.Selection(string='Género', selection=[
                              ('M', 'Masculino'), ('F', 'Femenino')],required=True)
    sector_id = fields.Many2one('stps.sector', string='Sector Industrial',required=True)
    state_id = fields.Many2one('stps.state', string='Estado',required=True)
    municipality_id = fields.Many2one('stps.municipality', string='Municipio',required=True)    

    def copy(self, default=None):
        default.update( {
            "year": self.year,
            "month": self.month,
            "salary": self.salary,
            "age": self.age,
            "gender": self.gender,
            "state_id": self.state_id.id,
            "sector_id":self.sector_id.id,
            "municipality_id": self.municipality_id.id,
            "statistical_sector_number":self.env['ir.sequence'].next_by_code('stps.statistical_sector')
        })
        return super().copy(default)   
            
