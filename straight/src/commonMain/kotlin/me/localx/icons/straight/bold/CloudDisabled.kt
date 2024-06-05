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

public val Icons.Bold.CloudDisabled: ImageVector
    get() {
        if (_cloudDisabled != null) {
            return _cloudDisabled!!
        }
        _cloudDisabled = Builder(name = "CloudDisabled", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.85f)
                arcToRelative(8.176f, 8.176f, 0.0f, false, false, -6.024f, -7.85f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -7.885f, -6.0f)
                arcToRelative(8.065f, 8.065f, 0.0f, false, false, -5.15f, 1.82f)
                lineToRelative(-2.755f, -2.756f)
                lineToRelative(-2.122f, 2.122f)
                lineToRelative(21.75f, 21.75f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(-1.806f, -1.8f)
                arcToRelative(8.067f, 8.067f, 0.0f, false, false, 1.87f, -5.164f)
                close()
                moveTo(10.091f, 4.0f)
                arcToRelative(5.181f, 5.181f, 0.0f, false, true, 5.13f, 4.465f)
                lineToRelative(0.151f, 1.135f)
                lineToRelative(1.138f, 0.15f)
                arcToRelative(5.172f, 5.172f, 0.0f, false, true, 4.49f, 5.1f)
                arcToRelative(5.054f, 5.054f, 0.0f, false, true, -1.0f, 3.024f)
                lineToRelative(-12.927f, -12.923f)
                arcToRelative(5.085f, 5.085f, 0.0f, false, true, 3.018f, -0.951f)
                close()
                moveTo(13.655f, 20.0f)
                lineTo(16.615f, 22.96f)
                curveToRelative(-0.263f, 0.025f, -0.528f, 0.04f, -0.8f, 0.04f)
                horizontalLineToRelative(-10.015f)
                arcToRelative(5.792f, 5.792f, 0.0f, false, true, -5.8f, -5.775f)
                arcToRelative(5.953f, 5.953f, 0.0f, false, true, 2.72f, -4.925f)
                arcToRelative(8.045f, 8.045f, 0.0f, false, true, -0.69f, -3.27f)
                curveToRelative(0.0f, -0.211f, 0.015f, -0.418f, 0.03f, -0.624f)
                lineToRelative(4.891f, 4.894f)
                lineToRelative(0.432f, 0.58f)
                lineToRelative(-2.165f, 0.557f)
                arcToRelative(3.025f, 3.025f, 0.0f, false, false, -2.218f, 2.788f)
                arcToRelative(2.788f, 2.788f, 0.0f, false, false, 2.8f, 2.775f)
                close()
            }
        }
        .build()
        return _cloudDisabled!!
    }

private var _cloudDisabled: ImageVector? = null
