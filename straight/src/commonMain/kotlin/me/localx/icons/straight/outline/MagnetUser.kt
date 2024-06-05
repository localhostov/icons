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

public val Icons.Outline.MagnetUser: ImageVector
    get() {
        if (_magnetUser != null) {
            return _magnetUser!!
        }
        _magnetUser = Builder(name = "MagnetUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.004f)
                curveTo(14.692f, 0.004f, 12.0f, 2.695f, 12.0f, 6.004f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(21.309f, 0.004f, 18.0f, 0.004f)
                close()
                moveTo(21.0f, 8.622f)
                verticalLineToRelative(-0.119f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.118f)
                curveToRelative(-0.614f, -0.703f, -1.0f, -1.612f, -1.0f, -2.618f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.006f, -0.385f, 1.915f, -1.0f, 2.618f)
                close()
                moveTo(19.5f, 4.504f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.835f, 17.518f)
                curveToRelative(-0.649f, 0.647f, -1.702f, 0.646f, -2.349f, 0.0f)
                curveToRelative(-0.647f, -0.647f, -0.647f, -1.701f, 0.0f, -2.349f)
                lineToRelative(5.046f, -5.047f)
                lineToRelative(-4.212f, -4.212f)
                lineToRelative(-5.089f, 5.09f)
                curveToRelative(-1.439f, 1.439f, -2.231f, 3.353f, -2.231f, 5.387f)
                reflectiveCurveToRelative(0.792f, 3.947f, 2.231f, 5.386f)
                curveToRelative(1.485f, 1.485f, 3.436f, 2.228f, 5.386f, 2.228f)
                reflectiveCurveToRelative(3.9f, -0.742f, 5.386f, -2.228f)
                lineToRelative(5.09f, -5.09f)
                lineToRelative(-4.212f, -4.212f)
                lineToRelative(-5.046f, 5.047f)
                close()
                moveTo(8.704f, 10.122f)
                lineToRelative(-1.086f, 1.086f)
                lineToRelative(-1.384f, -1.384f)
                lineToRelative(1.086f, -1.086f)
                lineToRelative(1.384f, 1.384f)
                close()
                moveTo(3.645f, 20.358f)
                curveToRelative(-1.061f, -1.061f, -1.646f, -2.472f, -1.646f, -3.972f)
                reflectiveCurveToRelative(0.584f, -2.911f, 1.646f, -3.973f)
                lineToRelative(1.176f, -1.176f)
                lineToRelative(1.384f, 1.384f)
                lineToRelative(-1.132f, 1.133f)
                curveToRelative(-1.427f, 1.427f, -1.427f, 3.75f, 0.0f, 5.177f)
                curveToRelative(1.427f, 1.428f, 3.749f, 1.428f, 5.177f, 0.0f)
                lineToRelative(1.132f, -1.132f)
                lineToRelative(1.383f, 1.383f)
                lineToRelative(-1.176f, 1.176f)
                curveToRelative(-2.189f, 2.189f, -5.753f, 2.189f, -7.944f, 0.0f)
                close()
                moveTo(14.179f, 17.768f)
                lineToRelative(-1.384f, -1.384f)
                lineToRelative(1.086f, -1.086f)
                lineToRelative(1.384f, 1.384f)
                lineToRelative(-1.086f, 1.086f)
                close()
            }
        }
        .build()
        return _magnetUser!!
    }

private var _magnetUser: ImageVector? = null
