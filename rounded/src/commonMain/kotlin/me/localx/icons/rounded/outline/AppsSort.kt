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

public val Icons.Outline.AppsSort: ImageVector
    get() {
        if (_appsSort != null) {
            return _appsSort!!
        }
        _appsSort = Builder(name = "AppsSort", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 0.0f)
                horizontalLineTo(4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 0.0f, 4.0f)
                verticalLineTo(7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 7.0f, 0.0f)
                close()
                moveTo(9.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 9.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 7.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 2.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(7.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(11.0f, 17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 7.0f, 13.0f)
                close()
                moveTo(9.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(2.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(7.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.293f, 19.049f)
                lineTo(20.0f, 21.339f)
                verticalLineTo(2.633f)
                lineToRelative(2.293f, 2.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, -1.415f)
                lineTo(21.12f, 0.925f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.24f, 0.0f)
                lineTo(14.293f, 3.508f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.415f)
                lineTo(18.0f, 2.633f)
                verticalLineTo(21.339f)
                lineToRelative(-2.293f, -2.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, 1.415f)
                lineToRelative(2.587f, 2.583f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.24f, 0.0f)
                lineToRelative(2.587f, -2.583f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.415f)
                close()
            }
        }
        .build()
        return _appsSort!!
    }

private var _appsSort: ImageVector? = null
