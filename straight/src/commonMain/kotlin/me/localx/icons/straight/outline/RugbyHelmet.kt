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

public val Icons.Outline.RugbyHelmet: ImageVector
    get() {
        if (_rugbyHelmet != null) {
            return _rugbyHelmet!!
        }
        _rugbyHelmet = Builder(name = "RugbyHelmet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.949f, 14.684f)
                lineTo(22.721f, 14.0f)
                lineTo(18.337f, 14.0f)
                lineToRelative(-0.31f, -3.72f)
                lineToRelative(0.343f, -0.05f)
                arcToRelative(2.509f, 2.509f, 0.0f, false, false, 1.991f, -3.345f)
                arcTo(10.5f, 10.5f, 0.0f, false, false, 0.0f, 10.5f)
                arcToRelative(50.976f, 50.976f, 0.0f, false, false, 0.8f, 6.431f)
                arcTo(2.991f, 2.991f, 0.0f, false, false, 2.924f, 19.3f)
                arcToRelative(35.572f, 35.572f, 0.0f, false, true, 8.553f, 3.55f)
                lineToRelative(0.672f, 0.412f)
                lineTo(15.414f, 20.0f)
                lineTo(16.83f, 20.0f)
                lineToRelative(0.222f, 2.665f)
                lineToRelative(0.531f, 0.244f)
                arcTo(13.463f, 13.463f, 0.0f, false, false, 23.0f, 24.0f)
                horizontalLineToRelative(1.0f)
                lineTo(24.0f, 23.0f)
                arcTo(28.48f, 28.48f, 0.0f, false, false, 22.949f, 14.684f)
                close()
                moveTo(21.238f, 16.0f)
                curveToRelative(0.112f, 0.454f, 0.257f, 1.136f, 0.391f, 2.0f)
                lineTo(18.67f, 18.0f)
                lineTo(18.5f, 16.0f)
                close()
                moveTo(16.33f, 14.0f)
                lineTo(13.189f, 14.0f)
                arcToRelative(0.972f, 0.972f, 0.0f, false, true, -0.028f, -0.521f)
                lineToRelative(0.484f, -1.935f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.826f, -0.747f)
                lineToRelative(1.573f, -0.229f)
                close()
                moveTo(11.841f, 20.745f)
                arcToRelative(38.8f, 38.8f, 0.0f, false, false, -8.353f, -3.361f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.719f, -0.788f)
                arcTo(47.758f, 47.758f, 0.0f, false, true, 2.0f, 10.5f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 18.483f, 7.573f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.041f, 0.437f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.36f, 0.241f)
                lineToRelative(-3.9f, 0.566f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, false, -2.478f, 2.242f)
                lineToRelative(-0.484f, 1.935f)
                arcToRelative(2.991f, 2.991f, 0.0f, false, false, 0.285f, 2.179f)
                lineToRelative(2.1f, 3.8f)
                close()
                moveTo(15.355f, 18.0f)
                lineToRelative(-1.106f, -2.0f)
                lineTo(16.5f, 16.0f)
                lineToRelative(0.166f, 2.0f)
                close()
                moveTo(18.946f, 21.311f)
                lineTo(18.837f, 20.0f)
                horizontalLineToRelative(3.034f)
                curveToRelative(0.053f, 0.6f, 0.093f, 1.257f, 0.114f, 1.959f)
                arcTo(11.434f, 11.434f, 0.0f, false, true, 18.946f, 21.311f)
                close()
                moveTo(10.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 16.0f)
                close()
            }
        }
        .build()
        return _rugbyHelmet!!
    }

private var _rugbyHelmet: ImageVector? = null
