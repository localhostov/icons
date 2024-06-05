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

public val Icons.Outline.Duck: ImageVector
    get() {
        if (_duck != null) {
            return _duck!!
        }
        _duck = Builder(name = "Duck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.75f, 13.0f)
                curveToRelative(-2.547f, 0.0f, -6.014f, 2.909f, -6.4f, 3.241f)
                lineToRelative(-0.961f, 0.824f)
                lineToRelative(1.023f, 0.744f)
                curveToRelative(0.123f, 0.09f, 3.051f, 2.191f, 6.338f, 2.191f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(14.75f, 18.0f)
                curveToRelative(-1.521f, 0.0f, -3.002f, -0.6f, -3.985f, -1.109f)
                curveToRelative(1.292f, -0.93f, 2.957f, -1.891f, 3.985f, -1.891f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-3.251f, -1.219f)
                curveToRelative(-0.741f, -2.473f, -3.037f, -4.281f, -5.749f, -4.281f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                curveToRelative(0.0f, 1.338f, 0.44f, 2.575f, 1.184f, 3.574f)
                curveToRelative(-1.513f, 1.52f, -4.011f, 3.426f, -5.184f, 3.426f)
                curveToRelative(-1.128f, 0.0f, -3.156f, -3.364f, -3.156f, -3.364f)
                lineToRelative(-0.71f, 1.465f)
                curveToRelative(-1.535f, 3.171f, -1.498f, 6.585f, 0.099f, 9.133f)
                curveToRelative(1.501f, 2.394f, 4.204f, 3.766f, 7.417f, 3.766f)
                horizontalLineToRelative(6.943f)
                curveToRelative(3.591f, 0.0f, 7.406f, -2.559f, 7.406f, -7.3f)
                curveToRelative(0.0f, -2.615f, -2.02f, -5.531f, -3.326f, -6.941f)
                curveToRelative(0.355f, -0.441f, 0.65f, -0.933f, 0.87f, -1.463f)
                lineToRelative(3.457f, -1.297f)
                close()
                moveTo(15.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(15.593f, 22.0f)
                horizontalLineToRelative(-6.943f)
                curveToRelative(-2.547f, 0.0f, -4.579f, -1.004f, -5.722f, -2.829f)
                curveToRelative(-0.974f, -1.553f, -1.175f, -3.563f, -0.608f, -5.589f)
                curveToRelative(0.602f, 0.76f, 1.374f, 1.418f, 2.681f, 1.418f)
                curveToRelative(2.022f, 0.0f, 4.915f, -2.316f, 6.619f, -4.046f)
                curveToRelative(0.963f, 0.659f, 2.128f, 1.046f, 3.381f, 1.046f)
                curveToRelative(1.167f, 0.0f, 2.257f, -0.335f, 3.179f, -0.914f)
                curveToRelative(1.12f, 1.182f, 2.82f, 3.668f, 2.82f, 5.614f)
                curveToRelative(0.0f, 3.888f, -3.233f, 5.3f, -5.406f, 5.3f)
                close()
            }
        }
        .build()
        return _duck!!
    }

private var _duck: ImageVector? = null
