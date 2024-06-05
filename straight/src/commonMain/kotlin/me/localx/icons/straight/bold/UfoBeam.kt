package me.localx.icons.straight.bold

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

public val Icons.Bold.UfoBeam: ImageVector
    get() {
        if (_ufoBeam != null) {
            return _ufoBeam!!
        }
        _ufoBeam = Builder(name = "UfoBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.158f, 15.203f)
                lineToRelative(3.556f, 8.797f)
                horizontalLineToRelative(-3.236f)
                lineToRelative(-3.334f, -8.249f)
                curveToRelative(1.043f, -0.128f, 2.056f, -0.308f, 3.014f, -0.548f)
                close()
                moveTo(1.286f, 24.0f)
                horizontalLineToRelative(3.236f)
                lineToRelative(3.334f, -8.249f)
                curveToRelative(-1.043f, -0.128f, -2.056f, -0.308f, -3.014f, -0.548f)
                lineToRelative(-3.556f, 8.797f)
                close()
                moveTo(24.0f, 9.0f)
                curveToRelative(0.0f, 3.454f, -6.027f, 5.0f, -12.0f, 5.0f)
                reflectiveCurveTo(0.0f, 12.454f, 0.0f, 9.0f)
                curveToRelative(0.0f, -2.073f, 2.182f, -3.634f, 6.177f, -4.448f)
                curveTo(6.827f, 1.941f, 9.191f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(5.173f, 1.941f, 5.823f, 4.552f)
                curveToRelative(3.995f, 0.814f, 6.177f, 2.376f, 6.177f, 4.448f)
                close()
                moveTo(9.024f, 5.615f)
                curveToRelative(0.519f, 0.177f, 1.451f, 0.385f, 2.976f, 0.385f)
                reflectiveCurveToRelative(2.457f, -0.208f, 2.976f, -0.385f)
                curveToRelative(-0.189f, -1.473f, -1.452f, -2.615f, -2.976f, -2.615f)
                reflectiveCurveToRelative(-2.786f, 1.143f, -2.976f, 2.615f)
                close()
                moveTo(20.955f, 9.001f)
                curveToRelative(-0.277f, -0.332f, -1.332f, -0.967f, -3.399f, -1.436f)
                curveToRelative(-0.345f, 0.343f, -1.748f, 1.435f, -5.556f, 1.435f)
                reflectiveCurveToRelative(-5.211f, -1.092f, -5.556f, -1.435f)
                curveToRelative(-2.067f, 0.469f, -3.122f, 1.104f, -3.399f, 1.436f)
                curveToRelative(0.521f, 0.645f, 3.574f, 1.999f, 8.955f, 1.999f)
                reflectiveCurveToRelative(8.434f, -1.354f, 8.955f, -1.999f)
                close()
            }
        }
        .build()
        return _ufoBeam!!
    }

private var _ufoBeam: ImageVector? = null
