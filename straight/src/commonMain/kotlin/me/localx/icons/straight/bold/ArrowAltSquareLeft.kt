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

public val Icons.Bold.ArrowAltSquareLeft: ImageVector
    get() {
        if (_arrowAltSquareLeft != null) {
            return _arrowAltSquareLeft!!
        }
        _arrowAltSquareLeft = Builder(name = "ArrowAltSquareLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.462f, 0.0f)
                lineTo(3.461f, 0.0f)
                curveTo(1.532f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 24.0f)
                lineTo(23.962f, 24.0f)
                lineTo(23.962f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(2.961f, 21.0f)
                lineTo(2.961f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                lineTo(20.462f, 3.0f)
                curveToRelative(0.275f, 0.0f, 0.538f, 0.224f, 0.538f, 0.5f)
                lineTo(21.0f, 21.0f)
                close()
                moveTo(11.0f, 10.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.632f)
                lineToRelative(-4.629f, -4.236f)
                curveToRelative(-0.494f, -0.443f, -0.494f, -1.217f, 0.0f, -1.66f)
                lineToRelative(4.629f, -4.236f)
                verticalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _arrowAltSquareLeft!!
    }

private var _arrowAltSquareLeft: ImageVector? = null
