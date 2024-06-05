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

public val Icons.Outline.ClockUpArrow: ImageVector
    get() {
        if (_clockUpArrow != null) {
            return _clockUpArrow!!
        }
        _clockUpArrow = Builder(name = "ClockUpArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.437f)
                lineToRelative(-4.887f, 2.989f)
                lineToRelative(-1.043f, -1.707f)
                lineToRelative(3.93f, -2.403f)
                verticalLineToRelative(-5.315f)
                close()
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(3.559f, 0.0f, 6.878f, 1.916f, 8.663f, 5.001f)
                curveToRelative(0.707f, 1.224f, 1.13f, 2.591f, 1.271f, 3.999f)
                horizontalLineToRelative(2.0f)
                curveToRelative(-0.147f, -1.759f, -0.657f, -3.473f, -1.541f, -5.001f)
                curveTo(20.253f, 2.299f, 16.271f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.076f, 1.162f, 6.002f, 3.273f, 8.236f)
                curveToRelative(0.449f, 0.475f, 0.937f, 0.896f, 1.444f, 1.286f)
                lineToRelative(1.423f, -1.423f)
                curveToRelative(-0.501f, -0.365f, -0.977f, -0.773f, -1.414f, -1.236f)
                curveToRelative(-1.758f, -1.862f, -2.727f, -4.3f, -2.727f, -6.863f)
                close()
                moveTo(22.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.568f)
                lineToRelative(-4.693f, 4.692f)
                lineToRelative(-3.25f, -3.25f)
                lineToRelative(-6.063f, 6.062f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(4.648f, -4.648f)
                lineToRelative(3.25f, 3.25f)
                lineToRelative(6.125f, -6.124f)
                verticalLineToRelative(2.604f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _clockUpArrow!!
    }

private var _clockUpArrow: ImageVector? = null
