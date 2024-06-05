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

public val Icons.Bold.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) {
            return _wifiSlash!!
        }
        _wifiSlash = Builder(name = "WifiSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.76f, 6.71f)
                lineToRelative(2.13f, 2.13f)
                curveToRelative(-0.38f, 0.3f, -0.74f, 0.62f, -1.08f, 0.97f)
                lineTo(0.69f, 7.69f)
                curveToRelative(0.34f, -0.34f, 0.7f, -0.67f, 1.07f, -0.98f)
                close()
                moveTo(5.64f, 12.64f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.35f, -0.35f, 0.73f, -0.65f, 1.15f, -0.9f)
                lineToRelative(-2.16f, -2.16f)
                curveToRelative(-0.39f, 0.28f, -0.76f, 0.6f, -1.11f, 0.94f)
                close()
                moveTo(16.56f, 14.44f)
                lineToRelative(1.8f, -1.8f)
                curveToRelative(-1.66f, -1.66f, -3.9f, -2.59f, -6.24f, -2.63f)
                lineToRelative(-3.55f, -3.55f)
                curveToRelative(4.44f, -1.2f, 9.3f, 0.03f, 12.61f, 3.35f)
                lineToRelative(2.12f, -2.12f)
                curveTo(18.84f, 3.21f, 12.06f, 1.81f, 6.2f, 4.08f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-7.4f, -7.4f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
