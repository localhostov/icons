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

public val Icons.Filled.UpFromBracket: ImageVector
    get() {
        if (_upFromBracket != null) {
            return _upFromBracket!!
        }
        _upFromBracket = Builder(name = "UpFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 24.0f)
                lineTo(4.5f, 24.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(16.974f, 15.012f)
                lineToRelative(0.022f, -2.038f)
                horizontalLineToRelative(2.074f)
                curveToRelative(1.227f, -0.006f, 2.277f, -0.714f, 2.744f, -1.849f)
                reflectiveCurveToRelative(0.217f, -2.377f, -0.629f, -3.222f)
                lineTo(14.839f, 1.158f)
                curveToRelative(-0.007f, -0.008f, -0.015f, -0.015f, -0.021f, -0.022f)
                curveToRelative(-1.548f, -1.547f, -4.068f, -1.545f, -5.641f, 0.027f)
                lineTo(2.896f, 7.908f)
                curveToRelative(-0.869f, 0.868f, -1.118f, 2.111f, -0.651f, 3.246f)
                curveToRelative(0.467f, 1.134f, 1.519f, 1.841f, 2.75f, 1.846f)
                horizontalLineToRelative(2.054f)
                lineToRelative(-0.005f, 2.0f)
                curveToRelative(0.0f, 2.191f, 1.783f, 3.974f, 3.974f, 3.974f)
                horizontalLineToRelative(1.982f)
                curveToRelative(2.191f, 0.0f, 3.974f, -1.782f, 3.974f, -3.962f)
                close()
            }
        }
        .build()
        return _upFromBracket!!
    }

private var _upFromBracket: ImageVector? = null
