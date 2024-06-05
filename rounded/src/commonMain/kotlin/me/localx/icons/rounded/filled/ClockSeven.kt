package me.localx.icons.rounded.filled

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

public val Icons.Filled.ClockSeven: ImageVector
    get() {
        if (_clockSeven != null) {
            return _clockSeven!!
        }
        _clockSeven = Builder(name = "ClockSeven", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.0f, 12.0f)
                curveToRelative(0.0f, 0.176f, -0.046f, 0.348f, -0.134f, 0.5f)
                lineToRelative(-2.0f, 3.464f)
                curveToRelative(-0.186f, 0.321f, -0.521f, 0.5f, -0.867f, 0.5f)
                curveToRelative(-0.169f, 0.0f, -0.342f, -0.043f, -0.499f, -0.134f)
                curveToRelative(-0.479f, -0.276f, -0.642f, -0.888f, -0.366f, -1.366f)
                lineToRelative(1.866f, -3.232f)
                lineTo(11.0f, 6.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _clockSeven!!
    }

private var _clockSeven: ImageVector? = null
