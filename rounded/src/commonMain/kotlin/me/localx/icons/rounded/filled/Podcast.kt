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

public val Icons.Filled.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = Builder(name = "Podcast", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.417f, 16.902f)
                curveToRelative(0.492f, 0.559f, 0.691f, 1.327f, 0.578f, 2.224f)
                lineToRelative(-0.541f, 2.865f)
                curveToRelative(-0.257f, 1.172f, -1.454f, 2.009f, -2.454f, 2.009f)
                reflectiveCurveToRelative(-2.172f, -0.837f, -2.423f, -1.98f)
                lineToRelative(-0.536f, -2.834f)
                curveToRelative(-0.124f, -0.956f, 0.076f, -1.725f, 0.568f, -2.283f)
                curveToRelative(0.528f, -0.599f, 1.333f, -0.902f, 2.392f, -0.902f)
                curveToRelative(1.083f, 0.0f, 1.888f, 0.304f, 2.416f, 0.902f)
                close()
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 4.071f, 2.039f, 7.831f, 5.453f, 10.059f)
                curveToRelative(0.463f, 0.301f, 1.083f, 0.171f, 1.384f, -0.292f)
                curveToRelative(0.302f, -0.462f, 0.171f, -1.082f, -0.291f, -1.384f)
                curveToRelative(-2.847f, -1.856f, -4.546f, -4.99f, -4.546f, -8.383f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 3.393f, -1.699f, 6.526f, -4.546f, 8.383f)
                curveToRelative(-0.462f, 0.302f, -0.593f, 0.922f, -0.291f, 1.384f)
                curveToRelative(0.191f, 0.294f, 0.512f, 0.454f, 0.838f, 0.454f)
                curveToRelative(0.188f, 0.0f, 0.376f, -0.053f, 0.545f, -0.162f)
                curveToRelative(3.415f, -2.228f, 5.453f, -5.987f, 5.453f, -10.059f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.833f, 15.871f)
                curveToRelative(0.764f, -1.148f, 1.167f, -2.487f, 1.167f, -3.871f)
                curveToRelative(0.0f, -3.859f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.141f, -7.0f, 7.0f)
                curveToRelative(0.0f, 1.336f, 0.402f, 2.657f, 1.163f, 3.822f)
                curveToRelative(0.302f, 0.463f, 0.921f, 0.593f, 1.384f, 0.29f)
                curveToRelative(0.462f, -0.302f, 0.592f, -0.921f, 0.291f, -1.384f)
                curveToRelative(-0.548f, -0.839f, -0.837f, -1.782f, -0.837f, -2.729f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 0.988f, -0.288f, 1.944f, -0.833f, 2.764f)
                curveToRelative(-0.306f, 0.46f, -0.181f, 1.081f, 0.279f, 1.387f)
                curveToRelative(0.17f, 0.113f, 0.363f, 0.167f, 0.553f, 0.167f)
                curveToRelative(0.324f, 0.0f, 0.641f, -0.156f, 0.833f, -0.446f)
                close()
            }
        }
        .build()
        return _podcast!!
    }

private var _podcast: ImageVector? = null
