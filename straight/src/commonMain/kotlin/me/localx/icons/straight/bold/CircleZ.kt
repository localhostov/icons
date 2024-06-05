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

public val Icons.Bold.CircleZ: ImageVector
    get() {
        if (_circleZ != null) {
            return _circleZ!!
        }
        _circleZ = Builder(name = "CircleZ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.467f, 9.54f)
                lineToRelative(-5.224f, 5.46f)
                horizontalLineToRelative(5.757f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-7.925f)
                curveToRelative(-0.842f, 0.0f, -1.594f, -0.503f, -1.916f, -1.28f)
                reflectiveCurveToRelative(-0.146f, -1.665f, 0.449f, -2.26f)
                lineToRelative(5.224f, -5.46f)
                horizontalLineToRelative(-5.832f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.842f, 0.0f, 1.594f, 0.503f, 1.916f, 1.28f)
                reflectiveCurveToRelative(0.146f, 1.665f, -0.449f, 2.26f)
                close()
            }
        }
        .build()
        return _circleZ!!
    }

private var _circleZ: ImageVector? = null
