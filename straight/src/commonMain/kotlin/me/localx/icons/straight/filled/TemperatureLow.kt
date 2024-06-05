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

public val Icons.Filled.TemperatureLow: ImageVector
    get() {
        if (_temperatureLow != null) {
            return _temperatureLow!!
        }
        _temperatureLow = Builder(name = "TemperatureLow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 17.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, -7.0f, 7.0f)
                curveToRelative(-6.078f, 0.117f, -9.334f, -7.638f, -5.0f, -11.89f)
                lineTo(6.0f, 5.0f)
                curveToRelative(0.211f, -6.609f, 9.791f, -6.6f, 10.0f, 0.0f)
                verticalLineToRelative(7.11f)
                arcTo(7.009f, 7.009f, 0.0f, false, true, 18.0f, 17.0f)
                close()
                moveTo(14.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.816f)
                lineTo(12.0f, 12.0f)
                lineTo(10.0f, 12.0f)
                verticalLineToRelative(2.184f)
                arcTo(2.995f, 2.995f, 0.0f, true, false, 14.0f, 17.0f)
                close()
                moveTo(24.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                close()
                moveTo(22.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 3.0f)
                close()
            }
        }
        .build()
        return _temperatureLow!!
    }

private var _temperatureLow: ImageVector? = null
