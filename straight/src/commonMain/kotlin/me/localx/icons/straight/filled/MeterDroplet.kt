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

public val Icons.Filled.MeterDroplet: ImageVector
    get() {
        if (_meterDroplet != null) {
            return _meterDroplet!!
        }
        _meterDroplet = Builder(name = "MeterDroplet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 24.1f)
                curveToRelative(-1.47f, 0.0f, -2.851f, -0.572f, -3.889f, -1.611f)
                curveToRelative(-1.039f, -1.038f, -1.611f, -2.419f, -1.611f, -3.889f)
                reflectiveCurveToRelative(0.572f, -2.851f, 1.611f, -3.889f)
                lineToRelative(3.889f, -3.804f)
                lineToRelative(3.881f, 3.796f)
                curveToRelative(1.047f, 1.046f, 1.619f, 2.427f, 1.619f, 3.896f)
                reflectiveCurveToRelative(-0.572f, 2.851f, -1.611f, 3.889f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.039f, 1.039f, -2.42f, 1.611f, -3.889f, 1.611f)
                close()
                moveTo(13.196f, 23.902f)
                curveToRelative(-1.416f, -1.414f, -2.196f, -3.298f, -2.196f, -5.302f)
                reflectiveCurveToRelative(0.781f, -3.888f, 2.198f, -5.304f)
                lineToRelative(3.802f, -3.719f)
                verticalLineToRelative(-2.577f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.598f)
                lineToRelative(4.779f, 4.675f)
                curveToRelative(0.046f, 0.046f, 0.092f, 0.093f, 0.137f, 0.14f)
                curveToRelative(0.055f, -0.464f, 0.084f, -0.935f, 0.084f, -1.414f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(0.416f, 0.0f, 0.827f, -0.021f, 1.233f, -0.063f)
                curveToRelative(-0.012f, -0.012f, -0.024f, -0.024f, -0.036f, -0.036f)
                close()
                moveTo(13.0f, 7.001f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(7.0f, 11.001f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(9.0f, 7.001f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _meterDroplet!!
    }

private var _meterDroplet: ImageVector? = null
