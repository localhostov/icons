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

public val Icons.Outline.ChartPyramid: ImageVector
    get() {
        if (_chartPyramid != null) {
            return _chartPyramid!!
        }
        _chartPyramid = Builder(name = "ChartPyramid", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.905f, 1.243f)
                arcToRelative(2.088f, 2.088f, 0.0f, false, false, -3.81f, 0.0f)
                lineTo(0.0f, 24.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(18.263f, 16.0f)
                horizontalLineTo(5.737f)
                lineToRelative(1.774f, -4.0f)
                horizontalLineToRelative(8.978f)
                close()
                moveTo(11.919f, 2.062f)
                curveToRelative(0.016f, -0.035f, 0.024f, -0.052f, 0.081f, -0.052f)
                reflectiveCurveToRelative(0.065f, 0.017f, 0.077f, 0.044f)
                lineTo(15.6f, 10.0f)
                horizontalLineTo(8.4f)
                close()
                moveTo(4.849f, 18.0f)
                horizontalLineToRelative(14.3f)
                lineToRelative(1.774f, 4.0f)
                horizontalLineTo(3.075f)
                close()
            }
        }
        .build()
        return _chartPyramid!!
    }

private var _chartPyramid: ImageVector? = null
