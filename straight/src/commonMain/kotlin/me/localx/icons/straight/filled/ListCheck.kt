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

public val Icons.Filled.ListCheck: ImageVector
    get() {
        if (_listCheck != null) {
            return _listCheck!!
        }
        _listCheck = Builder(name = "ListCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 6.0f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, true, -2.122f, -0.879f)
                lineToRelative(-1.585f, -1.585f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.586f, 1.585f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(3.586f, -3.585f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.586f, 3.585f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, true, -2.121f, 0.879f)
                close()
                moveTo(24.0f, 3.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(6.121f, 13.121f)
                lineTo(9.707f, 9.536f)
                lineTo(8.293f, 8.122f)
                lineTo(4.707f, 11.707f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-1.586f, -1.585f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.585f, 1.585f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.243f, 0.0f)
                close()
                moveTo(24.0f, 11.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(6.121f, 21.121f)
                lineTo(9.707f, 17.536f)
                lineTo(8.293f, 16.122f)
                lineTo(4.707f, 19.707f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-1.586f, -1.585f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.585f, 1.585f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.243f, 0.0f)
                close()
                moveTo(24.0f, 19.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _listCheck!!
    }

private var _listCheck: ImageVector? = null
