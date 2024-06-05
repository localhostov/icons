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

public val Icons.Outline.Hiking: ImageVector
    get() {
        if (_hiking != null) {
            return _hiking!!
        }
        _hiking = Builder(name = "Hiking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.665f, 19.15f)
                lineToRelative(-0.6f, 3.975f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.988f, 0.85f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, true, -0.151f, -0.012f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.838f, -1.138f)
                lineToRelative(0.6f, -3.975f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.977f, 0.3f)
                close()
                moveTo(21.048f, 8.0f)
                verticalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.895f, -0.553f)
                lineToRelative(-0.637f, -1.275f)
                lineToRelative(-0.459f, 2.52f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.983f, 0.821f)
                arcToRelative(1.114f, 1.114f, 0.0f, false, true, -0.18f, -0.016f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.8f, -1.164f)
                lineToRelative(0.788f, -4.324f)
                curveToRelative(-0.023f, 0.0f, -0.044f, -0.009f, -0.066f, -0.009f)
                horizontalLineToRelative(-1.93f)
                lineTo(9.9f, 13.36f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.436f, 1.042f)
                lineToRelative(4.252f, 2.759f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.455f, 0.839f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(18.543f)
                lineToRelative(-3.8f, -2.463f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.743f, -0.694f)
                arcTo(3.3f, 3.3f, 0.0f, false, true, 6.537f, 16.0f)
                curveToRelative(-1.671f, 0.0f, -3.47f, -1.252f, -3.47f, -4.0f)
                curveToRelative(0.0f, -3.364f, 3.037f, -6.0f, 6.914f, -6.0f)
                horizontalLineToRelative(2.831f)
                arcTo(2.984f, 2.984f, 0.0f, false, true, 15.5f, 7.658f)
                lineTo(16.666f, 10.0f)
                horizontalLineToRelative(2.382f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(7.977f, 12.793f)
                lineToRelative(0.851f, -4.676f)
                curveTo(6.832f, 8.508f, 5.067f, 9.9f, 5.067f, 12.0f)
                curveToRelative(0.0f, 1.9f, 1.225f, 2.0f, 1.47f, 2.0f)
                arcTo(1.491f, 1.491f, 0.0f, false, false, 7.977f, 12.793f)
                close()
                moveTo(13.048f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.048f, 5.0f)
                close()
            }
        }
        .build()
        return _hiking!!
    }

private var _hiking: ImageVector? = null
