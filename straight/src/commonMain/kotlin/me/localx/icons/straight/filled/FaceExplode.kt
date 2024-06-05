package me.localx.icons.straight.filled

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

public val Icons.Filled.FaceExplode: ImageVector
    get() {
        if (_faceExplode != null) {
            return _faceExplode!!
        }
        _faceExplode = Builder(name = "FaceExplode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                curveToRelative(0.0f, 1.826f, -1.537f, 1.992f, -2.0f, 2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.041f, -0.037f, 0.274f, 0.253f, 0.33f, 0.235f)
                curveToRelative(0.911f, 0.732f, 2.088f, 0.955f, 3.244f, 0.599f)
                curveToRelative(1.037f, -0.32f, 1.896f, -1.145f, 2.237f, -2.175f)
                curveToRelative(0.381f, -1.152f, 0.178f, -2.37f, -0.541f, -3.299f)
                curveToRelative(-0.827f, -1.068f, -2.217f, -1.583f, -3.538f, -1.271f)
                curveTo(15.487f, -0.081f, 13.484f, -0.323f, 12.0f, 0.546f)
                curveToRelative(-1.483f, -0.868f, -3.486f, -0.626f, -4.731f, 0.542f)
                curveToRelative(-0.655f, -0.152f, -1.33f, -0.11f, -1.987f, 0.135f)
                curveToRelative(-1.108f, 0.411f, -1.95f, 1.37f, -2.197f, 2.502f)
                curveToRelative(-0.23f, 1.058f, 0.021f, 2.141f, 0.689f, 2.97f)
                curveToRelative(0.668f, 0.83f, 1.662f, 1.306f, 2.727f, 1.306f)
                curveToRelative(0.572f, 0.0f, 1.389f, -0.138f, 2.202f, -0.76f)
                curveToRelative(0.044f, 0.015f, 0.298f, -0.24f, 0.298f, -0.24f)
                curveToRelative(0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.007f, 11.001f)
                curveToRelative(-0.471f, -0.008f, -2.007f, -0.174f, -2.007f, -2.0f)
                lineTo(0.0f, 9.001f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 14.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(9.0f, 20.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(15.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _faceExplode!!
    }

private var _faceExplode: ImageVector? = null
