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

public val Icons.Bold.LoopSquare: ImageVector
    get() {
        if (_loopSquare != null) {
            return _loopSquare!!
        }
        _loopSquare = Builder(name = "LoopSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.364f, 18.531f)
                curveToRelative(-0.477f, 0.477f, -1.251f, 0.477f, -1.728f, 0.0f)
                lineTo(0.0f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.5f)
                curveTo(4.0f, 2.019f, 6.019f, 0.0f, 8.5f, 0.0f)
                horizontalLineToRelative(9.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-4.636f, 4.531f)
                close()
                moveTo(24.0f, 10.0f)
                lineToRelative(-4.636f, -4.531f)
                curveToRelative(-0.477f, -0.477f, -1.251f, -0.477f, -1.728f, 0.0f)
                lineToRelative(-4.636f, 4.531f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(15.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _loopSquare!!
    }

private var _loopSquare: ImageVector? = null
