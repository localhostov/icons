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

public val Icons.Filled.Ufo: ImageVector
    get() {
        if (_ufo != null) {
            return _ufo!!
        }
        _ufo = Builder(name = "Ufo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.878f, 9.721f)
                curveToRelative(-0.943f, 1.203f, -3.484f, 2.279f, -6.878f, 2.279f)
                reflectiveCurveToRelative(-5.935f, -1.064f, -6.878f, -2.267f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.012f, -0.004f, -0.012f, -0.008f, 0.0f, -0.012f)
                curveToRelative(0.603f, -3.25f, 3.455f, -5.721f, 6.878f, -5.721f)
                reflectiveCurveToRelative(6.274f, 2.471f, 6.878f, 5.721f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(20.808f, 10.467f)
                curveToRelative(-1.236f, 2.075f, -4.66f, 3.533f, -8.807f, 3.533f)
                reflectiveCurveToRelative(-7.571f, -1.458f, -8.807f, -3.533f)
                curveToRelative(-2.567f, 1.219f, -3.193f, 2.682f, -3.193f, 3.805f)
                curveToRelative(0.0f, 3.266f, 5.159f, 5.728f, 12.0f, 5.728f)
                reflectiveCurveToRelative(12.0f, -2.462f, 12.0f, -5.728f)
                curveToRelative(0.0f, -1.123f, -0.626f, -2.586f, -3.193f, -3.805f)
                close()
                moveTo(4.501f, 17.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12.001f, 18.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(19.501f, 17.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _ufo!!
    }

private var _ufo: ImageVector? = null
