package me.localx.icons.rounded.bold

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

public val Icons.Bold.MapMarkerSlash: ImageVector
    get() {
        if (_mapMarkerSlash != null) {
            return _mapMarkerSlash!!
        }
        _mapMarkerSlash = Builder(name = "MapMarkerSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.319f, 21.281f)
                curveToRelative(0.394f, 0.729f, 0.123f, 1.639f, -0.605f, 2.033f)
                curveToRelative(-0.83f, 0.449f, -1.768f, 0.686f, -2.714f, 0.686f)
                curveToRelative(-1.506f, 0.0f, -2.928f, -0.583f, -4.003f, -1.64f)
                lineToRelative(-3.734f, -3.466f)
                curveTo(1.85f, 16.473f, 0.7f, 13.187f, 1.065f, 9.837f)
                curveToRelative(0.09f, -0.824f, 0.835f, -1.413f, 1.654f, -1.329f)
                curveToRelative(0.824f, 0.09f, 1.418f, 0.831f, 1.329f, 1.654f)
                curveToRelative(-0.267f, 2.443f, 0.571f, 4.839f, 2.297f, 6.574f)
                lineToRelative(3.723f, 3.455f)
                curveToRelative(0.884f, 0.866f, 2.202f, 1.035f, 3.218f, 0.484f)
                curveToRelative(0.729f, -0.394f, 1.639f, -0.124f, 2.033f, 0.605f)
                close()
                moveTo(23.56f, 23.561f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                curveTo(1.025f, -0.146f, 1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(2.247f, 2.247f)
                curveTo(6.805f, 0.949f, 9.33f, 0.0f, 12.0f, 0.0f)
                curveToRelative(2.939f, 0.0f, 5.703f, 1.15f, 7.78f, 3.238f)
                curveToRelative(4.085f, 4.104f, 4.276f, 10.661f, 0.573f, 14.994f)
                lineToRelative(3.207f, 3.207f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                close()
                moveTo(6.937f, 4.815f)
                lineToRelative(11.286f, 11.286f)
                curveToRelative(2.541f, -3.158f, 2.352f, -7.813f, -0.568f, -10.748f)
                curveToRelative(-1.511f, -1.518f, -3.519f, -2.354f, -5.654f, -2.354f)
                curveToRelative(-1.868f, 0.0f, -3.638f, 0.64f, -5.063f, 1.815f)
                close()
            }
        }
        .build()
        return _mapMarkerSlash!!
    }

private var _mapMarkerSlash: ImageVector? = null
