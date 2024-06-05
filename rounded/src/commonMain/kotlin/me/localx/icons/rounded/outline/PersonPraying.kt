package me.localx.icons.rounded.outline

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

public val Icons.Outline.PersonPraying: ImageVector
    get() {
        if (_personPraying != null) {
            return _personPraying!!
        }
        _personPraying = Builder(name = "PersonPraying", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 2.468f)
                curveTo(13.0f, 1.087f, 14.119f, -0.032f, 15.5f, -0.032f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(21.748f, 8.336f)
                curveToRelative(-0.366f, -0.414f, -1.0f, -0.451f, -1.411f, -0.084f)
                lineToRelative(-3.062f, 2.714f)
                lineToRelative(-1.918f, -2.685f)
                curveToRelative(-0.486f, -0.937f, -1.295f, -1.652f, -2.223f, -1.992f)
                curveToRelative(-0.672f, -0.306f, -1.39f, -0.369f, -2.074f, -0.184f)
                curveToRelative(-0.873f, 0.235f, -1.601f, 0.835f, -2.019f, 1.69f)
                lineToRelative(-2.649f, 6.169f)
                curveToRelative(-0.734f, 1.497f, -0.401f, 2.787f, 1.057f, 3.974f)
                lineToRelative(5.51f, 4.062f)
                horizontalLineToRelative(-7.976f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.525f)
                curveToRelative(0.645f, 0.0f, 1.214f, -0.412f, 1.415f, -1.024f)
                curveToRelative(0.202f, -0.613f, -0.011f, -1.282f, -0.53f, -1.666f)
                lineToRelative(-6.719f, -4.952f)
                curveToRelative(-0.835f, -0.681f, -0.729f, -1.019f, -0.465f, -1.559f)
                lineToRelative(2.649f, -6.169f)
                curveToRelative(0.144f, -0.292f, 0.407f, -0.509f, 0.724f, -0.595f)
                curveToRelative(0.238f, -0.065f, 0.47f, -0.042f, 0.792f, 0.102f)
                curveToRelative(0.405f, 0.15f, 0.752f, 0.409f, 1.007f, 0.747f)
                lineToRelative(-2.404f, 5.729f)
                curveToRelative(-0.214f, 0.509f, 0.026f, 1.095f, 0.535f, 1.309f)
                curveToRelative(0.126f, 0.053f, 0.257f, 0.079f, 0.386f, 0.079f)
                curveToRelative(0.391f, 0.0f, 0.762f, -0.23f, 0.922f, -0.614f)
                lineToRelative(1.907f, -4.546f)
                lineToRelative(0.955f, 1.337f)
                curveToRelative(0.612f, 0.863f, 1.781f, 1.083f, 2.66f, 0.5f)
                curveToRelative(0.04f, -0.026f, 3.319f, -2.93f, 3.319f, -2.93f)
                curveToRelative(0.413f, -0.366f, 0.451f, -0.998f, 0.085f, -1.412f)
                close()
            }
        }
        .build()
        return _personPraying!!
    }

private var _personPraying: ImageVector? = null
