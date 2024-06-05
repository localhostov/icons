package me.localx.icons.rounded.filled

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

public val Icons.Filled.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.496f, 8.57f)
                curveToRelative(0.324f, 1.087f, 0.504f, 2.237f, 0.504f, 3.43f)
                curveToRelative(0.0f, 3.153f, -1.226f, 6.014f, -3.215f, 8.155f)
                curveToRelative(0.136f, -0.507f, 0.215f, -1.032f, 0.215f, -1.571f)
                verticalLineToRelative(-6.584f)
                horizontalLineToRelative(-0.024f)
                lineToRelative(2.521f, -3.43f)
                close()
                moveTo(3.0f, 12.0f)
                horizontalLineToRelative(0.033f)
                lineTo(0.511f, 8.543f)
                curveToRelative(-0.329f, 1.095f, -0.511f, 2.255f, -0.511f, 3.457f)
                curveToRelative(0.0f, 3.229f, 1.282f, 6.153f, 3.356f, 8.31f)
                curveToRelative(-0.23f, -0.697f, -0.356f, -1.432f, -0.356f, -2.186f)
                verticalLineToRelative(-6.124f)
                close()
                moveTo(5.508f, 12.0f)
                lineTo(1.406f, 6.376f)
                curveTo(3.426f, 2.587f, 7.415f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(8.592f, 2.6f, 10.607f, 6.403f)
                lineToRelative(-4.113f, 5.597f)
                lineTo(5.508f, 12.0f)
                close()
                moveTo(13.019f, 6.804f)
                curveToRelative(-0.108f, 0.542f, 0.243f, 1.068f, 0.784f, 1.177f)
                curveToRelative(0.93f, 0.186f, 1.882f, 0.626f, 2.839f, 1.31f)
                curveToRelative(0.418f, 0.299f, 0.999f, 0.216f, 1.329f, -0.177f)
                curveToRelative(0.382f, -0.454f, 0.279f, -1.134f, -0.205f, -1.477f)
                curveToRelative(-1.178f, -0.835f, -2.375f, -1.377f, -3.571f, -1.616f)
                curveToRelative(-0.543f, -0.113f, -1.069f, 0.242f, -1.177f, 0.784f)
                close()
                moveTo(6.027f, 9.114f)
                curveToRelative(0.33f, 0.393f, 0.911f, 0.476f, 1.329f, 0.177f)
                curveToRelative(0.957f, -0.684f, 1.909f, -1.124f, 2.839f, -1.31f)
                curveToRelative(0.542f, -0.108f, 0.893f, -0.635f, 0.784f, -1.177f)
                reflectiveCurveToRelative(-0.635f, -0.898f, -1.177f, -0.784f)
                curveToRelative(-1.196f, 0.239f, -2.393f, 0.781f, -3.571f, 1.616f)
                curveToRelative(-0.484f, 0.343f, -0.587f, 1.023f, -0.205f, 1.477f)
                close()
                moveTo(4.999f, 18.124f)
                curveToRelative(0.0f, 1.522f, 0.698f, 2.954f, 1.882f, 3.91f)
                curveToRelative(1.125f, 0.907f, 2.601f, 1.967f, 5.118f, 1.967f)
                curveToRelative(2.824f, 0.0f, 4.338f, -1.333f, 5.514f, -2.289f)
                curveToRelative(0.941f, -0.765f, 1.486f, -1.914f, 1.486f, -3.127f)
                verticalLineToRelative(-4.584f)
                lineTo(5.0f, 14.001f)
                verticalLineToRelative(4.124f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
