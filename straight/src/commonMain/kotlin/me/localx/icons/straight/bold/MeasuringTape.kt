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

public val Icons.Bold.MeasuringTape: ImageVector
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
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-14.5f)
                curveToRelative(-5.327f, 0.0f, -9.5f, -2.636f, -9.5f, -6.0f)
                lineTo(0.0f, 7.0f)
                curveTo(0.0f, 3.636f, 4.173f, 1.0f, 9.5f, 1.0f)
                reflectiveCurveToRelative(9.5f, 2.636f, 9.5f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(3.0f, 7.0f)
                curveToRelative(0.0f, 1.416f, 2.779f, 3.0f, 6.5f, 3.0f)
                reflectiveCurveToRelative(6.5f, -1.584f, 6.5f, -3.0f)
                reflectiveCurveToRelative(-2.779f, -3.0f, -6.5f, -3.0f)
                reflectiveCurveToRelative(-6.5f, 1.584f, -6.5f, 3.0f)
                close()
                moveTo(21.0f, 13.0f)
                horizontalLineToRelative(-11.5f)
                curveToRelative(-2.541f, 0.0f, -4.812f, -0.604f, -6.5f, -1.596f)
                verticalLineToRelative(5.596f)
                curveToRelative(0.0f, 0.917f, 1.169f, 1.901f, 3.0f, 2.483f)
                verticalLineToRelative(-3.832f)
                curveToRelative(0.945f, 0.196f, 1.952f, 0.304f, 3.0f, 0.332f)
                verticalLineToRelative(4.003f)
                curveToRelative(0.165f, 0.006f, 0.331f, 0.013f, 0.5f, 0.013f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _measuringTape!!
    }

private var _measuringTape: ImageVector? = null
