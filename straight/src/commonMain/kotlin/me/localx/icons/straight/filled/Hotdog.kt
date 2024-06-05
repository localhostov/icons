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

public val Icons.Filled.Hotdog: ImageVector
    get() {
        if (_hotdog != null) {
            return _hotdog!!
        }
        _hotdog = Builder(name = "Hotdog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcToRelative(18.149f, 18.149f, 0.0f, false, true, -8.443f, -1.941f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.887f, -8.118f)
                arcTo(9.316f, 9.316f, 0.0f, false, false, 12.0f, 15.0f)
                arcToRelative(9.316f, 9.316f, 0.0f, false, false, 4.556f, -1.059f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.887f, 8.118f)
                arcTo(18.149f, 18.149f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(13.0f, 1.0f)
                lineTo(11.0f, 1.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 1.0f)
                lineTo(15.0f, 1.0f)
                lineTo(15.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 1.0f)
                lineTo(7.0f, 1.0f)
                lineTo(7.0f, 4.989f)
                lineTo(9.0f, 4.989f)
                close()
                moveTo(1.191f, 13.135f)
                arcToRelative(6.507f, 6.507f, 0.0f, false, true, 7.116f, -1.0f)
                arcTo(7.4f, 7.4f, 0.0f, false, false, 12.0f, 13.0f)
                arcToRelative(7.388f, 7.388f, 0.0f, false, false, 3.692f, -0.862f)
                arcToRelative(6.51f, 6.51f, 0.0f, false, true, 7.117f, 1.0f)
                curveToRelative(0.117f, -0.109f, 0.2f, -0.191f, 0.234f, -0.23f)
                arcTo(3.464f, 3.464f, 0.0f, false, false, 22.926f, 8.0f)
                arcTo(3.523f, 3.523f, 0.0f, false, false, 18.0f, 8.053f)
                arcTo(8.7f, 8.7f, 0.0f, false, true, 12.0f, 10.0f)
                arcTo(8.733f, 8.733f, 0.0f, false, true, 6.017f, 8.068f)
                arcTo(3.511f, 3.511f, 0.0f, false, false, 1.1f, 7.956f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.139f, 4.951f)
                curveTo(1.0f, 12.945f, 1.075f, 13.026f, 1.191f, 13.135f)
                close()
            }
        }
        .build()
        return _hotdog!!
    }

private var _hotdog: ImageVector? = null
