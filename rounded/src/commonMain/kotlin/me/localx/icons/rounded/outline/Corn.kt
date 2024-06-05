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

public val Icons.Outline.Corn: ImageVector
    get() {
        if (_corn != null) {
            return _corn!!
        }
        _corn = Builder(name = "Corn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 10.0f)
                close()
                moveTo(22.994f, 12.2f)
                curveTo(22.377f, 20.307f, 16.862f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveTo(1.623f, 20.307f, 1.006f, 12.2f)
                arcTo(2.033f, 2.033f, 0.0f, false, true, 3.73f, 10.137f)
                arcToRelative(12.579f, 12.579f, 0.0f, false, true, 1.3f, 0.621f)
                curveToRelative(1.535f, -14.263f, 12.42f, -14.249f, 13.95f, 0.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, 1.3f, -0.622f)
                arcTo(2.033f, 2.033f, 0.0f, false, true, 22.994f, 12.2f)
                close()
                moveTo(10.959f, 21.925f)
                curveTo(10.6f, 20.582f, 8.634f, 14.225f, 2.994f, 12.0f)
                curveTo(3.534f, 19.066f, 7.861f, 21.491f, 10.959f, 21.925f)
                close()
                moveTo(12.0f, 18.861f)
                arcTo(19.625f, 19.625f, 0.0f, false, true, 14.186f, 15.0f)
                arcTo(1.007f, 1.007f, 0.0f, true, true, 14.0f, 13.0f)
                horizontalLineToRelative(1.9f)
                arcToRelative(14.241f, 14.241f, 0.0f, false, true, 1.126f, -0.977f)
                curveToRelative(-0.012f, -0.344f, -0.012f, -0.688f, -0.037f, -1.023f)
                lineTo(16.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(0.733f)
                arcTo(14.73f, 14.73f, 0.0f, false, false, 16.2f, 7.0f)
                lineTo(14.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.323f)
                curveToRelative(-2.21f, -3.944f, -4.436f, -3.944f, -6.646f, 0.0f)
                lineTo(10.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                reflectiveCurveToRelative(-2.123f, -0.025f, -2.185f, -0.037f)
                arcTo(14.865f, 14.865f, 0.0f, false, false, 7.267f, 9.0f)
                lineTo(8.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(7.012f, 11.0f)
                curveToRelative(-0.025f, 0.335f, -0.025f, 0.679f, -0.037f, 1.023f)
                arcTo(14.064f, 14.064f, 0.0f, false, true, 8.1f, 13.0f)
                lineTo(10.0f, 13.0f)
                arcToRelative(1.007f, 1.007f, 0.0f, true, true, -0.186f, 2.0f)
                arcTo(19.625f, 19.625f, 0.0f, false, true, 12.0f, 18.861f)
                close()
                moveTo(21.0f, 12.048f)
                curveToRelative(-5.635f, 2.182f, -7.6f, 8.535f, -7.959f, 9.877f)
                curveTo(16.139f, 21.492f, 20.465f, 19.072f, 21.0f, 12.048f)
                close()
            }
        }
        .build()
        return _corn!!
    }

private var _corn: ImageVector? = null
