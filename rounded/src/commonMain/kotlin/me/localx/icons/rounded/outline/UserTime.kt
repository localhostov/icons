package me.localx.icons.rounded.outline

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
                moveToRelative(17.0f, 24.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 7.0f, -7.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, -7.0f, 7.0f)
                close()
                moveTo(17.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                close()
                moveTo(18.707f, 18.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-0.707f, -0.707f)
                verticalLineToRelative(-1.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.293f, 0.707f)
                lineToRelative(1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                close()
                moveTo(2.0f, 23.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 6.221f, -8.024f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.442f, -1.952f)
                arcToRelative(10.213f, 10.213f, 0.0f, false, false, -7.779f, 9.976f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(8.474f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 5.5f, -5.5f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, 5.5f)
                close()
                moveTo(8.474f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 3.5f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _userTime!!
    }

private var _userTime: ImageVector? = null
