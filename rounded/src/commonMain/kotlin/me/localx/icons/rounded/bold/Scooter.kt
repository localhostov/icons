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

public val Icons.Bold.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.695f, 0.246f, -1.326f, 0.642f, -1.835f)
                lineToRelative(-0.629f, -2.656f)
                lineToRelative(-1.141f, 1.427f)
                curveToRelative(-1.05f, 1.312f, -2.615f, 2.064f, -4.295f, 2.064f)
                horizontalLineToRelative(-4.761f)
                curveToRelative(0.112f, 0.314f, 0.184f, 0.647f, 0.184f, 1.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.353f, 0.072f, -0.686f, 0.184f, -1.0f)
                horizontalLineToRelative(-0.684f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11.077f)
                curveToRelative(0.764f, 0.0f, 1.476f, -0.342f, 1.953f, -0.938f)
                lineToRelative(2.606f, -3.257f)
                lineToRelative(-1.866f, -7.881f)
                curveToRelative(-0.269f, -1.133f, -1.269f, -1.924f, -2.433f, -1.924f)
                horizontalLineToRelative(-0.337f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.337f)
                curveToRelative(2.561f, 0.0f, 4.762f, 1.74f, 5.353f, 4.232f)
                lineToRelative(3.271f, 13.815f)
                curveToRelative(1.437f, 0.223f, 2.539f, 1.455f, 2.539f, 2.954f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
