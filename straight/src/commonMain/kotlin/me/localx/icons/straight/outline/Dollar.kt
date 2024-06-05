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

public val Icons.Outline.Dollar: ImageVector
    get() {
        if (_dollar != null) {
            return _dollar!!
        }
        _dollar = Builder(name = "Dollar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                lineTo(19.0f, 7.068f)
                arcTo(5.073f, 5.073f, 0.0f, false, false, 13.932f, 2.0f)
                lineTo(13.0f, 2.0f)
                lineTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(-0.932f)
                arcToRelative(5.068f, 5.068f, 0.0f, false, false, -1.6f, 9.875f)
                lineTo(11.0f, 12.72f)
                lineTo(11.0f, 20.0f)
                horizontalLineToRelative(-0.932f)
                arcTo(3.071f, 3.071f, 0.0f, false, true, 7.0f, 16.932f)
                lineTo(7.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(0.932f)
                arcTo(5.073f, 5.073f, 0.0f, false, false, 10.068f, 22.0f)
                lineTo(11.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 22.0f)
                horizontalLineToRelative(0.932f)
                arcToRelative(5.068f, 5.068f, 0.0f, false, false, 1.6f, -9.875f)
                lineTo(13.0f, 11.28f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(0.932f)
                arcTo(3.071f, 3.071f, 0.0f, false, true, 17.0f, 7.068f)
                lineTo(17.0f, 8.0f)
                close()
                moveTo(14.9f, 14.021f)
                arcTo(3.068f, 3.068f, 0.0f, false, true, 13.932f, 20.0f)
                lineTo(13.0f, 20.0f)
                lineTo(13.0f, 13.387f)
                close()
                moveTo(11.0f, 10.613f)
                lineTo(9.1f, 9.979f)
                arcTo(3.068f, 3.068f, 0.0f, false, true, 10.068f, 4.0f)
                lineTo(11.0f, 4.0f)
                close()
            }
        }
        .build()
        return _dollar!!
    }

private var _dollar: ImageVector? = null
