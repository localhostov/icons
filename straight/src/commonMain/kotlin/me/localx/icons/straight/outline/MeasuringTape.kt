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

public val Icons.Outline.MeasuringTape: ImageVector
    get() {
        if (_measuringTape != null) {
            return _measuringTape!!
        }
        _measuringTape = Builder(name = "MeasuringTape", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 7.0f)
                curveToRelative(0.0f, -0.552f, 1.119f, -1.0f, 2.5f, -1.0f)
                reflectiveCurveToRelative(2.5f, 0.448f, 2.5f, 1.0f)
                reflectiveCurveToRelative(-1.119f, 1.0f, -2.5f, 1.0f)
                reflectiveCurveToRelative(-2.5f, -0.448f, -2.5f, -1.0f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-14.619f)
                curveToRelative(-5.261f, 0.0f, -9.381f, -2.51f, -9.381f, -5.714f)
                lineTo(0.0f, 6.81f)
                horizontalLineToRelative(0.015f)
                curveTo(0.17f, 3.538f, 4.275f, 1.0f, 9.5f, 1.0f)
                curveToRelative(5.327f, 0.0f, 9.5f, 2.636f, 9.5f, 6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(2.0f, 7.0f)
                curveToRelative(0.0f, 2.168f, 3.435f, 4.0f, 7.5f, 4.0f)
                reflectiveCurveToRelative(7.5f, -1.832f, 7.5f, -4.0f)
                reflectiveCurveToRelative(-3.435f, -4.0f, -7.5f, -4.0f)
                reflectiveCurveToRelative(-7.5f, 1.832f, -7.5f, 4.0f)
                close()
                moveTo(22.0f, 13.0f)
                horizontalLineToRelative(-12.5f)
                curveToRelative(-3.085f, 0.0f, -5.775f, -0.887f, -7.5f, -2.284f)
                verticalLineToRelative(6.57f)
                curveToRelative(0.0f, 1.414f, 1.966f, 2.956f, 5.0f, 3.504f)
                verticalLineToRelative(-4.791f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.989f)
                curveToRelative(0.127f, 0.003f, 0.251f, 0.011f, 0.381f, 0.011f)
                horizontalLineToRelative(2.619f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _measuringTape!!
    }

private var _measuringTape: ImageVector? = null
