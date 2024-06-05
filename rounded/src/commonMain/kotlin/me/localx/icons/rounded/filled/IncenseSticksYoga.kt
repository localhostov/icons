package me.localx.icons.rounded.filled

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

public val Icons.Filled.IncenseSticksYoga: ImageVector
    get() {
        if (_incenseSticksYoga != null) {
            return _incenseSticksYoga!!
        }
        _incenseSticksYoga = Builder(name = "IncenseSticksYoga", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.255f, 14.0f)
                horizontalLineToRelative(-5.498f)
                lineToRelative(2.717f, -11.775f)
                curveToRelative(0.124f, -0.539f, -0.212f, -1.075f, -0.75f, -1.2f)
                curveToRelative(-0.534f, -0.122f, -1.074f, 0.212f, -1.199f, 0.75f)
                lineToRelative(-2.821f, 12.225f)
                horizontalLineToRelative(-1.704f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-1.704f)
                lineTo(6.475f, 1.775f)
                curveToRelative(-0.124f, -0.538f, -0.664f, -0.872f, -1.199f, -0.75f)
                curveToRelative(-0.538f, 0.125f, -0.874f, 0.661f, -0.75f, 1.2f)
                lineToRelative(2.717f, 11.775f)
                horizontalLineTo(1.745f)
                curveToRelative(-1.608f, 0.0f, -2.355f, 1.993f, -1.15f, 3.059f)
                curveToRelative(1.613f, 1.427f, 3.529f, 2.572f, 5.539f, 3.253f)
                curveToRelative(-0.676f, 0.485f, -1.271f, 1.091f, -1.748f, 1.805f)
                lineToRelative(-0.219f, 0.328f)
                curveToRelative(-0.307f, 0.459f, -0.183f, 1.081f, 0.277f, 1.387f)
                reflectiveCurveToRelative(1.081f, 0.182f, 1.387f, -0.277f)
                lineToRelative(0.219f, -0.328f)
                curveToRelative(0.93f, -1.394f, 2.485f, -2.227f, 4.16f, -2.227f)
                horizontalLineToRelative(3.578f)
                curveToRelative(1.675f, 0.0f, 3.23f, 0.833f, 4.16f, 2.227f)
                lineToRelative(0.219f, 0.328f)
                curveToRelative(0.192f, 0.289f, 0.51f, 0.445f, 0.833f, 0.445f)
                curveToRelative(0.19f, 0.0f, 0.383f, -0.054f, 0.554f, -0.168f)
                curveToRelative(0.46f, -0.306f, 0.584f, -0.927f, 0.277f, -1.387f)
                lineToRelative(-0.219f, -0.328f)
                curveToRelative(-0.476f, -0.714f, -1.072f, -1.32f, -1.748f, -1.805f)
                curveToRelative(2.01f, -0.682f, 3.927f, -1.826f, 5.539f, -3.253f)
                curveToRelative(1.205f, -1.066f, 0.458f, -3.059f, -1.15f, -3.059f)
                close()
            }
        }
        .build()
        return _incenseSticksYoga!!
    }

private var _incenseSticksYoga: ImageVector? = null
