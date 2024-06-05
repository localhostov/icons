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
                moveToRelative(20.359f, 11.48f)
                lineToRelative(-3.573f, 3.548f)
                lineToRelative(-0.879f, -0.879f)
                lineToRelative(6.573f, -6.548f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-6.573f, 6.548f)
                lineToRelative(-0.879f, -0.879f)
                lineToRelative(7.573f, -7.548f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-7.573f, 7.548f)
                lineToRelative(-0.879f, -0.879f)
                lineToRelative(5.573f, -5.548f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineTo(4.0f, 9.813f)
                verticalLineToRelative(-2.853f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveTo(0.0f, 5.855f, 0.0f, 6.959f)
                verticalLineToRelative(8.746f)
                curveToRelative(0.0f, 2.16f, 0.841f, 4.191f, 2.369f, 5.719f)
                curveToRelative(1.69f, 1.69f, 3.911f, 2.535f, 6.131f, 2.535f)
                reflectiveCurveToRelative(4.44f, -0.845f, 6.131f, -2.535f)
                lineToRelative(7.848f, -7.823f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.535f, 0.0f, -2.121f)
                reflectiveCurveToRelative(-1.536f, -0.586f, -2.121f, 0.0f)
                close()
                moveTo(8.25f, 19.8f)
                reflectiveCurveToRelative(-3.5f, -2.431f, -3.5f, -4.41f)
                curveToRelative(0.0f, -1.044f, 0.784f, -1.89f, 1.75f, -1.89f)
                reflectiveCurveToRelative(1.75f, 0.674f, 1.75f, 1.718f)
                curveToRelative(0.0f, -1.044f, 0.784f, -1.718f, 1.75f, -1.718f)
                reflectiveCurveToRelative(1.75f, 0.846f, 1.75f, 1.89f)
                curveToRelative(0.0f, 1.979f, -3.5f, 4.41f, -3.5f, 4.41f)
                close()
            }
        }
        .build()
        return _handmade!!
    }

private var _handmade: ImageVector? = null
