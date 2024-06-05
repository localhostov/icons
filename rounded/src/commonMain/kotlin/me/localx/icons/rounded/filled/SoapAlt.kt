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

public val Icons.Filled.SoapAlt: ImageVector
    get() {
        if (_soapAlt != null) {
            return _soapAlt!!
        }
        _soapAlt = Builder(name = "SoapAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(21.0f, 7.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.791f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.791f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.791f, 4.0f, 4.0f)
                close()
                moveTo(24.0f, 16.5f)
                curveToRelative(0.0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
                lineTo(7.5f, 24.0f)
                curveTo(3.04f, 24.0f, -0.523f, 20.087f, 0.063f, 15.513f)
                curveToRelative(0.485f, -3.78f, 3.886f, -6.513f, 7.698f, -6.513f)
                horizontalLineToRelative(3.588f)
                curveToRelative(0.825f, 2.329f, 3.04f, 4.0f, 5.651f, 4.0f)
                curveToRelative(1.805f, 0.0f, 3.419f, -0.801f, 4.519f, -2.062f)
                curveToRelative(1.52f, 1.373f, 2.481f, 3.352f, 2.481f, 5.562f)
                close()
                moveTo(13.0f, 14.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.658f, 1.178f, 3.101f, 2.801f, 3.431f)
                curveToRelative(0.067f, 0.014f, 0.134f, 0.02f, 0.2f, 0.02f)
                curveToRelative(0.466f, 0.0f, 0.883f, -0.327f, 0.979f, -0.801f)
                curveToRelative(0.11f, -0.542f, -0.24f, -1.069f, -0.781f, -1.18f)
                curveToRelative(-0.694f, -0.141f, -1.199f, -0.759f, -1.199f, -1.47f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _soapAlt!!
    }

private var _soapAlt: ImageVector? = null
