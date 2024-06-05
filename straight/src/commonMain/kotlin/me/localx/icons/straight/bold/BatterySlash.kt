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

public val Icons.Bold.BatterySlash: ImageVector
    get() {
        if (_batterySlash != null) {
            return _batterySlash!!
        }
        _batterySlash = Builder(name = "BatterySlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.035f, 18.914f)
                curveToRelative(0.604f, -0.635f, 0.965f, -1.49f, 0.965f, -2.414f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(6.121f, 4.0f)
                lineTo(1.81f, -0.311f)
                lineTo(-0.311f, 1.811f)
                lineTo(22.189f, 24.311f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-3.276f, -3.276f)
                close()
                moveTo(18.5f, 7.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.114f, -0.036f, 0.211f, -0.091f, 0.288f)
                lineTo(9.121f, 7.0f)
                horizontalLineToRelative(9.379f)
                close()
                moveTo(12.05f, 17.0f)
                lineToRelative(3.0f, 3.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 4.95f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(9.05f)
                lineTo(12.05f, 17.0f)
                close()
            }
        }
        .build()
        return _batterySlash!!
    }

private var _batterySlash: ImageVector? = null
