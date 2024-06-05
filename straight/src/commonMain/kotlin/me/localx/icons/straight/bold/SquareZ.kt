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

public val Icons.Bold.SquareZ: ImageVector
    get() {
        if (_squareZ != null) {
            return _squareZ!!
        }
        _squareZ = Builder(name = "SquareZ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(10.128f, 16.0f)
                horizontalLineToRelative(7.872f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-9.797f)
                curveToRelative(-0.894f, 0.0f, -1.692f, -0.534f, -2.034f, -1.359f)
                curveToRelative(-0.342f, -0.826f, -0.154f, -1.768f, 0.478f, -2.399f)
                lineToRelative(7.225f, -7.241f)
                horizontalLineToRelative(-7.872f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(9.797f)
                curveToRelative(0.894f, 0.0f, 1.692f, 0.534f, 2.034f, 1.359f)
                curveToRelative(0.342f, 0.826f, 0.154f, 1.768f, -0.478f, 2.399f)
                lineToRelative(-7.225f, 7.241f)
                close()
            }
        }
        .build()
        return _squareZ!!
    }

private var _squareZ: ImageVector? = null
