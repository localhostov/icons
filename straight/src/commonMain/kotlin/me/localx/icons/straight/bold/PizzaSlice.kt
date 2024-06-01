package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.PizzaSlice: ImageVector
    get() {
        if (_pizzaSlice != null) {
            return _pizzaSlice!!
        }
        _pizzaSlice = Builder(name = "PizzaSlice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.072f, 0.9285f)
                    curveTo(22.642f, 0.4971f, 22.0961f, 0.1996f, 21.5004f, 0.0722f)
                    curveTo(20.9047f, -0.0553f, 20.2849f, -0.0072f, 19.716f, 0.2105f)
                    lineTo(0.0f, 8.1215f)
                    verticalLineTo(9.1365f)
                    curveTo(0.0048f, 13.0772f, 1.5724f, 16.855f, 4.3589f, 19.6413f)
                    curveTo(7.1454f, 22.4277f, 10.9234f, 23.995f, 14.864f, 23.9995f)
                    horizontalLineTo(15.878f)
                    lineTo(23.807f, 4.2375f)
                    curveTo(24.0157f, 3.6737f, 24.0573f, 3.0617f, 23.9269f, 2.4748f)
                    curveTo(23.7966f, 1.8879f, 23.4997f, 1.351f, 23.072f, 0.9285f)
                    close()
                    moveTo(19.441f, 7.0635f)
                    curveTo(18.5903f, 6.9221f, 17.7168f, 7.0754f, 16.9651f, 7.4981f)
                    curveTo(16.2135f, 7.9208f, 15.6286f, 8.5874f, 15.3075f, 9.3878f)
                    curveTo(14.9864f, 10.1881f, 14.9482f, 11.0741f, 15.1992f, 11.8991f)
                    curveTo(15.4502f, 12.7242f, 15.9755f, 13.4387f, 16.688f, 13.9245f)
                    lineTo(14.276f, 19.9365f)
                    curveTo(11.652f, 19.6869f, 9.197f, 18.5308f, 7.3331f, 16.6671f)
                    curveTo(5.4692f, 14.8034f, 4.3129f, 12.3485f, 4.063f, 9.7245f)
                    lineTo(20.787f, 3.0135f)
                    curveTo(20.8143f, 2.9998f, 20.8455f, 2.9958f, 20.8754f, 3.0024f)
                    curveTo(20.9053f, 3.0089f, 20.932f, 3.0256f, 20.951f, 3.0495f)
                    curveTo(20.9675f, 3.0645f, 20.9804f, 3.0829f, 20.9889f, 3.1035f)
                    curveTo(20.9974f, 3.1241f, 21.0012f, 3.1463f, 21.0f, 3.1685f)
                    lineTo(19.441f, 7.0635f)
                    close()
                    moveTo(12.0f, 11.9995f)
                    curveTo(12.0f, 12.53f, 11.7893f, 13.0387f, 11.4142f, 13.4137f)
                    curveTo(11.0391f, 13.7888f, 10.5304f, 13.9995f, 10.0f, 13.9995f)
                    curveTo(9.4696f, 13.9995f, 8.9609f, 13.7888f, 8.5858f, 13.4137f)
                    curveTo(8.2107f, 13.0387f, 8.0f, 12.53f, 8.0f, 11.9995f)
                    curveTo(8.0f, 11.4691f, 8.2107f, 10.9604f, 8.5858f, 10.5853f)
                    curveTo(8.9609f, 10.2102f, 9.4696f, 9.9995f, 10.0f, 9.9995f)
                    curveTo(10.5304f, 9.9995f, 11.0391f, 10.2102f, 11.4142f, 10.5853f)
                    curveTo(11.7893f, 10.9604f, 12.0f, 11.4691f, 12.0f, 11.9995f)
                    close()
                }
            }
        }
        .build()
        return _pizzaSlice!!
    }

private var _pizzaSlice: ImageVector? = null
