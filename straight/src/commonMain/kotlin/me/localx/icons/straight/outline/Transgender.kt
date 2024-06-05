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

public val Icons.Outline.Transgender: ImageVector
    get() {
        if (_transgender != null) {
            return _transgender!!
        }
        _transgender = Builder(name = "Transgender", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 0.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(-5.111f, 5.111f)
                curveToRelative(-0.981f, -0.699f, -2.181f, -1.111f, -3.475f, -1.111f)
                reflectiveCurveToRelative(-2.494f, 0.412f, -3.475f, 1.111f)
                lineToRelative(-1.52f, -1.52f)
                lineToRelative(1.465f, -1.465f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.465f, 1.465f)
                lineToRelative(-2.177f, -2.177f)
                horizontalLineToRelative(2.586f)
                lineTo(6.0f, 0.0f)
                lineTo(2.0f, 0.0f)
                curveTo(0.897f, 0.0f, 0.0f, 0.897f, 0.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.586f)
                lineToRelative(2.177f, 2.177f)
                lineToRelative(-1.621f, 1.621f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.621f, -1.621f)
                lineToRelative(1.52f, 1.52f)
                curveToRelative(-0.699f, 0.981f, -1.111f, 2.181f, -1.111f, 3.475f)
                curveToRelative(0.0f, 2.968f, 2.166f, 5.439f, 5.0f, 5.916f)
                verticalLineToRelative(2.084f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.084f)
                curveToRelative(2.834f, -0.477f, 5.0f, -2.948f, 5.0f, -5.916f)
                curveToRelative(0.0f, -1.294f, -0.412f, -2.494f, -1.111f, -3.475f)
                lineToRelative(5.111f, -5.111f)
                verticalLineToRelative(2.586f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _transgender!!
    }

private var _transgender: ImageVector? = null
