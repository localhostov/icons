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

public val Icons.Bold.StrategyChessRisk: ImageVector
    get() {
        if (_strategyChessRisk != null) {
            return _strategyChessRisk!!
        }
        _strategyChessRisk = Builder(name = "StrategyChessRisk", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(3.793f, -3.707f)
                curveToRelative(0.391f, -0.391f, 1.024f, -0.391f, 1.414f, 0.0f)
                lineToRelative(3.793f, 3.707f)
                close()
                moveTo(3.793f, 8.707f)
                curveToRelative(0.391f, 0.391f, 1.024f, 0.391f, 1.414f, 0.0f)
                lineToRelative(3.793f, -3.707f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.5f)
                lineTo(12.0f, 0.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(0.0f, 5.0f)
                lineToRelative(3.793f, 3.707f)
                close()
                moveTo(7.0f, 13.0f)
                curveToRelative(0.0f, -0.718f, -0.845f, -1.745f, -1.437f, -2.689f)
                curveToRelative(-0.26f, -0.415f, -0.867f, -0.415f, -1.127f, 0.0f)
                curveToRelative(-0.591f, 0.944f, -1.437f, 1.971f, -1.437f, 2.689f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
                moveTo(23.0f, 10.0f)
                verticalLineToRelative(-5.179f)
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
