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

public val Icons.Filled.PipeSmoking: ImageVector
    get() {
        if (_pipeSmoking != null) {
            return _pipeSmoking!!
        }
        _pipeSmoking = Builder(name = "PipeSmoking", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.992f, 11.512f)
                curveToRelative(0.349f, -0.527f, 1.058f, -0.671f, 1.585f, -0.322f)
                lineToRelative(1.907f, 1.263f)
                curveToRelative(0.527f, 0.349f, 0.671f, 1.058f, 0.322f, 1.585f)
                lineToRelative(-4.669f, 7.173f)
                curveToRelative(-1.225f, 1.748f, -3.226f, 2.789f, -5.361f, 2.789f)
                horizontalLineToRelative(-1.206f)
                curveToRelative(-2.514f, 0.0f, -4.572f, -2.036f, -4.574f, -4.55f)
                curveToRelative(-0.003f, -3.593f, 0.617f, -5.91f, 1.144f, -8.45f)
                lineToRelative(7.117f, 0.013f)
                curveToRelative(0.313f, 1.509f, 0.659f, 2.792f, 0.888f, 4.339f)
                lineToRelative(2.848f, -3.84f)
                close()
                moveTo(22.653f, 0.0f)
                curveToRelative(-1.012f, 0.0f, -1.948f, 0.504f, -2.505f, 1.35f)
                lineToRelative(-5.411f, 8.211f)
                lineToRelative(1.668f, 1.103f)
                lineTo(21.818f, 2.45f)
                curveToRelative(0.186f, -0.282f, 0.498f, -0.45f, 0.835f, -0.45f)
                horizontalLineToRelative(1.347f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-1.347f)
                close()
            }
        }
        .build()
        return _pipeSmoking!!
    }

private var _pipeSmoking: ImageVector? = null
