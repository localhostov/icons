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

public val Icons.Bold.CircleOverlap: ImageVector
    get() {
        if (_circleOverlap != null) {
            return _circleOverlap!!
        }
        _circleOverlap = Builder(name = "CircleOverlap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.611f, 6.389f)
                curveTo(16.489f, 2.696f, 13.054f, 0.0f, 9.0f, 0.0f)
                curveTo(4.038f, 0.0f, 0.0f, 4.038f, 0.0f, 9.0f)
                curveToRelative(0.0f, 4.054f, 2.696f, 7.489f, 6.389f, 8.611f)
                curveToRelative(1.122f, 3.693f, 4.556f, 6.389f, 8.611f, 6.389f)
                curveToRelative(4.962f, 0.0f, 9.0f, -4.038f, 9.0f, -9.0f)
                curveToRelative(0.0f, -4.054f, -2.696f, -7.489f, -6.389f, -8.611f)
                close()
                moveTo(3.0f, 9.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                curveToRelative(2.232f, 0.0f, 4.179f, 1.227f, 5.213f, 3.04f)
                curveToRelative(-4.334f, 0.378f, -7.794f, 3.838f, -8.173f, 8.173f)
                curveToRelative(-1.813f, -1.034f, -3.04f, -2.981f, -3.04f, -5.213f)
                close()
                moveTo(15.0f, 21.0f)
                curveToRelative(-2.232f, 0.0f, -4.179f, -1.227f, -5.213f, -3.04f)
                curveToRelative(4.334f, -0.378f, 7.794f, -3.838f, 8.173f, -8.173f)
                curveToRelative(1.813f, 1.034f, 3.04f, 2.981f, 3.04f, 5.213f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _circleOverlap!!
    }

private var _circleOverlap: ImageVector? = null
