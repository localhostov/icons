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

public val Icons.Bold.Moped: ImageVector
    get() {
        if (_moped != null) {
            return _moped!!
        }
        _moped = Builder(name = "Moped", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(21.172f, 14.0f)
                curveToRelative(-1.273f, 0.0f, -2.492f, 0.543f, -3.344f, 1.49f)
                lineToRelative(-1.522f, 1.69f)
                curveToRelative(-1.04f, 1.156f, -2.529f, 1.82f, -4.087f, 1.82f)
                horizontalLineToRelative(-4.219f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.246f, 0.038f, -0.482f, 0.094f, -0.711f)
                curveToRelative(-1.255f, -0.799f, -2.094f, -2.194f, -2.094f, -3.789f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(0.921f)
                curveToRelative(1.865f, 0.0f, 3.559f, 1.173f, 4.214f, 2.92f)
                lineToRelative(1.905f, 5.08f)
                horizontalLineToRelative(0.679f)
                curveToRelative(0.708f, 0.0f, 1.385f, -0.301f, 1.857f, -0.827f)
                lineToRelative(1.522f, -1.69f)
                curveToRelative(0.337f, -0.375f, 0.711f, -0.709f, 1.111f, -1.005f)
                lineToRelative(-2.393f, -6.496f)
                curveToRelative(-0.217f, -0.587f, -0.782f, -0.981f, -1.408f, -0.981f)
                horizontalLineToRelative(-1.408f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.408f)
                curveToRelative(1.877f, 0.0f, 3.574f, 1.183f, 4.223f, 2.944f)
                lineToRelative(0.071f, 0.194f)
                curveToRelative(0.323f, -0.671f, 1.003f, -1.138f, 1.798f, -1.138f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-0.288f, 0.0f, -0.56f, -0.063f, -0.807f, -0.173f)
                lineToRelative(1.246f, 3.383f)
                curveToRelative(0.564f, -0.134f, 1.144f, -0.211f, 1.733f, -0.211f)
                horizontalLineToRelative(1.328f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.328f)
                close()
                moveTo(8.336f, 16.0f)
                lineToRelative(-1.51f, -4.027f)
                curveToRelative(-0.219f, -0.582f, -0.783f, -0.973f, -1.405f, -0.973f)
                horizontalLineToRelative(-0.921f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.836f)
                close()
            }
        }
        .build()
        return _moped!!
    }

private var _moped: ImageVector? = null
