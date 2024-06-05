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

public val Icons.Bold.AngleSquareDown: ImageVector
    get() {
        if (_angleSquareDown != null) {
            return _angleSquareDown!!
        }
        _angleSquareDown = Builder(name = "AngleSquareDown", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 24.0f, 3.5f)
                close()
                moveTo(3.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(13.768f, 15.268f)
                lineTo(18.018f, 11.018f)
                lineTo(15.9f, 8.9f)
                lineToRelative(-3.9f, 3.9f)
                lineTo(8.1f, 8.9f)
                lineTo(5.982f, 11.018f)
                lineToRelative(4.25f, 4.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.536f, 0.0f)
                close()
            }
        }
        .build()
        return _angleSquareDown!!
    }

private var _angleSquareDown: ImageVector? = null
