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

public val Icons.Filled.UserTime: ImageVector
    get() {
        if (_userTime != null) {
            return _userTime!!
        }
        _userTime = Builder(name = "UserTime", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 7.0f, 7.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, -7.0f, -7.0f)
                close()
                moveTo(19.707f, 19.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.293f, -0.707f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(1.707f, 1.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                close()
                moveTo(8.474f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 5.5f, -5.5f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, 5.5f)
                close()
                moveTo(11.356f, 24.0f)
                horizontalLineToRelative(-10.356f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.011f)
                arcToRelative(10.275f, 10.275f, 0.0f, false, true, 6.553f, -9.6f)
                arcToRelative(6.685f, 6.685f, 0.0f, false, true, 2.394f, -0.384f)
                arcToRelative(9.087f, 9.087f, 0.0f, false, false, -0.424f, 0.995f)
                arcToRelative(8.853f, 8.853f, 0.0f, false, false, -0.523f, 3.0f)
                arcToRelative(8.983f, 8.983f, 0.0f, false, false, 3.356f, 7.0f)
                close()
            }
        }
        .build()
        return _userTime!!
    }

private var _userTime: ImageVector? = null
