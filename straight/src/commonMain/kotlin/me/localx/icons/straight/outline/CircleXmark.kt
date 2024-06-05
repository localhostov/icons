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

public val Icons.Outline.CircleXmark: ImageVector
    get() {
        if (_circleXmark != null) {
            return _circleXmark!!
        }
        _circleXmark = Builder(name = "CircleXmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.707f, 8.707f)
                lineToRelative(-3.293f, 3.293f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(-3.293f, 3.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.293f, -3.293f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(3.293f, -3.293f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _circleXmark!!
    }

private var _circleXmark: ImageVector? = null
