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
                moveToRelative(24.0f, 19.0f)
                curveToRelative(0.0f, 1.336f, -0.521f, 2.591f, -1.465f, 3.535f)
                reflectiveCurveToRelative(-2.2f, 1.465f, -3.535f, 1.465f)
                reflectiveCurveToRelative(-2.592f, -0.521f, -3.536f, -1.465f)
                reflectiveCurveToRelative(-1.464f, -2.199f, -1.464f, -3.535f)
                reflectiveCurveToRelative(0.521f, -2.592f, 1.465f, -3.535f)
                lineToRelative(3.535f, -3.458f)
                lineToRelative(3.527f, 3.45f)
                curveToRelative(0.952f, 0.951f, 1.473f, 2.207f, 1.473f, 3.543f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, -0.802f, -0.313f, -1.555f, -0.879f, -2.121f)
                lineToRelative(-2.121f, -2.075f)
                lineToRelative(-2.129f, 2.083f)
                curveToRelative(-0.559f, 0.559f, -0.871f, 1.312f, -0.871f, 2.113f)
                reflectiveCurveToRelative(0.312f, 1.555f, 0.879f, 2.121f)
                curveToRelative(1.132f, 1.134f, 3.108f, 1.134f, 4.242f, 0.0f)
                curveToRelative(0.566f, -0.566f, 0.879f, -1.319f, 0.879f, -2.121f)
                close()
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(10.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(9.144f)
                lineToRelative(-2.0f, -1.956f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.165f)
                lineToRelative(-0.853f, 0.835f)
                horizontalLineToRelative(-4.147f)
                close()
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(10.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 2.0f)
                close()
                moveTo(2.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.0f)
                lineTo(5.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(2.0f, 20.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _grateDroplet!!
    }

private var _grateDroplet: ImageVector? = null
