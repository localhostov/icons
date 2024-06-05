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

public val Icons.Filled.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.333f, 14.667f)
                arcTo(4.664f, 4.664f, 0.0f, false, false, 15.49f, 16.69f)
                lineToRelative(-6.5f, -2.935f)
                arcTo(4.665f, 4.665f, 0.0f, false, false, 9.0f, 10.261f)
                lineToRelative(6.494f, -2.949f)
                arcToRelative(4.665f, 4.665f, 0.0f, true, false, -0.824f, -2.645f)
                arcToRelative(4.712f, 4.712f, 0.0f, false, false, 0.067f, 0.792f)
                lineTo(7.846f, 8.587f)
                arcToRelative(4.667f, 4.667f, 0.0f, true, false, -0.014f, 6.839f)
                lineToRelative(6.9f, 3.117f)
                arcToRelative(4.667f, 4.667f, 0.0f, true, false, 4.6f, -3.876f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
