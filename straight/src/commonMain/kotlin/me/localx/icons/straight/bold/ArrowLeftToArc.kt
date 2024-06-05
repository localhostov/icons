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

public val Icons.Bold.ArrowLeftToArc: ImageVector
    get() {
        if (_arrowLeftToArc != null) {
            return _arrowLeftToArc!!
        }
        _arrowLeftToArc = Builder(name = "ArrowLeftToArc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 13.5f)
                horizontalLineToRelative(-12.35f)
                lineToRelative(3.415f, 3.443f)
                lineToRelative(-2.13f, 2.113f)
                lineToRelative(-5.177f, -5.221f)
                curveToRelative(-1.009f, -1.011f, -1.009f, -2.661f, 0.004f, -3.676f)
                lineToRelative(5.173f, -5.217f)
                lineToRelative(2.13f, 2.113f)
                lineToRelative(-3.415f, 3.443f)
                horizontalLineToRelative(12.35f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 7.037f, 7.038f, 3.0f, 12.0f, 3.0f)
                lineTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _arrowLeftToArc!!
    }

private var _arrowLeftToArc: ImageVector? = null
