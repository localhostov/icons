package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.RotateReverse: ImageVector
    get() {
        if (_rotateReverse != null) {
            return _rotateReverse!!
        }
        _rotateReverse = Builder(name = "RotateReverse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 17.187f)
                verticalLineToRelative(4.52f)
                curveToRelative(0.0f, 0.705f, -0.852f, 1.058f, -1.35f, 0.559f)
                lineToRelative(-1.491f, -1.491f)
                curveToRelative(-2.2f, 2.042f, -5.103f, 3.225f, -8.158f, 3.225f)
                curveTo(6.066f, 24.0f, 0.868f, 19.577f, 0.029f, 13.712f)
                curveToRelative(-0.117f, -0.82f, 0.453f, -1.58f, 1.273f, -1.697f)
                curveToRelative(0.816f, -0.122f, 1.579f, 0.453f, 1.697f, 1.272f)
                curveToRelative(0.628f, 4.397f, 4.55f, 7.712f, 9.0f, 7.712f)
                curveToRelative(2.254f, 0.0f, 4.4f, -0.856f, 6.041f, -2.342f)
                lineToRelative(-1.308f, -1.308f)
                curveToRelative(-0.498f, -0.498f, -0.145f, -1.35f, 0.559f, -1.35f)
                horizontalLineToRelative(4.52f)
                curveToRelative(0.656f, 0.0f, 1.187f, 0.531f, 1.187f, 1.187f)
                close()
                moveTo(1.0f, 6.813f)
                verticalLineTo(2.293f)
                curveToRelative(0.0f, -0.705f, 0.852f, -1.058f, 1.35f, -0.559f)
                lineToRelative(1.491f, 1.491f)
                curveTo(6.042f, 1.183f, 8.945f, 0.0f, 12.0f, 0.0f)
                curveToRelative(5.934f, 0.0f, 11.132f, 4.423f, 11.971f, 10.288f)
                curveToRelative(0.117f, 0.82f, -0.453f, 1.58f, -1.273f, 1.697f)
                curveToRelative(-0.816f, 0.122f, -1.579f, -0.453f, -1.697f, -1.272f)
                curveToRelative(-0.628f, -4.397f, -4.55f, -7.712f, -9.0f, -7.712f)
                curveToRelative(-2.254f, 0.0f, -4.4f, 0.856f, -6.041f, 2.342f)
                lineToRelative(1.308f, 1.308f)
                curveToRelative(0.498f, 0.498f, 0.145f, 1.35f, -0.559f, 1.35f)
                horizontalLineTo(2.187f)
                curveToRelative(-0.656f, 0.0f, -1.187f, -0.531f, -1.187f, -1.187f)
                close()
            }
        }
        .build()
        return _rotateReverse!!
    }

private var _rotateReverse: ImageVector? = null
