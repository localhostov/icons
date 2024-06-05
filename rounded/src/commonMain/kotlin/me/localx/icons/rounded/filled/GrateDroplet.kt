package me.localx.icons.rounded.filled

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
                moveToRelative(10.0f, 0.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(10.0f, 22.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(12.0f, 0.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(4.0f, 0.101f)
                curveTo(1.718f, 0.564f, 0.0f, 2.581f, 0.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.0f)
                lineTo(4.0f, 0.101f)
                close()
                moveTo(4.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.419f, 1.718f, 4.436f, 4.0f, 4.899f)
                verticalLineToRelative(-9.899f)
                close()
                moveTo(18.0f, 0.101f)
                verticalLineToRelative(9.899f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.419f, -1.718f, -4.436f, -4.0f, -4.899f)
                close()
                moveTo(19.0f, 24.0f)
                curveToRelative(-1.336f, 0.0f, -2.592f, -0.521f, -3.536f, -1.465f)
                reflectiveCurveToRelative(-1.464f, -2.199f, -1.464f, -3.535f)
                reflectiveCurveToRelative(0.521f, -2.592f, 1.465f, -3.535f)
                lineToRelative(2.205f, -2.965f)
                curveToRelative(0.731f, -0.716f, 1.928f, -0.716f, 2.659f, 0.0f)
                lineToRelative(2.198f, 2.957f)
                curveToRelative(0.952f, 0.951f, 1.473f, 2.207f, 1.473f, 3.543f)
                reflectiveCurveToRelative(-0.521f, 2.591f, -1.465f, 3.535f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.944f, 0.944f, -2.2f, 1.465f, -3.535f, 1.465f)
                close()
                moveTo(15.571f, 12.0f)
                horizontalLineToRelative(-3.571f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, -1.817f, 0.687f, -3.529f, 1.94f, -4.837f)
                lineToRelative(1.63f, -2.163f)
                close()
            }
        }
        .build()
        return _grateDroplet!!
    }

private var _grateDroplet: ImageVector? = null
