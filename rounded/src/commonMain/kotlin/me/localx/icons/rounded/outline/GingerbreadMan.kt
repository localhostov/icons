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

public val Icons.Outline.GingerbreadMan: ImageVector
    get() {
        if (_gingerbreadMan != null) {
            return _gingerbreadMan!!
        }
        _gingerbreadMan = Builder(name = "GingerbreadMan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.634f, 7.564f)
                arcTo(3.084f, 3.084f, 0.0f, false, false, 17.919f, 6.2f)
                lineToRelative(-1.211f, 0.419f)
                arcToRelative(4.984f, 4.984f, 0.0f, true, false, -9.415f, 0.0f)
                lineTo(6.078f, 6.2f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -2.061f, 5.635f)
                lineToRelative(1.636f, 0.566f)
                curveToRelative(1.7f, 0.57f, 1.581f, 2.752f, 0.728f, 4.0f)
                lineTo(4.532f, 19.292f)
                arcTo(3.025f, 3.025f, 0.0f, false, false, 7.4f, 23.973f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, false, 2.115f, -1.341f)
                lineTo(11.9f, 19.056f)
                arcToRelative(0.165f, 0.165f, 0.0f, false, true, 0.147f, -0.079f)
                curveToRelative(0.057f, -0.02f, 0.115f, 0.027f, 0.15f, 0.082f)
                lineToRelative(2.219f, 3.463f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 5.113f, -3.141f)
                lineToRelative(-1.906f, -2.976f)
                curveToRelative(-0.852f, -1.25f, -0.976f, -3.435f, 0.728f, -4.005f)
                lineToRelative(1.632f, -0.564f)
                arcTo(3.019f, 3.019f, 0.0f, false, false, 21.634f, 7.564f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, true, 0.314f, 5.968f)
                arcToRelative(4.311f, 4.311f, 0.0f, false, true, -0.612f, 0.0f)
                arcTo(2.994f, 2.994f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(19.932f, 9.363f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.607f, 0.582f)
                lineToRelative(-1.633f, 0.565f)
                curveToRelative(-2.923f, 0.946f, -3.355f, 4.678f, -1.756f, 6.974f)
                lineToRelative(1.906f, 2.976f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.746f, 0.983f)
                lineToRelative(-2.219f, -3.464f)
                arcToRelative(2.171f, 2.171f, 0.0f, false, false, -1.815f, -1.0f)
                arcToRelative(2.107f, 2.107f, 0.0f, false, false, -1.833f, 0.972f)
                lineToRelative(-2.386f, 3.59f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, -1.522f, 0.2f)
                arcToRelative(1.085f, 1.085f, 0.0f, false, true, -0.1f, -1.365f)
                lineToRelative(1.848f, -2.885f)
                curveToRelative(1.6f, -2.3f, 1.167f, -6.029f, -1.757f, -6.974f)
                lineTo(4.669f, 9.945f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.756f, -1.854f)
                curveTo(6.816f, 8.529f, 10.582f, 10.077f, 12.0f, 10.0f)
                curveToRelative(1.418f, 0.079f, 5.189f, -1.483f, 6.572f, -1.91f)
                arcTo(1.015f, 1.015f, 0.0f, false, true, 19.932f, 9.363f)
                close()
                moveTo(13.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 12.0f)
                close()
                moveTo(13.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 15.0f)
                close()
            }
        }
        .build()
        return _gingerbreadMan!!
    }

private var _gingerbreadMan: ImageVector? = null
