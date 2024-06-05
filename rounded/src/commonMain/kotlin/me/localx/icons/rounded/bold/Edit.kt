package me.localx.icons.rounded.bold

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

public val Icons.Bold.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 19.5f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 1.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 0.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 0.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 4.5f, 24.0f)
                horizontalLineTo(16.484f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 3.181f, -1.317f)
                lineToRelative(3.017f, -3.017f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 24.0f, 16.485f)
                verticalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 10.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 11.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.793f, 1.793f)
                lineToRelative(-12.5f, 12.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 15.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -0.293f)
                lineTo(22.038f, 6.376f)
                arcToRelative(3.379f, 3.379f, 0.0f, false, false, 0.952f, -3.17f)
                arcTo(3.118f, 3.118f, 0.0f, false, false, 17.793f, 1.793f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
