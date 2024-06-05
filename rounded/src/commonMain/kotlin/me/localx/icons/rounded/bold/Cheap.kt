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

public val Icons.Bold.Cheap: ImageVector
    get() {
        if (_cheap != null) {
            return _cheap!!
        }
        _cheap = Builder(name = "Cheap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 10.0f)
                curveToRelative(0.0f, 0.989f, 0.736f, 1.84f, 1.712f, 1.979f)
                curveToRelative(0.82f, 0.117f, 1.39f, 0.877f, 1.272f, 1.697f)
                curveToRelative(-0.107f, 0.748f, -0.749f, 1.288f, -1.483f, 1.288f)
                curveToRelative(-0.071f, 0.0f, -0.142f, -0.005f, -0.214f, -0.015f)
                curveToRelative(-2.444f, -0.35f, -4.288f, -2.478f, -4.288f, -4.949f)
                reflectiveCurveToRelative(1.843f, -4.6f, 4.288f, -4.949f)
                curveToRelative(0.816f, -0.118f, 1.58f, 0.452f, 1.697f, 1.272f)
                curveToRelative(0.117f, 0.82f, -0.452f, 1.58f, -1.272f, 1.697f)
                curveToRelative(-0.976f, 0.14f, -1.712f, 0.991f, -1.712f, 1.979f)
                close()
                moveTo(23.571f, 16.95f)
                curveToRelative(-0.579f, -0.592f, -1.529f, -0.6f, -2.121f, -0.021f)
                lineToRelative(-2.45f, 2.401f)
                lineTo(19.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(17.793f)
                lineToRelative(-2.396f, -2.396f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                lineToRelative(4.25f, 4.25f)
                curveToRelative(0.489f, 0.489f, 1.131f, 0.732f, 1.771f, 0.732f)
                curveToRelative(0.637f, 0.0f, 1.272f, -0.241f, 1.753f, -0.722f)
                lineToRelative(4.293f, -4.207f)
                curveToRelative(0.592f, -0.58f, 0.602f, -1.529f, 0.021f, -2.121f)
                close()
                moveTo(7.94f, 16.693f)
                curveToRelative(-2.955f, -0.908f, -4.94f, -3.598f, -4.94f, -6.693f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                curveToRelative(0.702f, 0.0f, 1.395f, 0.104f, 2.06f, 0.308f)
                curveToRelative(0.792f, 0.244f, 1.631f, -0.202f, 1.875f, -0.994f)
                reflectiveCurveToRelative(-0.202f, -1.631f, -0.994f, -1.875f)
                curveToRelative(-0.95f, -0.292f, -1.939f, -0.439f, -2.94f, -0.439f)
                curveTo(4.486f, 0.0f, 0.0f, 4.486f, 0.0f, 10.0f)
                curveToRelative(0.0f, 4.42f, 2.837f, 8.263f, 7.06f, 9.56f)
                curveToRelative(0.146f, 0.045f, 0.295f, 0.067f, 0.441f, 0.067f)
                curveToRelative(0.641f, 0.0f, 1.235f, -0.415f, 1.433f, -1.06f)
                curveToRelative(0.244f, -0.792f, -0.201f, -1.631f, -0.993f, -1.874f)
                close()
            }
        }
        .build()
        return _cheap!!
    }

private var _cheap: ImageVector? = null
