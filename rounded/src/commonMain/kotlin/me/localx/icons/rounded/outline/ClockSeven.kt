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

public val Icons.Outline.ClockSeven: ImageVector
    get() {
        if (_clockSeven != null) {
            return _clockSeven!!
        }
        _clockSeven = Builder(name = "ClockSeven", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.866f, 15.964f)
                lineToRelative(2.0f, -3.464f)
                curveToRelative(0.087f, -0.152f, 0.134f, -0.324f, 0.134f, -0.5f)
                lineTo(13.0f, 6.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(5.732f)
                lineToRelative(-1.866f, 3.232f)
                curveToRelative(-0.276f, 0.479f, -0.112f, 1.09f, 0.366f, 1.366f)
                curveToRelative(0.157f, 0.091f, 0.33f, 0.134f, 0.499f, 0.134f)
                curveToRelative(0.346f, 0.0f, 0.682f, -0.179f, 0.867f, -0.5f)
                close()
            }
        }
        .build()
        return _clockSeven!!
    }

private var _clockSeven: ImageVector? = null
