package me.localx.icons.straight.filled

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

public val Icons.Filled.LocationAlt: ImageVector
    get() {
        if (_locationAlt != null) {
            return _locationAlt!!
        }
        _locationAlt = Builder(name = "LocationAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0004f, 10.0068f)
                curveTo(22.0004f, 8.029f, 21.4139f, 6.0957f, 20.3151f, 4.4512f)
                curveTo(19.2162f, 2.8067f, 17.6545f, 1.525f, 15.8272f, 0.7682f)
                curveTo(14.0f, 0.0113f, 11.9893f, -0.1867f, 10.0495f, 0.1991f)
                curveTo(8.1097f, 0.5849f, 6.3279f, 1.5373f, 4.9294f, 2.9358f)
                curveTo(4.0003f, 3.8651f, 3.2635f, 4.9683f, 2.761f, 6.1825f)
                curveTo(2.2585f, 7.3966f, 2.0003f, 8.6979f, 2.001f, 10.012f)
                curveTo(2.0018f, 11.326f, 2.2615f, 12.627f, 2.7653f, 13.8406f)
                curveTo(3.2692f, 15.0542f, 4.0073f, 16.1566f, 4.9374f, 17.0848f)
                lineTo(9.9624f, 21.9998f)
                horizontalLineTo(5.0004f)
                verticalLineTo(23.9998f)
                horizontalLineTo(19.0004f)
                verticalLineTo(21.9998f)
                horizontalLineTo(14.0384f)
                lineTo(19.0714f, 17.0768f)
                curveTo(20.0029f, 16.1506f, 20.7414f, 15.0488f, 21.2442f, 13.8352f)
                curveTo(21.7469f, 12.6217f, 22.004f, 11.3204f, 22.0004f, 10.0068f)
                close()
                moveTo(17.0004f, 12.6178f)
                lineTo(12.0004f, 15.1178f)
                lineTo(7.0004f, 12.6178f)
                verticalLineTo(6.3818f)
                lineTo(12.0004f, 3.8818f)
                lineTo(17.0004f, 6.3818f)
                verticalLineTo(12.6178f)
                close()
                moveTo(12.0004f, 8.9998f)
                lineTo(15.0004f, 7.4998f)
                verticalLineTo(11.3818f)
                lineTo(12.0004f, 12.8818f)
                lineTo(9.0004f, 11.3818f)
                verticalLineTo(7.4998f)
                lineTo(12.0004f, 8.9998f)
                close()
            }
        }
        .build()
        return _locationAlt!!
    }

private var _locationAlt: ImageVector? = null
