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
                moveTo(21.0f, 15.0f)
                lineTo(21.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(14.0f, 0.0f)
                lineTo(14.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(10.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(3.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 17.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                lineTo(10.0f, 23.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.0f)
                lineTo(21.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                lineTo(17.0f, 15.0f)
                close()
                moveTo(14.0f, 17.0f)
                lineTo(10.0f, 17.0f)
                lineTo(10.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
