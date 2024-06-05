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

public val Icons.Bold.SkullCrossbones: ImageVector
    get() {
        if (_skullCrossbones != null) {
            return _skullCrossbones!!
        }
        _skullCrossbones = Builder(name = "SkullCrossbones", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.902f, 23.033f)
                curveToRelative(-0.228f, 0.599f, -0.797f, 0.967f, -1.402f, 0.967f)
                curveToRelative(-0.177f, 0.0f, -0.357f, -0.032f, -0.533f, -0.099f)
                lineToRelative(-9.967f, -3.791f)
                lineToRelative(-9.967f, 3.791f)
                curveToRelative(-0.175f, 0.067f, -0.355f, 0.099f, -0.533f, 0.099f)
                curveToRelative(-0.605f, 0.0f, -1.175f, -0.368f, -1.402f, -0.967f)
                curveToRelative(-0.294f, -0.774f, 0.094f, -1.641f, 0.869f, -1.935f)
                lineToRelative(6.814f, -2.592f)
                lineTo(0.967f, 15.915f)
                curveToRelative(-0.774f, -0.294f, -1.163f, -1.161f, -0.869f, -1.935f)
                curveToRelative(0.294f, -0.774f, 1.163f, -1.164f, 1.935f, -0.869f)
                lineToRelative(9.967f, 3.791f)
                lineToRelative(9.967f, -3.791f)
                curveToRelative(0.774f, -0.295f, 1.641f, 0.094f, 1.935f, 0.869f)
                reflectiveCurveToRelative(-0.094f, 1.641f, -0.869f, 1.935f)
                lineToRelative(-6.814f, 2.592f)
                lineToRelative(6.814f, 2.592f)
                curveToRelative(0.774f, 0.294f, 1.163f, 1.161f, 0.869f, 1.935f)
                close()
                moveTo(6.0f, 8.627f)
                verticalLineToRelative(-2.421f)
                curveTo(6.0f, 3.157f, 8.187f, 0.438f, 11.212f, 0.051f)
                curveToRelative(3.659f, -0.469f, 6.788f, 2.382f, 6.788f, 5.949f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.891f, -2.0f, -2.373f)
                close()
                moveTo(13.0f, 7.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(8.0f, 7.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _skullCrossbones!!
    }

private var _skullCrossbones: ImageVector? = null
