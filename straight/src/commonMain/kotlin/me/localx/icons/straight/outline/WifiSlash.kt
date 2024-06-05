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

public val Icons.Outline.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) {
            return _wifiSlash!!
        }
        _wifiSlash = Builder(name = "WifiSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.17f, 11.41f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(-0.57f, 0.32f, -1.11f, 0.7f, -1.59f, 1.17f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(0.47f, -0.47f, 0.99f, -0.88f, 1.53f, -1.22f)
                close()
                moveTo(0.69f, 7.69f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.47f, -0.47f, 0.97f, -0.88f, 1.48f, -1.27f)
                lineToRelative(-1.43f, -1.43f)
                curveToRelative(-0.51f, 0.4f, -1.01f, 0.82f, -1.47f, 1.29f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(13.6f, 12.18f)
                curveToRelative(1.25f, 0.29f, 2.41f, 0.93f, 3.35f, 1.87f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-1.85f, -1.85f, -4.35f, -2.78f, -6.93f, -2.62f)
                lineTo(7.24f, 5.83f)
                curveToRelative(5.1f, -1.85f, 10.77f, -0.61f, 14.66f, 3.27f)
                lineToRelative(1.41f, -1.41f)
                curveTo(18.65f, 3.03f, 11.75f, 1.7f, 5.7f, 4.29f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.6f, 12.18f)
                close()
            }
        }
        .build()
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
