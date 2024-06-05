package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.InboxIn: ImageVector
    get() {
        if (_inboxIn != null) {
            return _inboxIn!!
        }
        _inboxIn = Builder(name = "InboxIn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 12.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(3.5f, 12.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.001f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-3.001f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 18.501f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.001f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-3.001f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.708f)
                curveToRelative(0.654f, 2.306f, 2.779f, 4.0f, 5.292f, 4.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.513f, 0.0f, 4.638f, -1.694f, 5.292f, -4.0f)
                horizontalLineToRelative(2.208f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(3.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.356f, 11.731f)
                curveToRelative(0.354f, 0.359f, 0.934f, 0.359f, 1.288f, 0.0f)
                lineToRelative(3.299f, -3.342f)
                curveToRelative(0.509f, -0.515f, 0.144f, -1.388f, -0.58f, -1.388f)
                horizontalLineToRelative(-1.863f)
                verticalLineTo(1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-1.863f)
                curveToRelative(-0.724f, 0.0f, -1.089f, 0.873f, -0.58f, 1.388f)
                lineToRelative(3.299f, 3.342f)
                close()
            }
        }
        .build()
        return _inboxIn!!
    }

private var _inboxIn: ImageVector? = null
