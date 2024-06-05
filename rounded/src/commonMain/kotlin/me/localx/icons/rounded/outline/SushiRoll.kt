package me.localx.icons.rounded.outline

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

public val Icons.Outline.SushiRoll: ImageVector
    get() {
        if (_sushiRoll != null) {
            return _sushiRoll!!
        }
        _sushiRoll = Builder(name = "SushiRoll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.5f)
                curveToRelative(0.0f, -3.645f, -5.271f, -6.5f, -12.0f, -6.5f)
                reflectiveCurveTo(0.0f, 2.855f, 0.0f, 6.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.767f, 5.047f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveToRelative(12.0f, -2.733f, 12.0f, -6.5f)
                lineTo(24.0f, 6.5f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(5.894f, 0.0f, 10.0f, 2.372f, 10.0f, 4.5f)
                reflectiveCurveToRelative(-4.106f, 4.5f, -10.0f, 4.5f)
                reflectiveCurveTo(2.0f, 8.628f, 2.0f, 6.5f)
                reflectiveCurveTo(6.107f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -2.019f, -10.0f, -4.5f)
                verticalLineToRelative(-7.362f)
                curveToRelative(2.132f, 1.738f, 5.778f, 2.862f, 10.0f, 2.862f)
                reflectiveCurveToRelative(7.868f, -1.124f, 10.0f, -2.862f)
                verticalLineToRelative(7.362f)
                curveToRelative(0.0f, 2.481f, -4.486f, 4.5f, -10.0f, 4.5f)
                close()
                moveTo(5.292f, 7.137f)
                curveToRelative(-0.39f, -0.291f, -0.39f, -0.982f, 0.0f, -1.273f)
                curveToRelative(1.141f, -0.853f, 3.443f, -1.863f, 6.708f, -1.863f)
                reflectiveCurveToRelative(5.566f, 1.011f, 6.707f, 1.863f)
                curveToRelative(0.39f, 0.291f, 0.39f, 0.982f, 0.0f, 1.273f)
                curveToRelative(-1.141f, 0.853f, -3.442f, 1.863f, -6.707f, 1.863f)
                reflectiveCurveToRelative(-5.566f, -1.011f, -6.708f, -1.863f)
                close()
            }
        }
        .build()
        return _sushiRoll!!
    }

private var _sushiRoll: ImageVector? = null
