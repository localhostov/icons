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

public val Icons.Filled.Analyse: ImageVector
    get() {
        if (_analyse != null) {
            return _analyse!!
        }
        _analyse = Builder(name = "Analyse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.736f, 5.139f)
                curveToRelative(-0.337f, -0.604f, -0.737f, -1.166f, -1.188f, -1.685f)
                lineToRelative(2.689f, -3.114f)
                lineToRelative(1.514f, 1.308f)
                lineToRelative(-3.015f, 3.491f)
                close()
                moveTo(17.742f, 16.327f)
                curveToRelative(1.411f, -1.724f, 2.258f, -3.926f, 2.258f, -6.327f)
                curveToRelative(0.0f, -1.765f, -0.461f, -3.421f, -1.264f, -4.861f)
                lineToRelative(-7.188f, 8.323f)
                lineToRelative(-3.486f, -3.486f)
                lineToRelative(-4.245f, 5.094f)
                curveToRelative(-0.446f, -0.543f, -0.816f, -1.147f, -1.108f, -1.795f)
                lineToRelative(5.218f, -6.262f)
                lineToRelative(3.514f, 3.514f)
                lineToRelative(6.108f, -7.072f)
                curveToRelative(-1.833f, -2.112f, -4.532f, -3.454f, -7.548f, -3.454f)
                curveTo(4.477f, 0.0f, 0.0f, 4.477f, 0.0f, 10.0f)
                reflectiveCurveToRelative(4.477f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.401f, 0.0f, 4.604f, -0.848f, 6.327f, -2.258f)
                lineToRelative(6.22f, 6.22f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-6.22f, -6.22f)
                close()
            }
        }
        .build()
        return _analyse!!
    }

private var _analyse: ImageVector? = null
