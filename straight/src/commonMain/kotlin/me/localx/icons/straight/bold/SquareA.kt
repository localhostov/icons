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

public val Icons.Bold.SquareA: ImageVector
    get() {
        if (_squareA != null) {
            return _squareA!!
        }
        _squareA = Builder(name = "SquareA", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(-1.358f, 0.0f, -2.327f, 0.469f, -3.0f, 2.0f)
                lineToRelative(-4.0f, 12.0f)
                horizontalLineToRelative(3.244f)
                lineToRelative(0.926f, -3.0f)
                horizontalLineToRelative(5.659f)
                lineToRelative(0.926f, 3.0f)
                horizontalLineToRelative(3.244f)
                lineToRelative(-4.0f, -12.0f)
                curveToRelative(-0.673f, -1.531f, -1.642f, -2.0f, -3.0f, -2.0f)
                close()
                moveTo(10.097f, 13.0f)
                lineToRelative(1.458f, -4.723f)
                curveToRelative(0.085f, -0.173f, 0.27f, -0.275f, 0.445f, -0.277f)
                curveToRelative(0.175f, 0.002f, 0.36f, 0.104f, 0.445f, 0.277f)
                lineToRelative(1.458f, 4.723f)
                horizontalLineToRelative(-3.807f)
                close()
            }
        }
        .build()
        return _squareA!!
    }

private var _squareA: ImageVector? = null
