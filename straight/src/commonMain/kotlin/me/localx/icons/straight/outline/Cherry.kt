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

public val Icons.Outline.Cherry: ImageVector
    get() {
        if (_cherry != null) {
            return _cherry!!
        }
        _cherry = Builder(name = "Cherry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4f, 13.0f)
                arcToRelative(5.742f, 5.742f, 0.0f, false, false, -2.315f, 0.487f)
                curveToRelative(-0.617f, -2.516f, -2.282f, -8.349f, -5.278f, -12.454f)
                lineTo(12.037f, -0.025f)
                lineTo(11.219f, 1.0f)
                curveTo(8.052f, 4.946f, 6.418f, 10.8f, 5.805f, 13.446f)
                arcTo(5.825f, 5.825f, 0.0f, false, false, 3.568f, 13.0f)
                curveTo(1.814f, 13.0f, 0.0f, 14.678f, 0.0f, 17.489f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 12.0f, 3.452f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 12.0f, -3.452f)
                curveTo(24.0f, 14.678f, 22.171f, 13.0f, 20.4f, 13.0f)
                close()
                moveTo(11.966f, 3.36f)
                arcToRelative(38.606f, 38.606f, 0.0f, false, true, 3.969f, 9.8f)
                arcTo(5.748f, 5.748f, 0.0f, false, false, 14.568f, 13.0f)
                arcTo(3.325f, 3.325f, 0.0f, false, false, 12.0f, 14.347f)
                arcTo(3.363f, 3.363f, 0.0f, false, false, 9.4f, 13.0f)
                arcToRelative(5.738f, 5.738f, 0.0f, false, false, -1.472f, 0.192f)
                arcTo(33.634f, 33.634f, 0.0f, false, true, 11.966f, 3.36f)
                close()
                moveTo(6.5f, 21.979f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 2.0f, 17.489f)
                curveToRelative(0.0f, -1.867f, 1.077f, -2.5f, 1.568f, -2.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 2.27f, 0.747f)
                lineToRelative(0.665f, 0.573f)
                lineToRelative(0.661f, -0.575f)
                arcTo(3.6f, 3.6f, 0.0f, false, true, 9.4f, 14.994f)
                curveToRelative(0.5f, 0.0f, 1.6f, 0.628f, 1.6f, 2.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 6.5f, 21.979f)
                close()
                moveTo(17.5f, 21.979f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, -4.49f)
                curveToRelative(0.0f, -1.867f, 1.077f, -2.5f, 1.568f, -2.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 2.27f, 0.747f)
                lineToRelative(0.665f, 0.573f)
                lineToRelative(0.661f, -0.575f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 2.238f, -0.745f)
                curveToRelative(0.5f, 0.0f, 1.6f, 0.628f, 1.6f, 2.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 17.5f, 21.979f)
                close()
            }
        }
        .build()
        return _cherry!!
    }

private var _cherry: ImageVector? = null
