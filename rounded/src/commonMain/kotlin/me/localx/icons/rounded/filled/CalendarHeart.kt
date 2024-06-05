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

public val Icons.Filled.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) {
            return _calendarHeart!!
        }
        _calendarHeart = Builder(name = "CalendarHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.985f, 16.084f)
                curveToRelative(0.0f, -0.662f, 0.435f, -1.2f, 0.969f, -1.2f)
                reflectiveCurveToRelative(0.969f, 0.538f, 0.969f, 1.2f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.662f, 0.435f, -1.2f, 0.969f, -1.2f)
                reflectiveCurveToRelative(0.969f, 0.538f, 0.969f, 1.2f)
                curveToRelative(0.0f, 0.419f, -0.288f, 1.63f, -2.916f, 3.808f)
                curveToRelative(-2.67f, -2.178f, -2.959f, -3.388f, -2.959f, -3.808f)
                close()
                moveTo(0.0f, 10.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(6.985f, 16.084f)
                curveToRelative(0.0f, 1.578f, 1.208f, 3.33f, 3.695f, 5.358f)
                curveToRelative(0.36f, 0.293f, 0.801f, 0.44f, 1.242f, 0.44f)
                curveToRelative(0.441f, 0.0f, 0.883f, -0.147f, 1.243f, -0.44f)
                curveToRelative(2.486f, -2.027f, 3.695f, -3.78f, 3.695f, -5.357f)
                curveToRelative(0.0f, -1.764f, -1.332f, -3.2f, -2.969f, -3.2f)
                curveToRelative(-0.755f, 0.0f, -1.444f, 0.305f, -1.969f, 0.807f)
                curveToRelative(-0.524f, -0.501f, -1.214f, -0.807f, -1.969f, -0.807f)
                curveToRelative(-1.637f, 0.0f, -2.969f, 1.436f, -2.969f, 3.2f)
                close()
                moveTo(19.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null
