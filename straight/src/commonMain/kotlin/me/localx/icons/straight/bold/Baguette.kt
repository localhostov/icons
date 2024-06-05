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

public val Icons.Bold.Baguette: ImageVector
    get() {
        if (_baguette != null) {
            return _baguette!!
        }
        _baguette = Builder(name = "Baguette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.921f, 1.08f)
                curveToRelative(-1.301f, -1.301f, -3.572f, -1.431f, -6.391f, -0.368f)
                curveToRelative(-2.422f, 0.913f, -5.007f, 2.633f, -7.093f, 4.719f)
                lineToRelative(-4.006f, 4.007f)
                curveToRelative(-2.086f, 2.085f, -3.806f, 4.67f, -4.719f, 7.092f)
                curveToRelative(-1.063f, 2.821f, -0.933f, 5.091f, 0.367f, 6.391f)
                curveToRelative(0.719f, 0.719f, 1.734f, 1.08f, 2.974f, 1.08f)
                curveToRelative(1.004f, 0.0f, 2.156f, -0.236f, 3.417f, -0.712f)
                curveToRelative(2.422f, -0.913f, 5.007f, -2.633f, 7.093f, -4.719f)
                lineToRelative(4.006f, -4.007f)
                curveToRelative(2.086f, -2.085f, 3.806f, -4.67f, 4.719f, -7.092f)
                curveToRelative(1.063f, -2.821f, 0.933f, -5.091f, -0.367f, -6.391f)
                close()
                moveTo(20.481f, 6.412f)
                curveToRelative(-0.768f, 2.037f, -2.238f, 4.234f, -4.033f, 6.029f)
                lineToRelative(-4.006f, 4.007f)
                curveToRelative(-1.795f, 1.795f, -3.993f, 3.265f, -6.03f, 4.032f)
                curveToRelative(-1.868f, 0.706f, -2.961f, 0.567f, -3.211f, 0.318f)
                curveToRelative(-0.25f, -0.251f, -0.385f, -1.344f, 0.319f, -3.211f)
                curveToRelative(0.333f, -0.883f, 0.798f, -1.796f, 1.363f, -2.693f)
                lineToRelative(2.111f, 2.111f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.415f, -2.415f)
                curveToRelative(0.275f, -0.313f, 0.559f, -0.617f, 0.853f, -0.911f)
                lineToRelative(0.943f, -0.943f)
                lineToRelative(2.445f, 2.445f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.445f, -2.445f)
                lineToRelative(0.943f, -0.943f)
                curveToRelative(0.312f, -0.312f, 0.636f, -0.613f, 0.969f, -0.904f)
                lineToRelative(2.412f, 2.412f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.099f, -2.099f)
                curveToRelative(0.876f, -0.547f, 1.765f, -0.997f, 2.626f, -1.321f)
                curveToRelative(1.026f, -0.388f, 1.819f, -0.521f, 2.366f, -0.521f)
                curveToRelative(0.448f, 0.0f, 0.732f, 0.09f, 0.845f, 0.202f)
                curveToRelative(0.25f, 0.251f, 0.385f, 1.344f, -0.319f, 3.211f)
                close()
            }
        }
        .build()
        return _baguette!!
    }

private var _baguette: ImageVector? = null
