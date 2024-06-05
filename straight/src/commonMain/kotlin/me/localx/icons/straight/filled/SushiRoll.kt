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

public val Icons.Filled.SushiRoll: ImageVector
    get() {
        if (_sushiRoll != null) {
            return _sushiRoll!!
        }
        _sushiRoll = Builder(name = "SushiRoll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.006f)
                verticalLineToRelative(7.494f)
                curveToRelative(0.0f, 3.767f, -5.047f, 6.5f, -12.0f, 6.5f)
                reflectiveCurveTo(0.0f, 21.267f, 0.0f, 17.5f)
                verticalLineToRelative(-7.494f)
                curveToRelative(2.408f, 2.433f, 6.785f, 3.994f, 12.0f, 3.994f)
                reflectiveCurveToRelative(9.592f, -1.56f, 12.0f, -3.994f)
                close()
                moveTo(24.0f, 6.0f)
                curveToRelative(0.0f, 3.365f, -5.271f, 6.0f, -12.0f, 6.0f)
                reflectiveCurveTo(0.0f, 9.365f, 0.0f, 6.0f)
                reflectiveCurveTo(5.271f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 2.635f, 12.0f, 6.0f)
                close()
                moveTo(18.707f, 5.491f)
                curveToRelative(-1.141f, -0.682f, -3.442f, -1.491f, -6.707f, -1.491f)
                reflectiveCurveToRelative(-5.566f, 0.809f, -6.708f, 1.491f)
                curveToRelative(-0.39f, 0.233f, -0.39f, 0.785f, 0.0f, 1.019f)
                curveToRelative(1.141f, 0.682f, 3.443f, 1.491f, 6.708f, 1.491f)
                reflectiveCurveToRelative(5.566f, -0.809f, 6.707f, -1.491f)
                curveToRelative(0.39f, -0.233f, 0.39f, -0.785f, 0.0f, -1.019f)
                close()
            }
        }
        .build()
        return _sushiRoll!!
    }

private var _sushiRoll: ImageVector? = null
