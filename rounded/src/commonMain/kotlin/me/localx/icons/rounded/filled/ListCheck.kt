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
                moveToRelative(4.0f, 22.0f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, true, -2.122f, -0.879f)
                lineToRelative(-1.544f, -1.374f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.332f, -1.494f)
                lineToRelative(1.585f, 1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.456f, 0.04f)
                lineToRelative(3.6f, -3.431f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.378f, 1.448f)
                lineToRelative(-3.585f, 3.414f)
                arcToRelative(2.964f, 2.964f, 0.0f, false, true, -2.1f, 0.862f)
                close()
                moveTo(23.0f, 21.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(4.0f, 14.0f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, true, -2.122f, -0.879f)
                lineToRelative(-1.585f, -1.585f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(1.586f, 1.585f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(3.6f, -3.431f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.382f, 1.448f)
                lineToRelative(-3.589f, 3.414f)
                arcToRelative(2.964f, 2.964f, 0.0f, false, true, -2.1f, 0.862f)
                close()
                moveTo(23.0f, 13.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(4.0f, 6.0f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, true, -2.122f, -0.879f)
                lineToRelative(-1.544f, -1.374f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.332f, -1.494f)
                lineToRelative(1.585f, 1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.456f, 0.04f)
                lineToRelative(3.604f, -3.431f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.378f, 1.448f)
                lineToRelative(-3.589f, 3.414f)
                arcToRelative(2.964f, 2.964f, 0.0f, false, true, -2.1f, 0.862f)
                close()
                moveTo(23.0f, 5.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _listCheck!!
    }

private var _listCheck: ImageVector? = null
