package me.localx.icons.straight.bold

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

public val Icons.Bold.CirclePhone: ImageVector
    get() {
        if (_circlePhone != null) {
            return _circlePhone!!
        }
        _circlePhone = Builder(name = "CirclePhone", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveTo(7.037f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                reflectiveCurveTo(16.963f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(15.288f, 13.115f)
                lineToRelative(-1.775f, 1.775f)
                curveToRelative(-2.027f, -0.773f, -3.521f, -2.208f, -4.403f, -4.403f)
                lineToRelative(1.775f, -1.775f)
                lineToRelative(-2.712f, -2.712f)
                lineToRelative(-1.378f, 1.378f)
                curveToRelative(-0.54f, 0.539f, -0.795f, 1.249f, -0.795f, 1.957f)
                curveToRelative(0.0f, 3.914f, 5.032f, 8.666f, 8.666f, 8.666f)
                curveToRelative(0.708f, 0.0f, 1.418f, -0.256f, 1.957f, -0.795f)
                lineToRelative(1.378f, -1.378f)
                lineToRelative(-2.712f, -2.712f)
                close()
            }
        }
        .build()
        return _circlePhone!!
    }

private var _circlePhone: ImageVector? = null
