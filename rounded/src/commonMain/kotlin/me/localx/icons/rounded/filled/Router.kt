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

public val Icons.Filled.Router: ImageVector
    get() {
        if (_router != null) {
            return _router!!
        }
        _router = Builder(name = "Router", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 15.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(4.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.0f, 5.0f)
                curveToRelative(1.817f, 0.0f, 3.526f, 0.708f, 4.812f, 1.993f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.024f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.907f, -0.908f, -2.114f, -1.407f, -3.397f, -1.407f)
                reflectiveCurveToRelative(-2.49f, 0.5f, -3.397f, 1.407f)
                curveToRelative(-0.39f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                curveToRelative(-0.391f, -0.39f, -0.391f, -1.023f, 0.0f, -1.414f)
                curveToRelative(1.285f, -1.285f, 2.994f, -1.993f, 4.811f, -1.993f)
                close()
                moveTo(6.222f, 3.818f)
                curveTo(8.485f, 1.392f, 11.684f, 0.0f, 15.0f, 0.0f)
                reflectiveCurveToRelative(6.516f, 1.392f, 8.778f, 3.818f)
                curveToRelative(0.377f, 0.404f, 0.354f, 1.037f, -0.05f, 1.414f)
                curveToRelative(-0.192f, 0.18f, -0.438f, 0.269f, -0.682f, 0.269f)
                curveToRelative(-0.268f, 0.0f, -0.534f, -0.107f, -0.731f, -0.318f)
                curveToRelative(-1.886f, -2.022f, -4.552f, -3.182f, -7.315f, -3.182f)
                reflectiveCurveToRelative(-5.43f, 1.16f, -7.315f, 3.182f)
                curveToRelative(-0.378f, 0.404f, -1.01f, 0.425f, -1.414f, 0.049f)
                curveToRelative(-0.404f, -0.377f, -0.426f, -1.01f, -0.049f, -1.414f)
                close()
            }
        }
        .build()
        return _router!!
    }

private var _router: ImageVector? = null
