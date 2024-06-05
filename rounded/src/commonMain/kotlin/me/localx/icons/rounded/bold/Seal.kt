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

public val Icons.Bold.Seal: ImageVector
    get() {
        if (_seal != null) {
            return _seal!!
        }
        _seal = Builder(name = "Seal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.004f, 9.594f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-2.003f, -2.003f)
                verticalLineToRelative(-1.091f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.091f)
                lineToRelative(-2.003f, -2.003f)
                curveToRelative(-1.285f, -1.285f, -3.528f, -1.285f, -4.812f, 0.0f)
                lineToRelative(-2.003f, 2.003f)
                horizontalLineToRelative(-1.091f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.091f)
                lineToRelative(-2.004f, 2.003f)
                curveToRelative(-1.326f, 1.327f, -1.326f, 3.485f, 0.0f, 4.812f)
                lineToRelative(2.003f, 2.003f)
                verticalLineToRelative(1.091f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.091f)
                lineToRelative(2.003f, 2.003f)
                curveToRelative(0.643f, 0.643f, 1.497f, 0.997f, 2.406f, 0.997f)
                reflectiveCurveToRelative(1.764f, -0.354f, 2.406f, -0.997f)
                lineToRelative(2.003f, -2.003f)
                horizontalLineToRelative(1.091f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.091f)
                lineToRelative(2.004f, -2.003f)
                curveToRelative(1.326f, -1.327f, 1.326f, -3.485f, 0.0f, -4.812f)
                close()
                moveTo(20.882f, 12.285f)
                lineToRelative(-2.443f, 2.442f)
                curveToRelative(-0.281f, 0.281f, -0.439f, 0.663f, -0.439f, 1.061f)
                verticalLineToRelative(1.712f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.712f)
                curveToRelative(-0.398f, 0.0f, -0.779f, 0.158f, -1.061f, 0.439f)
                lineToRelative(-2.442f, 2.442f)
                curveToRelative(-0.195f, 0.195f, -0.375f, 0.195f, -0.57f, 0.0f)
                lineToRelative(-2.443f, -2.442f)
                curveToRelative(-0.281f, -0.281f, -0.663f, -0.439f, -1.061f, -0.439f)
                horizontalLineToRelative(-1.712f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-1.712f)
                curveToRelative(0.0f, -0.397f, -0.158f, -0.779f, -0.439f, -1.061f)
                lineToRelative(-2.442f, -2.442f)
                curveToRelative(-0.157f, -0.157f, -0.157f, -0.413f, 0.0f, -0.57f)
                lineToRelative(2.443f, -2.442f)
                curveToRelative(0.281f, -0.281f, 0.439f, -0.663f, 0.439f, -1.061f)
                verticalLineToRelative(-1.712f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.712f)
                curveToRelative(0.398f, 0.0f, 0.779f, -0.158f, 1.061f, -0.439f)
                lineToRelative(2.443f, -2.442f)
                curveToRelative(0.194f, -0.195f, 0.374f, -0.195f, 0.569f, 0.0f)
                lineToRelative(2.442f, 2.442f)
                curveToRelative(0.281f, 0.281f, 0.663f, 0.439f, 1.061f, 0.439f)
                horizontalLineToRelative(1.712f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(1.712f)
                curveToRelative(0.0f, 0.397f, 0.158f, 0.779f, 0.439f, 1.061f)
                lineToRelative(2.442f, 2.442f)
                curveToRelative(0.157f, 0.157f, 0.157f, 0.413f, 0.0f, 0.57f)
                close()
            }
        }
        .build()
        return _seal!!
    }

private var _seal: ImageVector? = null
