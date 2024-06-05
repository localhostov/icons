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

public val Icons.Bold.SushiRoll: ImageVector
    get() {
        if (_sushiRoll != null) {
            return _sushiRoll!!
        }
        _sushiRoll = Builder(name = "SushiRoll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.159f, 0.0f, 0.0f, 3.009f, 0.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 3.991f, 5.159f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(12.0f, -3.009f, 12.0f, -7.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -3.991f, -5.159f, -7.0f, -12.0f, -7.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(5.151f, 0.0f, 9.0f, 2.112f, 9.0f, 4.0f)
                reflectiveCurveToRelative(-3.849f, 4.0f, -9.0f, 4.0f)
                reflectiveCurveTo(3.0f, 8.888f, 3.0f, 7.0f)
                reflectiveCurveTo(6.849f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-5.151f, 0.0f, -9.0f, -2.112f, -9.0f, -4.0f)
                verticalLineToRelative(-5.272f)
                curveToRelative(2.165f, 1.411f, 5.341f, 2.272f, 9.0f, 2.272f)
                reflectiveCurveToRelative(6.835f, -0.861f, 9.0f, -2.272f)
                verticalLineToRelative(5.272f)
                curveToRelative(0.0f, 1.888f, -3.849f, 4.0f, -9.0f, 4.0f)
                close()
                moveTo(5.713f, 6.491f)
                curveToRelative(1.07f, -0.682f, 3.227f, -1.491f, 6.287f, -1.491f)
                reflectiveCurveToRelative(5.217f, 0.809f, 6.287f, 1.491f)
                curveToRelative(0.365f, 0.233f, 0.365f, 0.786f, 0.0f, 1.019f)
                curveToRelative(-1.07f, 0.682f, -3.227f, 1.491f, -6.287f, 1.491f)
                reflectiveCurveToRelative(-5.217f, -0.809f, -6.287f, -1.491f)
                curveToRelative(-0.365f, -0.233f, -0.365f, -0.785f, 0.0f, -1.019f)
                close()
            }
        }
        .build()
        return _sushiRoll!!
    }

private var _sushiRoll: ImageVector? = null
