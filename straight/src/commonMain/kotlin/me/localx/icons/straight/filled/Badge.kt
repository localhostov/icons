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

public val Icons.Filled.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = Builder(name = "Badge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, 8.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(9.942f, 9.942f, 0.0f, false, true, -6.0f, -2.014f)
                verticalLineToRelative(5.514f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.062f, 1.952f)
                lineToRelative(1.938f, -1.552f)
                lineToRelative(1.938f, 1.55f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.062f, -1.95f)
                verticalLineToRelative(-5.514f)
                arcToRelative(9.942f, 9.942f, 0.0f, false, true, -6.0f, 2.014f)
                close()
            }
        }
        .build()
        return _badge!!
    }

private var _badge: ImageVector? = null
