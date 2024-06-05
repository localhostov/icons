package me.localx.icons.straight.outline

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

public val Icons.Outline.PaperPlaneTop: ImageVector
    get() {
        if (_paperPlaneTop != null) {
            return _paperPlaneTop!!
        }
        _paperPlaneTop = Builder(name = "PaperPlaneTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.034f, 0.282f)
                curveTo(2.981f, -0.22f, 1.748f, -0.037f, 0.893f, 0.749f)
                curveTo(0.054f, 1.521f, -0.22f, 2.657f, 0.18f, 3.717f)
                lineToRelative(4.528f, 8.288f)
                lineTo(0.264f, 20.288f)
                curveToRelative(-0.396f, 1.061f, -0.121f, 2.196f, 0.719f, 2.966f)
                curveToRelative(0.524f, 0.479f, 1.19f, 0.734f, 1.887f, 0.734f)
                curveToRelative(0.441f, 0.0f, 0.895f, -0.102f, 1.332f, -0.312f)
                lineToRelative(19.769f, -11.678f)
                lineTo(4.034f, 0.282f)
                close()
                moveTo(2.032f, 2.958f)
                curveToRelative(-0.114f, -0.381f, 0.108f, -0.64f, 0.214f, -0.736f)
                curveToRelative(0.095f, -0.087f, 0.433f, -0.348f, 0.895f, -0.149f)
                lineToRelative(15.185f, 8.928f)
                lineTo(6.438f, 11.001f)
                lineTo(2.032f, 2.958f)
                close()
                moveTo(3.261f, 21.912f)
                curveToRelative(-0.472f, 0.228f, -0.829f, -0.044f, -0.928f, -0.134f)
                curveToRelative(-0.105f, -0.097f, -0.329f, -0.355f, -0.214f, -0.737f)
                lineToRelative(4.324f, -8.041f)
                horizontalLineToRelative(11.898f)
                lineTo(3.261f, 21.912f)
                close()
            }
        }
        .build()
        return _paperPlaneTop!!
    }

private var _paperPlaneTop: ImageVector? = null
