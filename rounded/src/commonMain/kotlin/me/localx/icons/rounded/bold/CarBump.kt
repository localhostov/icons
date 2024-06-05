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

public val Icons.Bold.CarBump: ImageVector
    get() {
        if (_carBump != null) {
            return _carBump!!
        }
        _carBump = Builder(name = "CarBump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.952f, 23.949f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.835f, -1.064f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, false, -5.1f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.9f, -0.771f)
                curveToRelative(1.4f, -5.424f, 9.5f, -5.421f, 10.9f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.952f, 23.949f)
                close()
                moveTo(8.463f, 18.321f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.738f, 1.421f)
                lineToRelative(-0.2f, -0.507f)
                arcTo(4.064f, 4.064f, 0.0f, false, true, 1.448f, 16.8f)
                lineTo(0.671f, 14.93f)
                arcToRelative(9.584f, 9.584f, 0.0f, false, true, -0.656f, -4.05f)
                lineTo(0.177f, 8.043f)
                arcToRelative(5.518f, 5.518f, 0.0f, false, true, 3.475f, -4.8f)
                lineTo(11.25f, 0.375f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, 5.8f, 1.149f)
                lineTo(19.1f, 3.49f)
                arcToRelative(9.569f, 9.569f, 0.0f, false, true, 2.272f, 3.383f)
                lineToRelative(0.72f, 1.732f)
                arcToRelative(4.058f, 4.058f, 0.0f, false, true, -0.572f, 4.075f)
                lineToRelative(0.2f, 0.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 14.643f)
                lineToRelative(0.0f, -0.008f)
                close()
                moveTo(3.172f, 8.214f)
                lineToRelative(-0.11f, 1.925f)
                lineTo(16.439f, 5.1f)
                lineToRelative(-1.466f, -1.4f)
                arcToRelative(2.508f, 2.508f, 0.0f, false, false, -2.644f, -0.519f)
                lineToRelative(-7.6f, 2.865f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.172f, 8.214f)
                close()
                moveTo(4.219f, 15.652f)
                arcToRelative(1.052f, 1.052f, 0.0f, false, false, 1.342f, 0.575f)
                horizontalLineToRelative(0.0f)
                lineToRelative(13.172f, -5.1f)
                arcToRelative(1.044f, 1.044f, 0.0f, false, false, 0.588f, -1.375f)
                lineTo(18.592f, 8.0f)
                quadToRelative(-0.087f, -0.222f, -0.191f, -0.437f)
                lineToRelative(-2.079f, 0.784f)
                lineToRelative(0.309f, 0.746f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.77f, 1.151f)
                lineTo(13.513f, 9.4f)
                lineTo(8.019f, 11.476f)
                lineToRelative(0.33f, 0.8f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.77f, 1.15f)
                lineToRelative(-0.368f, -0.886f)
                lineToRelative(-1.943f, 0.733f)
                quadToRelative(0.08f, 0.273f, 0.184f, 0.537f)
                close()
            }
        }
        .build()
        return _carBump!!
    }

private var _carBump: ImageVector? = null
