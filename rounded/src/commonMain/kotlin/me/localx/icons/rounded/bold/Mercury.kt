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

public val Icons.Bold.Mercury: ImageVector
    get() {
        if (_mercury != null) {
            return _mercury!!
        }
        _mercury = Builder(name = "Mercury", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 10.0f)
                curveToRelative(0.0f, -2.673f, -1.318f, -5.043f, -3.337f, -6.497f)
                curveToRelative(0.394f, -0.284f, 0.765f, -0.606f, 1.109f, -0.964f)
                curveToRelative(0.574f, -0.598f, 0.554f, -1.548f, -0.043f, -2.121f)
                curveToRelative(-0.597f, -0.573f, -1.547f, -0.555f, -2.121f, 0.043f)
                curveToRelative(-0.953f, 0.992f, -2.234f, 1.539f, -3.608f, 1.539f)
                reflectiveCurveToRelative(-2.656f, -0.547f, -3.608f, -1.539f)
                curveToRelative(-0.574f, -0.598f, -1.524f, -0.616f, -2.121f, -0.043f)
                curveToRelative(-0.598f, 0.573f, -0.617f, 1.523f, -0.043f, 2.121f)
                curveToRelative(0.344f, 0.359f, 0.716f, 0.68f, 1.109f, 0.964f)
                curveToRelative(-2.019f, 1.454f, -3.337f, 3.824f, -3.337f, 6.497f)
                curveToRelative(0.0f, 3.898f, 2.803f, 7.154f, 6.5f, 7.858f)
                verticalLineToRelative(1.142f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.142f)
                curveToRelative(3.697f, -0.704f, 6.5f, -3.96f, 6.5f, -7.858f)
                close()
                moveTo(7.0f, 10.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _mercury!!
    }

private var _mercury: ImageVector? = null
