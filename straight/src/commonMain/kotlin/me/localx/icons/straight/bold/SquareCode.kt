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

public val Icons.Bold.SquareCode: ImageVector
    get() {
        if (_squareCode != null) {
            return _squareCode!!
        }
        _squareCode = Builder(name = "SquareCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.973f, 17.059f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(2.938f, -2.938f)
                lineToRelative(-2.938f, -2.937f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(3.299f, 3.298f)
                curveToRelative(0.97f, 0.971f, 0.97f, 2.549f, 0.0f, 3.519f)
                lineToRelative(-3.3f, 3.3f)
                close()
                moveTo(11.149f, 14.938f)
                lineToRelative(-2.938f, -2.938f)
                lineToRelative(2.938f, -2.937f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-3.3f, 3.299f)
                curveToRelative(-0.969f, 0.97f, -0.969f, 2.548f, 0.0f, 3.519f)
                lineToRelative(3.299f, 3.299f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.5f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                lineTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                close()
            }
        }
        .build()
        return _squareCode!!
    }

private var _squareCode: ImageVector? = null
