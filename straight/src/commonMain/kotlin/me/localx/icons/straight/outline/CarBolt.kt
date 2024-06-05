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

public val Icons.Outline.CarBolt: ImageVector
    get() {
        if (_carBolt != null) {
            return _carBolt!!
        }
        _carBolt = Builder(name = "CarBolt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.032f)
                curveToRelative(0.0f, -2.792f, -0.484f, -5.539f, -1.438f, -8.163f)
                lineToRelative(-2.144f, -5.895f)
                curveToRelative(-0.429f, -1.181f, -1.562f, -1.975f, -2.819f, -1.975f)
                lineTo(6.401f, 0.999f)
                curveToRelative(-1.257f, 0.0f, -2.39f, 0.793f, -2.819f, 1.975f)
                lineTo(1.438f, 8.869f)
                curveToRelative(-0.954f, 2.624f, -1.438f, 5.371f, -1.438f, 8.163f)
                verticalLineToRelative(1.968f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.968f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 17.0f)
                curveToRelative(0.002f, -1.349f, 0.127f, -2.685f, 0.374f, -4.0f)
                horizontalLineToRelative(1.626f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.848f, 11.0f)
                curveToRelative(0.14f, -0.486f, 0.296f, -0.969f, 0.47f, -1.447f)
                lineTo(5.461f, 3.658f)
                curveToRelative(0.143f, -0.394f, 0.521f, -0.658f, 0.939f, -0.658f)
                horizontalLineToRelative(11.198f)
                curveToRelative(0.419f, 0.0f, 0.796f, 0.265f, 0.939f, 0.658f)
                lineToRelative(2.144f, 5.895f)
                curveToRelative(0.174f, 0.478f, 0.331f, 0.961f, 0.47f, 1.447f)
                horizontalLineToRelative(-4.152f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.626f)
                curveToRelative(0.247f, 1.315f, 0.372f, 2.651f, 0.374f, 4.0f)
                lineTo(2.0f, 17.0f)
                close()
                moveTo(14.809f, 9.846f)
                curveToRelative(0.268f, 0.499f, 0.252f, 1.098f, -0.037f, 1.58f)
                lineToRelative(-1.764f, 3.534f)
                lineToRelative(-1.789f, -0.894f)
                lineToRelative(1.53f, -3.066f)
                horizontalLineToRelative(-2.134f)
                curveToRelative(-0.509f, 0.0f, -0.994f, -0.244f, -1.297f, -0.653f)
                reflectiveCurveToRelative(-0.396f, -0.943f, -0.249f, -1.43f)
                lineToRelative(2.224f, -4.161f)
                lineToRelative(1.76f, 0.95f)
                lineToRelative(-1.778f, 3.294f)
                horizontalLineToRelative(2.121f)
                curveToRelative(0.592f, 0.0f, 1.133f, 0.324f, 1.413f, 0.846f)
                close()
            }
        }
        .build()
        return _carBolt!!
    }

private var _carBolt: ImageVector? = null
