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

public val Icons.Outline.Ufo: ImageVector
    get() {
        if (_ufo != null) {
            return _ufo!!
        }
        _ufo = Builder(name = "Ufo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.995f, 9.755f)
                curveToRelative(-0.13f, -3.746f, -3.217f, -6.755f, -6.995f, -6.755f)
                reflectiveCurveToRelative(-6.865f, 3.009f, -6.995f, 6.755f)
                curveTo(0.892f, 11.074f, 0.0f, 12.921f, 0.0f, 14.272f)
                curveToRelative(0.0f, 3.266f, 5.159f, 5.728f, 12.0f, 5.728f)
                reflectiveCurveToRelative(12.0f, -2.462f, 12.0f, -5.728f)
                curveToRelative(0.0f, -1.352f, -0.892f, -3.198f, -5.005f, -4.518f)
                close()
                moveTo(7.0f, 10.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(0.134f)
                curveToRelative(-0.586f, 0.308f, -2.055f, 0.866f, -5.0f, 0.866f)
                curveToRelative(-2.962f, 0.0f, -4.431f, -0.564f, -5.0f, -0.861f)
                verticalLineToRelative(-0.139f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-5.724f, 0.0f, -10.0f, -1.968f, -10.0f, -3.728f)
                curveToRelative(0.0f, -0.928f, 1.349f, -1.891f, 3.643f, -2.622f)
                curveToRelative(0.703f, 0.472f, 2.526f, 1.35f, 6.357f, 1.35f)
                reflectiveCurveToRelative(5.654f, -0.878f, 6.357f, -1.35f)
                curveToRelative(2.294f, 0.731f, 3.643f, 1.694f, 3.643f, 2.622f)
                curveToRelative(0.0f, 1.76f, -4.276f, 3.728f, -10.0f, 3.728f)
                close()
                moveTo(13.5f, 15.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.0f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(19.0f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _ufo!!
    }

private var _ufo: ImageVector? = null
