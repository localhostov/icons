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

public val Icons.Outline.Superscript: ImageVector
    get() {
        if (_superscript != null) {
            return _superscript!!
        }
        _superscript = Builder(name = "Superscript", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 1.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(22.0f, 3.386f)
                lineToRelative(-0.78f, 0.809f)
                curveToRelative(-0.383f, 0.397f, -1.017f, 0.409f, -1.414f, 0.025f)
                curveToRelative(-0.397f, -0.384f, -0.409f, -1.017f, -0.025f, -1.414f)
                lineToRelative(2.413f, -2.5f)
                curveToRelative(0.188f, -0.195f, 0.448f, -0.306f, 0.72f, -0.306f)
                curveToRelative(0.552f, 0.0f, 1.087f, 0.447f, 1.087f, 1.0f)
                close()
                moveTo(14.63f, 6.224f)
                curveToRelative(-0.427f, -0.347f, -1.058f, -0.283f, -1.406f, 0.146f)
                lineToRelative(-5.724f, 7.045f)
                lineTo(1.776f, 6.369f)
                curveToRelative(-0.348f, -0.429f, -0.978f, -0.492f, -1.406f, -0.146f)
                curveToRelative(-0.429f, 0.349f, -0.494f, 0.979f, -0.146f, 1.407f)
                lineToRelative(5.987f, 7.369f)
                lineTo(0.224f, 22.369f)
                curveToRelative(-0.349f, 0.429f, -0.283f, 1.059f, 0.146f, 1.407f)
                curveToRelative(0.185f, 0.15f, 0.408f, 0.224f, 0.63f, 0.224f)
                curveToRelative(0.291f, 0.0f, 0.579f, -0.126f, 0.776f, -0.369f)
                lineToRelative(5.724f, -7.045f)
                lineToRelative(5.724f, 7.045f)
                curveToRelative(0.197f, 0.243f, 0.486f, 0.369f, 0.776f, 0.369f)
                curveToRelative(0.222f, 0.0f, 0.445f, -0.073f, 0.63f, -0.224f)
                curveToRelative(0.429f, -0.349f, 0.494f, -0.979f, 0.146f, -1.407f)
                lineToRelative(-5.987f, -7.369f)
                lineToRelative(5.987f, -7.369f)
                curveToRelative(0.349f, -0.429f, 0.283f, -1.059f, -0.146f, -1.407f)
                close()
            }
        }
        .build()
        return _superscript!!
    }

private var _superscript: ImageVector? = null
