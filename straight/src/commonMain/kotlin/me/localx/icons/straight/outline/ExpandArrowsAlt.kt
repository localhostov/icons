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

public val Icons.Outline.ExpandArrowsAlt: ImageVector
    get() {
        if (_expandArrowsAlt != null) {
            return _expandArrowsAlt!!
        }
        _expandArrowsAlt = Builder(name = "ExpandArrowsAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.718f, 4.7f)
                lineTo(24.0f, 8.0f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(16.048f)
                lineToRelative(3.261f, 3.28f)
                lineTo(11.986f, 10.6f)
                lineToRelative(-7.3f, -7.3f)
                lineTo(8.0f, 0.0f)
                horizontalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.0f)
                verticalLineTo(7.952f)
                lineTo(3.263f, 4.708f)
                lineToRelative(7.309f, 7.309f)
                lineTo(3.285f, 19.3f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineTo(7.952f)
                lineTo(4.694f, 20.723f)
                lineToRelative(7.292f, -7.292f)
                lineToRelative(7.3f, 7.3f)
                lineTo(16.0f, 24.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(16.048f)
                lineToRelative(-3.294f, 3.274f)
                lineToRelative(-7.306f, -7.3f)
                close()
            }
        }
        .build()
        return _expandArrowsAlt!!
    }

private var _expandArrowsAlt: ImageVector? = null
