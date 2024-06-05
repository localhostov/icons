package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.ExpandArrows: ImageVector
    get() {
        if (_expandArrows != null) {
            return _expandArrows!!
        }
        _expandArrows = Builder(name = "ExpandArrows", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.0f)
                verticalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(4.586f)
                lineTo(12.0f, 10.586f)
                lineTo(3.414f, 2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.414f)
                lineTo(10.586f, 12.0f)
                lineTo(2.0f, 20.586f)
                verticalLineTo(16.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.414f)
                lineTo(12.0f, 13.414f)
                lineTo(20.586f, 22.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(4.586f)
                lineTo(13.414f, 12.0f)
                lineTo(22.0f, 3.414f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _expandArrows!!
    }

private var _expandArrows: ImageVector? = null
