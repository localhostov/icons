package me.localx.icons.straight.outline

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

public val Icons.Outline.BatterySlash: ImageVector
    get() {
        if (_batterySlash != null) {
            return _batterySlash!!
        }
        _batterySlash = Builder(name = "BatterySlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(5.414f, 4.0f)
                lineTo(1.457f, 0.043f)
                lineTo(0.042f, 1.457f)
                lineTo(22.543f, 23.957f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(0.724f, -0.548f, 1.193f, -1.417f, 1.193f, -2.393f)
                close()
                moveTo(7.414f, 6.0f)
                horizontalLineToRelative(11.586f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.428f, -0.27f, 0.794f, -0.65f, 0.937f)
                lineTo(7.414f, 6.0f)
                close()
                moveTo(13.757f, 18.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 4.243f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(11.757f)
                lineTo(13.757f, 18.0f)
                close()
            }
        }
        .build()
        return _batterySlash!!
    }

private var _batterySlash: ImageVector? = null
