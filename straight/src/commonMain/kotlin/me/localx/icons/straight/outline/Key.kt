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

public val Icons.Outline.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 0.0f)
                horizontalLineToRelative(-2.172f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, false, -2.121f, 0.879f)
                lineToRelative(-8.361f, 8.36f)
                arcToRelative(7.537f, 7.537f, 0.0f, true, false, 5.415f, 5.415f)
                lineToRelative(1.239f, -1.239f)
                verticalLineToRelative(-2.415f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.414f)
                lineToRelative(1.707f, -1.707f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, false, 0.879f, -2.122f)
                verticalLineToRelative(-2.171f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(22.0f, 4.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.293f, 0.708f)
                lineToRelative(-1.121f, 1.121f)
                horizontalLineToRelative(-3.586f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.585f)
                lineToRelative(-1.545f, 1.545f)
                arcToRelative(5.64f, 5.64f, 0.0f, false, true, 0.545f, 2.37f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -5.5f, -5.5f)
                arcToRelative(4.236f, 4.236f, 0.0f, false, true, 2.369f, 0.544f)
                lineToRelative(9.252f, -9.251f)
                arcToRelative(1.009f, 1.009f, 0.0f, false, true, 0.707f, -0.293f)
                horizontalLineToRelative(2.172f)
                close()
                moveTo(5.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
