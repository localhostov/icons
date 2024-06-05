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

public val Icons.Filled.ClockTen: ImageVector
    get() {
        if (_clockTen != null) {
            return _clockTen!!
        }
        _clockTen = Builder(name = "ClockTen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveToRelative(0.0f, 0.357f, -0.19f, 0.688f, -0.5f, 0.866f)
                curveToRelative(-0.155f, 0.089f, -0.327f, 0.134f, -0.5f, 0.134f)
                reflectiveCurveToRelative(-0.345f, -0.045f, -0.5f, -0.134f)
                lineToRelative(-3.464f, -2.0f)
                curveToRelative(-0.479f, -0.276f, -0.642f, -0.888f, -0.366f, -1.366f)
                reflectiveCurveToRelative(0.888f, -0.644f, 1.366f, -0.366f)
                lineToRelative(1.964f, 1.134f)
                lineTo(11.0f, 6.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _clockTen!!
    }

private var _clockTen: ImageVector? = null
