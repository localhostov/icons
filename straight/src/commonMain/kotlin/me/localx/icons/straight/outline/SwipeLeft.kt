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

public val Icons.Outline.SwipeLeft: ImageVector
    get() {
        if (_swipeLeft != null) {
            return _swipeLeft!!
        }
        _swipeLeft = Builder(name = "SwipeLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 3.107f)
                curveToRelative(0.0f, -1.516f, -1.076f, -2.835f, -2.503f, -3.067f)
                curveToRelative(-0.88f, -0.142f, -1.768f, 0.102f, -2.439f, 0.674f)
                curveToRelative(-0.672f, 0.571f, -1.058f, 1.404f, -1.058f, 2.286f)
                verticalLineToRelative(11.566f)
                lineToRelative(-0.955f, -0.759f)
                curveToRelative(-1.208f, -1.128f, -3.107f, -1.063f, -4.235f, 0.143f)
                curveToRelative(-1.13f, 1.208f, -1.067f, 3.11f, 0.129f, 4.231f)
                lineToRelative(6.035f, 5.818f)
                horizontalLineToRelative(15.026f)
                verticalLineToRelative(-12.819f)
                lineToRelative(-10.0f, -2.0f)
                lineTo(12.0f, 3.107f)
                close()
                moveTo(20.0f, 12.819f)
                verticalLineToRelative(9.181f)
                lineTo(7.78f, 22.0f)
                lineToRelative(-5.464f, -5.268f)
                curveToRelative(-0.402f, -0.378f, -0.424f, -1.013f, -0.046f, -1.416f)
                curveToRelative(0.182f, -0.194f, 0.429f, -0.307f, 0.694f, -0.315f)
                curveToRelative(0.267f, 0.004f, 0.521f, 0.085f, 0.774f, 0.319f)
                lineToRelative(4.261f, 3.392f)
                lineTo(7.999f, 3.0f)
                curveToRelative(0.0f, -0.294f, 0.129f, -0.572f, 0.353f, -0.763f)
                curveToRelative(0.228f, -0.193f, 0.52f, -0.273f, 0.822f, -0.223f)
                curveToRelative(0.463f, 0.075f, 0.825f, 0.555f, 0.825f, 1.093f)
                verticalLineToRelative(7.712f)
                lineToRelative(10.0f, 2.0f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.892f)
                lineToRelative(1.574f, 1.574f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.761f, -2.762f)
                curveToRelative(-0.693f, -0.693f, -0.694f, -1.822f, 0.0f, -2.518f)
                lineTo(17.268f, -0.053f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.638f, 1.639f)
                horizontalLineToRelative(6.956f)
                close()
            }
        }
        .build()
        return _swipeLeft!!
    }

private var _swipeLeft: ImageVector? = null
