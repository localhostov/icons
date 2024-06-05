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

public val Icons.Filled.GrinTears: ImageVector
    get() {
        if (_grinTears != null) {
            return _grinTears!!
        }
        _grinTears = Builder(name = "GrinTears", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.688f, 16.432f)
                curveTo(19.93f, 15.674f, 19.4f, 12.4f, 19.4f, 12.4f)
                reflectiveCurveToRelative(3.277f, 0.533f, 4.035f, 1.291f)
                arcToRelative(1.933f, 1.933f, 0.0f, false, true, 0.358f, 0.512f)
                arcToRelative(11.995f, 11.995f, 0.0f, true, false, -23.58f, 0.0f)
                arcToRelative(1.933f, 1.933f, 0.0f, false, true, 0.358f, -0.512f)
                curveToRelative(0.758f, -0.758f, 4.06f, -1.316f, 4.06f, -1.316f)
                curveToRelative(-0.274f, 1.064f, -0.649f, 5.837f, -3.655f, 4.361f)
                curveToRelative(4.1f, 9.632f, 17.959f, 9.627f, 22.054f, 0.0f)
                arcTo(1.935f, 1.935f, 0.0f, false, true, 20.688f, 16.432f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(1.768f, 0.0f, 3.0f, 2.108f, 3.0f, 4.0f)
                lineTo(17.0f, 11.0f)
                curveToRelative(0.0f, -1.054f, -0.68f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                lineTo(13.0f, 11.0f)
                curveTo(13.0f, 9.108f, 14.232f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(8.0f, 7.0f)
                curveToRelative(1.768f, 0.0f, 3.0f, 2.108f, 3.0f, 4.0f)
                lineTo(9.0f, 11.0f)
                curveToRelative(0.0f, -1.054f, -0.679f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                lineTo(5.0f, 11.0f)
                curveTo(5.0f, 9.108f, 6.232f, 7.0f, 8.0f, 7.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.336f, 0.0f, -5.392f, -2.72f, -6.007f, -5.0f)
                arcToRelative(21.841f, 21.841f, 0.0f, false, false, 6.0f, 1.0f)
                arcTo(21.923f, 21.923f, 0.0f, false, false, 18.0f, 14.0f)
                curveTo(17.385f, 16.28f, 15.336f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _grinTears!!
    }

private var _grinTears: ImageVector? = null
