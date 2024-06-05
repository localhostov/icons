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

public val Icons.Bold.Transporter5: ImageVector
    get() {
        if (_transporter5 != null) {
            return _transporter5!!
        }
        _transporter5 = Builder(name = "Transporter5", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 14.0f)
                close()
                moveTo(15.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 1.0f)
                close()
                moveTo(18.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(4.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(21.667f, 14.353f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(2.333f, -1.167f)
                lineToRelative(-2.333f, -1.167f)
                close()
                moveTo(6.5f, 3.5f)
                lineToRelative(-2.0f, -1.0f)
                lineTo(3.5f, 0.5f)
                lineToRelative(-1.0f, 2.0f)
                lineTo(0.5f, 3.5f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.0f, -1.0f)
                close()
            }
        }
        .build()
        return _transporter5!!
    }

private var _transporter5: ImageVector? = null
