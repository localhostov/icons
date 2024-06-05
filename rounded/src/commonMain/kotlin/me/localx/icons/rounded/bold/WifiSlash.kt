package me.localx.icons.rounded.bold

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
                moveTo(23.56f, 23.56f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineTo(0.44f, 2.56f)
                curveTo(-0.15f, 1.97f, -0.15f, 1.03f, 0.44f, 0.44f)
                reflectiveCurveTo(1.97f, -0.15f, 2.56f, 0.44f)
                lineToRelative(3.64f, 3.64f)
                curveToRelative(5.86f, -2.27f, 12.63f, -0.87f, 17.11f, 3.6f)
                curveToRelative(0.09f, 0.09f, 0.18f, 0.18f, 0.27f, 0.28f)
                curveToRelative(0.57f, 0.6f, 0.55f, 1.55f, -0.05f, 2.12f)
                curveToRelative(-0.29f, 0.28f, -0.66f, 0.42f, -1.04f, 0.42f)
                curveToRelative(-0.4f, 0.0f, -0.79f, -0.16f, -1.09f, -0.46f)
                lineToRelative(-0.22f, -0.22f)
                curveToRelative(-3.32f, -3.32f, -8.18f, -4.55f, -12.62f, -3.35f)
                lineToRelative(3.55f, 3.55f)
                curveToRelative(2.34f, 0.04f, 4.58f, 0.97f, 6.24f, 2.63f)
                curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0.0f, 2.12f)
                curveToRelative(-0.29f, 0.29f, -0.67f, 0.44f, -1.05f, 0.44f)
                lineToRelative(6.24f, 6.24f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(6.0f, 12.29f)
                curveToRelative(-0.12f, 0.11f, -0.24f, 0.22f, -0.36f, 0.34f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, 0.0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(0.08f, -0.08f, 0.16f, -0.16f, 0.24f, -0.23f)
                curveToRelative(0.62f, -0.55f, 0.67f, -1.5f, 0.12f, -2.12f)
                curveToRelative(-0.55f, -0.62f, -1.5f, -0.67f, -2.12f, -0.12f)
                close()
                moveTo(0.97f, 7.41f)
                curveToRelative(-0.1f, 0.09f, -0.19f, 0.18f, -0.28f, 0.27f)
                curveToRelative(-0.09f, 0.09f, -0.18f, 0.19f, -0.27f, 0.28f)
                curveToRelative(-0.57f, 0.6f, -0.55f, 1.55f, 0.05f, 2.12f)
                curveToRelative(0.29f, 0.28f, 0.66f, 0.42f, 1.04f, 0.42f)
                curveToRelative(0.4f, 0.0f, 0.79f, -0.16f, 1.09f, -0.46f)
                lineToRelative(0.45f, -0.45f)
                curveToRelative(0.6f, -0.57f, 0.63f, -1.52f, 0.06f, -2.12f)
                reflectiveCurveToRelative(-1.52f, -0.63f, -2.12f, -0.06f)
                close()
            }
        }
        .build()
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
