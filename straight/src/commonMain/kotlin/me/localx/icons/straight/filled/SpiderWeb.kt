package me.localx.icons.straight.filled

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

public val Icons.Filled.SpiderWeb: ImageVector
    get() {
        if (_spiderWeb != null) {
            return _spiderWeb!!
        }
        _spiderWeb = Builder(name = "SpiderWeb", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.568f, 10.35f)
                lineToRelative(-4.516f, -7.774f)
                curveToRelative(-0.563f, -0.972f, -1.61f, -1.575f, -2.729f, -1.575f)
                lineTo(7.677f, 1.001f)
                curveToRelative(-1.119f, 0.0f, -2.166f, 0.604f, -2.729f, 1.575f)
                lineTo(0.432f, 10.35f)
                curveToRelative(-0.578f, 0.994f, -0.575f, 2.227f, 0.008f, 3.217f)
                lineToRelative(4.631f, 7.874f)
                curveToRelative(0.566f, 0.962f, 1.609f, 1.56f, 2.722f, 1.56f)
                horizontalLineToRelative(8.416f)
                curveToRelative(1.112f, 0.0f, 2.155f, -0.598f, 2.723f, -1.561f)
                lineToRelative(4.629f, -7.873f)
                curveToRelative(0.584f, -0.991f, 0.587f, -2.223f, 0.009f, -3.217f)
                close()
                moveTo(21.634f, 11.0f)
                horizontalLineToRelative(-2.183f)
                lineToRelative(-2.961f, -5.029f)
                lineToRelative(1.09f, -1.951f)
                lineToRelative(4.054f, 6.98f)
                close()
                moveTo(14.741f, 5.0f)
                horizontalLineToRelative(-5.482f)
                lineToRelative(-1.117f, -2.0f)
                horizontalLineToRelative(7.716f)
                lineToRelative(-1.117f, 2.0f)
                close()
                moveTo(13.624f, 7.0f)
                lineToRelative(-1.624f, 2.907f)
                lineToRelative(-1.624f, -2.907f)
                horizontalLineToRelative(3.247f)
                close()
                moveTo(10.32f, 11.0f)
                horizontalLineToRelative(-3.4f)
                lineToRelative(1.733f, -2.984f)
                lineToRelative(1.667f, 2.984f)
                close()
                moveTo(10.273f, 13.0f)
                lineToRelative(-1.613f, 2.888f)
                lineToRelative(-1.698f, -2.888f)
                horizontalLineToRelative(3.311f)
                close()
                moveTo(12.001f, 14.008f)
                lineToRelative(1.671f, 2.992f)
                horizontalLineToRelative(-3.342f)
                lineToRelative(1.671f, -2.992f)
                close()
                moveTo(9.212f, 19.0f)
                horizontalLineToRelative(5.577f)
                lineToRelative(1.117f, 2.0f)
                horizontalLineToRelative(-7.811f)
                lineToRelative(1.117f, -2.0f)
                close()
                moveTo(13.728f, 13.0f)
                horizontalLineToRelative(3.321f)
                lineToRelative(-1.704f, 2.896f)
                lineToRelative(-1.618f, -2.896f)
                close()
                moveTo(13.681f, 11.0f)
                lineToRelative(1.672f, -2.993f)
                lineToRelative(1.738f, 2.993f)
                horizontalLineToRelative(-3.41f)
                close()
                moveTo(6.421f, 4.02f)
                lineToRelative(1.099f, 1.967f)
                lineToRelative(-2.911f, 5.013f)
                horizontalLineToRelative(-2.243f)
                lineToRelative(4.054f, -6.98f)
                close()
                moveTo(2.427f, 13.0f)
                horizontalLineToRelative(2.214f)
                lineToRelative(2.888f, 4.911f)
                lineToRelative(-1.078f, 1.93f)
                lineToRelative(-4.024f, -6.842f)
                close()
                moveTo(17.55f, 19.842f)
                lineToRelative(-1.074f, -1.922f)
                lineToRelative(2.893f, -4.92f)
                horizontalLineToRelative(2.204f)
                lineToRelative(-4.023f, 6.842f)
                close()
            }
        }
        .build()
        return _spiderWeb!!
    }

private var _spiderWeb: ImageVector? = null
