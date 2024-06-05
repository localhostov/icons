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

public val Icons.Bold.ProgressComplete: ImageVector
    get() {
        if (_progressComplete != null) {
            return _progressComplete!!
        }
        _progressComplete = Builder(name = "ProgressComplete", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.894f, 5.415f)
                lineTo(14.032f, 15.151f)
                curveToRelative(-0.565f, 0.565f, -1.311f, 0.849f, -2.056f, 0.849f)
                curveToRelative(-0.749f, 0.0f, -1.498f, -0.285f, -2.068f, -0.855f)
                lineToRelative(-4.48f, -4.343f)
                lineToRelative(2.088f, -2.154f)
                lineToRelative(4.458f, 4.321f)
                lineTo(21.786f, 3.28f)
                lineToRelative(2.107f, 2.135f)
                close()
                moveTo(3.964f, 7.942f)
                lineToRelative(-2.678f, -1.352f)
                curveToRelative(-0.565f, 1.119f, -0.949f, 2.313f, -1.143f, 3.549f)
                lineToRelative(2.965f, 0.463f)
                curveToRelative(0.145f, -0.926f, 0.433f, -1.821f, 0.855f, -2.66f)
                close()
                moveTo(3.109f, 13.402f)
                lineToRelative(-2.965f, 0.463f)
                curveToRelative(0.193f, 1.237f, 0.578f, 2.432f, 1.145f, 3.55f)
                lineToRelative(2.676f, -1.355f)
                curveToRelative(-0.423f, -0.836f, -0.711f, -1.73f, -0.855f, -2.657f)
                close()
                moveTo(3.464f, 3.566f)
                lineToRelative(2.135f, 2.107f)
                curveToRelative(0.642f, -0.674f, 1.594f, -1.337f, 2.247f, -1.659f)
                lineToRelative(-1.383f, -2.662f)
                curveToRelative(-1.174f, 0.599f, -2.421f, 1.628f, -2.999f, 2.214f)
                close()
                moveTo(3.467f, 20.437f)
                curveToRelative(0.881f, 0.892f, 1.891f, 1.636f, 2.999f, 2.213f)
                lineToRelative(1.385f, -2.662f)
                curveToRelative(-0.832f, -0.433f, -1.589f, -0.991f, -2.251f, -1.66f)
                lineToRelative(-2.133f, 2.109f)
                close()
                moveTo(20.036f, 16.059f)
                lineToRelative(2.676f, 1.355f)
                curveToRelative(0.566f, -1.118f, 0.951f, -2.312f, 1.145f, -3.55f)
                lineToRelative(-2.965f, -0.463f)
                curveToRelative(-0.145f, 0.927f, -0.433f, 1.821f, -0.855f, 2.657f)
                close()
                moveTo(16.149f, 19.988f)
                lineToRelative(1.385f, 2.662f)
                curveToRelative(1.108f, -0.577f, 2.118f, -1.321f, 2.999f, -2.213f)
                lineToRelative(-2.133f, -2.109f)
                curveToRelative(-0.662f, 0.669f, -1.419f, 1.228f, -2.251f, 1.66f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-0.501f, 0.0f, -1.005f, -0.042f, -1.498f, -0.124f)
                lineToRelative(-0.494f, 2.959f)
                curveToRelative(0.656f, 0.109f, 1.326f, 0.165f, 1.992f, 0.165f)
                reflectiveCurveToRelative(1.336f, -0.056f, 1.992f, -0.165f)
                lineToRelative(-0.494f, -2.959f)
                curveToRelative(-0.493f, 0.082f, -0.997f, 0.124f, -1.498f, 0.124f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(0.501f, 0.0f, 1.005f, 0.042f, 1.498f, 0.124f)
                lineToRelative(0.494f, -2.959f)
                curveToRelative(-0.656f, -0.109f, -1.326f, -0.165f, -1.992f, -0.165f)
                reflectiveCurveToRelative(-1.336f, 0.056f, -1.992f, 0.165f)
                lineToRelative(0.494f, 2.959f)
                curveToRelative(0.493f, -0.082f, 0.997f, -0.124f, 1.498f, -0.124f)
                close()
            }
        }
        .build()
        return _progressComplete!!
    }

private var _progressComplete: ImageVector? = null
