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

public val Icons.Bold.Burst: ImageVector
    get() {
        if (_burst != null) {
            return _burst!!
        }
        _burst = Builder(name = "Burst", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.044f, 11.891f)
                lineToRelative(-4.929f, -2.632f)
                lineToRelative(3.562f, -7.034f)
                lineToRelative(-7.386f, 3.127f)
                lineTo(12.395f, -0.078f)
                lineToRelative(-2.789f, 5.238f)
                lineTo(0.214f, 0.164f)
                lineTo(5.611f, 9.27f)
                lineTo(-0.078f, 12.075f)
                lineToRelative(5.855f, 2.586f)
                lineToRelative(-2.169f, 5.911f)
                lineToRelative(5.939f, -2.041f)
                lineToRelative(2.971f, 5.55f)
                lineToRelative(2.755f, -5.385f)
                lineToRelative(8.009f, 3.958f)
                lineToRelative(-4.078f, -8.173f)
                lineToRelative(4.841f, -2.589f)
                close()
                moveTo(16.615f, 16.013f)
                lineToRelative(-2.667f, -1.317f)
                lineToRelative(-1.491f, 2.916f)
                lineToRelative(-1.471f, -2.747f)
                lineToRelative(-2.389f, 0.821f)
                lineToRelative(0.966f, -2.631f)
                lineToRelative(-2.555f, -1.128f)
                lineToRelative(2.834f, -1.397f)
                lineToRelative(-1.595f, -2.691f)
                lineToRelative(2.596f, 1.382f)
                lineToRelative(1.553f, -2.917f)
                lineToRelative(1.539f, 2.883f)
                lineToRelative(2.36f, -1.0f)
                lineToRelative(-1.184f, 2.336f)
                lineToRelative(2.567f, 1.372f)
                lineToRelative(-2.464f, 1.318f)
                lineToRelative(1.398f, 2.802f)
                close()
            }
        }
        .build()
        return _burst!!
    }

private var _burst: ImageVector? = null
