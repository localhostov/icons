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

public val Icons.Outline.ClockTen: ImageVector
    get() {
        if (_clockTen != null) {
            return _clockTen!!
        }
        _clockTen = Builder(name = "ClockTen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.5f, 12.866f)
                curveToRelative(0.31f, -0.179f, 0.5f, -0.509f, 0.5f, -0.866f)
                lineTo(13.0f, 6.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(4.268f)
                lineToRelative(-1.964f, -1.134f)
                curveToRelative(-0.478f, -0.277f, -1.09f, -0.112f, -1.366f, 0.366f)
                reflectiveCurveToRelative(-0.112f, 1.09f, 0.366f, 1.366f)
                lineToRelative(3.464f, 2.0f)
                curveToRelative(0.155f, 0.089f, 0.327f, 0.134f, 0.5f, 0.134f)
                reflectiveCurveToRelative(0.345f, -0.045f, 0.5f, -0.134f)
                close()
            }
        }
        .build()
        return _clockTen!!
    }

private var _clockTen: ImageVector? = null
