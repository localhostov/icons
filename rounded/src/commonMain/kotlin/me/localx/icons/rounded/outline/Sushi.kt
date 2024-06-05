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

public val Icons.Outline.Sushi: ImageVector
    get() {
        if (_sushi != null) {
            return _sushi!!
        }
        _sushi = Builder(name = "Sushi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 11.0f)
                curveToRelative(0.067f, 1.293f, 7.938f, 1.291f, 8.0f, 0.0f)
                curveTo(12.433f, 9.707f, 4.562f, 9.709f, 4.5f, 11.0f)
                close()
                moveTo(11.5f, 5.0f)
                curveToRelative(0.067f, 1.293f, 7.938f, 1.291f, 8.0f, 0.0f)
                curveTo(19.433f, 3.707f, 11.562f, 3.709f, 11.5f, 5.0f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.492f, -2.948f, 4.516f, -7.0f, 4.922f)
                curveTo(18.238f, 25.678f, 0.277f, 25.9f, 0.0f, 19.0f)
                lineTo(0.0f, 11.0f)
                curveTo(0.0f, 8.5f, 2.974f, 6.486f, 7.0f, 6.079f)
                curveTo(5.76f, -1.679f, 23.723f, -1.9f, 24.0f, 5.0f)
                close()
                moveTo(9.0f, 5.0f)
                arcToRelative(1.587f, 1.587f, 0.0f, false, false, 0.461f, 1.032f)
                arcTo(10.661f, 10.661f, 0.0f, false, true, 15.329f, 8.0f)
                curveToRelative(3.742f, 0.088f, 6.726f, -1.558f, 6.671f, -3.0f)
                curveTo(21.577f, 1.057f, 9.419f, 1.06f, 9.0f, 5.0f)
                close()
                moveTo(2.0f, 11.0f)
                curveToRelative(0.424f, 3.944f, 12.581f, 3.939f, 13.0f, 0.0f)
                curveTo(14.576f, 7.056f, 2.419f, 7.061f, 2.0f, 11.0f)
                close()
                moveTo(15.0f, 19.0f)
                lineTo(15.0f, 14.251f)
                curveToRelative(-2.963f, 2.292f, -10.037f, 2.292f, -13.0f, 0.0f)
                lineTo(2.0f, 19.0f)
                curveTo(2.422f, 22.943f, 14.582f, 22.939f, 15.0f, 19.0f)
                close()
                moveTo(22.0f, 13.0f)
                lineTo(22.0f, 8.251f)
                arcToRelative(10.868f, 10.868f, 0.0f, false, true, -5.188f, 1.686f)
                curveToRelative(0.357f, 0.663f, 0.127f, 5.183f, 0.188f, 5.974f)
                curveTo(20.029f, 15.561f, 22.0f, 14.209f, 22.0f, 13.0f)
                close()
            }
        }
        .build()
        return _sushi!!
    }

private var _sushi: ImageVector? = null
