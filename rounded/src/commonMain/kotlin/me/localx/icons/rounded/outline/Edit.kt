package me.localx.icons.rounded.outline

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
                moveTo(18.656f, 0.93f)
                lineTo(6.464f, 13.122f)
                arcTo(4.966f, 4.966f, 0.0f, false, false, 5.0f, 16.657f)
                lineTo(5.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(7.343f, 19.0f)
                arcToRelative(4.966f, 4.966f, 0.0f, false, false, 3.535f, -1.464f)
                lineTo(23.07f, 5.344f)
                arcToRelative(3.125f, 3.125f, 0.0f, false, false, 0.0f, -4.414f)
                arcTo(3.194f, 3.194f, 0.0f, false, false, 18.656f, 0.93f)
                close()
                moveTo(21.656f, 3.93f)
                lineTo(9.464f, 16.122f)
                arcTo(3.02f, 3.02f, 0.0f, false, true, 7.343f, 17.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(-0.343f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, true, 0.878f, -2.121f)
                lineTo(20.07f, 2.344f)
                arcToRelative(1.148f, 1.148f, 0.0f, false, true, 1.586f, 0.0f)
                arcTo(1.123f, 1.123f, 0.0f, false, true, 21.656f, 3.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.979f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 2.0f)
                horizontalLineToRelative(9.042f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(16.343f)
                arcToRelative(4.968f, 4.968f, 0.0f, false, false, 3.536f, -1.464f)
                lineToRelative(2.656f, -2.658f)
                arcTo(4.968f, 4.968f, 0.0f, false, false, 24.0f, 16.343f)
                verticalLineTo(9.979f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 8.979f)
                close()
                moveTo(18.465f, 21.122f)
                arcToRelative(2.975f, 2.975f, 0.0f, false, true, -1.465f, 0.8f)
                verticalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.925f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, true, -0.8f, 1.464f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
