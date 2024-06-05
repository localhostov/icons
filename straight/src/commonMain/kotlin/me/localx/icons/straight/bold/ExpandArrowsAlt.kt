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

public val Icons.Bold.ExpandArrowsAlt: ImageVector
    get() {
        if (_expandArrowsAlt != null) {
            return _expandArrowsAlt!!
        }
        _expandArrowsAlt = Builder(name = "ExpandArrowsAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.071f, 5.053f)
                lineTo(24.0f, 8.0f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(16.048f)
                lineToRelative(2.908f, 2.926f)
                lineTo(11.986f, 9.9f)
                lineToRelative(-6.95f, -6.95f)
                lineTo(8.0f, 0.0f)
                horizontalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.0f)
                verticalLineTo(7.952f)
                lineTo(2.909f, 5.061f)
                lineToRelative(6.956f, 6.956f)
                lineTo(2.932f, 18.95f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineTo(7.952f)
                lineToRelative(-2.9f, -2.923f)
                lineToRelative(6.939f, -6.939f)
                lineToRelative(6.947f, 6.947f)
                lineTo(16.0f, 24.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(16.048f)
                lineTo(21.06f, 18.97f)
                lineToRelative(-6.953f, -6.953f)
                close()
            }
        }
        .build()
        return _expandArrowsAlt!!
    }

private var _expandArrowsAlt: ImageVector? = null
