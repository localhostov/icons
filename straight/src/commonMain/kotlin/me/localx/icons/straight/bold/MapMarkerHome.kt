package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.MapMarkerHome: ImageVector
    get() {
        if (_mapMarkerHome != null) {
            return _mapMarkerHome!!
        }
        _mapMarkerHome = Builder(name = "MapMarkerHome", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.007f)
                curveTo(10.0209f, 0.0072f, 8.0865f, 0.5946f, 6.4415f, 1.6949f)
                curveTo(4.7965f, 2.7952f, 3.515f, 4.3588f, 2.7591f, 6.1878f)
                curveTo(2.0033f, 8.0168f, 1.8072f, 10.029f, 2.1956f, 11.9695f)
                curveTo(2.584f, 13.9101f, 3.5394f, 15.6917f, 4.941f, 17.089f)
                lineTo(12.0f, 23.994f)
                lineTo(19.071f, 17.077f)
                curveTo(20.4691f, 15.6784f, 21.4212f, 13.8967f, 21.8069f, 11.957f)
                curveTo(22.1925f, 10.0174f, 21.9944f, 8.007f, 21.2376f, 6.18f)
                curveTo(20.4807f, 4.3529f, 19.1992f, 2.7913f, 17.5549f, 1.6925f)
                curveTo(15.9107f, 0.5938f, 13.9776f, 0.0072f, 12.0f, 0.007f)
                close()
                moveTo(16.961f, 14.944f)
                lineTo(12.0f, 19.8f)
                lineTo(7.05f, 14.956f)
                curveTo(5.7372f, 13.6431f, 4.9996f, 11.8626f, 4.9996f, 10.006f)
                curveTo(4.9996f, 8.1494f, 5.7372f, 6.3688f, 7.05f, 5.056f)
                curveTo(8.3628f, 3.7431f, 10.1434f, 3.0056f, 12.0f, 3.0056f)
                curveTo(13.8566f, 3.0056f, 15.6372f, 3.7431f, 16.95f, 5.056f)
                curveTo(18.2604f, 6.3667f, 18.9974f, 8.1437f, 18.9995f, 9.9972f)
                curveTo(19.0016f, 11.8506f, 18.2685f, 13.6293f, 16.961f, 14.943f)
                verticalLineTo(14.944f)
                close()
                moveTo(16.0f, 9.409f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.409f)
                curveTo(7.9999f, 9.1784f, 8.0531f, 8.9509f, 8.1552f, 8.7441f)
                curveTo(8.2573f, 8.5374f, 8.4058f, 8.357f, 8.589f, 8.217f)
                lineTo(11.089f, 6.308f)
                curveTo(11.3506f, 6.108f, 11.6707f, 5.9996f, 12.0f, 5.9996f)
                curveTo(12.3293f, 5.9996f, 12.6494f, 6.108f, 12.911f, 6.308f)
                lineTo(15.411f, 8.217f)
                curveTo(15.5942f, 8.357f, 15.7426f, 8.5374f, 15.8448f, 8.7441f)
                curveTo(15.9469f, 8.9509f, 16.0f, 9.1784f, 16.0f, 9.409f)
                close()
            }
        }
        .build()
        return _mapMarkerHome!!
    }

private var _mapMarkerHome: ImageVector? = null
