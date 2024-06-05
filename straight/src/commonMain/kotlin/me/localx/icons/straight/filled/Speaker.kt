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

public val Icons.Filled.Speaker: ImageVector
    get() {
        if (_speaker != null) {
            return _speaker!!
        }
        _speaker = Builder(name = "Speaker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                lineTo(18.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 13.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 3.5f)
                close()
                moveTo(18.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.0f, 6.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 18.0f, 16.0f)
                close()
                moveTo(16.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
                moveTo(13.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _speaker!!
    }

private var _speaker: ImageVector? = null
