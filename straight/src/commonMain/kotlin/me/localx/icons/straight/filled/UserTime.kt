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
                moveToRelative(8.474f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 5.5f, -5.5f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, 5.5f)
                close()
                moveTo(17.0f, 10.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 7.0f, 7.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, -7.0f, -7.0f)
                close()
                moveTo(19.0f, 20.414f)
                lineTo(16.0f, 17.414f)
                verticalLineToRelative(-4.414f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(2.414f, 2.414f)
                close()
                moveTo(8.0f, 17.0f)
                arcToRelative(8.938f, 8.938f, 0.0f, false, true, 0.947f, -4.0f)
                horizontalLineToRelative(-3.947f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(11.349f)
                arcToRelative(8.98f, 8.98f, 0.0f, false, true, -3.349f, -7.0f)
                close()
            }
        }
        .build()
        return _userTime!!
    }

private var _userTime: ImageVector? = null
