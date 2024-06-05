package me.localx.icons.straight.bold

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

public val Icons.Bold.ExpandArrows: ImageVector
    get() {
        if (_expandArrows != null) {
            return _expandArrows!!
        }
        _expandArrows = Builder(name = "ExpandArrows", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.0f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.5f, 0.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(3.879f)
                lineTo(12.0f, 9.879f)
                lineTo(5.121f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 0.0f, 2.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.121f)
                lineTo(9.879f, 12.0f)
                lineTo(3.0f, 18.879f)
                verticalLineTo(15.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.5f, 24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.121f)
                lineTo(12.0f, 14.121f)
                lineTo(18.879f, 21.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.0f, 21.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(3.879f)
                lineTo(14.121f, 12.0f)
                lineTo(21.0f, 5.121f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _expandArrows!!
    }

private var _expandArrows: ImageVector? = null
