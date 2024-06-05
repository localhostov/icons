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

public val Icons.Outline.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.533f, 191.04f)
                curveToRelative(-14.409f, -7.302f, -31.716f, -5.78f, -44.629f, 3.925f)
                lineTo(404.8f, 224.0f)
                curveToRelative(-5.544f, -54.472f, -51.38f, -95.931f, -106.133f, -96.0f)
                horizontalLineToRelative(-1.813f)
                lineToRelative(-87.936f, -87.915f)
                curveToRelative(-11.967f, -12.051f, -28.264f, -18.805f, -45.248f, -18.752f)
                horizontalLineTo(21.333f)
                curveTo(9.551f, 21.333f, 0.0f, 30.885f, 0.0f, 42.667f)
                reflectiveCurveTo(9.551f, 64.0f, 21.333f, 64.0f)
                horizontalLineToRelative(142.336f)
                curveToRelative(5.655f, 0.015f, 11.075f, 2.261f, 15.083f, 6.251f)
                lineTo(236.501f, 128.0f)
                horizontalLineTo(106.667f)
                curveTo(47.786f, 128.071f, 0.071f, 175.786f, 0.0f, 234.667f)
                verticalLineToRelative(170.667f)
                curveTo(0.071f, 464.214f, 47.786f, 511.93f, 106.667f, 512.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(54.754f, -0.069f, 100.589f, -41.528f, 106.133f, -96.0f)
                lineToRelative(39.04f, 29.099f)
                curveToRelative(18.851f, 14.138f, 45.595f, 10.318f, 59.733f, -8.533f)
                curveToRelative(5.539f, -7.385f, 8.533f, -16.368f, 8.533f, -25.6f)
                verticalLineTo(229.184f)
                curveTo(512.162f, 213.015f, 503.02f, 198.222f, 488.533f, 191.04f)
                close()
                moveTo(362.667f, 405.333f)
                curveToRelative(0.0f, 35.346f, -28.654f, 64.0f, -64.0f, 64.0f)
                horizontalLineToRelative(-192.0f)
                curveToRelative(-35.346f, 0.0f, -64.0f, -28.654f, -64.0f, -64.0f)
                verticalLineTo(234.667f)
                curveToRelative(0.0f, -35.346f, 28.654f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(35.346f, 0.0f, 64.0f, 28.654f, 64.0f, 64.0f)
                verticalLineTo(405.333f)
                close()
                moveTo(469.333f, 410.816f)
                lineToRelative(-64.0f, -47.701f)
                verticalLineToRelative(-86.229f)
                lineToRelative(64.0f, -47.701f)
                verticalLineTo(410.816f)
                close()
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
