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

public val Icons.Filled.BatterySlash: ImageVector
    get() {
        if (_batterySlash != null) {
            return _batterySlash!!
        }
        _batterySlash = Builder(name = "BatterySlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.757f, 20.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 4.243f)
                lineToRelative(15.757f, 15.757f)
                close()
                moveTo(20.799f, 19.385f)
                lineToRelative(3.158f, 3.158f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.042f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(3.957f, 3.957f)
                horizontalLineToRelative(13.586f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.977f, -0.476f, 1.837f, -1.201f, 2.385f)
                close()
            }
        }
        .build()
        return _batterySlash!!
    }

private var _batterySlash: ImageVector? = null
