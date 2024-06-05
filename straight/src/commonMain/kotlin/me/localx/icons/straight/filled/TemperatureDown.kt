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

public val Icons.Filled.TemperatureDown: ImageVector
    get() {
        if (_temperatureDown != null) {
            return _temperatureDown!!
        }
        _temperatureDown = Builder(name = "TemperatureDown", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.11f)
                curveTo(16.334f, 16.363f, 13.079f, 24.117f, 7.0f, 24.0f)
                curveToRelative(-6.078f, 0.117f, -9.335f, -7.638f, -5.0f, -11.89f)
                verticalLineTo(5.0f)
                curveToRelative(0.211f, -6.609f, 9.791f, -6.6f, 10.0f, 0.0f)
                close()
                moveTo(10.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.816f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.184f)
                arcTo(2.995f, 2.995f, 0.0f, true, false, 10.0f, 17.0f)
                close()
                moveTo(15.707f, 6.707f)
                lineTo(14.293f, 8.121f)
                lineToRelative(3.293f, 3.293f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.828f, 0.0f)
                lineToRelative(3.293f, -3.293f)
                lineTo(22.293f, 6.707f)
                lineTo(20.0f, 9.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _temperatureDown!!
    }

private var _temperatureDown: ImageVector? = null
