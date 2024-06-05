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

public val Icons.Filled.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.6f, -0.2f)
                lineToRelative(-4.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.4f, -0.8f)
                verticalLineToRelative(-5.62f)
                lineToRelative(-7.016f, -7.893f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.916f, -6.487f)
                horizontalLineToRelative(14.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.913f, 6.488f)
                lineToRelative(-7.013f, 7.892f)
                verticalLineToRelative(8.62f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
