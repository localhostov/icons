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

public val Icons.Bold.CrystalBall: ImageVector
    get() {
        if (_crystalBall != null) {
            return _crystalBall!!
        }
        _crystalBall = Builder(name = "CrystalBall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.667f, 9.333f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-2.333f, -1.167f)
                lineToRelative(2.333f, -1.167f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(1.167f, 2.333f)
                close()
                moveTo(18.667f, 5.333f)
                lineToRelative(1.333f, 2.667f)
                lineToRelative(1.333f, -2.667f)
                lineToRelative(2.667f, -1.333f)
                lineToRelative(-2.667f, -1.333f)
                lineToRelative(-1.333f, -2.667f)
                lineToRelative(-1.333f, 2.667f)
                lineToRelative(-2.667f, 1.333f)
                lineToRelative(2.667f, 1.333f)
                close()
                moveTo(22.437f, 7.523f)
                lineToRelative(-2.653f, 5.329f)
                curveToRelative(-0.144f, 0.604f, -0.356f, 1.182f, -0.629f, 1.725f)
                lineToRelative(0.003f, 0.002f)
                curveToRelative(-1.348f, 2.707f, -4.087f, 4.421f, -7.157f, 4.421f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveTo(7.589f, 3.0f, 12.0f, 3.0f)
                curveToRelative(0.426f, 0.0f, 0.844f, 0.034f, 1.251f, 0.098f)
                lineToRelative(3.769f, -1.884f)
                curveToRelative(-1.506f, -0.776f, -3.213f, -1.214f, -5.02f, -1.214f)
                curveTo(5.935f, 0.0f, 1.0f, 4.935f, 1.0f, 11.0f)
                curveToRelative(0.0f, 3.036f, 1.236f, 5.788f, 3.231f, 7.78f)
                lineToRelative(-2.231f, 2.677f)
                verticalLineToRelative(2.543f)
                lineTo(22.0f, 24.0f)
                verticalLineToRelative(-2.543f)
                lineToRelative(-2.221f, -2.665f)
                curveToRelative(1.04f, -1.041f, 1.88f, -2.304f, 2.449f, -3.74f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(0.499f, -1.255f, 0.774f, -2.622f, 0.774f, -4.053f)
                curveToRelative(0.0f, -1.214f, -0.198f, -2.383f, -0.563f, -3.477f)
                close()
            }
        }
        .build()
        return _crystalBall!!
    }

private var _crystalBall: ImageVector? = null
