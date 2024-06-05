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

public val Icons.Bold.PlaneTail: ImageVector
    get() {
        if (_planeTail != null) {
            return _planeTail!!
        }
        _planeTail = Builder(name = "PlaneTail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.073f, 15.659f)
                curveToRelative(-0.178f, -0.073f, -1.926f, -0.788f, -4.591f, -1.636f)
                lineTo(22.488f, 0.0f)
                horizontalLineToRelative(-5.04f)
                curveToRelative(-1.054f, 0.0f, -2.042f, 0.468f, -2.71f, 1.283f)
                lineToRelative(-6.299f, 7.7f)
                curveToRelative(-1.049f, 1.281f, -2.6f, 2.017f, -4.257f, 2.017f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(3.0f)
                lineTo(1.5f, 14.0f)
                curveToRelative(6.779f, 0.0f, 14.146f, 2.2f, 17.907f, 3.5f)
                curveToRelative(-3.762f, 1.3f, -11.128f, 3.5f, -17.907f, 3.5f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(1.5f, 24.0f)
                curveToRelative(10.181f, 0.0f, 21.112f, -4.47f, 21.573f, -4.659f)
                lineToRelative(0.927f, -0.384f)
                verticalLineToRelative(-2.914f)
                lineToRelative(-0.927f, -0.384f)
                close()
                moveTo(9.851f, 11.835f)
                curveToRelative(0.325f, -0.291f, 0.63f, -0.609f, 0.911f, -0.952f)
                lineToRelative(6.298f, -7.699f)
                curveToRelative(0.096f, -0.116f, 0.237f, -0.184f, 0.389f, -0.184f)
                horizontalLineToRelative(1.063f)
                lineToRelative(-2.906f, 10.168f)
                curveToRelative(-1.743f, -0.481f, -3.697f, -0.953f, -5.755f, -1.333f)
                close()
                moveTo(11.0f, 16.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _planeTail!!
    }

private var _planeTail: ImageVector? = null
