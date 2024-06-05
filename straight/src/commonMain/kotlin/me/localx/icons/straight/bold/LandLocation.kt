package me.localx.icons.straight.bold

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

public val Icons.Bold.LandLocation: ImageVector
    get() {
        if (_landLocation != null) {
            return _landLocation!!
        }
        _landLocation = Builder(name = "LandLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.768f, 9.0f)
                horizontalLineToRelative(-2.35f)
                curveToRelative(-0.397f, 0.983f, -0.989f, 1.886f, -1.762f, 2.658f)
                lineToRelative(-0.35f, 0.342f)
                horizontalLineToRelative(1.926f)
                lineToRelative(0.507f, 3.0f)
                horizontalLineToRelative(-2.858f)
                lineToRelative(-0.199f, -2.389f)
                lineToRelative(-4.681f, 4.578f)
                lineToRelative(-4.681f, -4.578f)
                lineToRelative(-0.199f, 2.389f)
                horizontalLineToRelative(-2.859f)
                lineToRelative(0.507f, -3.0f)
                horizontalLineToRelative(1.926f)
                lineToRelative(-0.323f, -0.316f)
                curveToRelative(-0.785f, -0.784f, -1.384f, -1.696f, -1.786f, -2.684f)
                horizontalLineToRelative(-2.354f)
                lineTo(0.021f, 22.092f)
                lineToRelative(-0.021f, 1.908f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-2.232f, -13.5f)
                close()
                moveTo(6.62f, 21.0f)
                horizontalLineToRelative(-3.372f)
                lineToRelative(0.507f, -3.0f)
                horizontalLineToRelative(3.115f)
                lineToRelative(-0.25f, 3.0f)
                close()
                moveTo(9.63f, 21.0f)
                lineToRelative(0.25f, -3.0f)
                horizontalLineToRelative(4.24f)
                lineToRelative(0.25f, 3.0f)
                horizontalLineToRelative(-4.74f)
                close()
                moveTo(17.38f, 21.0f)
                lineToRelative(-0.25f, -3.0f)
                horizontalLineToRelative(3.115f)
                lineToRelative(0.507f, 3.0f)
                horizontalLineToRelative(-3.371f)
                close()
                moveTo(12.0f, 14.392f)
                lineToRelative(4.242f, -4.149f)
                curveToRelative(1.134f, -1.133f, 1.758f, -2.64f, 1.758f, -4.243f)
                reflectiveCurveToRelative(-0.624f, -3.11f, -1.758f, -4.243f)
                curveToRelative(-1.134f, -1.133f, -2.641f, -1.757f, -4.242f, -1.757f)
                reflectiveCurveToRelative(-3.11f, 0.624f, -4.242f, 1.757f)
                curveToRelative(-1.134f, 1.133f, -1.758f, 2.64f, -1.758f, 4.243f)
                reflectiveCurveToRelative(0.624f, 3.11f, 1.77f, 4.254f)
                lineToRelative(4.23f, 4.138f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _landLocation!!
    }

private var _landLocation: ImageVector? = null
