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

public val Icons.Bold.SquareM: ImageVector
    get() {
        if (_squareM != null) {
            return _squareM!!
        }
        _squareM = Builder(name = "SquareM", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(19.0f, 7.244f)
                verticalLineToRelative(11.756f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-9.013f)
                lineToRelative(-4.0f, 6.481f)
                lineToRelative(-4.0f, -6.479f)
                verticalLineToRelative(9.01f)
                horizontalLineToRelative(-3.0f)
                lineTo(5.0f, 7.244f)
                curveToRelative(0.0f, -1.009f, 0.6f, -1.85f, 1.527f, -2.142f)
                curveToRelative(0.932f, -0.293f, 1.944f, 0.056f, 2.516f, 0.873f)
                lineToRelative(2.957f, 4.785f)
                lineToRelative(2.91f, -4.713f)
                curveToRelative(0.618f, -0.888f, 1.63f, -1.238f, 2.563f, -0.944f)
                curveToRelative(0.928f, 0.292f, 1.527f, 1.133f, 1.527f, 2.142f)
                close()
            }
        }
        .build()
        return _squareM!!
    }

private var _squareM: ImageVector? = null
