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

public val Icons.Filled.Subscript: ImageVector
    get() {
        if (_subscript != null) {
            return _subscript!!
        }
        _subscript = Builder(name = "Subscript", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-6.614f)
                lineToRelative(-0.78f, 0.809f)
                curveToRelative(-0.383f, 0.398f, -1.017f, 0.409f, -1.414f, 0.025f)
                reflectiveCurveToRelative(-0.409f, -1.017f, -0.025f, -1.414f)
                lineToRelative(2.413f, -2.5f)
                curveToRelative(0.188f, -0.195f, 0.448f, -0.306f, 0.72f, -0.306f)
                curveToRelative(0.552f, 0.0f, 1.087f, 0.447f, 1.087f, 1.0f)
                close()
                moveTo(14.63f, 0.224f)
                curveToRelative(-0.428f, -0.348f, -1.058f, -0.283f, -1.406f, 0.146f)
                lineToRelative(-5.724f, 7.045f)
                lineTo(1.776f, 0.369f)
                curveTo(1.428f, -0.061f, 0.797f, -0.124f, 0.37f, 0.224f)
                curveTo(-0.059f, 0.572f, -0.125f, 1.202f, 0.224f, 1.631f)
                lineToRelative(5.987f, 7.369f)
                lineTo(0.224f, 16.369f)
                curveToRelative(-0.349f, 0.429f, -0.283f, 1.059f, 0.146f, 1.407f)
                curveToRelative(0.185f, 0.15f, 0.408f, 0.224f, 0.63f, 0.224f)
                curveToRelative(0.291f, 0.0f, 0.579f, -0.126f, 0.776f, -0.369f)
                lineToRelative(5.724f, -7.045f)
                lineToRelative(5.724f, 7.045f)
                curveToRelative(0.197f, 0.243f, 0.486f, 0.369f, 0.776f, 0.369f)
                curveToRelative(0.222f, 0.0f, 0.445f, -0.073f, 0.63f, -0.224f)
                curveToRelative(0.429f, -0.349f, 0.494f, -0.979f, 0.146f, -1.407f)
                lineToRelative(-5.987f, -7.369f)
                lineTo(14.776f, 1.631f)
                curveToRelative(0.349f, -0.429f, 0.283f, -1.059f, -0.146f, -1.407f)
                close()
            }
        }
        .build()
        return _subscript!!
    }

private var _subscript: ImageVector? = null
