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
                lineTo(2.0f, 5.0f)
                curveToRelative(0.211f, -6.609f, 9.791f, -6.6f, 10.0f, 0.0f)
                close()
                moveTo(10.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.828f)
                lineTo(8.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(2.172f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 10.0f, 17.0f)
                close()
                moveTo(15.3f, 8.692f)
                lineTo(18.3f, 11.692f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(3.0f, -3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.3f, 7.277f)
                lineTo(20.0f, 8.57f)
                lineTo(20.0f, 0.985f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(18.0f, 8.57f)
                lineTo(16.7f, 7.277f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.413f, 1.415f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _temperatureDown!!
    }

private var _temperatureDown: ImageVector? = null
