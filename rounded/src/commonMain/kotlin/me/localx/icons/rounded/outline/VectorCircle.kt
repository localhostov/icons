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

public val Icons.Outline.VectorCircle: ImageVector
    get() {
        if (_vectorCircle != null) {
            return _vectorCircle!!
        }
        _vectorCircle = Builder(name = "VectorCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.065f, 9.002f)
                curveToRelative(-1.008f, -3.392f, -3.675f, -6.059f, -7.067f, -7.067f)
                curveToRelative(-0.035f, -1.073f, -0.917f, -1.935f, -1.998f, -1.935f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.081f, 0.0f, -1.964f, 0.862f, -1.998f, 1.935f)
                curveToRelative(-3.392f, 1.008f, -6.059f, 3.675f, -7.067f, 7.067f)
                curveToRelative(-1.073f, 0.035f, -1.935f, 0.917f, -1.935f, 1.998f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.081f, 0.862f, 1.964f, 1.935f, 1.998f)
                curveToRelative(1.008f, 3.392f, 3.675f, 6.059f, 7.067f, 7.067f)
                curveToRelative(0.035f, 1.073f, 0.917f, 1.935f, 1.998f, 1.935f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.081f, 0.0f, 1.964f, -0.862f, 1.998f, -1.935f)
                curveToRelative(3.392f, -1.008f, 6.059f, -3.675f, 7.067f, -7.067f)
                curveToRelative(1.073f, -0.035f, 1.935f, -0.917f, 1.935f, -1.998f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.081f, -0.862f, -1.964f, -1.935f, -1.998f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                reflectiveCurveToRelative(-2.0f, 0.0f, -2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                reflectiveCurveToRelative(0.0f, 2.0f, 0.0f, 2.0f)
                close()
                moveTo(11.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                reflectiveCurveToRelative(-2.0f, 0.0f, -2.0f, 0.0f)
                close()
                moveTo(19.956f, 14.999f)
                curveToRelative(-0.86f, 2.285f, -2.672f, 4.097f, -4.957f, 4.957f)
                curveToRelative(-0.023f, -1.083f, -0.911f, -1.956f, -1.999f, -1.956f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.088f, 0.0f, -1.976f, 0.873f, -1.999f, 1.956f)
                curveToRelative(-2.285f, -0.86f, -4.097f, -2.672f, -4.957f, -4.957f)
                curveToRelative(1.083f, -0.023f, 1.956f, -0.911f, 1.956f, -1.999f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.088f, -0.873f, -1.976f, -1.956f, -1.999f)
                curveToRelative(0.86f, -2.285f, 2.672f, -4.097f, 4.957f, -4.957f)
                curveToRelative(0.023f, 1.083f, 0.911f, 1.956f, 1.999f, 1.956f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.088f, 0.0f, 1.976f, -0.873f, 1.999f, -1.956f)
                curveToRelative(2.285f, 0.86f, 4.097f, 2.672f, 4.957f, 4.957f)
                curveToRelative(-1.083f, 0.023f, -1.956f, 0.911f, -1.956f, 1.999f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.088f, 0.873f, 1.976f, 1.956f, 1.999f)
                close()
                moveTo(22.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                reflectiveCurveToRelative(0.0f, 2.0f, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _vectorCircle!!
    }

private var _vectorCircle: ImageVector? = null
