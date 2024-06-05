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

public val Icons.Bold.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) {
            return _flowerTulip!!
        }
        _flowerTulip = Builder(name = "FlowerTulip", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.263f, 14.759f)
                arcToRelative(2.427f, 2.427f, 0.0f, false, false, -2.0f, -0.748f)
                arcTo(12.49f, 12.49f, 0.0f, false, false, 13.5f, 17.337f)
                lineTo(13.5f, 14.818f)
                arcToRelative(6.506f, 6.506f, 0.0f, false, false, 5.0f, -6.318f)
                curveToRelative(0.0f, -2.973f, -2.016f, -5.43f, -3.987f, -7.441f)
                arcToRelative(3.592f, 3.592f, 0.0f, false, false, -5.026f, 0.0f)
                curveTo(7.516f, 3.07f, 5.5f, 5.527f, 5.5f, 8.5f)
                arcToRelative(6.506f, 6.506f, 0.0f, false, false, 5.0f, 6.318f)
                verticalLineToRelative(2.519f)
                arcToRelative(12.493f, 12.493f, 0.0f, false, false, -7.763f, -3.326f)
                arcToRelative(2.432f, 2.432f, 0.0f, false, false, -2.0f, 0.748f)
                arcToRelative(2.665f, 2.665f, 0.0f, false, false, -0.687f, 2.2f)
                curveToRelative(0.811f, 5.673f, 6.6f, 7.108f, 10.559f, 7.108f)
                curveToRelative(5.012f, 0.143f, 12.1f, -0.157f, 13.341f, -7.108f)
                arcTo(2.669f, 2.669f, 0.0f, false, false, 23.263f, 14.759f)
                close()
                moveTo(8.5f, 8.5f)
                arcToRelative(7.04f, 7.04f, 0.0f, false, true, 2.0f, -4.118f)
                lineTo(10.5f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(13.5f, 4.382f)
                arcToRelative(7.04f, 7.04f, 0.0f, false, true, 2.0f, 4.118f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                close()
                moveTo(3.127f, 17.077f)
                arcToRelative(8.953f, 8.953f, 0.0f, false, true, 6.561f, 3.956f)
                curveTo(7.369f, 20.9f, 3.917f, 20.162f, 3.127f, 17.077f)
                close()
                moveTo(14.312f, 21.033f)
                arcToRelative(8.955f, 8.955f, 0.0f, false, true, 6.561f, -3.956f)
                curveTo(20.084f, 20.162f, 16.631f, 20.9f, 14.312f, 21.033f)
                close()
            }
        }
        .build()
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
