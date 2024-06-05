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

public val Icons.Bold.GrowthChartInvest: ImageVector
    get() {
        if (_growthChartInvest != null) {
            return _growthChartInvest!!
        }
        _growthChartInvest = Builder(name = "GrowthChartInvest", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 11.0f)
                lineToRelative(3.0f, -3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(11.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-12.0f)
                lineToRelative(-3.0f, -3.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(1.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-11.0f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(22.909f, 0.0f)
                horizontalLineToRelative(-5.909f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(-3.939f, 3.939f)
                lineTo(9.5f, 0.378f)
                lineTo(0.046f, 9.833f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(7.333f, -7.333f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(6.061f, -6.061f)
                lineToRelative(2.439f, 2.439f)
                lineTo(24.0f, 1.091f)
                curveToRelative(0.0f, -0.602f, -0.488f, -1.091f, -1.091f, -1.091f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.359f, 0.974f, 2.51f, 2.315f, 2.733f)
                lineToRelative(3.04f, 0.506f)
                curveToRelative(0.374f, 0.062f, 0.645f, 0.382f, 0.645f, 0.761f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.359f, -0.974f, -2.51f, -2.315f, -2.733f)
                lineToRelative(-3.04f, -0.506f)
                curveToRelative(-0.374f, -0.062f, -0.645f, -0.382f, -0.645f, -0.761f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _growthChartInvest!!
    }

private var _growthChartInvest: ImageVector? = null
