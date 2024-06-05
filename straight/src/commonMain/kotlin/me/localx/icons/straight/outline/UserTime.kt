package me.localx.icons.straight.outline

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

public val Icons.Outline.UserTime: ImageVector
    get() {
        if (_userTime != null) {
            return _userTime!!
        }
        _userTime = Builder(name = "UserTime", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.474f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 5.5f, -5.5f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, 5.5f)
                close()
                moveTo(8.474f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 3.5f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                close()
                moveTo(17.0f, 24.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 7.0f, -7.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, -7.0f, 7.0f)
                close()
                moveTo(17.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                close()
                moveTo(19.707f, 18.293f)
                lineTo(18.0f, 16.586f)
                verticalLineToRelative(-2.586f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.414f)
                lineToRelative(2.293f, 2.293f)
                close()
                moveTo(8.947f, 13.0f)
                horizontalLineToRelative(-3.947f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(3.231f)
                arcToRelative(8.852f, 8.852f, 0.0f, false, true, 0.716f, -2.0f)
                close()
            }
        }
        .build()
        return _userTime!!
    }

private var _userTime: ImageVector? = null
