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

public val Icons.Filled.ArrowLeftToArc: ImageVector
    get() {
        if (_arrowLeftToArc != null) {
            return _arrowLeftToArc!!
        }
        _arrowLeftToArc = Builder(name = "ArrowLeftToArc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 13.0f)
                horizontalLineToRelative(-14.049f)
                lineToRelative(4.759f, 4.796f)
                lineToRelative(-1.42f, 1.408f)
                lineToRelative(-5.677f, -5.721f)
                curveToRelative(-0.816f, -0.816f, -0.816f, -2.15f, 0.002f, -2.97f)
                lineToRelative(5.675f, -5.718f)
                lineToRelative(1.42f, 1.408f)
                lineToRelative(-4.759f, 4.796f)
                horizontalLineToRelative(14.049f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                lineTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _arrowLeftToArc!!
    }

private var _arrowLeftToArc: ImageVector? = null
