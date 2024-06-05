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

public val Icons.Filled.UserGraduate: ImageVector
    get() {
        if (_userGraduate != null) {
            return _userGraduate!!
        }
        _userGraduate = Builder(name = "UserGraduate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.034f, 18.101f)
                curveToRelative(1.84f, 0.992f, 3.285f, 2.63f, 3.913f, 4.652f)
                curveToRelative(0.094f, 0.303f, 0.039f, 0.634f, -0.15f, 0.89f)
                reflectiveCurveToRelative(-0.487f, 0.407f, -0.805f, 0.407f)
                lineTo(4.993f, 24.05f)
                curveToRelative(-0.318f, 0.0f, -0.617f, -0.151f, -0.805f, -0.407f)
                reflectiveCurveToRelative(-0.244f, -0.586f, -0.15f, -0.89f)
                curveToRelative(0.63f, -2.026f, 2.079f, -3.666f, 3.924f, -4.658f)
                curveToRelative(0.473f, -0.254f, 1.061f, -0.148f, 1.405f, 0.265f)
                lineToRelative(1.949f, 2.338f)
                curveToRelative(0.356f, 0.427f, 1.012f, 0.427f, 1.368f, 0.0f)
                lineToRelative(1.944f, -2.333f)
                curveToRelative(0.344f, -0.413f, 0.933f, -0.519f, 1.406f, -0.264f)
                close()
                moveTo(20.656f, 2.65f)
                lineTo(14.192f, 0.369f)
                curveToRelative(-1.388f, -0.491f, -2.916f, -0.492f, -4.303f, -0.006f)
                lineTo(3.346f, 2.653f)
                curveToRelative(-0.818f, 0.286f, -1.346f, 1.03f, -1.346f, 1.896f)
                curveToRelative(0.0f, 0.867f, 0.529f, 1.611f, 1.347f, 1.896f)
                lineToRelative(6.507f, 2.27f)
                curveToRelative(0.689f, 0.24f, 1.414f, 0.361f, 2.138f, 0.361f)
                reflectiveCurveToRelative(1.448f, -0.121f, 2.137f, -0.361f)
                lineToRelative(5.864f, -2.045f)
                verticalLineToRelative(4.379f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, 0.0f, 0.004f, -6.493f, 0.004f, -6.502f)
                curveToRelative(0.001f, -0.865f, -0.525f, -1.61f, -1.34f, -1.898f)
                close()
                moveTo(17.992f, 9.486f)
                lineToRelative(-3.205f, 1.118f)
                curveToRelative(-1.798f, 0.627f, -3.793f, 0.627f, -5.592f, 0.0f)
                lineToRelative(-3.203f, -1.118f)
                verticalLineToRelative(0.563f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-0.564f)
                close()
            }
        }
        .build()
        return _userGraduate!!
    }

private var _userGraduate: ImageVector? = null
