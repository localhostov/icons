package me.localx.icons.straight.bold

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
                moveTo(21.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.409f)
                arcTo(0.41f, 0.41f, 0.0f, false, true, 3.409f, 3.0f)
                horizontalLineTo(15.172f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineTo(3.409f)
                arcTo(3.413f, 3.413f, 0.0f, false, false, 0.0f, 3.409f)
                verticalLineTo(24.0f)
                horizontalLineTo(18.349f)
                lineTo(24.0f, 18.348f)
                verticalLineTo(5.829f)
                lineToRelative(-3.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                horizontalLineTo(8.0f)
                lineTo(23.4f, 3.6f)
                arcToRelative(2.121f, 2.121f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(5.0f, 16.0f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
