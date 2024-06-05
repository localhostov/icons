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

public val Icons.Filled.BenchTree: ImageVector
    get() {
        if (_benchTree != null) {
            return _benchTree!!
        }
        _benchTree = Builder(name = "BenchTree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 10.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.391f, 0.822f, 2.585f, 2.0f, 3.149f)
                verticalLineToRelative(2.351f)
                lineTo(1.0f, 19.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.351f)
                curveToRelative(1.178f, -0.564f, 2.0f, -1.758f, 2.0f, -3.149f)
                close()
                moveTo(4.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 19.0f)
                close()
                moveTo(23.544f, 10.161f)
                curveToRelative(0.487f, 0.959f, 0.58f, 1.966f, 0.297f, 2.966f)
                curveToRelative(-0.523f, 1.849f, -2.343f, 3.05f, -4.32f, 2.851f)
                curveToRelative(-0.242f, -0.024f, -0.344f, 0.032f, -0.399f, 0.081f)
                curveToRelative(-0.056f, 0.051f, -0.122f, 0.144f, -0.122f, 0.302f)
                verticalLineToRelative(6.64f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(17.0f, 13.5f)
                curveToRelative(0.0f, -2.562f, -1.739f, -4.765f, -4.23f, -5.353f)
                curveToRelative(-0.493f, -0.117f, -0.821f, -0.584f, -0.764f, -1.087f)
                curveToRelative(0.094f, -0.821f, 0.667f, -1.604f, 1.703f, -2.327f)
                curveToRelative(0.271f, -0.189f, 0.294f, -0.521f, 0.292f, -0.656f)
                curveToRelative(-0.011f, -0.542f, 0.092f, -1.084f, 0.306f, -1.61f)
                curveToRelative(0.468f, -1.151f, 1.454f, -2.021f, 2.637f, -2.33f)
                curveToRelative(0.706f, -0.185f, 1.437f, -0.181f, 2.143f, 0.008f)
                curveToRelative(1.171f, 0.313f, 2.146f, 1.184f, 2.61f, 2.326f)
                curveToRelative(0.214f, 0.531f, 0.316f, 1.075f, 0.303f, 1.62f)
                curveToRelative(-0.003f, 0.161f, 0.03f, 0.459f, 0.294f, 0.645f)
                curveToRelative(1.069f, 0.745f, 1.707f, 1.966f, 1.707f, 3.265f)
                curveToRelative(0.0f, 0.589f, -0.138f, 1.177f, -0.41f, 1.749f)
                curveToRelative(-0.104f, 0.218f, -0.096f, 0.306f, -0.096f, 0.307f)
                curveToRelative(0.003f, 0.016f, 0.032f, 0.069f, 0.05f, 0.105f)
                close()
            }
        }
        .build()
        return _benchTree!!
    }

private var _benchTree: ImageVector? = null
