package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 19.0f)
                verticalLineToRelative(4.7f)
                arcToRelative(4.968f, 4.968f, 0.0f, false, false, 1.879f, -1.164f)
                lineToRelative(2.656f, -2.658f)
                arcTo(4.954f, 4.954f, 0.0f, false, false, 23.7f, 18.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.172f, 13.828f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.0f, 16.657f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.343f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.829f, -1.172f)
                lineTo(21.5f, 5.5f)
                arcToRelative(2.121f, 2.121f, 0.0f, false, false, -3.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.952f)
                arcToRelative(4.087f, 4.087f, 0.0f, false, true, -1.08f, 1.962f)
                lineTo(11.586f, 18.243f)
                arcTo(5.961f, 5.961f, 0.0f, false, true, 7.343f, 20.0f)
                horizontalLineTo(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(16.657f)
                arcToRelative(5.957f, 5.957f, 0.0f, false, true, 1.758f, -4.242f)
                lineTo(17.086f, 1.086f)
                arcTo(4.078f, 4.078f, 0.0f, false, true, 19.037f, 0.0f)
                curveToRelative(-0.013f, 0.0f, -0.024f, 0.0f, -0.037f, 0.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(5.0f)
                curveTo(24.0f, 4.984f, 24.0f, 4.969f, 24.0f, 4.952f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
