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

public val Icons.Filled.ChartPieSimpleCircleDollar: ImageVector
    get() {
        if (_chartPieSimpleCircleDollar != null) {
            return _chartPieSimpleCircleDollar!!
        }
        _chartPieSimpleCircleDollar = Builder(name = "ChartPieSimpleCircleDollar", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 16.0f)
                curveToRelative(0.0f, 0.378f, 0.271f, 0.698f, 0.644f, 0.76f)
                lineToRelative(3.042f, 0.507f)
                curveToRelative(1.341f, 0.223f, 2.315f, 1.373f, 2.315f, 2.733f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.378f, -0.271f, -0.698f, -0.644f, -0.76f)
                lineToRelative(-3.042f, -0.507f)
                curveToRelative(-1.341f, -0.223f, -2.315f, -1.373f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                close()
                moveTo(15.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(14.0f, 10.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                curveTo(24.0f, 4.038f, 19.962f, 0.0f, 15.0f, 0.0f)
                close()
                moveTo(16.031f, 12.0f)
                horizontalLineToRelative(-4.031f)
                lineTo(12.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(4.935f, 2.0f, 0.0f, 6.935f, 0.0f, 13.0f)
                reflectiveCurveToRelative(4.935f, 11.0f, 11.0f, 11.0f)
                curveToRelative(1.476f, 0.0f, 2.882f, -0.297f, 4.169f, -0.826f)
                curveToRelative(-0.719f, -0.866f, -1.169f, -1.963f, -1.169f, -3.174f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.641f, 0.806f, -3.088f, 2.031f, -4.0f)
                close()
            }
        }
        .build()
        return _chartPieSimpleCircleDollar!!
    }

private var _chartPieSimpleCircleDollar: ImageVector? = null
