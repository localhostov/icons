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

public val Icons.Outline.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.606f, -5.98f)
                arcTo(5.456f, 5.456f, 0.0f, false, false, 18.0f, 5.546f)
                arcTo(5.793f, 5.793f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(5.793f, 5.793f, 0.0f, false, false, 6.0f, 5.546f)
                arcTo(5.45f, 5.45f, 0.0f, false, false, 6.607f, 8.02f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 7.0f, 20.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, 3.938f, -1.807f)
                curveTo(10.773f, 20.755f, 10.156f, 22.0f, 8.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(18.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(16.0f, 22.0f)
                curveToRelative(-2.156f, 0.0f, -2.773f, -1.245f, -2.938f, -3.807f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 17.0f, 20.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, false, 23.0f, 14.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 4.0f, 3.546f)
                curveToRelative(0.0f, 2.133f, -2.1f, 3.534f, -2.189f, 3.593f)
                arcToRelative(0.843f, 0.843f, 0.0f, false, false, -0.08f, 0.078f)
                arcTo(8.972f, 8.972f, 0.0f, false, false, 12.0f, 11.053f)
                arcToRelative(8.955f, 8.955f, 0.0f, false, false, -1.732f, -1.837f)
                curveToRelative(-0.025f, -0.019f, -0.039f, -0.047f, -0.066f, -0.065f)
                reflectiveCurveToRelative(-0.068f, -0.046f, -0.145f, -0.1f)
                lineToRelative(-0.031f, -0.025f)
                arcTo(4.716f, 4.716f, 0.0f, false, true, 8.0f, 5.546f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(11.971f, 22.0f)
                curveToRelative(0.009f, -0.016f, 0.02f, -0.031f, 0.029f, -0.047f)
                curveToRelative(0.009f, 0.016f, 0.02f, 0.031f, 0.029f, 0.047f)
                close()
                moveTo(12.91f, 14.586f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 14.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.91f, 0.583f)
                curveTo(11.075f, 14.618f, 9.491f, 18.0f, 7.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(3.226f, 3.226f, 0.0f, false, true, 1.876f, 0.662f)
                curveToRelative(0.075f, 0.055f, 0.13f, 0.094f, 0.174f, 0.124f)
                arcToRelative(8.182f, 8.182f, 0.0f, false, true, 2.04f, 2.628f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 14.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.91f, -0.583f)
                curveTo(12.925f, 13.382f, 14.509f, 10.0f, 17.0f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                curveTo(14.509f, 18.0f, 12.925f, 14.618f, 12.91f, 14.586f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null
