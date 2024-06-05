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

public val Icons.Bold.AppsSort: ImageVector
    get() {
        if (_appsSort != null) {
            return _appsSort!!
        }
        _appsSort = Builder(name = "AppsSort", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.056f)
                verticalLineTo(4.925f)
                horizontalLineToRelative(3.989f)
                lineTo(19.461f, 0.4f)
                arcToRelative(1.376f, 1.376f, 0.0f, false, false, -1.944f, 0.0f)
                lineTo(12.989f, 4.925f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.056f)
                horizontalLineTo(12.96f)
                lineToRelative(4.546f, 4.54f)
                arcToRelative(1.379f, 1.379f, 0.0f, false, false, 1.951f, 0.0f)
                lineTo(24.0f, 19.056f)
                close()
            }
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
                moveTo(3.0f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                lineTo(11.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                close()
                moveTo(3.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 21.0f)
                close()
            }
        }
        .build()
        return _appsSort!!
    }

private var _appsSort: ImageVector? = null
