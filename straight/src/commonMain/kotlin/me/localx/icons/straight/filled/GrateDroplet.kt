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

public val Icons.Filled.GrateDroplet: ImageVector
    get() {
        if (_grateDroplet != null) {
            return _grateDroplet!!
        }
        _grateDroplet = Builder(name = "GrateDroplet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.535f, 22.535f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.944f, -0.944f, 1.465f, -2.199f, 1.465f, -3.535f)
                reflectiveCurveToRelative(-0.521f, -2.592f, -1.473f, -3.543f)
                lineToRelative(-3.527f, -3.45f)
                lineToRelative(-3.535f, 3.458f)
                curveToRelative(-0.944f, 0.943f, -1.465f, 2.199f, -1.465f, 3.535f)
                reflectiveCurveToRelative(0.521f, 2.592f, 1.464f, 3.535f)
                reflectiveCurveToRelative(2.2f, 1.465f, 3.536f, 1.465f)
                reflectiveCurveToRelative(2.591f, -0.521f, 3.535f, -1.465f)
                close()
                moveTo(6.0f, 0.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                lineTo(10.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(10.0f, 22.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(16.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                lineTo(16.0f, 0.0f)
                close()
                moveTo(19.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(4.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(4.0f, 10.0f)
                lineTo(4.0f, 0.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(16.147f, 12.0f)
                horizontalLineToRelative(-4.147f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, -1.871f, 0.729f, -3.629f, 2.052f, -4.95f)
                lineToRelative(2.095f, -2.05f)
                close()
            }
        }
        .build()
        return _grateDroplet!!
    }

private var _grateDroplet: ImageVector? = null
