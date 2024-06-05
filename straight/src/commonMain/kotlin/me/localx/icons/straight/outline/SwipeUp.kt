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

public val Icons.Outline.SwipeUp: ImageVector
    get() {
        if (_swipeUp != null) {
            return _swipeUp!!
        }
        _swipeUp = Builder(name = "SwipeUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 9.198f)
                lineTo(15.0f, 3.107f)
                curveToRelative(0.0f, -1.516f, -1.076f, -2.835f, -2.503f, -3.067f)
                curveToRelative(-0.878f, -0.142f, -1.768f, 0.102f, -2.439f, 0.674f)
                curveToRelative(-0.672f, 0.571f, -1.058f, 1.404f, -1.058f, 2.286f)
                verticalLineToRelative(11.565f)
                lineToRelative(-0.955f, -0.758f)
                curveToRelative(-1.207f, -1.128f, -3.107f, -1.063f, -4.236f, 0.144f)
                curveToRelative(-1.13f, 1.208f, -1.066f, 3.11f, 0.13f, 4.23f)
                lineToRelative(6.034f, 5.818f)
                horizontalLineToRelative(14.027f)
                verticalLineToRelative(-12.802f)
                lineToRelative(-9.0f, -2.0f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-11.219f)
                lineToRelative(-5.464f, -5.268f)
                curveToRelative(-0.403f, -0.378f, -0.424f, -1.013f, -0.047f, -1.416f)
                curveToRelative(0.376f, -0.401f, 1.008f, -0.423f, 1.47f, 0.004f)
                lineToRelative(4.26f, 3.392f)
                lineTo(11.0f, 3.0f)
                curveToRelative(0.0f, -0.294f, 0.129f, -0.572f, 0.353f, -0.763f)
                curveToRelative(0.227f, -0.193f, 0.517f, -0.273f, 0.822f, -0.223f)
                curveToRelative(0.462f, 0.075f, 0.825f, 0.555f, 0.825f, 1.093f)
                verticalLineToRelative(7.694f)
                lineToRelative(9.0f, 2.0f)
                verticalLineToRelative(9.198f)
                close()
                moveTo(3.0f, 10.0f)
                lineTo(3.0f, 3.109f)
                lineToRelative(-1.574f, 1.573f)
                lineTo(0.012f, 3.268f)
                lineTo(2.773f, 0.507f)
                curveToRelative(0.694f, -0.692f, 1.824f, -0.694f, 2.518f, 0.0f)
                lineToRelative(2.762f, 2.762f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.639f, -1.639f)
                verticalLineToRelative(6.957f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _swipeUp!!
    }

private var _swipeUp: ImageVector? = null
