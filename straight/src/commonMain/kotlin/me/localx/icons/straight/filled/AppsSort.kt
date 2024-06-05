package me.localx.icons.straight.filled

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

public val Icons.Filled.AppsSort: ImageVector
    get() {
        if (_appsSort != null) {
            return _appsSort!!
        }
        _appsSort = Builder(name = "AppsSort", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 21.417f)
                verticalLineTo(2.586f)
                lineToRelative(2.584f, 2.58f)
                lineTo(24.0f, 3.751f)
                lineTo(21.121f, 0.876f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.239f, 0.0f)
                lineToRelative(-2.875f, 2.87f)
                lineTo(15.42f, 5.161f)
                lineTo(18.0f, 2.582f)
                verticalLineTo(21.416f)
                lineToRelative(-2.585f, -2.582f)
                lineToRelative(-1.413f, 1.415f)
                lineToRelative(2.879f, 2.875f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.239f, 0.0f)
                lineTo(24.0f, 20.254f)
                lineToRelative(-1.413f, -1.415f)
                close()
            }
        }
        .build()
        return _appsSort!!
    }

private var _appsSort: ImageVector? = null
