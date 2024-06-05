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

public val Icons.Filled.BatteryFull: ImageVector
    get() {
        if (_batteryFull != null) {
            return _batteryFull!!
        }
        _batteryFull = Builder(name = "BatteryFull", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 4.0f)
                lineTo(19.0f, 4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 6.0f)
                close()
            }
        }
        .build()
        return _batteryFull!!
    }

private var _batteryFull: ImageVector? = null
