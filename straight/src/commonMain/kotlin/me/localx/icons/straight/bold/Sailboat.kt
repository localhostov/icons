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

public val Icons.Bold.Sailboat: ImageVector
    get() {
        if (_sailboat != null) {
            return _sailboat!!
        }
        _sailboat = Builder(name = "Sailboat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.01f, 15.0f)
                lineToRelative(0.221f, 1.694f)
                curveToRelative(0.329f, 2.526f, 2.691f, 7.306f, 9.27f, 7.306f)
                horizontalLineToRelative(5.0f)
                curveToRelative(6.571f, 0.0f, 8.965f, -4.772f, 9.312f, -7.295f)
                lineToRelative(0.234f, -1.705f)
                lineTo(0.01f, 15.0f)
                close()
                moveTo(14.5f, 21.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-3.407f, 0.0f, -4.987f, -1.648f, -5.71f, -3.0f)
                horizontalLineToRelative(16.447f)
                curveToRelative(-0.737f, 1.355f, -2.332f, 3.0f, -5.737f, 3.0f)
                close()
                moveTo(23.0f, 13.0f)
                horizontalLineToRelative(-11.0f)
                lineToRelative(0.009f, -13.0f)
                lineToRelative(10.991f, 13.0f)
                close()
                moveTo(10.0f, 13.0f)
                lineTo(1.0f, 13.0f)
                lineTo(10.0f, 3.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
