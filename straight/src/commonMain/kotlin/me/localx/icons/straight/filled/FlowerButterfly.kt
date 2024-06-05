package me.localx.icons.straight.filled

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

public val Icons.Filled.FlowerButterfly: ImageVector
    get() {
        if (_flowerButterfly != null) {
            return _flowerButterfly!!
        }
        _flowerButterfly = Builder(name = "FlowerButterfly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 18.0f)
                curveToRelative(-1.012f, 5.232f, -5.09f, 5.952f, -7.0f, 5.996f)
                verticalLineToRelative(0.004f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.004f)
                curveToRelative(-1.91f, -0.044f, -5.988f, -0.765f, -7.0f, -5.996f)
                curveToRelative(4.001f, 0.0f, 5.997f, 1.669f, 7.0f, 3.241f)
                verticalLineToRelative(-4.827f)
                curveToRelative(-1.721f, -0.447f, -3.0f, -2.0f, -3.0f, -3.858f)
                curveToRelative(0.0f, -2.094f, 1.652f, -4.064f, 2.26f, -4.719f)
                curveToRelative(0.264f, 1.404f, 0.74f, 3.164f, 2.74f, 5.164f)
                curveToRelative(-0.5f, -2.5f, -1.0f, -4.5f, -0.845f, -5.964f)
                curveToRelative(0.526f, 0.035f, 1.041f, 0.238f, 1.423f, 0.629f)
                curveToRelative(0.404f, 0.412f, 2.422f, 2.585f, 2.422f, 4.891f)
                curveToRelative(0.0f, 1.858f, -1.279f, 3.411f, -3.0f, 3.858f)
                verticalLineToRelative(4.827f)
                curveToRelative(1.003f, -1.572f, 2.999f, -3.241f, 7.0f, -3.241f)
                close()
                moveTo(21.319f, 5.25f)
                curveToRelative(0.273f, -0.359f, 0.681f, -1.019f, 0.681f, -1.788f)
                curveToRelative(0.0f, -1.402f, -1.846f, -3.462f, -1.846f, -3.462f)
                curveToRelative(0.0f, 0.0f, -3.154f, 1.538f, -3.154f, 3.5f)
                curveToRelative(0.0f, 0.788f, 0.436f, 2.034f, 1.0f, 2.5f)
                curveToRelative(-0.466f, -0.564f, -1.712f, -1.0f, -2.5f, -1.0f)
                curveToRelative(-1.962f, 0.0f, -3.5f, 3.154f, -3.5f, 3.154f)
                curveToRelative(0.0f, 0.0f, 2.06f, 1.846f, 3.462f, 1.846f)
                curveToRelative(0.77f, 0.0f, 1.43f, -0.407f, 1.788f, -0.681f)
                curveToRelative(0.0f, 2.681f, 2.75f, 2.681f, 2.75f, 2.681f)
                verticalLineToRelative(-2.308f)
                curveToRelative(0.0f, -0.923f, -0.712f, -2.336f, -1.0f, -2.692f)
                curveToRelative(0.357f, 0.288f, 1.769f, 1.0f, 2.692f, 1.0f)
                horizontalLineToRelative(2.308f)
                reflectiveCurveToRelative(0.0f, -2.75f, -2.681f, -2.75f)
                close()
                moveTo(14.5f, 4.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _flowerButterfly!!
    }

private var _flowerButterfly: ImageVector? = null
