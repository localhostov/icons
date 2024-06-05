package me.localx.icons.rounded.filled

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

public val Icons.Filled.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 24.0f)
                lineTo(8.13f, 24.0f)
                arcToRelative(2.02f, 2.02f, 0.0f, false, false, 1.941f, -1.532f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.858f, 0.0f)
                arcTo(2.02f, 2.02f, 0.0f, false, false, 15.87f, 24.0f)
                lineTo(18.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(21.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(21.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineToRelative(-0.13f)
                arcToRelative(2.02f, 2.02f, 0.0f, false, false, -1.941f, 1.532f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.858f, 0.0f)
                arcTo(2.02f, 2.02f, 0.0f, false, false, 8.13f, 0.0f)
                lineTo(8.0f, 0.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 3.0f, 5.0f)
                lineTo(3.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(3.0f, 17.0f)
                verticalLineToRelative(4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 24.0f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(11.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
