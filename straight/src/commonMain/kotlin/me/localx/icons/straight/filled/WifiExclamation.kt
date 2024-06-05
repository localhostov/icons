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

public val Icons.Filled.WifiExclamation: ImageVector
    get() {
        if (_wifiExclamation != null) {
            return _wifiExclamation!!
        }
        _wifiExclamation = Builder(name = "WifiExclamation", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.69f, 7.69f)
                curveTo(3.04f, 5.33f, 5.95f, 3.87f, 9.0f, 3.29f)
                verticalLineToRelative(2.05f)
                curveToRelative(-2.53f, 0.55f, -4.94f, 1.8f, -6.9f, 3.76f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(7.05f, 14.05f)
                curveToRelative(0.58f, -0.58f, 1.24f, -1.03f, 1.95f, -1.37f)
                verticalLineToRelative(-2.16f)
                curveToRelative(-1.25f, 0.44f, -2.4f, 1.15f, -3.36f, 2.12f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(15.0f, 3.29f)
                verticalLineToRelative(2.05f)
                curveToRelative(2.53f, 0.55f, 4.94f, 1.8f, 6.9f, 3.76f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-2.35f, -2.35f, -5.27f, -3.82f, -8.31f, -4.39f)
                close()
                moveTo(15.0f, 12.68f)
                curveToRelative(0.71f, 0.34f, 1.37f, 0.79f, 1.95f, 1.37f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-0.96f, -0.97f, -2.11f, -1.67f, -3.36f, -2.12f)
                verticalLineToRelative(2.16f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(13.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 3.0f)
                close()
            }
        }
        .build()
        return _wifiExclamation!!
    }

private var _wifiExclamation: ImageVector? = null
