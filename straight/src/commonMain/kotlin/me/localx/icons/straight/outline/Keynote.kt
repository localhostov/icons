package me.localx.icons.straight.outline

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

public val Icons.Outline.Keynote: ImageVector
    get() {
        if (_keynote != null) {
            return _keynote!!
        }
        _keynote = Builder(name = "Keynote", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.28f)
                lineToRelative(-2.0f, -6.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(0.184f)
                curveToRelative(0.414f, 1.161f, 1.514f, 2.0f, 2.816f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.302f, 0.0f, -2.402f, 0.839f, -2.816f, 2.0f)
                horizontalLineToRelative(-0.184f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(3.838f)
                lineToRelative(-1.72f, 5.162f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(4.721f, 12.0f)
                horizontalLineToRelative(14.559f)
                lineToRelative(1.334f, 4.0f)
                horizontalLineTo(3.387f)
                lineToRelative(1.334f, -4.0f)
                close()
            }
        }
        .build()
        return _keynote!!
    }

private var _keynote: ImageVector? = null
