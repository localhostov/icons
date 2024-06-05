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

public val Icons.Filled.FireBurner: ImageVector
    get() {
        if (_fireBurner != null) {
            return _fireBurner!!
        }
        _fireBurner = Builder(name = "FireBurner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 24.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                curveToRelative(0.0f, -1.208f, 0.861f, -2.218f, 2.001f, -2.45f)
                curveToRelative(0.0f, -0.017f, -0.001f, -0.033f, -0.001f, -0.05f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.017f, 0.0f, 0.034f, -0.001f, 0.05f)
                curveToRelative(1.14f, 0.232f, 2.001f, 1.242f, 2.001f, 2.45f)
                close()
                moveTo(17.121f, 10.889f)
                curveToRelative(-1.157f, 1.916f, -3.25f, 3.196f, -5.484f, 3.063f)
                curveToRelative(-3.145f, -0.188f, -5.637f, -2.797f, -5.637f, -5.989f)
                curveToRelative(0.0f, -1.139f, 0.882f, -3.11f, 1.465f, -4.139f)
                curveToRelative(0.32f, -0.566f, 0.812f, -0.498f, 1.062f, 0.103f)
                curveToRelative(0.208f, 0.501f, 0.428f, 2.035f, 1.104f, 2.035f)
                curveToRelative(1.82f, 0.0f, 1.433f, -3.302f, 2.37f, -5.492f)
                curveToRelative(0.234f, -0.548f, 0.637f, -0.61f, 1.083f, -0.215f)
                curveToRelative(2.6f, 2.303f, 6.736f, 6.168f, 4.038f, 10.636f)
                close()
                moveTo(13.327f, 8.459f)
                lineToRelative(-0.769f, -1.097f)
                curveToRelative(-0.308f, -0.308f, -0.807f, -0.308f, -1.115f, 0.0f)
                lineToRelative(-0.77f, 1.096f)
                curveToRelative(-0.754f, 0.754f, -0.889f, 1.99f, -0.195f, 2.8f)
                curveToRelative(0.802f, 0.937f, 2.242f, 0.937f, 3.044f, 0.0f)
                curveToRelative(0.693f, -0.809f, 0.559f, -2.046f, -0.195f, -2.8f)
                close()
            }
        }
        .build()
        return _fireBurner!!
    }

private var _fireBurner: ImageVector? = null
