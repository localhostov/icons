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
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.38f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.38f, 12.0f, -12.0f)
                reflectiveCurveTo(18.62f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.59f, 6.33f, 2.16f, 11.7f, 2.0f)
                curveToRelative(2.39f, 0.11f, 4.3f, 2.08f, 4.3f, 4.5f)
                reflectiveCurveToRelative(-1.8f, 4.3f, -4.09f, 4.5f)
                curveToRelative(-3.31f, 0.3f, -5.91f, 3.15f, -5.91f, 6.5f)
                curveToRelative(0.0f, 1.08f, 0.27f, 2.1f, 0.73f, 3.0f)
                curveToRelative(-2.84f, -1.77f, -4.73f, -4.91f, -4.73f, -8.5f)
                close()
                moveTo(12.3f, 22.0f)
                curveToRelative(-2.39f, -0.11f, -4.3f, -2.08f, -4.3f, -4.5f)
                reflectiveCurveToRelative(1.8f, -4.3f, 4.09f, -4.5f)
                curveToRelative(3.31f, -0.3f, 5.91f, -3.15f, 5.91f, -6.5f)
                curveToRelative(0.0f, -1.08f, -0.27f, -2.1f, -0.73f, -3.0f)
                curveToRelative(2.84f, 1.77f, 4.73f, 4.91f, 4.73f, 8.5f)
                curveToRelative(0.0f, 5.41f, -4.33f, 9.84f, -9.7f, 10.0f)
                close()
                moveTo(10.0f, 6.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(14.0f, 17.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
