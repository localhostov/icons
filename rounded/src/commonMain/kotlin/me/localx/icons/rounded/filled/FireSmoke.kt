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

public val Icons.Filled.FireSmoke: ImageVector
    get() {
        if (_fireSmoke != null) {
            return _fireSmoke!!
        }
        _fireSmoke = Builder(name = "FireSmoke", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.308f, 23.981f)
                horizontalLineTo(4.692f)
                curveTo(2.206f, 23.981f, 0.148f, 22.124f, 0.008f, 19.752f)
                curveToRelative(-0.139f, -2.339f, 1.502f, -4.365f, 3.817f, -4.714f)
                curveToRelative(1.045f, -1.904f, 3.038f, -3.058f, 5.175f, -3.058f)
                curveToRelative(0.966f, 0.0f, 1.893f, 0.231f, 2.756f, 0.687f)
                curveToRelative(0.155f, 0.081f, 0.333f, 0.082f, 0.488f, 0.0f)
                curveToRelative(0.863f, -0.455f, 1.79f, -0.686f, 2.756f, -0.686f)
                curveToRelative(2.137f, 0.0f, 4.129f, 1.154f, 5.198f, 3.011f)
                lineToRelative(-0.008f, 0.049f)
                curveToRelative(2.307f, 0.355f, 3.94f, 2.378f, 3.802f, 4.711f)
                curveToRelative(-0.14f, 2.371f, -2.198f, 4.229f, -4.684f, 4.229f)
                close()
                moveTo(9.0f, 9.981f)
                curveToRelative(1.04f, 0.0f, 2.046f, 0.199f, 3.0f, 0.594f)
                curveToRelative(0.954f, -0.395f, 1.96f, -0.594f, 3.0f, -0.594f)
                curveToRelative(1.32f, 0.0f, 2.595f, 0.334f, 3.728f, 0.933f)
                curveToRelative(0.173f, -0.609f, 0.272f, -1.25f, 0.272f, -1.914f)
                curveToRelative(-0.009f, -4.167f, -3.895f, -6.945f, -4.675f, -7.458f)
                lineTo(12.868f, 0.169f)
                curveToRelative(-0.503f, -0.331f, -1.187f, -0.161f, -1.464f, 0.374f)
                curveToRelative(-0.214f, 0.414f, -0.404f, 1.317f, -0.404f, 1.753f)
                curveToRelative(0.0f, 1.5f, 1.0f, 1.954f, 1.0f, 2.954f)
                curveToRelative(0.0f, 0.828f, -0.462f, 1.75f, -1.741f, 1.75f)
                reflectiveCurveToRelative(-1.759f, -0.922f, -1.759f, -1.75f)
                curveToRelative(0.0f, -0.454f, 0.194f, -0.727f, 0.194f, -0.973f)
                curveToRelative(0.0f, -0.438f, -0.355f, -0.792f, -0.793f, -0.792f)
                curveToRelative(-0.156f, 0.0f, -0.294f, 0.057f, -0.417f, 0.135f)
                curveToRelative(0.0f, 0.0f, -2.485f, 1.5f, -2.485f, 5.38f)
                curveToRelative(0.0f, 0.667f, 0.099f, 1.309f, 0.273f, 1.92f)
                curveToRelative(1.127f, -0.603f, 2.401f, -0.939f, 3.727f, -0.939f)
                close()
            }
        }
        .build()
        return _fireSmoke!!
    }

private var _fireSmoke: ImageVector? = null
