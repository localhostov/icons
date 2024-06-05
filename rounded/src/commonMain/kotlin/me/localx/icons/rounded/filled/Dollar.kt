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

public val Icons.Filled.Dollar: ImageVector
    get() {
        if (_dollar != null) {
            return _dollar!!
        }
        _dollar = Builder(name = "Dollar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.068f, 20.0f)
                arcTo(3.071f, 3.071f, 0.0f, false, true, 7.0f, 16.932f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(17.0f)
                curveToRelative(0.0f, 0.019f, 0.0f, 0.036f, 0.0f, 0.055f)
                arcTo(5.073f, 5.073f, 0.0f, false, false, 10.068f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(0.932f)
                arcToRelative(5.068f, 5.068f, 0.0f, false, false, 1.6f, -9.875f)
                lineTo(13.0f, 11.28f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(0.932f)
                arcTo(3.071f, 3.071f, 0.0f, false, true, 17.0f, 7.068f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.019f, 0.0f, -0.036f, 0.0f, -0.055f)
                arcTo(5.073f, 5.073f, 0.0f, false, false, 13.932f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-0.932f)
                arcToRelative(5.068f, 5.068f, 0.0f, false, false, -1.6f, 9.875f)
                lineTo(11.0f, 12.72f)
                verticalLineTo(20.0f)
                close()
                moveTo(13.0f, 13.387f)
                lineToRelative(1.9f, 0.634f)
                arcTo(3.068f, 3.068f, 0.0f, false, true, 13.932f, 20.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(9.1f, 9.979f)
                arcTo(3.068f, 3.068f, 0.0f, false, true, 10.068f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(6.613f)
                close()
            }
        }
        .build()
        return _dollar!!
    }

private var _dollar: ImageVector? = null
