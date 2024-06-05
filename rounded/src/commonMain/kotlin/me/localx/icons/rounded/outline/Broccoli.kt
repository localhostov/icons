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

public val Icons.Outline.Broccoli: ImageVector
    get() {
        if (_broccoli != null) {
            return _broccoli!!
        }
        _broccoli = Builder(name = "Broccoli", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.794f, 6.206f)
                arcToRelative(4.431f, 4.431f, 0.0f, false, false, -4.6f, -3.194f)
                curveTo(13.509f, -1.852f, 5.916f, -0.445f, 5.083f, 5.0f)
                curveToRelative(-7.24f, 0.463f, -6.488f, 10.65f, 0.74f, 10.934f)
                arcToRelative(17.52f, 17.52f, 0.0f, false, true, 1.037f, 4.45f)
                arcTo(4.027f, 4.027f, 0.0f, false, false, 10.842f, 24.0f)
                horizontalLineToRelative(2.316f)
                arcToRelative(4.027f, 4.027f, 0.0f, false, false, 3.982f, -3.615f)
                arcToRelative(15.894f, 15.894f, 0.0f, false, true, 1.493f, -5.473f)
                curveTo(24.2f, 15.9f, 26.181f, 7.938f, 20.794f, 6.206f)
                close()
                moveTo(15.151f, 20.166f)
                arcTo(2.027f, 2.027f, 0.0f, false, true, 13.158f, 22.0f)
                lineTo(10.842f, 22.0f)
                arcToRelative(2.027f, 2.027f, 0.0f, false, true, -1.993f, -1.834f)
                arcTo(20.312f, 20.312f, 0.0f, false, false, 7.936f, 15.9f)
                arcToRelative(8.082f, 8.082f, 0.0f, false, false, 2.573f, -0.989f)
                arcToRelative(4.835f, 4.835f, 0.0f, false, false, 0.491f, 0.309f)
                lineTo(11.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(13.0f, 15.927f)
                arcToRelative(5.219f, 5.219f, 0.0f, false, false, 3.228f, -0.475f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 15.151f, 20.166f)
                close()
                moveTo(19.5f, 13.0f)
                arcToRelative(2.519f, 2.519f, 0.0f, false, true, -1.564f, -0.565f)
                arcTo(2.72f, 2.72f, 0.0f, false, true, 17.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, 0.969f, 3.255f)
                arcToRelative(3.425f, 3.425f, 0.0f, false, true, -4.6f, -0.264f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.33f, -0.151f)
                arcTo(5.75f, 5.75f, 0.0f, false, true, 7.0f, 14.0f)
                curveToRelative(-2.281f, 0.0f, -5.0f, -0.694f, -5.0f, -4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 7.0f)
                arcToRelative(2.808f, 2.808f, 0.0f, false, true, 3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.055f, 5.454f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.7f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.178f, 0.592f)
                arcToRelative(2.477f, 2.477f, 0.0f, false, true, 3.083f, 2.085f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.861f, 0.862f)
                arcTo(2.493f, 2.493f, 0.0f, false, true, 19.5f, 13.0f)
                close()
            }
        }
        .build()
        return _broccoli!!
    }

private var _broccoli: ImageVector? = null
