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

public val Icons.Bold.Transporter7: ImageVector
    get() {
        if (_transporter7 != null) {
            return _transporter7!!
        }
        _transporter7 = Builder(name = "Transporter7", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 21.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(7.0f, 3.5f)
                lineToRelative(-2.333f, -1.167f)
                lineTo(3.5f, 0.0f)
                lineToRelative(-1.167f, 2.333f)
                lineTo(0.0f, 3.5f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(2.333f, -1.167f)
                close()
                moveTo(21.5f, 14.5f)
                lineToRelative(-1.0f, -2.5f)
                lineToRelative(-1.0f, 2.5f)
                lineToRelative(-2.5f, 1.0f)
                lineToRelative(2.5f, 1.0f)
                lineToRelative(1.0f, 2.5f)
                lineToRelative(1.0f, -2.5f)
                lineToRelative(2.5f, -1.0f)
                lineToRelative(-2.5f, -1.0f)
                close()
            }
        }
        .build()
        return _transporter7!!
    }

private var _transporter7: ImageVector? = null
