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

public val Icons.Filled.OperatingSystemUpgrade: ImageVector
    get() {
        if (_operatingSystemUpgrade != null) {
            return _operatingSystemUpgrade!!
        }
        _operatingSystemUpgrade = Builder(name = "OperatingSystemUpgrade", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.716f, 9.128f)
                lineToRelative(-0.533f, -0.307f)
                curveToRelative(0.201f, -0.571f, 0.317f, -1.182f, 0.317f, -1.821f)
                reflectiveCurveToRelative(-0.115f, -1.25f, -0.317f, -1.821f)
                lineToRelative(0.533f, -0.307f)
                curveToRelative(0.479f, -0.276f, 0.643f, -0.887f, 0.368f, -1.366f)
                curveToRelative(-0.276f, -0.479f, -0.888f, -0.642f, -1.366f, -0.368f)
                lineToRelative(-0.53f, 0.305f)
                curveToRelative(-0.804f, -0.945f, -1.92f, -1.614f, -3.188f, -1.848f)
                verticalLineToRelative(-0.596f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(0.596f)
                curveToRelative(-1.265f, 0.234f, -2.379f, 0.9f, -3.182f, 1.841f)
                lineToRelative(-0.518f, -0.299f)
                curveToRelative(-0.478f, -0.274f, -1.089f, -0.111f, -1.366f, 0.368f)
                curveToRelative(-0.275f, 0.479f, -0.111f, 1.09f, 0.368f, 1.366f)
                lineToRelative(0.518f, 0.298f)
                curveToRelative(-0.203f, 0.573f, -0.32f, 1.188f, -0.32f, 1.83f)
                reflectiveCurveToRelative(0.116f, 1.257f, 0.32f, 1.83f)
                lineToRelative(-0.518f, 0.298f)
                curveToRelative(-0.479f, 0.276f, -0.643f, 0.887f, -0.368f, 1.366f)
                curveToRelative(0.186f, 0.321f, 0.521f, 0.501f, 0.868f, 0.501f)
                curveToRelative(0.169f, 0.0f, 0.341f, -0.043f, 0.498f, -0.133f)
                lineToRelative(0.518f, -0.299f)
                curveToRelative(0.806f, 0.944f, 1.923f, 1.611f, 3.193f, 1.843f)
                lineToRelative(0.007f, 0.606f)
                curveToRelative(0.007f, 0.548f, 0.453f, 0.988f, 1.0f, 0.988f)
                horizontalLineToRelative(0.013f)
                curveToRelative(0.552f, -0.007f, 0.994f, -0.46f, 0.988f, -1.012f)
                lineToRelative(-0.007f, -0.585f)
                curveToRelative(1.264f, -0.236f, 2.375f, -0.904f, 3.177f, -1.846f)
                lineToRelative(0.53f, 0.305f)
                curveToRelative(0.157f, 0.09f, 0.329f, 0.133f, 0.498f, 0.133f)
                curveToRelative(0.346f, 0.0f, 0.683f, -0.18f, 0.868f, -0.501f)
                curveToRelative(0.275f, -0.479f, 0.111f, -1.09f, -0.368f, -1.366f)
                close()
                moveTo(12.0f, 8.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(20.0f, 22.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _operatingSystemUpgrade!!
    }

private var _operatingSystemUpgrade: ImageVector? = null
