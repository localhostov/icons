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

public val Icons.Bold.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 6.0f)
                lineTo(11.169f, 6.0f)
                lineTo(11.169f, 0.211f)
                lineTo(1.1f, 8.953f)
                lineToRelative(-0.078f, 0.072f)
                arcToRelative(3.507f, 3.507f, 0.0f, false, false, 0.0f, 4.95f)
                lineToRelative(10.147f, 8.814f)
                lineTo(11.169f, 17.0f)
                lineTo(14.5f, 17.0f)
                arcTo(6.507f, 6.507f, 0.0f, false, true, 21.0f, 23.476f)
                horizontalLineToRelative(0.0f)
                lineTo(21.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 15.5f)
                arcTo(9.511f, 9.511f, 0.0f, false, false, 14.5f, 6.0f)
                close()
                moveTo(14.5f, 14.0f)
                lineTo(8.169f, 14.0f)
                verticalLineToRelative(2.211f)
                lineTo(3.12f, 11.828f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.656f)
                lineTo(8.169f, 6.789f)
                lineTo(8.169f, 9.0f)
                lineTo(14.5f, 9.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, true, 21.0f, 15.5f)
                verticalLineToRelative(1.078f)
                arcTo(9.466f, 9.466f, 0.0f, false, false, 14.5f, 14.0f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
