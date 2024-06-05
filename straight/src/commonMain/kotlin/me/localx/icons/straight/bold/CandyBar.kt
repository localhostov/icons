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

public val Icons.Bold.CandyBar: ImageVector
    get() {
        if (_candyBar != null) {
            return _candyBar!!
        }
        _candyBar = Builder(name = "CandyBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 11.5f)
                curveToRelative(0.0f, -0.462f, 0.214f, -0.797f, 0.394f, -0.997f)
                lineToRelative(0.902f, -1.003f)
                lineToRelative(-0.902f, -1.003f)
                curveToRelative(-0.18f, -0.199f, -0.394f, -0.534f, -0.394f, -0.997f)
                curveToRelative(0.0f, -0.387f, 0.256f, -0.8f, 0.882f, -1.425f)
                lineToRelative(1.062f, -1.061f)
                lineTo(17.927f, 0.999f)
                curveToRelative(-1.286f, -1.287f, -3.531f, -1.289f, -4.821f, 0.0f)
                lineTo(1.999f, 12.105f)
                curveToRelative(-1.33f, 1.329f, -1.33f, 3.492f, 0.0f, 4.821f)
                lineToRelative(6.075f, 6.075f)
                curveToRelative(0.644f, 0.644f, 1.5f, 0.999f, 2.411f, 0.999f)
                reflectiveCurveToRelative(1.767f, -0.354f, 2.411f, -0.999f)
                lineToRelative(9.028f, -9.029f)
                lineToRelative(-1.059f, -1.061f)
                curveToRelative(-0.598f, -0.598f, -0.864f, -1.034f, -0.864f, -1.412f)
                close()
                moveTo(9.053f, 9.293f)
                lineToRelative(2.016f, -2.016f)
                lineToRelative(2.236f, 2.236f)
                lineToRelative(-2.016f, 2.016f)
                lineToRelative(-2.236f, -2.236f)
                close()
                moveTo(15.425f, 11.634f)
                lineToRelative(2.297f, 2.297f)
                lineToRelative(-2.016f, 2.016f)
                lineToRelative(-2.297f, -2.297f)
                lineToRelative(2.016f, -2.016f)
                close()
                moveTo(15.516f, 2.999f)
                curveToRelative(0.077f, 0.0f, 0.189f, 0.021f, 0.289f, 0.12f)
                lineToRelative(1.946f, 1.946f)
                lineToRelative(-2.326f, 2.326f)
                lineToRelative(-2.236f, -2.236f)
                lineToRelative(2.037f, -2.037f)
                curveToRelative(0.1f, -0.1f, 0.213f, -0.12f, 0.29f, -0.12f)
                close()
                moveTo(10.773f, 20.879f)
                curveToRelative(-0.198f, 0.198f, -0.381f, 0.198f, -0.579f, 0.0f)
                lineToRelative(-6.075f, -6.075f)
                curveToRelative(-0.16f, -0.16f, -0.16f, -0.419f, 0.0f, -0.579f)
                lineToRelative(2.812f, -2.812f)
                lineToRelative(6.653f, 6.654f)
                lineToRelative(-2.812f, 2.812f)
                close()
            }
        }
        .build()
        return _candyBar!!
    }

private var _candyBar: ImageVector? = null
