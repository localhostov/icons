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

public val Icons.Bold.Circle7: ImageVector
    get() {
        if (_circle7 != null) {
            return _circle7!!
        }
        _circle7 = Builder(name = "Circle7", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.038f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveTo(16.962f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(10.499f, 18.5f)
                curveToRelative(-0.219f, 0.0f, -0.441f, -0.048f, -0.652f, -0.149f)
                curveToRelative(-0.746f, -0.36f, -1.058f, -1.258f, -0.698f, -2.004f)
                lineToRelative(3.552f, -7.347f)
                horizontalLineToRelative(-3.202f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.999f)
                curveToRelative(0.873f, 0.0f, 1.668f, 0.443f, 2.127f, 1.186f)
                curveToRelative(0.458f, 0.742f, 0.5f, 1.651f, 0.109f, 2.433f)
                lineToRelative(-3.884f, 8.035f)
                curveToRelative(-0.259f, 0.535f, -0.794f, 0.847f, -1.352f, 0.847f)
                close()
            }
        }
        .build()
        return _circle7!!
    }

private var _circle7: ImageVector? = null
