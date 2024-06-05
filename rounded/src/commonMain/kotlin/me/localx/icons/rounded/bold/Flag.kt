package me.localx.icons.rounded.bold

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

public val Icons.Bold.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 4.0f)
                horizontalLineToRelative(-4.051f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, false, -4.449f, -4.0f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, -4.5f, 4.5f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(6.551f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, false, 4.449f, 4.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, 4.5f, -4.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, -4.5f, -4.5f)
                close()
                moveTo(3.0f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(21.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.478f, -1.283f)
                arcToRelative(4.493f, 4.493f, 0.0f, false, false, 2.978f, -4.217f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
