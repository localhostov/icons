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

public val Icons.Filled.ArrowAltSquareUp: ImageVector
    get() {
        if (_arrowAltSquareUp != null) {
            return _arrowAltSquareUp!!
        }
        _arrowAltSquareUp = Builder(name = "ArrowAltSquareUp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineTo(6.868f)
                lineToRelative(4.236f, -4.629f)
                curveToRelative(0.443f, -0.494f, 1.217f, -0.494f, 1.66f, 0.0f)
                lineToRelative(4.236f, 4.629f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _arrowAltSquareUp!!
    }

private var _arrowAltSquareUp: ImageVector? = null
