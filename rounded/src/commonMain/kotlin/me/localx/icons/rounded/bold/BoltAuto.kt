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

public val Icons.Bold.BoltAuto: ImageVector
    get() {
        if (_boltAuto != null) {
            return _boltAuto!!
        }
        _boltAuto = Builder(name = "BoltAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.919f, 22.018f)
                lineToRelative(-2.431f, -7.172f)
                curveToRelative(-0.385f, -1.122f, -1.363f, -1.847f, -2.489f, -1.847f)
                reflectiveCurveToRelative(-2.104f, 0.725f, -2.492f, 1.853f)
                lineToRelative(-2.429f, 7.166f)
                curveToRelative(-0.266f, 0.784f, 0.154f, 1.636f, 0.939f, 1.902f)
                curveToRelative(0.785f, 0.266f, 1.637f, -0.154f, 1.902f, -0.939f)
                lineToRelative(0.013f, -0.039f)
                horizontalLineToRelative(4.133f)
                lineToRelative(0.013f, 0.039f)
                curveToRelative(0.212f, 0.625f, 0.795f, 1.019f, 1.42f, 1.019f)
                curveToRelative(0.16f, 0.0f, 0.322f, -0.025f, 0.481f, -0.079f)
                curveToRelative(0.785f, -0.267f, 1.205f, -1.118f, 0.939f, -1.902f)
                close()
                moveTo(17.304f, 20.5f)
                lineToRelative(1.695f, -5.0f)
                lineToRelative(1.695f, 5.0f)
                horizontalLineToRelative(-3.39f)
                close()
                moveTo(15.599f, 9.754f)
                curveToRelative(-0.592f, -1.117f, -1.746f, -1.812f, -3.011f, -1.812f)
                lineToRelative(-2.704f, -0.002f)
                lineToRelative(1.058f, -4.59f)
                curveToRelative(0.376f, -1.318f, -0.186f, -2.66f, -1.336f, -3.191f)
                curveToRelative(-1.094f, -0.505f, -2.36f, -0.105f, -3.102f, 1.008f)
                lineTo(0.589f, 10.62f)
                curveToRelative(-0.71f, 1.047f, -0.784f, 2.392f, -0.191f, 3.51f)
                curveToRelative(0.592f, 1.118f, 1.747f, 1.812f, 3.012f, 1.812f)
                horizontalLineToRelative(2.702f)
                lineToRelative(-1.057f, 4.588f)
                curveToRelative(-0.376f, 1.317f, 0.185f, 2.659f, 1.335f, 3.191f)
                curveToRelative(0.315f, 0.146f, 0.645f, 0.216f, 0.972f, 0.216f)
                curveToRelative(0.808f, 0.0f, 1.602f, -0.431f, 2.129f, -1.224f)
                lineToRelative(5.914f, -9.449f)
                curveToRelative(0.71f, -1.047f, 0.784f, -2.392f, 0.191f, -3.51f)
                close()
                moveTo(12.895f, 11.626f)
                lineToRelative(-4.288f, 6.85f)
                lineToRelative(0.853f, -3.697f)
                curveToRelative(0.103f, -0.445f, -0.003f, -0.913f, -0.288f, -1.271f)
                curveToRelative(-0.285f, -0.358f, -0.717f, -0.566f, -1.174f, -0.566f)
                lineTo(3.41f, 12.942f)
                curveToRelative(-0.204f, 0.0f, -0.309f, -0.118f, -0.362f, -0.218f)
                curveToRelative(-0.052f, -0.099f, -0.091f, -0.252f, 0.053f, -0.467f)
                lineToRelative(4.288f, -6.853f)
                lineToRelative(-0.853f, 3.696f)
                curveToRelative(-0.103f, 0.445f, 0.003f, 0.913f, 0.287f, 1.271f)
                reflectiveCurveToRelative(0.716f, 0.566f, 1.173f, 0.566f)
                lineToRelative(4.587f, 0.004f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.204f, 0.0f, 0.309f, 0.118f, 0.362f, 0.218f)
                curveToRelative(0.052f, 0.099f, 0.091f, 0.252f, -0.053f, 0.467f)
                close()
            }
        }
        .build()
        return _boltAuto!!
    }

private var _boltAuto: ImageVector? = null
