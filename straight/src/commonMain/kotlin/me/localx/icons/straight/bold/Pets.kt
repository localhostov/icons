package me.localx.icons.straight.bold

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

public val Icons.Bold.Pets: ImageVector
    get() {
        if (_pets != null) {
            return _pets!!
        }
        _pets = Builder(name = "Pets", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.733f, 18.718f)
                lineToRelative(0.291f, 0.477f)
                lineToRelative(-0.313f, 1.88f)
                curveToRelative(-0.282f, 1.694f, -1.734f, 2.924f, -3.452f, 2.924f)
                horizontalLineToRelative(-4.306f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.306f)
                curveToRelative(0.245f, 0.0f, 0.453f, -0.176f, 0.493f, -0.418f)
                lineToRelative(0.131f, -0.785f)
                curveToRelative(-0.949f, -1.625f, -1.016f, -2.152f, -1.039f, -2.335f)
                curveToRelative(-0.102f, -0.805f, -0.455f, -1.264f, -1.259f, -1.637f)
                curveToRelative(0.0f, 0.0f, -1.8f, -0.825f, -2.131f, -0.825f)
                curveToRelative(-0.483f, 0.0f, -0.784f, 0.101f, -0.874f, 0.135f)
                curveToRelative(-3.832f, 2.274f, -5.694f, 5.174f, -5.694f, 8.865f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -4.798f, 2.436f, -8.664f, 7.24f, -11.49f)
                curveToRelative(0.108f, -0.059f, 0.393f, -0.198f, 0.828f, -0.316f)
                verticalLineToRelative(-0.194f)
                curveToRelative(0.0f, -1.657f, 1.391f, -3.0f, 3.047f, -3.0f)
                verticalLineToRelative(3.281f)
                curveToRelative(0.6f, 0.197f, 1.846f, 0.822f, 1.846f, 0.822f)
                curveToRelative(1.714f, 0.794f, 2.711f, 2.106f, 2.962f, 3.9f)
                curveToRelative(0.1f, 0.271f, 0.517f, 1.048f, 0.924f, 1.715f)
                close()
                moveTo(19.856f, 6.0f)
                curveToRelative(-0.399f, 0.0f, -0.759f, -0.236f, -0.919f, -0.602f)
                curveToRelative(-0.638f, -1.457f, -2.078f, -2.398f, -3.668f, -2.398f)
                horizontalLineToRelative(-2.269f)
                lineTo(13.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(0.282f)
                lineToRelative(-4.319f, 6.718f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.319f)
                lineToRelative(4.5f, -7.0f)
                horizontalLineToRelative(3.45f)
                curveToRelative(0.399f, 0.0f, 0.76f, 0.236f, 0.919f, 0.601f)
                curveToRelative(0.638f, 1.457f, 2.077f, 2.399f, 3.668f, 2.399f)
                horizontalLineToRelative(1.144f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.581f)
                curveToRelative(1.001f, 0.695f, 1.768f, 1.591f, 2.266f, 2.666f)
                curveToRelative(1.647f, -0.669f, 2.814f, -2.281f, 2.814f, -4.166f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-4.144f)
                close()
            }
        }
        .build()
        return _pets!!
    }

private var _pets: ImageVector? = null
