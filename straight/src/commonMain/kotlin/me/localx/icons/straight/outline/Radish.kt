package me.localx.icons.straight.outline

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
                moveTo(22.321f, 8.0f)
                curveToRelative(0.13f, -0.108f, 0.257f, -0.216f, 0.361f, -0.321f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -6.364f, -6.364f)
                curveToRelative(-0.105f, 0.1f, -0.214f, 0.233f, -0.323f, 0.364f)
                arcTo(3.828f, 3.828f, 0.0f, false, false, 9.016f, 3.505f)
                arcToRelative(5.971f, 5.971f, 0.0f, false, false, 0.771f, 3.16f)
                arcToRelative(11.158f, 11.158f, 0.0f, false, true, 1.186f, 4.442f)
                arcToRelative(8.946f, 8.946f, 0.0f, false, false, -4.1f, -2.02f)
                arcToRelative(6.045f, 6.045f, 0.0f, false, false, -5.435f, 1.861f)
                curveTo(0.019f, 12.373f, 0.0f, 14.68f, 0.0f, 16.91f)
                lineTo(0.0f, 24.0f)
                lineTo(7.123f, 24.0f)
                curveToRelative(2.208f, 0.007f, 4.517f, -0.011f, 5.935f, -1.429f)
                curveToRelative(2.65f, -2.651f, 2.547f, -6.224f, -0.169f, -9.545f)
                arcToRelative(11.184f, 11.184f, 0.0f, false, true, 4.446f, 1.185f)
                arcTo(6.488f, 6.488f, 0.0f, false, false, 20.111f, 15.0f)
                curveToRelative(0.125f, 0.0f, 0.252f, -0.005f, 0.383f, -0.016f)
                arcTo(3.826f, 3.826f, 0.0f, false, false, 22.321f, 8.0f)
                close()
                moveTo(19.5f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.767f, 4.266f)
                curveTo(20.125f, 7.411f, 16.456f, 9.1f, 13.8f, 10.2f)
                curveToRelative(1.109f, -2.659f, 2.793f, -6.328f, 3.936f, -7.471f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.5f, 2.0f)
                close()
                moveTo(11.658f, 2.429f)
                arcTo(1.816f, 1.816f, 0.0f, false, true, 13.0f, 2.007f)
                arcToRelative(1.841f, 1.841f, 0.0f, false, true, 1.668f, 1.668f)
                curveTo(13.894f, 5.049f, 13.127f, 6.7f, 12.5f, 8.144f)
                arcToRelative(15.677f, 15.677f, 0.0f, false, false, -0.889f, -2.309f)
                arcToRelative(4.211f, 4.211f, 0.0f, false, true, -0.6f, -2.155f)
                arcTo(1.831f, 1.831f, 0.0f, false, true, 11.659f, 2.431f)
                close()
                moveTo(11.643f, 21.155f)
                curveToRelative(-0.833f, 0.832f, -2.625f, 0.833f, -4.52f, 0.83f)
                lineTo(1.986f, 22.0f)
                reflectiveCurveToRelative(0.027f, -4.626f, 0.028f, -5.086f)
                curveToRelative(0.0f, -1.909f, 0.0f, -3.711f, 0.843f, -4.551f)
                arcToRelative(4.067f, 4.067f, 0.0f, false, true, 3.687f, -1.3f)
                arcToRelative(7.811f, 7.811f, 0.0f, false, true, 4.02f, 2.368f)
                curveTo(11.888f, 14.751f, 14.642f, 18.156f, 11.644f, 21.157f)
                close()
                moveTo(20.32f, 12.99f)
                arcToRelative(4.258f, 4.258f, 0.0f, false, true, -2.155f, -0.6f)
                arcToRelative(15.633f, 15.633f, 0.0f, false, false, -2.309f, -0.889f)
                arcToRelative(49.717f, 49.717f, 0.0f, false, false, 4.471f, -2.176f)
                arcToRelative(1.839f, 1.839f, 0.0f, false, true, -0.007f, 3.663f)
                close()
            }
        }
        .build()
        return _radish!!
    }

private var _radish: ImageVector? = null
