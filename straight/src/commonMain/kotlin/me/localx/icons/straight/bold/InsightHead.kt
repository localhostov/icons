package me.localx.icons.straight.bold

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

public val Icons.Bold.InsightHead: ImageVector
    get() {
        if (_insightHead != null) {
            return _insightHead!!
        }
        _insightHead = Builder(name = "InsightHead", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.806f, 15.857f)
                lineToRelative(-2.278f, -2.278f)
                curveToRelative(0.539f, -1.503f, 0.616f, -3.124f, 0.192f, -4.7f)
                curveToRelative(-0.794f, -2.949f, -3.36f, -5.266f, -6.387f, -5.764f)
                curveToRelative(-3.009f, -0.497f, -5.998f, 0.701f, -7.811f, 3.121f)
                curveToRelative(-0.954f, 1.182f, -1.979f, 3.541f, -2.969f, 5.823f)
                curveToRelative(-0.064f, 0.147f, -0.128f, 0.295f, -0.192f, 0.441f)
                horizontalLineToRelative(1.557f)
                lineToRelative(0.698f, 5.067f)
                curveToRelative(0.033f, 0.247f, 0.247f, 0.433f, 0.495f, 0.433f)
                horizontalLineToRelative(3.894f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.046f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(0.046f)
                lineTo(7.005f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-0.894f)
                curveToRelative(-1.739f, 0.0f, -3.229f, -1.3f, -3.468f, -3.022f)
                lineToRelative(-0.341f, -2.478f)
                lineTo(0.005f, 15.5f)
                verticalLineToRelative(-2.817f)
                reflectiveCurveToRelative(0.574f, -1.306f, 0.797f, -1.818f)
                curveToRelative(1.12f, -2.58f, 2.178f, -5.017f, 3.354f, -6.472f)
                curveTo(6.608f, 1.116f, 10.709f, -0.518f, 14.821f, 0.153f)
                curveToRelative(4.231f, 0.698f, 7.684f, 3.816f, 8.795f, 7.945f)
                curveToRelative(0.709f, 2.638f, 0.406f, 5.358f, -0.81f, 7.758f)
                close()
                moveTo(19.0f, 11.0f)
                curveToRelative(0.0f, 1.111f, -0.309f, 2.148f, -0.837f, 3.042f)
                lineToRelative(3.898f, 3.898f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-3.898f, -3.898f)
                curveToRelative(-0.893f, 0.528f, -1.931f, 0.837f, -3.042f, 0.837f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(13.0f, 14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _insightHead!!
    }

private var _insightHead: ImageVector? = null
