package me.localx.icons.rounded.bold

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

public val Icons.Bold.ArrowsToCircle: ImageVector
    get() {
        if (_arrowsToCircle != null) {
            return _arrowsToCircle!!
        }
        _arrowsToCircle = Builder(name = "ArrowsToCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(15.0f, 10.0f)
                horizontalLineToRelative(4.574f)
                curveToRelative(0.823f, 0.0f, 1.236f, -0.995f, 0.653f, -1.578f)
                lineToRelative(-1.264f, -1.264f)
                lineToRelative(4.597f, -4.597f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-4.597f, 4.597f)
                lineToRelative(-1.264f, -1.264f)
                curveToRelative(-0.582f, -0.582f, -1.578f, -0.17f, -1.578f, 0.653f)
                verticalLineToRelative(4.574f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(8.422f, 3.773f)
                lineToRelative(-1.264f, 1.264f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                curveTo(-0.146f, 1.025f, -0.146f, 1.975f, 0.439f, 2.561f)
                lineTo(5.037f, 7.158f)
                lineToRelative(-1.264f, 1.264f)
                curveToRelative(-0.582f, 0.582f, -0.17f, 1.578f, 0.654f, 1.578f)
                horizontalLineToRelative(4.574f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(10.001f, 4.426f)
                curveToRelative(0.0f, -0.823f, -0.995f, -1.236f, -1.578f, -0.653f)
                close()
                moveTo(18.963f, 16.842f)
                lineToRelative(1.264f, -1.264f)
                curveToRelative(0.582f, -0.582f, 0.17f, -1.578f, -0.653f, -1.578f)
                horizontalLineToRelative(-4.574f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.574f)
                curveToRelative(0.0f, 0.823f, 0.995f, 1.236f, 1.578f, 0.654f)
                lineToRelative(1.264f, -1.264f)
                lineToRelative(4.597f, 4.597f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(-4.597f, -4.597f)
                close()
                moveTo(9.0f, 14.0f)
                lineTo(4.426f, 14.0f)
                curveToRelative(-0.823f, 0.0f, -1.236f, 0.995f, -0.654f, 1.578f)
                lineToRelative(1.264f, 1.264f)
                lineTo(0.439f, 21.439f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(4.597f, -4.597f)
                lineToRelative(1.264f, 1.264f)
                curveToRelative(0.582f, 0.582f, 1.578f, 0.17f, 1.578f, -0.654f)
                verticalLineToRelative(-4.574f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _arrowsToCircle!!
    }

private var _arrowsToCircle: ImageVector? = null
