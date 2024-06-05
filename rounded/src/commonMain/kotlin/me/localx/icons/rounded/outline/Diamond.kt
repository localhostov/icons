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

public val Icons.Outline.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.22f, 5.743f)
                lineToRelative(-3.011f, -4.068f)
                arcToRelative(4.005f, 4.005f, 0.0f, false, false, -3.254f, -1.675f)
                horizontalLineToRelative(-9.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.245f, 1.656f)
                lineToRelative(-3.065f, 4.097f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 0.123f, 4.784f)
                lineToRelative(8.792f, 12.328f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, false, 2.35f, 1.135f)
                arcToRelative(3.006f, 3.006f, 0.0f, false, false, 2.378f, -1.175f)
                lineToRelative(8.722f, -12.191f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.12f, -4.891f)
                close()
                moveTo(18.592f, 2.851f)
                lineTo(21.61f, 6.929f)
                curveToRelative(0.016f, 0.022f, 0.02f, 0.048f, 0.036f, 0.071f)
                horizontalLineToRelative(-4.892f)
                lineToRelative(-1.428f, -5.0f)
                horizontalLineToRelative(1.629f)
                arcToRelative(2.012f, 2.012f, 0.0f, false, true, 1.637f, 0.851f)
                close()
                moveTo(12.0f, 19.118f)
                lineTo(9.3f, 9.0f)
                horizontalLineToRelative(5.4f)
                close()
                moveTo(9.326f, 7.0f)
                lineTo(10.754f, 2.0f)
                horizontalLineToRelative(2.492f)
                lineToRelative(1.428f, 5.0f)
                close()
                moveTo(5.417f, 2.837f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, true, 1.628f, -0.837f)
                horizontalLineToRelative(1.629f)
                lineToRelative(-1.428f, 5.0f)
                horizontalLineToRelative(-4.928f)
                curveToRelative(0.014f, -0.022f, 0.018f, -0.049f, 0.034f, -0.07f)
                close()
                moveTo(2.448f, 9.325f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -0.185f, -0.325f)
                horizontalLineToRelative(4.969f)
                lineToRelative(2.994f, 11.23f)
                close()
                moveTo(13.771f, 20.24f)
                lineTo(16.771f, 9.0f)
                horizontalLineToRelative(4.986f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -0.243f, 0.421f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
