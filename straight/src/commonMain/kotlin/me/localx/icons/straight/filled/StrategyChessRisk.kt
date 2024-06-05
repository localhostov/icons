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

public val Icons.Filled.StrategyChessRisk: ImageVector
    get() {
        if (_strategyChessRisk != null) {
            return _strategyChessRisk!!
        }
        _strategyChessRisk = Builder(name = "StrategyChessRisk", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.406f, 15.581f)
                lineToRelative(2.507f, 2.507f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.499f, -1.499f)
                verticalLineToRelative(2.997f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-3.006f)
                lineToRelative(-1.499f, 1.508f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.506f, -2.506f)
                curveToRelative(0.775f, -0.775f, 2.038f, -0.775f, 2.812f, 0.0f)
                close()
                moveTo(4.0f, 9.0f)
                curveToRelative(0.509f, 0.0f, 1.019f, -0.193f, 1.406f, -0.581f)
                lineToRelative(2.506f, -2.506f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.499f, 1.508f)
                verticalLineToRelative(-3.006f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.999f, 0.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.997f)
                lineToRelative(-1.499f, -1.499f)
                lineTo(0.087f, 5.913f)
                lineToRelative(2.507f, 2.507f)
                curveToRelative(0.387f, 0.387f, 0.896f, 0.581f, 1.406f, 0.581f)
                close()
                moveTo(7.0f, 13.0f)
                curveToRelative(0.0f, -0.718f, -0.845f, -1.745f, -1.437f, -2.689f)
                curveToRelative(-0.26f, -0.415f, -0.867f, -0.415f, -1.127f, 0.0f)
                curveToRelative(-0.591f, 0.944f, -1.437f, 1.971f, -1.437f, 2.689f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
                moveTo(23.0f, 10.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-1.179f)
                reflectiveCurveToRelative(0.0f, -4.821f, -5.424f, -4.821f)
                curveToRelative(-0.508f, 2.034f, -1.417f, 2.781f, -2.774f, 3.326f)
                curveToRelative(-0.481f, 0.193f, -0.802f, 0.656f, -0.802f, 1.174f)
                verticalLineToRelative(1.5f)
                reflectiveCurveToRelative(4.0f, 0.0f, 4.0f, 0.0f)
                curveToRelative(-0.346f, 3.462f, -2.5f, 5.0f, -4.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                reflectiveCurveToRelative(-1.0f, 0.0f, -1.0f, -1.0f)
                close()
                moveTo(6.5f, 17.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.0f, 3.0f, -2.0f, 5.0f, -2.0f, 5.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.5f)
                reflectiveCurveToRelative(-2.0f, -2.0f, -2.0f, -5.0f)
                close()
            }
        }
        .build()
        return _strategyChessRisk!!
    }

private var _strategyChessRisk: ImageVector? = null
