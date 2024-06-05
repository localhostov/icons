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

public val Icons.Filled.CrystalBall: ImageVector
    get() {
        if (_crystalBall != null) {
            return _crystalBall!!
        }
        _crystalBall = Builder(name = "CrystalBall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                lineToRelative(2.667f, -1.333f)
                lineToRelative(1.333f, -2.667f)
                lineToRelative(1.333f, 2.667f)
                lineToRelative(2.667f, 1.333f)
                lineToRelative(-2.667f, 1.333f)
                lineToRelative(-1.333f, 2.667f)
                lineToRelative(-1.333f, -2.667f)
                lineToRelative(-2.667f, -1.333f)
                close()
                moveTo(3.403f, 18.0f)
                curveToRelative(-1.559f, -1.901f, -2.506f, -4.324f, -2.506f, -6.974f)
                curveTo(0.897f, 4.936f, 5.834f, 0.0f, 11.923f, 0.0f)
                curveToRelative(1.83f, 0.0f, 3.551f, 0.453f, 5.07f, 1.241f)
                lineToRelative(-5.518f, 2.759f)
                lineToRelative(5.649f, 2.824f)
                lineToRelative(2.824f, 5.649f)
                lineToRelative(2.445f, -4.89f)
                curveToRelative(0.356f, 1.084f, 0.555f, 2.239f, 0.555f, 3.442f)
                curveToRelative(0.0f, 2.65f, -0.945f, 5.073f, -2.503f, 6.974f)
                lineTo(3.403f, 17.999f)
                close()
                moveTo(8.948f, 11.5f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(2.333f, -1.167f)
                lineToRelative(-2.333f, -1.167f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-2.333f, 1.167f)
                close()
                moveTo(2.317f, 20.0f)
                lineToRelative(-1.369f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(22.949f, 24.0f)
                lineToRelative(0.051f, -2.0f)
                lineToRelative(-1.396f, -2.0f)
                lineTo(2.317f, 20.0f)
                close()
            }
        }
        .build()
        return _crystalBall!!
    }

private var _crystalBall: ImageVector? = null
