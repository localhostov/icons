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

public val Icons.Filled.DumpsterFire: ImageVector
    get() {
        if (_dumpsterFire != null) {
            return _dumpsterFire!!
        }
        _dumpsterFire = Builder(name = "DumpsterFire", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                curveToRelative(0.0f, -1.725f, 1.0f, -3.06f, 1.995f, -4.087f)
                curveToRelative(0.0f, 0.0f, 0.681f, 2.087f, 1.287f, 2.087f)
                curveToRelative(1.263f, 0.0f, 0.897f, -3.898f, 2.718f, -6.0f)
                curveToRelative(1.895f, 1.895f, 6.0f, 4.526f, 6.0f, 8.0f)
                close()
                moveTo(19.415f, 18.585f)
                lineToRelative(-1.415f, -1.415f)
                lineToRelative(-1.415f, 1.415f)
                curveToRelative(-0.781f, 0.781f, -0.781f, 2.048f, 0.0f, 2.829f)
                curveToRelative(0.781f, 0.781f, 2.048f, 0.781f, 2.829f, 0.0f)
                reflectiveCurveToRelative(0.781f, -2.048f, 0.0f, -2.829f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(18.829f, 8.0f)
                reflectiveCurveToRelative(1.415f, 1.352f, 1.922f, 1.792f)
                curveToRelative(0.872f, 0.757f, 1.869f, 1.626f, 2.76f, 2.621f)
                lineToRelative(0.4f, -4.413f)
                horizontalLineToRelative(-5.081f)
                close()
                moveTo(24.001f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(5.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                lineTo(5.0f, 0.0f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -2.544f, 1.46f, -4.345f, 2.559f, -5.479f)
                curveToRelative(0.0f, 0.0f, 3.318f, -3.125f, 3.93f, -3.83f)
                lineToRelative(0.598f, -0.691f)
                lineTo(0.091f, 8.0f)
                lineToRelative(0.996f, 11.0f)
                horizontalLineToRelative(8.983f)
                curveToRelative(-0.041f, -0.328f, -0.069f, -0.661f, -0.069f, -1.0f)
                close()
                moveTo(4.0f, 21.083f)
                curveToRelative(0.0f, 1.608f, 1.346f, 2.917f, 3.0f, 2.917f)
                reflectiveCurveToRelative(3.0f, -1.309f, 3.0f, -2.917f)
                verticalLineToRelative(-0.083f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(0.083f)
                close()
                moveTo(11.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 0.0f)
                close()
                moveTo(17.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                lineTo(17.0f, 0.0f)
                close()
            }
        }
        .build()
        return _dumpsterFire!!
    }

private var _dumpsterFire: ImageVector? = null
