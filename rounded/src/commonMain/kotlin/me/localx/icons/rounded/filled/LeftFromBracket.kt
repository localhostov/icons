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

public val Icons.Filled.LeftFromBracket: ImageVector
    get() {
        if (_leftFromBracket != null) {
            return _leftFromBracket!!
        }
        _leftFromBracket = Builder(name = "LeftFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 24.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(22.0f, 4.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(11.154f, 21.755f)
                curveToRelative(1.135f, -0.467f, 1.842f, -1.52f, 1.846f, -2.75f)
                verticalLineToRelative(-2.054f)
                lineToRelative(2.0f, 0.005f)
                curveToRelative(2.191f, 0.0f, 3.974f, -1.783f, 3.974f, -3.974f)
                verticalLineToRelative(-1.982f)
                curveToRelative(0.0f, -2.191f, -1.782f, -3.974f, -3.962f, -3.974f)
                lineToRelative(-2.038f, -0.023f)
                verticalLineToRelative(-2.073f)
                curveToRelative(-0.005f, -1.227f, -0.714f, -2.278f, -1.848f, -2.744f)
                curveToRelative(-1.133f, -0.467f, -2.376f, -0.218f, -3.223f, 0.629f)
                lineTo(1.158f, 9.162f)
                curveToRelative(-0.007f, 0.007f, -0.015f, 0.014f, -0.021f, 0.021f)
                curveToRelative(-1.547f, 1.548f, -1.547f, 4.067f, 0.026f, 5.641f)
                lineToRelative(6.745f, 6.281f)
                curveToRelative(0.578f, 0.579f, 1.323f, 0.883f, 2.093f, 0.883f)
                curveToRelative(0.385f, 0.0f, 0.775f, -0.076f, 1.153f, -0.232f)
                close()
            }
        }
        .build()
        return _leftFromBracket!!
    }

private var _leftFromBracket: ImageVector? = null
