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

public val Icons.Bold.SquareS: ImageVector
    get() {
        if (_squareS != null) {
            return _squareS!!
        }
        _squareS = Builder(name = "SquareS", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(15.0f, 9.0f)
                verticalLineToRelative(-0.093f)
                curveToRelative(0.0f, -0.5f, -0.407f, -0.907f, -0.907f, -0.907f)
                horizontalLineToRelative(-4.189f)
                curveToRelative(-0.498f, 0.0f, -0.903f, 0.405f, -0.903f, 0.903f)
                curveToRelative(0.0f, 0.402f, 0.271f, 0.76f, 0.657f, 0.87f)
                lineToRelative(5.51f, 1.562f)
                curveToRelative(1.67f, 0.481f, 2.833f, 2.025f, 2.833f, 3.757f)
                curveToRelative(0.0f, 2.154f, -1.753f, 3.907f, -3.907f, 3.907f)
                horizontalLineToRelative(-4.186f)
                curveToRelative(-2.154f, 0.0f, -3.907f, -1.753f, -3.907f, -3.907f)
                lineToRelative(3.0f, -0.093f)
                curveToRelative(0.0f, 0.593f, 0.407f, 1.0f, 0.907f, 1.0f)
                horizontalLineToRelative(4.186f)
                curveToRelative(0.5f, 0.0f, 0.907f, -0.407f, 0.907f, -0.907f)
                curveToRelative(0.0f, -0.402f, -0.27f, -0.761f, -0.657f, -0.872f)
                lineToRelative(-5.505f, -1.562f)
                curveToRelative(-1.671f, -0.476f, -2.838f, -2.02f, -2.838f, -3.756f)
                curveToRelative(0.0f, -2.152f, 1.751f, -3.903f, 3.903f, -3.903f)
                horizontalLineToRelative(4.189f)
                curveToRelative(2.154f, 0.0f, 3.907f, 1.753f, 3.907f, 3.907f)
                lineToRelative(-3.0f, 0.093f)
                close()
            }
        }
        .build()
        return _squareS!!
    }

private var _squareS: ImageVector? = null
