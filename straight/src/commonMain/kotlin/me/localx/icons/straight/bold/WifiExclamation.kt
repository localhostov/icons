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

public val Icons.Bold.WifiExclamation: ImageVector
    get() {
        if (_wifiExclamation != null) {
            return _wifiExclamation!!
        }
        _wifiExclamation = Builder(name = "WifiExclamation", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.64f, 12.64f)
                curveToRelative(0.7f, -0.7f, 1.5f, -1.27f, 2.36f, -1.7f)
                verticalLineToRelative(3.59f)
                curveToRelative(-0.08f, 0.07f, -0.16f, 0.15f, -0.24f, 0.23f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(2.81f, 9.81f)
                curveToRelative(1.51f, -1.51f, 3.29f, -2.56f, 5.19f, -3.18f)
                lineTo(8.0f, 3.51f)
                curveToRelative(-2.68f, 0.69f, -5.22f, 2.08f, -7.31f, 4.17f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(16.0f, 3.51f)
                verticalLineToRelative(3.12f)
                curveToRelative(1.9f, 0.61f, 3.69f, 1.67f, 5.19f, 3.18f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-2.1f, -2.1f, -4.63f, -3.49f, -7.31f, -4.17f)
                close()
                moveTo(16.0f, 14.53f)
                curveToRelative(0.08f, 0.07f, 0.16f, 0.15f, 0.24f, 0.23f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-0.7f, -0.7f, -1.5f, -1.27f, -2.36f, -1.7f)
                verticalLineToRelative(3.59f)
                close()
                moveTo(13.5f, 3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 15.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 3.0f)
                close()
            }
        }
        .build()
        return _wifiExclamation!!
    }

private var _wifiExclamation: ImageVector? = null
