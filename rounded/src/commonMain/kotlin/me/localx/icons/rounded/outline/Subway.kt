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

public val Icons.Outline.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 0.0f)
                horizontalLineTo(7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 2.0f, 5.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, 4.266f, 4.946f)
                lineTo(4.143f, 22.485f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.714f, 1.03f)
                lineTo(8.566f, 19.0f)
                horizontalLineToRelative(6.868f)
                lineToRelative(2.709f, 4.515f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.714f, -1.03f)
                lineToRelative(-2.123f, -3.539f)
                arcTo(5.008f, 5.008f, 0.0f, false, false, 22.0f, 14.0f)
                verticalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 17.0f, 0.0f)
                close()
                moveTo(13.0f, 11.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(4.0f, 11.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(7.0f, 2.0f)
                horizontalLineTo(17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.828f, 2.0f)
                horizontalLineTo(4.172f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 2.0f)
                close()
                moveTo(17.0f, 17.0f)
                horizontalLineTo(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null
