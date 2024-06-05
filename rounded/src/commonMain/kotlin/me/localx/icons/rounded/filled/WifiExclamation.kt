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
                moveTo(14.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(23.73f, 8.12f)
                curveToRelative(-2.03f, -2.19f, -4.61f, -3.76f, -7.47f, -4.55f)
                curveToRelative(-0.53f, -0.15f, -1.08f, 0.17f, -1.23f, 0.7f)
                curveToRelative(-0.15f, 0.53f, 0.17f, 1.08f, 0.7f, 1.23f)
                curveToRelative(2.5f, 0.69f, 4.76f, 2.07f, 6.53f, 3.98f)
                curveToRelative(0.2f, 0.21f, 0.46f, 0.32f, 0.73f, 0.32f)
                curveToRelative(0.24f, 0.0f, 0.49f, -0.09f, 0.68f, -0.27f)
                curveToRelative(0.4f, -0.38f, 0.43f, -1.01f, 0.05f, -1.41f)
                close()
                moveTo(7.73f, 3.58f)
                curveToRelative(-2.86f, 0.79f, -5.44f, 2.36f, -7.47f, 4.55f)
                curveToRelative(-0.38f, 0.4f, -0.35f, 1.04f, 0.05f, 1.41f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0.0f, 0.54f, -0.11f, 0.73f, -0.32f)
                curveToRelative(1.78f, -1.91f, 4.03f, -3.29f, 6.53f, -3.98f)
                curveToRelative(0.53f, -0.15f, 0.84f, -0.7f, 0.7f, -1.23f)
                curveToRelative(-0.15f, -0.53f, -0.7f, -0.85f, -1.23f, -0.7f)
                close()
                moveTo(16.49f, 11.18f)
                curveToRelative(-0.48f, -0.27f, -1.09f, -0.1f, -1.36f, 0.38f)
                reflectiveCurveToRelative(-0.1f, 1.09f, 0.38f, 1.36f)
                curveToRelative(0.65f, 0.37f, 1.24f, 0.83f, 1.75f, 1.38f)
                curveToRelative(0.2f, 0.21f, 0.46f, 0.32f, 0.73f, 0.32f)
                curveToRelative(0.24f, 0.0f, 0.49f, -0.09f, 0.68f, -0.27f)
                curveToRelative(0.4f, -0.38f, 0.43f, -1.01f, 0.05f, -1.41f)
                curveToRelative(-0.65f, -0.7f, -1.4f, -1.29f, -2.23f, -1.76f)
                close()
                moveTo(7.51f, 11.18f)
                curveToRelative(-0.83f, 0.47f, -1.58f, 1.06f, -2.23f, 1.76f)
                curveToRelative(-0.38f, 0.4f, -0.35f, 1.04f, 0.05f, 1.41f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0.0f, 0.54f, -0.11f, 0.73f, -0.32f)
                curveToRelative(0.51f, -0.55f, 1.1f, -1.01f, 1.75f, -1.38f)
                curveToRelative(0.48f, -0.27f, 0.65f, -0.88f, 0.38f, -1.36f)
                curveToRelative(-0.27f, -0.48f, -0.88f, -0.65f, -1.36f, -0.38f)
                close()
                moveTo(12.0f, 15.01f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(13.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                lineTo(11.0f, 14.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _wifiExclamation!!
    }

private var _wifiExclamation: ImageVector? = null
