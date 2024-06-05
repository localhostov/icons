package me.localx.icons.straight.filled

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

public val Icons.Filled.SquareX: ImageVector
    get() {
        if (_squareX != null) {
            return _squareX!!
        }
        _squareX = Builder(name = "SquareX", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(15.922f, 19.0f)
                lineToRelative(-3.922f, -5.309f)
                lineToRelative(-3.865f, 5.309f)
                horizontalLineToRelative(-2.481f)
                lineToRelative(5.106f, -7.0f)
                lineToRelative(-5.106f, -6.981f)
                horizontalLineToRelative(2.481f)
                lineToRelative(3.865f, 5.289f)
                lineToRelative(3.807f, -5.289f)
                horizontalLineToRelative(2.481f)
                lineToRelative(-5.048f, 6.981f)
                lineToRelative(5.164f, 7.0f)
                horizontalLineToRelative(-2.481f)
                close()
            }
        }
        .build()
        return _squareX!!
    }

private var _squareX: ImageVector? = null
