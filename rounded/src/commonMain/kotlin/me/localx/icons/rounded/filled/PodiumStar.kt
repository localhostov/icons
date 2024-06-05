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

public val Icons.Filled.PodiumStar: ImageVector
    get() {
        if (_podiumStar != null) {
            return _podiumStar!!
        }
        _podiumStar = Builder(name = "PodiumStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 10.0f)
                horizontalLineToRelative(-1.967f)
                curveToRelative(-0.027f, -0.001f, -0.054f, -0.001f, -0.08f, 0.0f)
                lineTo(4.0f, 10.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(0.172f)
                curveToRelative(0.413f, 1.164f, 1.524f, 2.0f, 2.828f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.304f, 0.0f, -2.415f, 0.836f, -2.828f, 2.0f)
                horizontalLineToRelative(-0.172f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                lineTo(1.0f, 10.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.153f)
                lineToRelative(1.304f, 7.821f)
                curveToRelative(0.403f, 2.422f, 2.478f, 4.179f, 4.932f, 4.179f)
                horizontalLineToRelative(7.223f)
                curveToRelative(2.454f, 0.0f, 4.528f, -1.757f, 4.932f, -4.179f)
                lineToRelative(1.304f, -7.821f)
                horizontalLineToRelative(1.153f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(15.665f, 16.781f)
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
                curveToRelative(0.113f, -0.345f, 0.407f, -0.558f, 0.77f, -0.558f)
                horizontalLineToRelative(1.853f)
                lineToRelative(0.563f, -1.756f)
                curveToRelative(0.111f, -0.347f, 0.407f, -0.562f, 0.771f, -0.562f)
                reflectiveCurveToRelative(0.66f, 0.215f, 0.771f, 0.562f)
                lineToRelative(0.563f, 1.756f)
                horizontalLineToRelative(1.853f)
                curveToRelative(0.362f, 0.0f, 0.657f, 0.214f, 0.77f, 0.558f)
                curveToRelative(0.112f, 0.344f, 0.0f, 0.691f, -0.292f, 0.905f)
                close()
            }
        }
        .build()
        return _podiumStar!!
    }

private var _podiumStar: ImageVector? = null
