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

public val Icons.Outline.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.765f, 9.458f)
                lineTo(4.98f, 0.019f)
                verticalLineToRelative(24.0f)
                lineToRelative(14.779f, -9.473f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, false, 0.006f, -5.088f)
                close()
                moveTo(18.685f, 12.853f)
                lineTo(6.985f, 20.353f)
                lineTo(6.985f, 3.677f)
                lineToRelative(11.707f, 7.474f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.007f, 1.7f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
