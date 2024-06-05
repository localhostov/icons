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

public val Icons.Outline.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(19.879f, 18.136f)
                arcToRelative(7.984f, 7.984f, 0.0f, false, true, -2.041f, -2.594f)
                lineToRelative(1.533f, -0.613f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.742f, -1.858f)
                lineToRelative(-1.445f, 0.578f)
                arcToRelative(7.481f, 7.481f, 0.0f, false, true, 0.0f, -3.3f)
                lineToRelative(1.445f, 0.578f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.742f, -1.858f)
                lineToRelative(-1.533f, -0.613f)
                arcToRelative(7.984f, 7.984f, 0.0f, false, true, 2.041f, -2.594f)
                arcToRelative(9.936f, 9.936f, 0.0f, false, true, 0.0f, 12.272f)
                close()
                moveTo(4.121f, 5.864f)
                arcToRelative(7.984f, 7.984f, 0.0f, false, true, 2.041f, 2.594f)
                lineToRelative(-1.533f, 0.613f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.742f, 1.858f)
                lineToRelative(1.445f, -0.578f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.184f, 1.649f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.184f, 1.649f)
                lineToRelative(-1.445f, -0.578f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.742f, 1.858f)
                lineToRelative(1.533f, 0.613f)
                arcToRelative(7.984f, 7.984f, 0.0f, false, true, -2.041f, 2.594f)
                arcToRelative(9.936f, 9.936f, 0.0f, false, true, 0.0f, -12.272f)
                close()
                moveTo(5.507f, 19.59f)
                arcToRelative(9.955f, 9.955f, 0.0f, false, false, 2.511f, -3.306f)
                lineToRelative(1.611f, 0.645f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.742f, -1.858f)
                lineToRelative(-1.666f, -0.666f)
                arcToRelative(10.031f, 10.031f, 0.0f, false, false, 0.295f, -2.405f)
                arcToRelative(10.031f, 10.031f, 0.0f, false, false, -0.295f, -2.4f)
                lineToRelative(1.666f, -0.666f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.742f, -1.858f)
                lineToRelative(-1.611f, 0.645f)
                arcToRelative(9.955f, 9.955f, 0.0f, false, false, -2.511f, -3.311f)
                arcToRelative(9.952f, 9.952f, 0.0f, false, true, 12.986f, 0.0f)
                arcToRelative(9.955f, 9.955f, 0.0f, false, false, -2.511f, 3.306f)
                lineToRelative(-1.611f, -0.645f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.742f, 1.858f)
                lineToRelative(1.671f, 0.671f)
                arcToRelative(9.951f, 9.951f, 0.0f, false, false, 0.0f, 4.81f)
                lineToRelative(-1.666f, 0.666f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.742f, 1.858f)
                lineToRelative(1.611f, -0.645f)
                arcToRelative(9.955f, 9.955f, 0.0f, false, false, 2.511f, 3.306f)
                arcToRelative(9.952f, 9.952f, 0.0f, false, true, -12.986f, 0.0f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null
