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

public val Icons.Filled.CarBolt: ImageVector
    get() {
        if (_carBolt != null) {
            return _carBolt!!
        }
        _carBolt = Builder(name = "CarBolt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(3.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 17.032f)
                verticalLineToRelative(1.968f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(-1.968f)
                curveToRelative(0.0f, -1.358f, 0.119f, -2.705f, 0.346f, -4.032f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.779f, 11.0f)
                curveToRelative(0.188f, -0.718f, 0.404f, -1.429f, 0.659f, -2.131f)
                lineTo(3.582f, 2.975f)
                curveToRelative(0.429f, -1.181f, 1.562f, -1.975f, 2.818f, -1.975f)
                horizontalLineToRelative(11.199f)
                curveToRelative(1.257f, 0.0f, 2.39f, 0.793f, 2.818f, 1.975f)
                lineToRelative(2.144f, 5.895f)
                curveToRelative(0.255f, 0.702f, 0.471f, 1.413f, 0.659f, 2.131f)
                horizontalLineToRelative(-5.221f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.654f)
                curveToRelative(0.227f, 1.327f, 0.346f, 2.674f, 0.346f, 4.032f)
                close()
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(14.809f, 9.846f)
                curveToRelative(-0.28f, -0.521f, -0.821f, -0.846f, -1.413f, -0.846f)
                horizontalLineToRelative(-2.121f)
                lineToRelative(1.778f, -3.294f)
                lineToRelative(-1.76f, -0.95f)
                lineToRelative(-2.224f, 4.161f)
                curveToRelative(-0.147f, 0.487f, -0.055f, 1.021f, 0.249f, 1.43f)
                reflectiveCurveToRelative(0.788f, 0.653f, 1.297f, 0.653f)
                horizontalLineToRelative(2.134f)
                lineToRelative(-1.53f, 3.066f)
                lineToRelative(1.789f, 0.894f)
                lineToRelative(1.764f, -3.534f)
                curveToRelative(0.289f, -0.482f, 0.304f, -1.081f, 0.037f, -1.58f)
                close()
                moveTo(20.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _carBolt!!
    }

private var _carBolt: ImageVector? = null
