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
                moveTo(4.5f, 17.5f)
                lineTo(2.0f, 17.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(0.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(4.5f, 24.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(6.5f, 19.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.5f, 17.5f)
                close()
                moveTo(4.5f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 19.5f)
                lineTo(4.5f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.5f)
                horizontalLineTo(19.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(19.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 17.5f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 8.75f)
                lineTo(2.0f, 8.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(4.5f, 15.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-2.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.5f, 8.75f)
                close()
                moveTo(4.5f, 13.25f)
                lineTo(2.0f, 13.25f)
                verticalLineToRelative(-2.5f)
                lineTo(4.5f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.75f)
                lineTo(19.5f, 8.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(22.0f, 15.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-2.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 8.75f)
                close()
                moveTo(22.0f, 13.25f)
                lineTo(19.5f, 13.25f)
                verticalLineToRelative(-2.5f)
                lineTo(22.0f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 0.0f)
                lineTo(2.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(0.0f, 4.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(4.5f, 6.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(6.5f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.5f, 0.0f)
                close()
                moveTo(4.5f, 4.5f)
                lineTo(2.0f, 4.5f)
                lineTo(2.0f, 2.0f)
                lineTo(4.5f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 17.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(8.75f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(15.25f, 19.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.25f, 17.5f)
                close()
                moveTo(13.25f, 22.0f)
                horizontalLineToRelative(-2.5f)
                lineTo(10.75f, 19.5f)
                horizontalLineToRelative(2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 8.75f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-2.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.25f, 8.75f)
                close()
                moveTo(13.25f, 13.25f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 0.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(8.75f, 4.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(15.25f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.25f, 0.0f)
                close()
                moveTo(13.25f, 4.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(10.75f, 2.0f)
                horizontalLineToRelative(2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 0.0f)
                lineTo(19.5f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(17.5f, 4.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(22.0f, 6.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(24.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 0.0f)
                close()
                moveTo(22.0f, 4.5f)
                lineTo(19.5f, 4.5f)
                lineTo(19.5f, 2.0f)
                lineTo(22.0f, 2.0f)
                close()
            }
        }
        .build()
        return _grid!!
    }

private var _grid: ImageVector? = null
