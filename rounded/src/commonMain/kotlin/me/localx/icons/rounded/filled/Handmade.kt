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

public val Icons.Filled.Handmade: ImageVector
    get() {
        if (_handmade != null) {
            return _handmade!!
        }
        _handmade = Builder(name = "Handmade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.439f, 11.439f)
                lineToRelative(-3.573f, 3.548f)
                curveToRelative(-0.243f, 0.242f, -0.637f, 0.242f, -0.879f, 0.0f)
                reflectiveCurveToRelative(-0.243f, -0.638f, 0.0f, -0.881f)
                curveToRelative(0.003f, -0.003f, 6.574f, -6.545f, 6.574f, -6.545f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                curveToRelative(0.0f, 0.0f, -6.564f, 6.544f, -6.569f, 6.55f)
                curveToRelative(-0.243f, 0.243f, -0.638f, 0.243f, -0.881f, 0.0f)
                curveToRelative(-0.243f, -0.243f, -0.243f, -0.636f, 0.0f, -0.879f)
                lineToRelative(7.572f, -7.549f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                curveToRelative(0.0f, 0.0f, -7.556f, 7.542f, -7.566f, 7.552f)
                curveToRelative(-0.243f, 0.243f, -0.638f, 0.243f, -0.881f, 0.0f)
                reflectiveCurveToRelative(-0.243f, -0.636f, 0.0f, -0.879f)
                lineToRelative(5.569f, -5.552f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineTo(4.0f, 9.853f)
                verticalLineToRelative(-2.853f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveTo(0.0f, 5.895f, 0.0f, 7.0f)
                verticalLineToRelative(8.746f)
                curveToRelative(0.0f, 2.16f, 0.841f, 4.191f, 2.369f, 5.719f)
                curveToRelative(1.69f, 1.69f, 3.911f, 2.535f, 6.131f, 2.535f)
                reflectiveCurveToRelative(4.44f, -0.845f, 6.131f, -2.535f)
                lineToRelative(7.929f, -7.904f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(-1.536f, -0.586f, -2.121f, 0.0f)
                close()
                moveTo(8.785f, 19.703f)
                curveToRelative(-0.459f, 0.376f, -1.113f, 0.376f, -1.572f, 0.0f)
                curveToRelative(-1.032f, -0.846f, -2.714f, -2.435f, -2.714f, -3.807f)
                curveToRelative(0.0f, -1.044f, 0.784f, -1.89f, 1.75f, -1.89f)
                reflectiveCurveToRelative(1.75f, 0.674f, 1.75f, 1.718f)
                curveToRelative(0.0f, -1.044f, 0.784f, -1.718f, 1.75f, -1.718f)
                reflectiveCurveToRelative(1.75f, 0.846f, 1.75f, 1.89f)
                curveToRelative(0.0f, 1.372f, -1.682f, 2.961f, -2.714f, 3.807f)
                close()
            }
        }
        .build()
        return _handmade!!
    }

private var _handmade: ImageVector? = null
