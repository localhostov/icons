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

public val Icons.Bold.WrenchSimple: ImageVector
    get() {
        if (_wrenchSimple != null) {
            return _wrenchSimple!!
        }
        _wrenchSimple = Builder(name = "WrenchSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 24.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.662f)
                curveToRelative(0.0f, -1.563f, 0.814f, -3.026f, 2.126f, -3.816f)
                curveToRelative(2.426f, -1.464f, 3.874f, -4.025f, 3.874f, -6.853f)
                curveToRelative(0.0f, -2.445f, -1.136f, -4.738f, -3.0f, -6.239f)
                verticalLineToRelative(3.872f)
                curveToRelative(0.0f, 2.771f, -2.079f, 5.052f, -4.732f, 5.191f)
                curveToRelative(-1.393f, 0.079f, -2.705f, -0.413f, -3.709f, -1.366f)
                curveToRelative(-0.99f, -0.94f, -1.559f, -2.262f, -1.559f, -3.627f)
                verticalLineTo(3.93f)
                curveToRelative(-1.864f, 1.501f, -3.0f, 3.794f, -3.0f, 6.239f)
                curveToRelative(0.0f, 2.827f, 1.448f, 5.389f, 3.875f, 6.853f)
                curveToRelative(1.311f, 0.79f, 2.125f, 2.253f, 2.125f, 3.816f)
                verticalLineToRelative(1.662f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.662f)
                curveToRelative(0.0f, -0.519f, -0.259f, -0.997f, -0.675f, -1.248f)
                curveTo(2.99f, 17.578f, 1.0f, 14.056f, 1.0f, 10.169f)
                curveTo(1.0f, 5.933f, 3.479f, 2.026f, 7.315f, 0.219f)
                curveToRelative(0.586f, -0.275f, 1.259f, -0.232f, 1.804f, 0.114f)
                curveToRelative(0.552f, 0.351f, 0.881f, 0.948f, 0.881f, 1.6f)
                verticalLineToRelative(6.067f)
                curveToRelative(0.0f, 0.554f, 0.222f, 1.069f, 0.624f, 1.451f)
                curveToRelative(0.401f, 0.382f, 0.923f, 0.58f, 1.486f, 0.546f)
                curveToRelative(1.042f, -0.055f, 1.89f, -1.04f, 1.89f, -2.195f)
                verticalLineTo(1.933f)
                curveToRelative(0.0f, -0.651f, 0.329f, -1.249f, 0.881f, -1.6f)
                curveToRelative(0.545f, -0.347f, 1.219f, -0.389f, 1.804f, -0.115f)
                curveToRelative(3.837f, 1.809f, 6.315f, 5.715f, 6.315f, 9.951f)
                curveToRelative(0.0f, 3.887f, -1.99f, 7.409f, -5.324f, 9.421f)
                curveToRelative(-0.417f, 0.251f, -0.676f, 0.729f, -0.676f, 1.248f)
                verticalLineToRelative(1.662f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _wrenchSimple!!
    }

private var _wrenchSimple: ImageVector? = null
