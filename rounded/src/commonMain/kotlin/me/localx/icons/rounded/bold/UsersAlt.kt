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

public val Icons.Bold.UsersAlt: ImageVector
    get() {
        if (_usersAlt != null) {
            return _usersAlt!!
        }
        _usersAlt = Builder(name = "UsersAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.489f, -1.335f)
                arcToRelative(3.031f, 3.031f, 0.0f, false, false, -6.018f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.982f, -0.33f)
                arcToRelative(6.031f, 6.031f, 0.0f, false, true, 11.982f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.326f, 1.656f)
                arcTo(1.557f, 1.557f, 0.0f, false, true, 16.5f, 24.0f)
                close()
                moveTo(22.667f, 14.991f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.326f, -1.656f)
                arcTo(5.815f, 5.815f, 0.0f, false, false, 18.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcToRelative(2.835f, 2.835f, 0.0f, false, true, 2.509f, 2.665f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 15.0f)
                arcTo(1.557f, 1.557f, 0.0f, false, false, 22.665f, 14.991f)
                close()
                moveTo(2.991f, 13.665f)
                arcTo(2.835f, 2.835f, 0.0f, false, true, 5.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                arcTo(5.815f, 5.815f, 0.0f, false, false, 0.009f, 13.335f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.326f, 1.656f)
                arcTo(1.557f, 1.557f, 0.0f, false, false, 1.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.991f, 13.665f)
                close()
                moveTo(12.077f, 16.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -3.5f, -3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.077f, 16.0f)
                close()
                moveTo(18.077f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -3.5f, -3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.077f, 7.0f)
                close()
                moveTo(6.077f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -3.5f, -3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.077f, 7.0f)
                close()
            }
        }
        .build()
        return _usersAlt!!
    }

private var _usersAlt: ImageVector? = null
