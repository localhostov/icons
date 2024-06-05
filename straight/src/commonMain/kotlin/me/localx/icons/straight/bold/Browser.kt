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

public val Icons.Bold.Browser: ImageVector
    get() {
        if (_browser != null) {
            return _browser!!
        }
        _browser = Builder(name = "Browser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 13.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(24.0f, 4.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-18.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                horizontalLineToRelative(17.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                close()
                moveTo(8.0f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                close()
                moveTo(4.5f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                close()
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(18.0f)
                close()
            }
        }
        .build()
        return _browser!!
    }

private var _browser: ImageVector? = null
