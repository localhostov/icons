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

public val Icons.Outline.YinYang: ImageVector
    get() {
        if (_yinYang != null) {
            return _yinYang!!
        }
        _yinYang = Builder(name = "YinYang", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(12.5f, 16.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.62f, -5.38f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.62f, 0.0f, 12.0f)
                reflectiveCurveTo(5.38f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.38f, 12.0f, 12.0f)
                close()
                moveTo(6.73f, 20.5f)
                curveToRelative(-0.47f, -0.9f, -0.73f, -1.92f, -0.73f, -3.0f)
                curveToRelative(0.0f, -3.34f, 2.6f, -6.2f, 5.91f, -6.5f)
                curveToRelative(2.29f, -0.21f, 4.09f, -2.18f, 4.09f, -4.5f)
                reflectiveCurveToRelative(-1.91f, -4.39f, -4.3f, -4.5f)
                curveTo(6.33f, 2.16f, 2.0f, 6.59f, 2.0f, 12.0f)
                curveToRelative(0.0f, 3.58f, 1.89f, 6.73f, 4.73f, 8.5f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -3.58f, -1.89f, -6.73f, -4.73f, -8.5f)
                curveToRelative(0.47f, 0.9f, 0.73f, 1.92f, 0.73f, 3.0f)
                curveToRelative(0.0f, 3.34f, -2.6f, 6.2f, -5.91f, 6.5f)
                curveToRelative(-2.29f, 0.21f, -4.09f, 2.18f, -4.09f, 4.5f)
                reflectiveCurveToRelative(1.91f, 4.39f, 4.3f, 4.5f)
                curveToRelative(5.38f, -0.16f, 9.7f, -4.58f, 9.7f, -10.0f)
                close()
            }
        }
        .build()
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
