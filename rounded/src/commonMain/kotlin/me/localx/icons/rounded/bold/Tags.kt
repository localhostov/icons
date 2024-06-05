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

public val Icons.Bold.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = Builder(name = "Tags", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.557f, 7.153f)
                lineTo(15.318f, 0.964f)
                curveTo(14.547f, 0.232f, 13.5f, -0.105f, 12.447f, 0.03f)
                lineTo(5.821f, 0.905f)
                curveToRelative(-0.821f, 0.109f, -1.399f, 0.862f, -1.291f, 1.684f)
                curveToRelative(0.108f, 0.822f, 0.867f, 1.402f, 1.684f, 1.291f)
                lineToRelative(6.626f, -0.875f)
                curveToRelative(0.15f, -0.02f, 0.301f, 0.028f, 0.388f, 0.112f)
                lineToRelative(6.201f, 6.152f)
                curveToRelative(0.757f, 0.773f, 0.756f, 2.03f, 0.007f, 2.793f)
                lineToRelative(-0.512f, 0.512f)
                curveToRelative(-0.113f, -0.145f, -0.236f, -0.285f, -0.367f, -0.419f)
                lineToRelative(-6.238f, -6.189f)
                curveToRelative(-0.771f, -0.732f, -1.819f, -1.07f, -2.871f, -0.935f)
                lineToRelative(-6.626f, 0.875f)
                curveToRelative(-0.701f, 0.093f, -1.242f, 0.663f, -1.299f, 1.368f)
                lineToRelative(-0.511f, 6.396f)
                curveToRelative(-0.086f, 1.059f, 0.307f, 2.086f, 1.054f, 2.795f)
                lineToRelative(6.086f, 6.035f)
                curveToRelative(0.947f, 0.967f, 2.214f, 1.5f, 3.567f, 1.501f)
                horizontalLineToRelative(0.005f)
                curveToRelative(1.352f, 0.0f, 2.617f, -0.53f, 3.564f, -1.494f)
                lineToRelative(3.278f, -3.333f)
                curveToRelative(0.927f, -0.944f, 1.401f, -2.178f, 1.421f, -3.421f)
                lineToRelative(1.579f, -1.579f)
                curveToRelative(1.896f, -1.929f, 1.898f, -5.072f, -0.01f, -7.02f)
                close()
                moveTo(16.427f, 17.07f)
                lineToRelative(-3.277f, 3.333f)
                curveToRelative(-0.379f, 0.386f, -0.887f, 0.598f, -1.428f, 0.598f)
                curveToRelative(-0.542f, 0.0f, -1.049f, -0.214f, -1.442f, -0.616f)
                lineToRelative(-6.124f, -6.072f)
                curveToRelative(-0.109f, -0.104f, -0.166f, -0.25f, -0.153f, -0.402f)
                lineToRelative(0.414f, -5.189f)
                lineToRelative(5.424f, -0.716f)
                curveToRelative(0.148f, -0.024f, 0.301f, 0.028f, 0.388f, 0.112f)
                lineToRelative(6.201f, 6.152f)
                curveToRelative(0.757f, 0.773f, 0.756f, 2.03f, -0.002f, 2.802f)
                close()
                moveTo(9.0f, 11.5f)
                curveToRelative(-0.034f, 1.972f, -2.967f, 1.971f, -3.0f, 0.0f)
                curveToRelative(0.034f, -1.972f, 2.967f, -1.971f, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
