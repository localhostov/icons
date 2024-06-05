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

public val Icons.Outline.Whistle: ImageVector
    get() {
        if (_whistle != null) {
            return _whistle!!
        }
        _whistle = Builder(name = "Whistle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.0f, 16.0f)
                close()
                moveTo(10.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 16.0f)
                close()
                moveTo(8.229f, 8.0f)
                arcTo(8.152f, 8.152f, 0.0f, false, false, 0.022f, 15.394f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.006f, 24.0f)
                arcToRelative(8.264f, 8.264f, 0.0f, false, false, 1.279f, -0.1f)
                arcToRelative(7.956f, 7.956f, 0.0f, false, false, 5.908f, -4.46f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 16.0f, 16.152f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.786f, -1.006f)
                lineTo(24.0f, 13.835f)
                lineTo(24.0f, 8.0f)
                close()
                moveTo(22.0f, 12.166f)
                lineToRelative(-5.573f, 1.013f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 14.0f, 16.112f)
                arcToRelative(5.938f, 5.938f, 0.0f, false, true, -0.607f, 2.46f)
                arcToRelative(5.986f, 5.986f, 0.0f, false, true, -11.375f, -3.03f)
                arcTo(6.144f, 6.144f, 0.0f, false, true, 8.229f, 10.0f)
                lineTo(22.0f, 10.0f)
                close()
                moveTo(11.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.9f, 6.44f)
                lineTo(12.149f, 5.473f)
                lineTo(14.565f, 1.1f)
                lineToRelative(1.751f, 0.966f)
                close()
                moveTo(6.126f, 6.44f)
                lineTo(3.708f, 2.062f)
                lineTo(5.459f, 1.1f)
                lineTo(7.875f, 5.473f)
                close()
            }
        }
        .build()
        return _whistle!!
    }

private var _whistle: ImageVector? = null
