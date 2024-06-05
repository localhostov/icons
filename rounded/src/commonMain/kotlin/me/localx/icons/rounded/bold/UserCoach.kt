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

public val Icons.Bold.UserCoach: ImageVector
    get() {
        if (_userCoach != null) {
            return _userCoach!!
        }
        _userCoach = Builder(name = "UserCoach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.312f)
                curveToRelative(-1.039f, -1.79f, -2.973f, -3.0f, -5.188f, -3.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(20.971f, 22.401f)
                curveToRelative(0.055f, 0.827f, -0.571f, 1.541f, -1.397f, 1.596f)
                curveToRelative(-0.034f, 0.002f, -0.067f, 0.003f, -0.101f, 0.003f)
                curveToRelative(-0.783f, 0.0f, -1.443f, -0.608f, -1.495f, -1.401f)
                curveToRelative(-0.101f, -1.521f, -0.772f, -2.879f, -1.792f, -3.878f)
                lineToRelative(-0.909f, 1.779f)
                curveToRelative(-0.384f, 0.607f, -1.249f, 0.663f, -1.709f, 0.112f)
                lineToRelative(-1.569f, -2.112f)
                lineToRelative(-1.569f, 2.112f)
                curveToRelative(-0.46f, 0.552f, -1.324f, 0.495f, -1.709f, -0.112f)
                lineToRelative(-0.909f, -1.779f)
                curveToRelative(-1.02f, 0.999f, -1.691f, 2.357f, -1.792f, 3.878f)
                curveToRelative(-0.055f, 0.826f, -0.769f, 1.457f, -1.596f, 1.397f)
                curveToRelative(-0.827f, -0.055f, -1.452f, -0.769f, -1.397f, -1.596f)
                curveToRelative(0.311f, -4.71f, 4.252f, -8.401f, 8.971f, -8.401f)
                reflectiveCurveToRelative(8.66f, 3.69f, 8.971f, 8.401f)
                close()
            }
        }
        .build()
        return _userCoach!!
    }

private var _userCoach: ImageVector? = null
