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

public val Icons.Outline.SkiingNordic: ImageVector
    get() {
        if (_skiingNordic != null) {
            return _skiingNordic!!
        }
        _skiingNordic = Builder(name = "SkiingNordic", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.758f, 1.975f)
                lineTo(22.978f, 9.209f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.956f, -0.418f)
                lineTo(20.549f, 11.0f)
                lineTo(19.13f, 11.0f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, -0.856f, -0.484f)
                lineTo(17.013f, 8.422f)
                arcTo(5.026f, 5.026f, 0.0f, false, false, 12.729f, 6.0f)
                lineTo(6.5f, 6.0f)
                arcTo(3.01f, 3.01f, 0.0f, false, false, 4.083f, 7.22f)
                lineTo(3.208f, 8.406f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 4.817f, 9.594f)
                lineToRelative(0.876f, -1.187f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.5f, 8.0f)
                lineTo(9.462f, 8.0f)
                lineTo(7.7f, 12.274f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.175f, 3.675f)
                lineToRelative(3.658f, 2.308f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 19.1f)
                lineTo(13.0f, 22.0f)
                lineTo(7.126f, 22.0f)
                lineToRelative(1.108f, -3.436f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.9f, -0.614f)
                lineTo(5.024f, 22.0f)
                horizontalLineToRelative(-2.8f)
                lineToRelative(1.817f, -8.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.959f, -0.4f)
                lineTo(0.021f, 22.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 19.0f)
                close()
                moveTo(13.6f, 16.566f)
                lineTo(9.943f, 14.258f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.392f, -1.224f)
                lineTo(11.625f, 8.0f)
                horizontalLineToRelative(1.1f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, true, 0.718f, 0.094f)
                lineToRelative(-1.864f, 4.525f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.849f, 0.762f)
                lineToRelative(1.7f, -4.134f)
                curveToRelative(0.052f, 0.071f, 0.118f, 0.13f, 0.164f, 0.206f)
                lineToRelative(1.261f, 2.094f)
                arcTo(3.018f, 3.018f, 0.0f, false, false, 19.13f, 13.0f)
                horizontalLineToRelative(0.99f)
                lineToRelative(-1.929f, 9.0f)
                lineTo(15.0f, 22.0f)
                lineTo(15.0f, 19.1f)
                arcTo(2.984f, 2.984f, 0.0f, false, false, 13.6f, 16.566f)
                close()
                moveTo(12.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 14.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 2.5f)
                close()
            }
        }
        .build()
        return _skiingNordic!!
    }

private var _skiingNordic: ImageVector? = null
