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

public val Icons.Bold.Shirt: ImageVector
    get() {
        if (_shirt != null) {
            return _shirt!!
        }
        _shirt = Builder(name = "Shirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.454f)
                verticalLineToRelative(10.046f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-10.046f)
                curveToRelative(0.0f, -1.104f, -0.709f, -2.064f, -1.765f, -2.389f)
                lineToRelative(-0.604f, -0.186f)
                lineToRelative(-1.876f, 2.388f)
                curveToRelative(-0.865f, 1.101f, -2.553f, 1.035f, -3.33f, -0.13f)
                lineToRelative(-1.425f, -2.137f)
                lineToRelative(2.493f, -3.0f)
                horizontalLineToRelative(-4.999f)
                lineToRelative(2.506f, 3.0f)
                lineToRelative(-1.425f, 2.137f)
                curveToRelative(-0.777f, 1.165f, -2.465f, 1.231f, -3.33f, 0.13f)
                lineToRelative(-1.876f, -2.388f)
                lineToRelative(-0.604f, 0.186f)
                curveToRelative(-1.056f, 0.325f, -1.765f, 1.285f, -1.765f, 2.389f)
                verticalLineToRelative(10.046f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-10.046f)
                curveToRelative(0.0f, -2.38f, 1.503f, -4.448f, 3.748f, -5.203f)
                lineToRelative(2.069f, -2.076f)
                curveTo(6.566f, 0.423f, 7.585f, 0.0f, 8.647f, -0.001f)
                lineToRelative(6.687f, -0.005f)
                curveToRelative(1.062f, 0.0f, 2.081f, 0.421f, 2.831f, 1.172f)
                lineToRelative(2.085f, 2.085f)
                curveToRelative(2.245f, 0.754f, 3.749f, 2.822f, 3.749f, 5.204f)
                close()
                moveTo(13.781f, 10.973f)
                curveToRelative(-0.163f, -0.855f, -0.781f, -1.974f, -1.781f, -1.974f)
                reflectiveCurveToRelative(-1.618f, 1.119f, -1.781f, 1.974f)
                lineToRelative(-1.422f, 8.381f)
                curveToRelative(-0.186f, 0.976f, 0.123f, 1.98f, 0.826f, 2.683f)
                lineToRelative(1.67f, 1.67f)
                curveToRelative(0.391f, 0.391f, 1.024f, 0.391f, 1.414f, 0.0f)
                lineToRelative(1.67f, -1.67f)
                curveToRelative(0.702f, -0.702f, 1.012f, -1.707f, 0.826f, -2.683f)
                lineToRelative(-1.422f, -8.381f)
                close()
            }
        }
        .build()
        return _shirt!!
    }

private var _shirt: ImageVector? = null
