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

public val Icons.Filled.SpeedometerKpi: ImageVector
    get() {
        if (_speedometerKpi != null) {
            return _speedometerKpi!!
        }
        _speedometerKpi = Builder(name = "SpeedometerKpi", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.566f, 19.435f)
                lineToRelative(1.997f, 4.565f)
                horizontalLineToRelative(-1.758f)
                lineToRelative(-1.593f, -3.533f)
                horizontalLineToRelative(-0.612f)
                verticalLineToRelative(3.533f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(2.867f)
                horizontalLineToRelative(0.354f)
                lineToRelative(1.685f, -2.867f)
                horizontalLineToRelative(1.861f)
                lineToRelative(-1.934f, 3.435f)
                close()
                moveTo(21.0f, 19.921f)
                verticalLineToRelative(-5.921f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.178f, -0.031f, -0.347f, -0.074f, -0.512f)
                lineToRelative(4.781f, -4.781f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-4.781f, 4.781f)
                curveToRelative(-0.164f, -0.044f, -0.334f, -0.074f, -0.512f, -0.074f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(5.921f)
                curveToRelative(-1.909f, -2.17f, -3.0f, -4.979f, -3.0f, -7.921f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                curveToRelative(0.0f, 2.942f, -1.091f, 5.751f, -3.0f, 7.921f)
                close()
                moveTo(15.871f, 3.887f)
                curveToRelative(-1.174f, -0.563f, -2.484f, -0.887f, -3.871f, -0.887f)
                curveTo(7.375f, 3.0f, 3.558f, 6.507f, 3.059f, 11.0f)
                horizontalLineToRelative(2.021f)
                curveToRelative(0.488f, -3.386f, 3.401f, -6.0f, 6.92f, -6.0f)
                curveToRelative(0.823f, 0.0f, 1.611f, 0.15f, 2.345f, 0.413f)
                lineToRelative(1.526f, -1.526f)
                close()
                moveTo(18.588f, 9.655f)
                curveToRelative(0.154f, 0.43f, 0.254f, 0.882f, 0.323f, 1.345f)
                horizontalLineToRelative(2.031f)
                curveToRelative(-0.116f, -1.017f, -0.404f, -1.983f, -0.829f, -2.871f)
                lineToRelative(-1.526f, 1.526f)
                close()
                moveTo(17.001f, 24.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(15.998f, 18.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.1f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(14.398f, 18.5f)
                curveToRelative(0.0f, -0.496f, -0.404f, -0.9f, -0.9f, -0.9f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.496f, 0.0f, 0.9f, -0.404f, 0.9f, -0.9f)
                close()
            }
        }
        .build()
        return _speedometerKpi!!
    }

private var _speedometerKpi: ImageVector? = null
