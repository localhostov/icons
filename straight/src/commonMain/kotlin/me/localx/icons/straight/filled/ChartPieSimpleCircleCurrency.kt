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

public val Icons.Filled.ChartPieSimpleCircleCurrency: ImageVector
    get() {
        if (_chartPieSimpleCircleCurrency != null) {
            return _chartPieSimpleCircleCurrency!!
        }
        _chartPieSimpleCircleCurrency = Builder(name = "ChartPieSimpleCircleCurrency", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, 2.324f, 0.997f, 4.41f, 2.58f, 5.872f)
                curveToRelative(-0.517f, 0.076f, -1.042f, 0.128f, -1.58f, 0.128f)
                curveTo(4.935f, 24.0f, 0.0f, 19.065f, 0.0f, 13.0f)
                reflectiveCurveTo(4.935f, 2.0f, 11.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 12.732f)
                curveToRelative(-1.239f, 1.407f, -2.0f, 3.246f, -2.0f, 5.268f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(20.6f, 16.531f)
                lineToRelative(1.216f, -1.216f)
                lineToRelative(-1.132f, -1.131f)
                lineToRelative(-1.216f, 1.216f)
                curveToRelative(-0.436f, -0.247f, -0.932f, -0.4f, -1.469f, -0.4f)
                reflectiveCurveToRelative(-1.033f, 0.153f, -1.469f, 0.4f)
                lineToRelative(-1.216f, -1.216f)
                lineToRelative(-1.132f, 1.131f)
                lineToRelative(1.216f, 1.216f)
                curveToRelative(-0.247f, 0.436f, -0.4f, 0.932f, -0.4f, 1.469f)
                reflectiveCurveToRelative(0.153f, 1.033f, 0.4f, 1.469f)
                lineToRelative(-1.216f, 1.216f)
                lineToRelative(1.132f, 1.131f)
                lineToRelative(1.216f, -1.216f)
                curveToRelative(0.436f, 0.247f, 0.932f, 0.4f, 1.469f, 0.4f)
                reflectiveCurveToRelative(1.033f, -0.153f, 1.469f, -0.4f)
                lineToRelative(1.216f, 1.216f)
                lineToRelative(1.132f, -1.131f)
                lineToRelative(-1.216f, -1.216f)
                curveToRelative(0.247f, -0.436f, 0.4f, -0.932f, 0.4f, -1.469f)
                reflectiveCurveToRelative(-0.153f, -1.033f, -0.4f, -1.469f)
                close()
                moveTo(15.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(14.0f, 10.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                curveTo(24.0f, 4.038f, 19.962f, 0.0f, 15.0f, 0.0f)
                close()
                moveTo(18.0f, 16.6f)
                curveToRelative(-0.772f, 0.0f, -1.4f, 0.628f, -1.4f, 1.4f)
                reflectiveCurveToRelative(0.628f, 1.4f, 1.4f, 1.4f)
                reflectiveCurveToRelative(1.4f, -0.628f, 1.4f, -1.4f)
                reflectiveCurveToRelative(-0.628f, -1.4f, -1.4f, -1.4f)
                close()
            }
        }
        .build()
        return _chartPieSimpleCircleCurrency!!
    }

private var _chartPieSimpleCircleCurrency: ImageVector? = null
