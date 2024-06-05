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

public val Icons.Outline.Glass: ImageVector
    get() {
        if (_glass != null) {
            return _glass!!
        }
        _glass = Builder(name = "Glass", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.354f, 0.0f)
                lineTo(4.273f, 21.405f)
                arcTo(3.012f, 3.012f, 0.0f, false, false, 7.246f, 24.0f)
                horizontalLineToRelative(9.508f)
                arcToRelative(3.012f, 3.012f, 0.0f, false, false, 2.973f, -2.595f)
                lineTo(22.646f, 0.0f)
                close()
                moveTo(17.745f, 21.135f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.991f, 0.865f)
                horizontalLineTo(7.246f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.991f, -0.865f)
                lineTo(4.6f, 9.0f)
                horizontalLineTo(16.689f)
                lineTo(17.0f, 7.0f)
                horizontalLineTo(4.327f)
                lineTo(3.646f, 2.0f)
                horizontalLineTo(20.354f)
                close()
            }
        }
        .build()
        return _glass!!
    }

private var _glass: ImageVector? = null
