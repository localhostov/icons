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

public val Icons.Filled.GrowthChartInvest: ImageVector
    get() {
        if (_growthChartInvest != null) {
            return _growthChartInvest!!
        }
        _growthChartInvest = Builder(name = "GrowthChartInvest", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 16.0f)
                curveToRelative(0.0f, 0.379f, 0.271f, 0.698f, 0.645f, 0.761f)
                lineToRelative(3.04f, 0.506f)
                curveToRelative(1.342f, 0.224f, 2.315f, 1.374f, 2.315f, 2.733f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.379f, -0.271f, -0.698f, -0.645f, -0.761f)
                lineToRelative(-3.04f, -0.506f)
                curveToRelative(-1.342f, -0.224f, -2.315f, -1.374f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(22.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.586f)
                lineToRelative(-5.086f, 5.086f)
                lineTo(9.5f, 1.086f)
                lineTo(0.12f, 10.466f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(7.966f, -7.966f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(6.5f, -6.5f)
                verticalLineToRelative(3.586f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(1.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-10.758f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(8.758f)
                close()
                moveTo(11.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-13.757f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(15.757f)
                close()
                moveTo(6.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-15.757f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(13.758f)
                close()
            }
        }
        .build()
        return _growthChartInvest!!
    }

private var _growthChartInvest: ImageVector? = null
