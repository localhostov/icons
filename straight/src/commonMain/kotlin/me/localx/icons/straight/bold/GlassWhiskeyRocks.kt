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

public val Icons.Bold.GlassWhiskeyRocks: ImageVector
    get() {
        if (_glassWhiskeyRocks != null) {
            return _glassWhiskeyRocks!!
        }
        _glassWhiskeyRocks = Builder(name = "GlassWhiskeyRocks", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.685f, 23.0f)
                lineTo(5.193f, 23.0f)
                curveToRelative(-1.822f, 0.0f, -3.321f, -1.368f, -3.486f, -3.183f)
                lineTo(-0.003f, 1.0f)
                horizontalLineToRelative(24.001f)
                lineToRelative(-1.829f, 18.838f)
                curveToRelative(-0.176f, 1.802f, -1.673f, 3.162f, -3.484f, 3.162f)
                close()
                moveTo(3.282f, 4.0f)
                lineToRelative(1.413f, 15.545f)
                curveToRelative(0.023f, 0.259f, 0.237f, 0.455f, 0.498f, 0.455f)
                horizontalLineToRelative(13.491f)
                curveToRelative(0.259f, 0.0f, 0.474f, -0.194f, 0.498f, -0.452f)
                lineToRelative(1.511f, -15.548f)
                lineTo(3.282f, 4.0f)
                close()
                moveTo(13.879f, 19.0f)
                curveToRelative(-0.512f, 0.0f, -1.024f, -0.195f, -1.414f, -0.585f)
                lineToRelative(-2.122f, -2.121f)
                curveToRelative(-0.778f, -0.78f, -0.778f, -2.048f, 0.0f, -2.828f)
                lineToRelative(2.123f, -2.122f)
                curveToRelative(0.779f, -0.78f, 2.049f, -0.78f, 2.828f, 0.0f)
                lineToRelative(2.121f, 2.121f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.049f, 0.0f, 2.829f)
                lineToRelative(-2.121f, 2.121f)
                curveToRelative(-0.39f, 0.39f, -0.902f, 0.585f, -1.414f, 0.585f)
                close()
                moveTo(8.664f, 11.794f)
                lineToRelative(2.125f, -2.124f)
                curveToRelative(0.594f, -0.594f, 1.345f, -0.969f, 2.159f, -1.105f)
                curveToRelative(-0.199f, -0.894f, -0.996f, -1.565f, -1.949f, -1.565f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.953f, 0.671f, 1.749f, 1.564f, 1.949f)
                curveToRelative(0.133f, -0.789f, 0.495f, -1.547f, 1.101f, -2.154f)
                close()
            }
        }
        .build()
        return _glassWhiskeyRocks!!
    }

private var _glassWhiskeyRocks: ImageVector? = null
