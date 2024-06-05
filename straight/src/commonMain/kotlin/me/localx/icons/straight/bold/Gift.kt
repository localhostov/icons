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

public val Icons.Bold.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 7.0f)
                lineTo(18.328f, 7.0f)
                arcTo(8.062f, 8.062f, 0.0f, false, false, 20.0f, 2.0f)
                lineTo(17.0f, 2.0f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, true, -3.214f, 4.689f)
                arcTo(8.4f, 8.4f, 0.0f, false, false, 15.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 3.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.214f, 3.689f)
                arcTo(4.8f, 4.8f, 0.0f, false, true, 7.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                arcTo(8.062f, 8.062f, 0.0f, false, false, 5.672f, 7.0f)
                lineTo(3.5f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 10.5f)
                lineTo(0.0f, 15.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(9.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 10.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 7.0f)
                close()
                moveTo(21.0f, 10.5f)
                lineTo(21.0f, 12.0f)
                lineTo(13.5f, 12.0f)
                lineTo(13.5f, 10.0f)
                horizontalLineToRelative(7.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 21.0f, 10.5f)
                close()
                moveTo(3.0f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 12.0f)
                close()
                moveTo(5.0f, 15.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(6.0f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(13.5f, 21.0f)
                lineTo(13.5f, 15.0f)
                lineTo(19.0f, 15.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
