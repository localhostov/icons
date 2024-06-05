package me.localx.icons.rounded.filled

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

public val Icons.Filled.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) {
            return _wifiSlash!!
        }
        _wifiSlash = Builder(name = "WifiSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(1.33f, 7.07f)
                curveToRelative(-0.37f, 0.33f, -0.73f, 0.69f, -1.07f, 1.05f)
                curveToRelative(-0.38f, 0.4f, -0.35f, 1.04f, 0.05f, 1.41f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0.0f, 0.54f, -0.11f, 0.73f, -0.32f)
                curveToRelative(0.3f, -0.32f, 0.61f, -0.63f, 0.93f, -0.92f)
                curveToRelative(0.41f, -0.37f, 0.45f, -1.0f, 0.08f, -1.41f)
                curveToRelative(-0.37f, -0.41f, -1.0f, -0.45f, -1.41f, -0.08f)
                close()
                moveTo(6.38f, 11.91f)
                curveToRelative(-0.4f, 0.31f, -0.77f, 0.65f, -1.11f, 1.02f)
                curveToRelative(-0.38f, 0.41f, -0.35f, 1.04f, 0.05f, 1.41f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0.0f, 0.54f, -0.11f, 0.73f, -0.32f)
                curveToRelative(0.27f, -0.29f, 0.56f, -0.56f, 0.87f, -0.8f)
                curveToRelative(0.44f, -0.34f, 0.52f, -0.97f, 0.18f, -1.4f)
                curveToRelative(-0.34f, -0.44f, -0.97f, -0.52f, -1.4f, -0.18f)
                close()
                moveTo(13.59f, 12.17f)
                curveToRelative(1.39f, 0.32f, 2.68f, 1.06f, 3.66f, 2.11f)
                curveToRelative(0.2f, 0.21f, 0.46f, 0.32f, 0.73f, 0.32f)
                curveToRelative(0.24f, 0.0f, 0.49f, -0.09f, 0.68f, -0.27f)
                curveToRelative(0.4f, -0.38f, 0.43f, -1.01f, 0.05f, -1.41f)
                curveToRelative(-1.84f, -1.99f, -4.54f, -3.06f, -7.22f, -2.92f)
                curveToRelative(-0.02f, 0.0f, -0.05f, 0.0f, -0.07f, 0.0f)
                lineTo(7.24f, 5.83f)
                curveToRelative(1.52f, -0.55f, 3.12f, -0.83f, 4.76f, -0.83f)
                curveToRelative(3.88f, 0.0f, 7.62f, 1.63f, 10.27f, 4.48f)
                curveToRelative(0.2f, 0.21f, 0.46f, 0.32f, 0.73f, 0.32f)
                curveToRelative(0.24f, 0.0f, 0.49f, -0.09f, 0.68f, -0.27f)
                curveToRelative(0.4f, -0.38f, 0.43f, -1.01f, 0.05f, -1.41f)
                curveToRelative(-3.02f, -3.25f, -7.3f, -5.12f, -11.73f, -5.12f)
                curveToRelative(-2.19f, 0.0f, -4.31f, 0.43f, -6.3f, 1.29f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(13.6f, 12.18f)
                close()
            }
        }
        .build()
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
