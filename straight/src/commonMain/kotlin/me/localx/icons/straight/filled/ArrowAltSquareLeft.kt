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

public val Icons.Filled.ArrowAltSquareLeft: ImageVector
    get() {
        if (_arrowAltSquareLeft != null) {
            return _arrowAltSquareLeft!!
        }
        _arrowAltSquareLeft = Builder(name = "ArrowAltSquareLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(4.132f)
                lineToRelative(-4.629f, -4.236f)
                curveToRelative(-0.494f, -0.443f, -0.494f, -1.217f, 0.0f, -1.66f)
                lineToRelative(4.629f, -4.236f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _arrowAltSquareLeft!!
    }

private var _arrowAltSquareLeft: ImageVector? = null
