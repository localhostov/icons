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

public val Icons.Outline.Grid: ImageVector
    get() {
        if (_grid != null) {
            return _grid!!
        }
        _grid = Builder(name = "Grid", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 19.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(4.5f)
                moveToRelative(2.0f, -2.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 19.5f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(22.0f)
                moveToRelative(2.0f, -2.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(24.0f)
                horizontalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 10.75f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(4.5f)
                moveToRelative(2.0f, -2.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(6.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.75f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(19.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(22.0f)
                moveToRelative(2.0f, -2.0f)
                horizontalLineTo(17.5f)
                verticalLineToRelative(6.5f)
                horizontalLineTo(24.0f)
                verticalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 2.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                horizontalLineTo(4.5f)
                moveToRelative(2.0f, -2.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 19.5f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(19.5f)
                horizontalLineToRelative(2.5f)
                moveToRelative(2.0f, -2.0f)
                horizontalLineTo(8.75f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 10.75f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                moveToRelative(2.0f, -2.0f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 2.0f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.5f)
                moveToRelative(2.0f, -2.0f)
                horizontalLineTo(8.75f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(21.0f)
                moveToRelative(0.0f, -2.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(24.0f)
                verticalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _grid!!
    }

private var _grid: ImageVector? = null
