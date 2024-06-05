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

public val Icons.Outline.GlassHalf: ImageVector
    get() {
        if (_glassHalf != null) {
            return _glassHalf!!
        }
        _glassHalf = Builder(name = "GlassHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.212f, 0.973f)
                curveToRelative(-0.566f, -0.618f, -1.373f, -0.973f, -2.212f, -0.973f)
                lineTo(4.0f, 0.0f)
                curveToRelative(-0.836f, 0.0f, -1.64f, 0.353f, -2.206f, 0.967f)
                reflectiveCurveToRelative(-0.853f, 1.445f, -0.784f, 2.279f)
                lineToRelative(1.329f, 16.164f)
                curveToRelative(0.213f, 2.574f, 2.401f, 4.59f, 4.983f, 4.59f)
                horizontalLineToRelative(9.264f)
                curveToRelative(2.61f, 0.0f, 4.752f, -1.961f, 4.98f, -4.562f)
                lineToRelative(1.422f, -16.175f)
                curveToRelative(0.073f, -0.836f, -0.21f, -1.671f, -0.776f, -2.29f)
                close()
                moveTo(3.265f, 2.322f)
                curveToRelative(0.191f, -0.208f, 0.453f, -0.322f, 0.735f, -0.322f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.284f, 0.0f, 0.546f, 0.115f, 0.737f, 0.324f)
                curveToRelative(0.191f, 0.209f, 0.283f, 0.48f, 0.259f, 0.764f)
                lineToRelative(-0.696f, 7.912f)
                lineTo(3.655f, 11.0f)
                lineToRelative(-0.651f, -7.918f)
                curveToRelative(-0.023f, -0.282f, 0.069f, -0.552f, 0.261f, -0.76f)
                close()
                moveTo(16.586f, 22.0f)
                lineTo(7.322f, 22.0f)
                curveToRelative(-1.549f, 0.0f, -2.862f, -1.21f, -2.989f, -2.754f)
                lineToRelative(-0.514f, -6.246f)
                horizontalLineToRelative(16.305f)
                lineToRelative(-0.551f, 6.263f)
                curveToRelative(-0.138f, 1.561f, -1.422f, 2.737f, -2.988f, 2.737f)
                close()
            }
        }
        .build()
        return _glassHalf!!
    }

private var _glassHalf: ImageVector? = null
