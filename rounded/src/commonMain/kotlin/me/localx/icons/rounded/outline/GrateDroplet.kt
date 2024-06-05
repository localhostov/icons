package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.GrateDroplet: ImageVector
    get() {
        if (_grateDroplet != null) {
            return _grateDroplet!!
        }
        _grateDroplet = Builder(name = "GrateDroplet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.527f, 15.457f)
                lineToRelative(-1.813f, -1.773f)
                curveToRelative(-0.943f, -0.924f, -2.483f, -0.924f, -3.429f, 0.0f)
                lineToRelative(-1.82f, 1.781f)
                curveToRelative(-0.944f, 0.943f, -1.465f, 2.199f, -1.465f, 3.535f)
                reflectiveCurveToRelative(0.521f, 2.592f, 1.464f, 3.535f)
                reflectiveCurveToRelative(2.2f, 1.465f, 3.536f, 1.465f)
                reflectiveCurveToRelative(2.591f, -0.521f, 3.535f, -1.465f)
                reflectiveCurveToRelative(1.465f, -2.199f, 1.465f, -3.535f)
                reflectiveCurveToRelative(-0.521f, -2.592f, -1.473f, -3.543f)
                close()
                moveTo(21.121f, 21.121f)
                curveToRelative(-1.134f, 1.134f, -3.11f, 1.134f, -4.242f, 0.0f)
                curveToRelative(-0.566f, -0.566f, -0.879f, -1.319f, -0.879f, -2.121f)
                reflectiveCurveToRelative(0.312f, -1.555f, 0.871f, -2.113f)
                lineToRelative(1.812f, -1.773f)
                curveToRelative(0.087f, -0.085f, 0.201f, -0.128f, 0.316f, -0.128f)
                curveToRelative(0.114f, 0.0f, 0.229f, 0.043f, 0.315f, 0.128f)
                lineToRelative(1.806f, 1.766f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.319f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.879f, 2.121f)
                close()
                moveTo(16.0f, 12.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(17.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(15.0f, 2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(12.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(5.0f, 2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(2.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _grateDroplet!!
    }

private var _grateDroplet: ImageVector? = null
