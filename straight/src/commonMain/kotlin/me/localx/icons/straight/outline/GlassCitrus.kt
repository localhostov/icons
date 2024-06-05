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

public val Icons.Outline.GlassCitrus: ImageVector
    get() {
        if (_glassCitrus != null) {
            return _glassCitrus!!
        }
        _glassCitrus = Builder(name = "GlassCitrus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.499f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.499f, -6.5f, -6.499f)
                curveToRelative(-3.067f, 0.0f, -5.638f, 2.138f, -6.318f, 5.0f)
                lineTo(-0.011f, 5.0f)
                lineToRelative(2.238f, 16.406f)
                curveToRelative(0.202f, 1.479f, 1.479f, 2.594f, 2.972f, 2.594f)
                horizontalLineToRelative(10.076f)
                curveToRelative(1.491f, 0.0f, 2.769f, -1.114f, 2.972f, -2.592f)
                lineToRelative(2.254f, -16.408f)
                horizontalLineToRelative(-7.226f)
                curveToRelative(0.621f, -1.742f, 2.271f, -3.0f, 4.224f, -3.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.214f, 0.046f, 1.868f, -0.082f, 2.495f)
                lineToRelative(-0.342f, 2.561f)
                curveToRelative(1.476f, -1.193f, 2.424f, -3.015f, 2.424f, -5.056f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(16.266f, 21.136f)
                curveToRelative(-0.068f, 0.493f, -0.494f, 0.864f, -0.991f, 0.864f)
                lineTo(5.2f, 22.0f)
                curveToRelative(-0.498f, 0.0f, -0.923f, -0.372f, -0.991f, -0.865f)
                lineToRelative(-1.11f, -8.135f)
                horizontalLineToRelative(8.935f)
                curveToRelative(-0.677f, -0.57f, -1.259f, -1.247f, -1.732f, -2.0f)
                lineTo(2.826f, 11.0f)
                lineToRelative(-0.546f, -4.0f)
                horizontalLineToRelative(8.745f)
                curveToRelative(0.254f, 3.312f, 2.997f, 5.935f, 6.359f, 5.994f)
                lineToRelative(-1.118f, 8.142f)
                close()
                moveTo(17.658f, 11.0f)
                horizontalLineToRelative(-0.159f)
                curveToRelative(-2.31f, 0.0f, -4.197f, -1.756f, -4.449f, -4.0f)
                horizontalLineToRelative(5.157f)
                lineToRelative(-0.549f, 4.0f)
                close()
            }
        }
        .build()
        return _glassCitrus!!
    }

private var _glassCitrus: ImageVector? = null
