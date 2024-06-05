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

public val Icons.Filled.VideoPlus: ImageVector
    get() {
        if (_videoPlus != null) {
            return _videoPlus!!
        }
        _videoPlus = Builder(name = "VideoPlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                curveTo(2.243f, 4.0f, 0.0f, 6.243f, 0.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveTo(0.0f, 17.757f, 2.243f, 20.0f, 5.0f, 20.0f)
                lineTo(13.0f, 20.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(24.0f, 8.303f)
                verticalLineToRelative(7.319f)
                curveToRelative(0.0f, 0.757f, -0.42f, 1.437f, -1.097f, 1.775f)
                curveToRelative(-0.283f, 0.141f, -0.587f, 0.211f, -0.889f, 0.211f)
                curveToRelative(-0.421f, 0.0f, -0.837f, -0.135f, -1.189f, -0.399f)
                curveToRelative(-0.037f, -0.028f, -0.825f, -0.81f, -0.825f, -0.81f)
                lineTo(20.0f, 7.534f)
                reflectiveCurveToRelative(0.786f, -0.789f, 0.825f, -0.818f)
                curveToRelative(0.604f, -0.454f, 1.399f, -0.527f, 2.078f, -0.188f)
                reflectiveCurveToRelative(1.097f, 1.018f, 1.097f, 1.775f)
                close()
            }
        }
        .build()
        return _videoPlus!!
    }

private var _videoPlus: ImageVector? = null
