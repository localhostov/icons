package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.TemperatureUp: ImageVector
    get() {
        if (_temperatureUp != null) {
            return _temperatureUp!!
        }
        _temperatureUp = Builder(name = "TemperatureUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.1f)
                curveToRelative(4.334f, 4.253f, 1.079f, 12.007f, -5.0f, 11.89f)
                curveTo(0.922f, 24.1f, -2.335f, 16.347f, 2.0f, 12.1f)
                lineTo(2.0f, 4.985f)
                curveToRelative(0.211f, -6.61f, 9.791f, -6.6f, 10.0f, 0.0f)
                close()
                moveTo(10.0f, 16.99f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.828f)
                lineTo(8.0f, 4.875f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(9.282f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 4.0f, 2.828f)
                close()
                moveTo(22.7f, 3.298f)
                lineTo(19.7f, 0.298f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.7f, 4.708f)
                lineTo(18.0f, 3.415f)
                lineTo(18.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(20.0f, 3.415f)
                lineToRelative(1.3f, 1.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.71f, 3.293f)
                horizontalLineToRelative(-0.005f)
                close()
            }
        }
        .build()
        return _temperatureUp!!
    }

private var _temperatureUp: ImageVector? = null
