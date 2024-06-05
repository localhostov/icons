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

public val Icons.Filled.Whistle: ImageVector
    get() {
        if (_whistle != null) {
            return _whistle!!
        }
        _whistle = Builder(name = "Whistle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 16.0f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(5.835f)
                lineToRelative(-7.215f, 1.311f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 16.152f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -0.806f, 3.287f)
                arcTo(7.956f, 7.956f, 0.0f, false, true, 9.285f, 23.9f)
                arcToRelative(8.264f, 8.264f, 0.0f, false, true, -1.279f, 0.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.984f, -8.6f)
                arcTo(8.152f, 8.152f, 0.0f, false, true, 8.229f, 8.0f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 16.0f)
                close()
                moveTo(11.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.316f, 2.062f)
                lineTo(14.565f, 1.1f)
                lineTo(12.148f, 5.473f)
                lineTo(13.9f, 6.44f)
                close()
                moveTo(7.875f, 5.473f)
                lineTo(5.459f, 1.1f)
                lineToRelative(-1.751f, 0.966f)
                lineTo(6.125f, 6.44f)
                close()
            }
        }
        .build()
        return _whistle!!
    }

private var _whistle: ImageVector? = null
