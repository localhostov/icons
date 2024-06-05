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

public val Icons.Bold.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.822f, 8.699f)
                lineToRelative(-4.839f, -5.199f)
                curveTo(13.647f, -0.743f, 9.254f, -0.221f, 7.019f, 0.472f)
                curveToRelative(-0.979f, 0.304f, -1.704f, 1.077f, -1.94f, 2.069f)
                curveToRelative(-0.233f, 0.978f, 0.055f, 1.979f, 0.77f, 2.684f)
                lineToRelative(4.982f, 5.124f)
                lineTo(0.571f, 20.601f)
                curveToRelative(-0.773f, 0.789f, -0.759f, 2.056f, 0.031f, 2.828f)
                curveToRelative(0.789f, 0.773f, 2.056f, 0.759f, 2.828f, -0.031f)
                lineTo(13.619f, 13.217f)
                lineToRelative(2.273f, 2.338f)
                curveToRelative(0.792f, 0.791f, 1.842f, 1.225f, 2.96f, 1.225f)
                horizontalLineToRelative(0.025f)
                curveToRelative(1.127f, -0.006f, 2.183f, -0.453f, 2.972f, -1.259f)
                lineToRelative(0.955f, -0.977f)
                curveToRelative(1.589f, -1.624f, 1.583f, -4.261f, 0.018f, -5.845f)
                close()
                moveTo(15.836f, 5.594f)
                lineToRelative(1.49f, 1.602f)
                lineToRelative(-2.717f, 2.736f)
                lineTo(8.133f, 3.271f)
                curveToRelative(1.95f, -0.534f, 4.803f, -0.512f, 7.702f, 2.323f)
                close()
                moveTo(20.66f, 12.446f)
                lineToRelative(-0.955f, 0.976f)
                curveToRelative(-0.224f, 0.229f, -0.524f, 0.356f, -0.845f, 0.358f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-0.318f, 0.0f, -0.616f, -0.123f, -0.826f, -0.332f)
                lineToRelative(-1.327f, -1.365f)
                lineToRelative(2.671f, -2.689f)
                lineToRelative(1.285f, 1.381f)
                curveToRelative(0.454f, 0.46f, 0.456f, 1.21f, 0.004f, 1.671f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
