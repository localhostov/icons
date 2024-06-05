package me.localx.icons.rounded.outline

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

public val Icons.Outline.Radish: ImageVector
    get() {
        if (_radish != null) {
            return _radish!!
        }
        _radish = Builder(name = "Radish", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.335f, 8.0f)
                curveToRelative(4.95f, -4.354f, -1.972f, -11.273f, -6.322f, -6.322f)
                curveTo(14.128f, -1.3f, 9.263f, -0.006f, 9.035f, 3.507f)
                curveToRelative(-0.027f, 3.1f, 1.881f, 4.0f, 1.956f, 7.6f)
                curveTo(8.06f, 8.621f, 4.266f, 8.083f, 1.464f, 10.949f)
                curveToRelative(-2.0f, 1.916f, -1.292f, 6.491f, -1.449f, 9.035f)
                arcToRelative(4.019f, 4.019f, 0.0f, false, false, 4.0f, 4.016f)
                curveToRelative(2.539f, -0.156f, 7.146f, 0.567f, 9.062f, -1.428f)
                curveToRelative(2.649f, -2.652f, 2.547f, -6.225f, -0.169f, -9.546f)
                curveToRelative(3.561f, 0.068f, 4.559f, 2.0f, 7.6f, 1.958f)
                curveTo(24.013f, 14.776f, 25.322f, 9.878f, 22.335f, 8.0f)
                close()
                moveTo(19.515f, 2.0f)
                arcToRelative(2.517f, 2.517f, 0.0f, false, true, 1.768f, 4.267f)
                curveToRelative(-0.325f, 0.326f, -1.649f, 1.094f, -2.135f, 1.438f)
                curveToRelative(-1.591f, 0.875f, -3.662f, 1.8f, -5.335f, 2.5f)
                curveToRelative(0.7f, -1.672f, 1.621f, -3.741f, 2.495f, -5.333f)
                curveTo(17.1f, 3.428f, 17.9f, 2.0f, 19.515f, 2.0f)
                close()
                moveTo(13.021f, 2.006f)
                arcTo(1.844f, 1.844f, 0.0f, false, true, 14.69f, 3.673f)
                arcToRelative(49.6f, 49.6f, 0.0f, false, false, -2.176f, 4.472f)
                curveToRelative(-0.392f, -1.7f, -1.533f, -2.958f, -1.487f, -4.463f)
                arcTo(1.844f, 1.844f, 0.0f, false, true, 13.021f, 2.007f)
                close()
                moveTo(11.663f, 21.158f)
                curveToRelative(-1.175f, 1.264f, -5.883f, 0.712f, -7.649f, 0.842f)
                curveToRelative(-2.674f, -0.163f, -1.886f, -3.0f, -1.98f, -5.088f)
                curveToRelative(0.0f, -1.908f, 0.005f, -3.71f, 0.844f, -4.549f)
                curveToRelative(2.466f, -2.448f, 5.334f, -1.29f, 7.705f, 1.064f)
                curveTo(11.906f, 14.751f, 14.66f, 18.156f, 11.663f, 21.158f)
                close()
                moveTo(21.584f, 12.341f)
                curveToRelative(-1.7f, 1.717f, -3.639f, -0.432f, -5.711f, -0.838f)
                arcToRelative(49.517f, 49.517f, 0.0f, false, false, 4.468f, -2.175f)
                arcTo(1.85f, 1.85f, 0.0f, false, true, 21.584f, 12.341f)
                close()
            }
        }
        .build()
        return _radish!!
    }

private var _radish: ImageVector? = null
