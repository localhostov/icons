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

public val Icons.Filled.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.008f, 24.0f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, -2.681f, -1.636f)
                lineToRelative(-3.127f, -6.704f)
                lineToRelative(-3.542f, 3.093f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.658f, -0.753f)
                verticalLineToRelative(-15.02f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.989f, -2.246f)
                lineToRelative(10.7f, 10.238f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.6f, 1.719f)
                lineToRelative(-4.468f, 0.407f)
                lineToRelative(3.065f, 6.569f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.678f, 4.333f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
