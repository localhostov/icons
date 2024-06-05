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

public val Icons.Bold.Cherry: ImageVector
    get() {
        if (_cherry != null) {
            return _cherry!!
        }
        _cherry = Builder(name = "Cherry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.048f, 12.0f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, -1.483f, 0.221f)
                curveToRelative(-0.517f, -3.585f, -2.239f, -7.33f, -5.353f, -11.6f)
                arcToRelative(1.554f, 1.554f, 0.0f, false, false, -2.424f, 0.0f)
                curveToRelative(-3.114f, 4.274f, -4.836f, 8.019f, -5.353f, 11.6f)
                arcTo(4.8f, 4.8f, 0.0f, false, false, 3.952f, 12.0f)
                curveTo(2.052f, 12.0f, 0.0f, 13.912f, 0.0f, 17.0f)
                arcToRelative(6.971f, 6.971f, 0.0f, false, false, 6.75f, 7.0f)
                arcTo(6.692f, 6.692f, 0.0f, false, false, 12.0f, 21.335f)
                arcTo(6.692f, 6.692f, 0.0f, false, false, 17.25f, 24.0f)
                arcTo(6.971f, 6.971f, 0.0f, false, false, 24.0f, 17.0f)
                curveTo(24.0f, 13.912f, 21.948f, 12.0f, 20.048f, 12.0f)
                close()
                moveTo(12.0f, 4.135f)
                arcTo(22.552f, 22.552f, 0.0f, false, true, 15.517f, 12.1f)
                arcToRelative(5.087f, 5.087f, 0.0f, false, false, -1.038f, -0.1f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 12.0f, 13.126f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 9.521f, 12.0f)
                arcToRelative(5.087f, 5.087f, 0.0f, false, false, -1.038f, 0.1f)
                arcTo(22.552f, 22.552f, 0.0f, false, true, 12.0f, 4.135f)
                close()
                moveTo(6.75f, 21.0f)
                arcTo(3.982f, 3.982f, 0.0f, false, true, 3.0f, 17.0f)
                curveToRelative(0.0f, -1.439f, 0.749f, -1.977f, 0.952f, -2.0f)
                arcToRelative(1.688f, 1.688f, 0.0f, false, true, 1.143f, 0.39f)
                arcToRelative(3.134f, 3.134f, 0.0f, false, false, 1.33f, 0.573f)
                arcTo(1.513f, 1.513f, 0.0f, false, false, 6.75f, 16.0f)
                arcToRelative(1.461f, 1.461f, 0.0f, false, false, 0.326f, -0.038f)
                arcToRelative(3.075f, 3.075f, 0.0f, false, false, 1.33f, -0.579f)
                arcTo(1.594f, 1.594f, 0.0f, false, true, 9.513f, 15.0f)
                curveToRelative(0.217f, 0.022f, 0.987f, 0.558f, 0.987f, 2.0f)
                arcTo(3.982f, 3.982f, 0.0f, false, true, 6.75f, 21.0f)
                close()
                moveTo(17.25f, 21.0f)
                arcToRelative(3.982f, 3.982f, 0.0f, false, true, -3.75f, -4.0f)
                curveToRelative(0.0f, -1.442f, 0.77f, -1.978f, 0.979f, -2.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.115f, 0.383f)
                arcToRelative(3.075f, 3.075f, 0.0f, false, false, 1.33f, 0.579f)
                arcTo(1.461f, 1.461f, 0.0f, false, false, 17.25f, 16.0f)
                arcToRelative(1.513f, 1.513f, 0.0f, false, false, 0.325f, -0.037f)
                arcToRelative(3.128f, 3.128f, 0.0f, false, false, 1.33f, -0.573f)
                arcTo(1.68f, 1.68f, 0.0f, false, true, 20.039f, 15.0f)
                curveToRelative(0.212f, 0.023f, 0.961f, 0.561f, 0.961f, 2.0f)
                arcTo(3.982f, 3.982f, 0.0f, false, true, 17.25f, 21.0f)
                close()
            }
        }
        .build()
        return _cherry!!
    }

private var _cherry: ImageVector? = null
