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

public val Icons.Bold.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.82f, 17.201f)
                curveToRelative(0.165f, 0.812f, -0.36f, 1.604f, -1.172f, 1.769f)
                curveToRelative(-0.101f, 0.021f, -0.201f, 0.03f, -0.3f, 0.03f)
                curveToRelative(-0.699f, 0.0f, -1.324f, -0.49f, -1.469f, -1.201f)
                curveToRelative(-0.479f, -2.362f, -2.316f, -4.199f, -4.678f, -4.679f)
                curveToRelative(-0.812f, -0.165f, -1.336f, -0.956f, -1.172f, -1.769f)
                curveToRelative(0.165f, -0.812f, 0.955f, -1.339f, 1.769f, -1.171f)
                curveToRelative(3.545f, 0.72f, 6.301f, 3.476f, 7.021f, 7.021f)
                close()
                moveTo(6.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, -2.467f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(0.0f, 5.5f)
                curveTo(0.0f, 2.468f, 2.467f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                lineTo(21.0f, 5.5f)
                close()
                moveTo(6.678f, 5.1f)
                curveToRelative(-0.823f, -0.102f, -1.569f, 0.488f, -1.667f, 1.312f)
                curveToRelative(-0.099f, 0.822f, 0.489f, 1.568f, 1.311f, 1.667f)
                curveToRelative(5.053f, 0.604f, 9.001f, 4.556f, 9.601f, 9.609f)
                curveToRelative(0.091f, 0.763f, 0.828f, 1.312f, 1.578f, 1.312f)
                curveToRelative(1.0f, 0.0f, 1.5f, -0.844f, 1.402f, -1.666f)
                curveToRelative(-0.764f, -6.435f, -5.791f, -11.465f, -12.224f, -12.234f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
