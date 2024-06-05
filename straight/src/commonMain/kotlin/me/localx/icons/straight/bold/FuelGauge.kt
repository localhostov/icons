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

public val Icons.Bold.FuelGauge: ImageVector
    get() {
        if (_fuelGauge != null) {
            return _fuelGauge!!
        }
        _fuelGauge = Builder(name = "FuelGauge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 4.082f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.9f)
                curveToRelative(2.212f, 0.217f, 4.326f, 0.905f, 6.227f, 2.045f)
                lineToRelative(-1.462f, 1.957f)
                lineToRelative(2.404f, 1.795f)
                lineToRelative(3.305f, -4.425f)
                lineToRelative(-1.207f, -0.897f)
                curveToRelative(-3.131f, -2.327f, -6.854f, -3.557f, -10.767f, -3.557f)
                reflectiveCurveTo(4.364f, 2.229f, 1.233f, 4.557f)
                lineTo(0.03f, 5.451f)
                lineToRelative(3.281f, 4.423f)
                lineToRelative(2.391f, -1.812f)
                lineToRelative(-1.433f, -1.932f)
                curveToRelative(1.902f, -1.142f, 4.017f, -1.831f, 6.23f, -2.048f)
                close()
                moveTo(16.903f, 10.205f)
                lineToRelative(-4.561f, 5.811f)
                curveToRelative(-0.114f, -0.013f, -0.225f, -0.034f, -0.342f, -0.034f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.42f, -0.088f, -0.82f, -0.244f, -1.183f)
                lineToRelative(4.552f, -5.798f)
                lineToRelative(-2.404f, -1.795f)
                close()
                moveTo(0.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 23.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(22.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _fuelGauge!!
    }

private var _fuelGauge: ImageVector? = null
