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

public val Icons.Filled.GroupCall: ImageVector
    get() {
        if (_groupCall != null) {
            return _groupCall!!
        }
        _groupCall = Builder(name = "GroupCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.5f, 7.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveTo(3.57f, 0.0f, 5.5f, 0.0f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(14.5f, 7.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(4.5f, 11.5f)
                curveToRelative(0.0f, -1.328f, 0.474f, -2.548f, 1.261f, -3.5f)
                horizontalLineToRelative(-2.761f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.121f)
                curveToRelative(-0.394f, -0.762f, -0.621f, -1.612f, -0.621f, -2.5f)
                close()
                moveTo(21.287f, 19.114f)
                lineToRelative(-1.775f, 1.775f)
                curveToRelative(-2.027f, -0.773f, -3.521f, -2.208f, -4.403f, -4.403f)
                lineToRelative(1.775f, -1.775f)
                lineToRelative(-2.712f, -2.712f)
                lineToRelative(-1.378f, 1.378f)
                curveToRelative(-0.54f, 0.539f, -0.795f, 1.249f, -0.795f, 1.957f)
                curveToRelative(0.0f, 3.914f, 5.032f, 8.665f, 8.665f, 8.665f)
                curveToRelative(0.708f, 0.0f, 1.418f, -0.256f, 1.957f, -0.795f)
                lineToRelative(1.378f, -1.378f)
                lineToRelative(-2.712f, -2.712f)
                horizontalLineToRelative(-0.001f)
                close()
                moveTo(10.047f, 15.999f)
                horizontalLineToRelative(-3.048f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(9.038f)
                curveToRelative(-1.627f, -1.785f, -2.78f, -3.94f, -2.99f, -6.0f)
                close()
                moveTo(9.999f, 14.999f)
                curveToRelative(0.011f, 0.0f, 0.021f, -0.003f, 0.032f, -0.003f)
                curveToRelative(0.079f, -1.154f, 0.538f, -2.224f, 1.349f, -3.034f)
                lineToRelative(1.836f, -1.836f)
                curveToRelative(-0.535f, -1.249f, -1.776f, -2.127f, -3.218f, -2.127f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(16.999f, 7.999f)
                horizontalLineToRelative(-2.757f)
                curveToRelative(0.56f, 0.678f, 0.96f, 1.492f, 1.144f, 2.385f)
                lineToRelative(3.615f, 3.615f)
                horizontalLineToRelative(0.999f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _groupCall!!
    }

private var _groupCall: ImageVector? = null
