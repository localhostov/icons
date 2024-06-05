package me.localx.icons.straight.outline

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

public val Icons.Outline.Angel: ImageVector
    get() {
        if (_angel != null) {
            return _angel!!
        }
        _angel = Builder(name = "Angel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 3.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(8.057f, 4.867f)
                curveToRelative(0.116f, -0.7f, 0.415f, -1.337f, 0.843f, -1.867f)
                curveToRelative(0.0f, 0.0f, 0.599f, -1.0f, 3.099f, -1.0f)
                reflectiveCurveToRelative(3.099f, 1.0f, 3.099f, 1.0f)
                curveToRelative(0.428f, 0.53f, 0.727f, 1.167f, 0.843f, 1.867f)
                curveToRelative(0.657f, -0.507f, 1.057f, -1.145f, 1.057f, -1.867f)
                curveToRelative(0.0f, -1.71f, -2.149f, -3.0f, -5.0f, -3.0f)
                reflectiveCurveToRelative(-5.0f, 1.29f, -5.0f, 3.0f)
                curveToRelative(0.0f, 0.722f, 0.4f, 1.36f, 1.057f, 1.867f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.615f)
                lineToRelative(1.009f, 2.385f)
                lineTo(2.991f, 24.0f)
                lineToRelative(1.009f, -2.385f)
                verticalLineToRelative(-2.615f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.007f, 0.341f, -10.0f, 3.5f, -10.0f)
                curveToRelative(3.434f, 0.0f, 6.139f, 2.872f, 6.865f, 3.722f)
                curveToRelative(1.061f, 0.368f, 2.21f, 0.368f, 3.271f, 0.0f)
                curveToRelative(0.726f, -0.851f, 3.431f, -3.722f, 6.865f, -3.722f)
                curveToRelative(3.159f, 0.0f, 3.5f, 6.993f, 3.5f, 10.0f)
                close()
                moveTo(5.953f, 17.0f)
                lineToRelative(2.646f, -6.251f)
                curveToRelative(-0.805f, -0.868f, -2.812f, -2.749f, -5.099f, -2.749f)
                curveToRelative(-0.624f, 0.171f, -1.368f, 3.237f, -1.484f, 7.0f)
                horizontalLineToRelative(1.984f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.953f)
                close()
                moveTo(17.99f, 22.0f)
                lineToRelative(-4.318f, -10.204f)
                curveToRelative(-1.095f, 0.271f, -2.251f, 0.271f, -3.346f, 0.0f)
                lineToRelative(-4.318f, 10.204f)
                horizontalLineToRelative(11.981f)
                close()
                moveTo(21.984f, 15.0f)
                curveToRelative(-0.117f, -3.763f, -0.86f, -6.829f, -1.484f, -7.0f)
                curveToRelative(-2.287f, 0.0f, -4.295f, 1.881f, -5.099f, 2.749f)
                lineToRelative(2.646f, 6.251f)
                horizontalLineToRelative(1.953f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.984f)
                close()
            }
        }
        .build()
        return _angel!!
    }

private var _angel: ImageVector? = null
