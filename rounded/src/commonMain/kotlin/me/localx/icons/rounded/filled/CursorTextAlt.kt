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

public val Icons.Filled.CursorTextAlt: ImageVector
    get() {
        if (_cursorTextAlt != null) {
            return _cursorTextAlt!!
        }
        _cursorTextAlt = Builder(name = "CursorTextAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(13.0f, 14.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, true, -2.0f, -0.78f)
                arcTo(2.981f, 2.981f, 0.0f, false, true, 10.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(11.0f, 14.0f)
                lineTo(10.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, true, 2.0f, 0.78f)
                arcTo(2.981f, 2.981f, 0.0f, false, true, 14.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 9.0f)
                close()
                moveTo(24.0f, 21.0f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, true, -5.816f, 1.0f)
                lineTo(5.816f, 22.0f)
                arcTo(2.993f, 2.993f, 0.0f, true, true, 2.0f, 18.184f)
                lineTo(2.0f, 5.816f)
                arcTo(2.993f, 2.993f, 0.0f, true, true, 5.816f, 2.0f)
                lineTo(18.184f, 2.0f)
                arcTo(2.993f, 2.993f, 0.0f, true, true, 22.0f, 5.816f)
                lineTo(22.0f, 18.184f)
                arcTo(2.99f, 2.99f, 0.0f, false, true, 24.0f, 21.0f)
                close()
                moveTo(20.0f, 18.184f)
                lineTo(20.0f, 5.816f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 18.184f, 4.0f)
                lineTo(5.816f, 4.0f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 4.0f, 5.816f)
                lineTo(4.0f, 18.184f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 5.816f, 20.0f)
                lineTo(18.184f, 20.0f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 20.0f, 18.184f)
                close()
            }
        }
        .build()
        return _cursorTextAlt!!
    }

private var _cursorTextAlt: ImageVector? = null
