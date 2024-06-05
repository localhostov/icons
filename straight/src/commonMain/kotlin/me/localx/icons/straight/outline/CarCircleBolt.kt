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

public val Icons.Outline.CarCircleBolt: ImageVector
    get() {
        if (_carCircleBolt != null) {
            return _carCircleBolt!!
        }
        _carCircleBolt = Builder(name = "CarCircleBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.947f)
                curveToRelative(0.363f, -0.729f, 0.82f, -1.4f, 1.359f, -2.0f)
                lineTo(2.861f, 11.0f)
                curveToRelative(0.139f, -0.485f, 0.283f, -0.97f, 0.457f, -1.447f)
                lineTo(5.461f, 3.658f)
                curveToRelative(0.143f, -0.394f, 0.521f, -0.658f, 0.939f, -0.658f)
                horizontalLineToRelative(11.199f)
                curveToRelative(0.419f, 0.0f, 0.796f, 0.265f, 0.939f, 0.658f)
                lineToRelative(1.816f, 4.995f)
                curveToRelative(0.989f, 0.398f, 1.887f, 0.968f, 2.665f, 1.671f)
                curveToRelative(-0.143f, -0.487f, -0.284f, -0.975f, -0.459f, -1.455f)
                lineToRelative(-2.144f, -5.895f)
                curveToRelative(-0.429f, -1.181f, -1.562f, -1.975f, -2.818f, -1.975f)
                lineTo(6.401f, 0.999f)
                curveToRelative(-1.257f, 0.0f, -2.39f, 0.793f, -2.819f, 1.975f)
                lineTo(1.438f, 8.869f)
                curveToRelative(-0.954f, 2.624f, -1.438f, 5.371f, -1.438f, 8.163f)
                verticalLineToRelative(1.968f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                lineTo(2.0f, 17.0f)
                curveToRelative(0.002f, -1.349f, 0.136f, -2.685f, 0.382f, -4.0f)
                horizontalLineToRelative(1.618f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(0.0f, -2.453f, 1.777f, -4.5f, 4.111f, -4.921f)
                lineToRelative(-2.041f, 3.839f)
                curveToRelative(-0.147f, 0.487f, -0.054f, 1.021f, 0.249f, 1.43f)
                curveToRelative(0.304f, 0.409f, 0.788f, 0.652f, 1.297f, 0.652f)
                horizontalLineToRelative(2.129f)
                lineToRelative(-1.964f, 3.849f)
                curveToRelative(-2.169f, -0.546f, -3.78f, -2.513f, -3.78f, -4.849f)
                close()
                moveTo(18.0f, 21.9f)
                lineToRelative(1.77f, -3.469f)
                curveToRelative(0.291f, -0.484f, 0.308f, -1.085f, 0.038f, -1.585f)
                curveToRelative(-0.279f, -0.521f, -0.82f, -0.845f, -1.412f, -0.845f)
                horizontalLineToRelative(-2.122f)
                lineToRelative(2.055f, -3.821f)
                curveToRelative(2.114f, 0.583f, 3.672f, 2.523f, 3.672f, 4.821f)
                curveToRelative(0.0f, 2.415f, -1.721f, 4.435f, -4.0f, 4.9f)
                close()
            }
        }
        .build()
        return _carCircleBolt!!
    }

private var _carCircleBolt: ImageVector? = null
