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

public val Icons.Outline.BookArrowRight: ImageVector
    get() {
        if (_bookArrowRight != null) {
            return _bookArrowRight!!
        }
        _bookArrowRight = Builder(name = "BookArrowRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.133f, 12.093f)
                lineToRelative(-1.614f, 1.614f)
                curveToRelative(-0.929f, 0.921f, -2.335f, -0.486f, -1.414f, -1.414f)
                lineToRelative(1.293f, -1.293f)
                lineTo(13.0f, 11.0f)
                curveToRelative(-1.308f, -0.006f, -1.307f, -1.995f, 0.0f, -2.0f)
                horizontalLineToRelative(8.398f)
                lineToRelative(-1.293f, -1.293f)
                curveToRelative(-0.921f, -0.928f, 0.486f, -2.335f, 1.414f, -1.414f)
                lineToRelative(1.614f, 1.614f)
                curveToRelative(1.154f, 1.154f, 1.154f, 3.032f, 0.0f, 4.187f)
                close()
                moveTo(20.0f, 16.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                lineTo(15.0f, 0.0f)
                curveToRelative(2.282f, 0.0f, 4.273f, 1.542f, 4.843f, 3.75f)
                curveToRelative(0.138f, 0.535f, -0.185f, 1.08f, -0.72f, 1.218f)
                curveToRelative(-0.526f, 0.14f, -1.08f, -0.183f, -1.218f, -0.719f)
                curveToRelative(-0.341f, -1.325f, -1.535f, -2.25f, -2.905f, -2.25f)
                lineTo(6.0f, 1.999f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.006f, -1.308f, 1.995f, -1.307f, 2.0f, 0.0f)
                close()
                moveTo(2.0f, 5.0f)
                verticalLineToRelative(11.556f)
                curveToRelative(0.591f, -0.344f, 1.268f, -0.556f, 2.0f, -0.556f)
                lineTo(4.0f, 2.184f)
                curveToRelative(-1.161f, 0.414f, -2.0f, 1.514f, -2.0f, 2.816f)
                close()
                moveTo(18.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 18.0f)
                curveToRelative(-2.629f, 0.047f, -2.627f, 3.953f, 0.0f, 4.0f)
                lineTo(15.0f, 22.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _bookArrowRight!!
    }

private var _bookArrowRight: ImageVector? = null
