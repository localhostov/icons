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

public val Icons.Bold.PodiumStar: ImageVector
    get() {
        if (_podiumStar != null) {
            return _podiumStar!!
        }
        _podiumStar = Builder(name = "PodiumStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 8.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.0f, 0.0f, 0.659f, -0.006f, 0.736f, -0.019f)
                curveToRelative(0.455f, 0.618f, 1.188f, 1.019f, 2.014f, 1.019f)
                horizontalLineToRelative(4.25f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(-0.826f, 0.0f, -1.559f, 0.401f, -2.014f, 1.019f)
                curveToRelative(-0.077f, -0.012f, -0.736f, -0.019f, -0.736f, -0.019f)
                curveTo(4.468f, 1.0f, 2.0f, 3.468f, 2.0f, 6.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.563f)
                lineToRelative(1.401f, 8.403f)
                curveToRelative(0.443f, 2.664f, 2.725f, 4.597f, 5.425f, 4.597f)
                horizontalLineToRelative(6.223f)
                curveToRelative(2.7f, 0.0f, 4.981f, -1.933f, 5.425f, -4.596f)
                lineToRelative(1.401f, -8.404f)
                horizontalLineToRelative(0.563f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(17.577f, 18.911f)
                curveToRelative(-0.202f, 1.21f, -1.238f, 2.089f, -2.466f, 2.089f)
                horizontalLineToRelative(-6.223f)
                curveToRelative(-1.228f, 0.0f, -2.264f, -0.879f, -2.466f, -2.09f)
                lineToRelative(-1.319f, -7.91f)
                horizontalLineToRelative(13.792f)
                lineToRelative(-1.319f, 7.911f)
                close()
                moveTo(8.043f, 14.876f)
                curveToRelative(0.113f, -0.345f, 0.407f, -0.558f, 0.77f, -0.558f)
                horizontalLineToRelative(1.853f)
                lineToRelative(0.563f, -1.756f)
                curveToRelative(0.111f, -0.347f, 0.407f, -0.562f, 0.771f, -0.562f)
                reflectiveCurveToRelative(0.66f, 0.215f, 0.771f, 0.562f)
                lineToRelative(0.563f, 1.756f)
                horizontalLineToRelative(1.853f)
                curveToRelative(0.362f, 0.0f, 0.657f, 0.214f, 0.77f, 0.558f)
                curveToRelative(0.112f, 0.344f, 0.0f, 0.691f, -0.292f, 0.905f)
                lineToRelative(-1.507f, 1.101f)
                lineToRelative(0.573f, 1.771f)
                curveToRelative(0.111f, 0.346f, -0.002f, 0.693f, -0.297f, 0.906f)
                curveToRelative(-0.295f, 0.212f, -0.66f, 0.211f, -0.953f, -0.005f)
                lineToRelative(-1.481f, -1.089f)
                lineToRelative(-1.481f, 1.089f)
                curveToRelative(-0.286f, 0.211f, -0.666f, 0.212f, -0.953f, 0.005f)
                curveToRelative(-0.295f, -0.213f, -0.409f, -0.56f, -0.297f, -0.906f)
                lineToRelative(0.572f, -1.771f)
                lineToRelative(-1.506f, -1.101f)
                curveToRelative(-0.293f, -0.214f, -0.404f, -0.561f, -0.292f, -0.905f)
                close()
            }
        }
        .build()
        return _podiumStar!!
    }

private var _podiumStar: ImageVector? = null
