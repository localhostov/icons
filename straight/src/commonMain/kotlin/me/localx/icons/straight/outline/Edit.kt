package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                lineTo(9.414f, 19.0f)
                lineTo(23.057f, 5.357f)
                arcToRelative(3.125f, 3.125f, 0.0f, false, false, 0.0f, -4.414f)
                arcToRelative(3.194f, 3.194f, 0.0f, false, false, -4.414f, 0.0f)
                lineTo(5.0f, 14.586f)
                close()
                moveTo(7.0f, 15.414f)
                lineTo(20.057f, 2.357f)
                arcToRelative(1.148f, 1.148f, 0.0f, false, true, 1.586f, 0.0f)
                arcToRelative(1.123f, 1.123f, 0.0f, false, true, 0.0f, 1.586f)
                lineTo(8.586f, 17.0f)
                lineTo(7.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.621f, 7.622f)
                lineTo(22.0f, 9.243f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                horizontalLineTo(14.758f)
                lineTo(16.379f, 0.379f)
                arcTo(5.013f, 5.013f, 0.0f, false, true, 16.84f, 0.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(18.414f)
                lineTo(24.0f, 18.414f)
                verticalLineTo(7.161f)
                arcTo(5.15f, 5.15f, 0.0f, false, true, 23.621f, 7.622f)
                close()
                moveTo(18.0f, 21.586f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(3.586f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
