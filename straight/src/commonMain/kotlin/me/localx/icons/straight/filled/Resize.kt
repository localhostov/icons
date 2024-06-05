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

public val Icons.Filled.Resize: ImageVector
    get() {
        if (_resize != null) {
            return _resize!!
        }
        _resize = Builder(name = "Resize", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 18.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.951f, 2.951f, 0.0f, false, true, 1.285f, 0.3f)
                lineToRelative(5.3f, -5.3f)
                horizontalLineToRelative(-3.585f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.586f)
                lineToRelative(-5.3f, 5.3f)
                arcToRelative(2.951f, 2.951f, 0.0f, false, true, 0.3f, 1.286f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _resize!!
    }

private var _resize: ImageVector? = null
