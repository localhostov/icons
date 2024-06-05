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

public val Icons.Bold.CircleV: ImageVector
    get() {
        if (_circleV != null) {
            return _circleV!!
        }
        _circleV = Builder(name = "CircleV", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, -0.5f)
                curveTo(5.383f, -0.5f, 0.0f, 4.883f, 0.0f, 11.5f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, -0.5f, 12.0f, -0.5f)
                close()
                moveTo(12.0f, 20.5f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 2.5f, 12.0f, 2.5f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(14.805f, 6.5f)
                horizontalLineToRelative(3.195f)
                lineToRelative(-3.0f, 9.5f)
                curveToRelative(-0.673f, 1.531f, -1.642f, 2.0f, -3.0f, 2.0f)
                curveToRelative(-1.358f, 0.0f, -2.327f, -0.469f, -3.0f, -2.0f)
                lineToRelative(-3.0f, -9.5f)
                horizontalLineToRelative(3.195f)
                lineToRelative(2.36f, 8.223f)
                curveToRelative(0.085f, 0.173f, 0.27f, 0.275f, 0.445f, 0.277f)
                curveToRelative(0.175f, -0.002f, 0.36f, -0.104f, 0.445f, -0.277f)
                lineToRelative(2.36f, -8.223f)
                close()
            }
        }
        .build()
        return _circleV!!
    }

private var _circleV: ImageVector? = null
