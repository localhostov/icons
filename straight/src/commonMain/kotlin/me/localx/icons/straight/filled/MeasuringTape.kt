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

public val Icons.Filled.MeasuringTape: ImageVector
    get() {
        if (_measuringTape != null) {
            return _measuringTape!!
        }
        _measuringTape = Builder(name = "MeasuringTape", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 1.0f)
                curveTo(4.253f, 1.0f, 0.0f, 3.015f, 0.0f, 5.5f)
                reflectiveCurveToRelative(4.253f, 4.5f, 9.5f, 4.5f)
                reflectiveCurveToRelative(9.5f, -2.015f, 9.5f, -4.5f)
                reflectiveCurveTo(14.747f, 1.0f, 9.5f, 1.0f)
                close()
                moveTo(9.5f, 6.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -0.448f, -2.5f, -1.0f)
                reflectiveCurveToRelative(1.119f, -1.0f, 2.5f, -1.0f)
                reflectiveCurveToRelative(2.5f, 0.448f, 2.5f, 1.0f)
                reflectiveCurveToRelative(-1.119f, 1.0f, -2.5f, 1.0f)
                close()
                moveTo(24.0f, 12.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.989f)
                curveToRelative(-5.076f, -0.119f, -9.0f, -2.577f, -9.0f, -5.703f)
                verticalLineToRelative(-7.983f)
                curveToRelative(2.018f, 1.665f, 5.412f, 2.697f, 9.5f, 2.697f)
                horizontalLineToRelative(14.5f)
                close()
            }
        }
        .build()
        return _measuringTape!!
    }

private var _measuringTape: ImageVector? = null
