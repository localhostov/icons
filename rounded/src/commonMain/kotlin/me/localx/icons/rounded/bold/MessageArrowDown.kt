package me.localx.icons.rounded.bold

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

public val Icons.Bold.MessageArrowDown: ImageVector
    get() {
        if (_messageArrowDown != null) {
            return _messageArrowDown!!
        }
        _messageArrowDown = Builder(name = "MessageArrowDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.87f, 12.707f)
                lineToRelative(-3.163f, 3.163f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                lineToRelative(-3.163f, -3.163f)
                curveToRelative(-0.63f, -0.63f, -0.184f, -1.707f, 0.707f, -1.707f)
                horizontalLineToRelative(1.663f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1.663f)
                curveToRelative(0.891f, 0.0f, 1.337f, 1.077f, 0.707f, 1.707f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-1.172f)
                lineToRelative(-3.708f, 3.066f)
                curveToRelative(-0.448f, 0.398f, -1.024f, 0.6f, -1.606f, 0.6f)
                curveToRelative(-0.595f, 0.0f, -1.195f, -0.21f, -1.674f, -0.635f)
                lineToRelative(-3.6f, -3.031f)
                horizontalLineToRelative(-1.24f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(-0.0f, 5.5f)
                curveTo(0.0f, 2.467f, 2.468f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.788f)
                curveToRelative(0.354f, 0.0f, 0.696f, 0.125f, 0.967f, 0.353f)
                lineToRelative(3.749f, 3.158f)
                lineToRelative(3.828f, -3.167f)
                curveToRelative(0.27f, -0.222f, 0.607f, -0.344f, 0.956f, -0.344f)
                horizontalLineToRelative(1.712f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(21.0f, 5.5f)
                close()
            }
        }
        .build()
        return _messageArrowDown!!
    }

private var _messageArrowDown: ImageVector? = null
