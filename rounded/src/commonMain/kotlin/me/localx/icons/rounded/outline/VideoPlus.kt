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

public val Icons.Outline.VideoPlus: ImageVector
    get() {
        if (_videoPlus != null) {
            return _videoPlus!!
        }
        _videoPlus = Builder(name = "VideoPlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.903f, 6.538f)
                curveToRelative(-0.677f, -0.337f, -1.473f, -0.266f, -2.078f, 0.188f)
                curveToRelative(-0.039f, 0.029f, -1.844f, 1.845f, -1.844f, 1.845f)
                curveToRelative(-0.219f, -2.557f, -2.369f, -4.571f, -4.981f, -4.571f)
                lineTo(5.0f, 4.0f)
                curveTo(2.243f, 4.0f, 0.0f, 6.243f, 0.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                lineTo(14.0f, 20.0f)
                curveToRelative(2.624f, 0.0f, 4.783f, -2.032f, 4.984f, -4.606f)
                curveToRelative(0.0f, 0.0f, 1.803f, 1.796f, 1.841f, 1.825f)
                curveToRelative(0.352f, 0.264f, 0.769f, 0.399f, 1.189f, 0.399f)
                curveToRelative(0.302f, 0.0f, 0.606f, -0.07f, 0.889f, -0.211f)
                curveToRelative(0.676f, -0.338f, 1.097f, -1.019f, 1.097f, -1.775f)
                verticalLineToRelative(-7.319f)
                curveToRelative(0.0f, -0.756f, -0.42f, -1.437f, -1.097f, -1.775f)
                close()
                moveTo(17.0f, 15.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 18.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(14.0f, 6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(19.0f, 12.583f)
                verticalLineToRelative(-1.189f)
                lineToRelative(3.0f, -3.028f)
                lineToRelative(0.025f, 7.239f)
                lineToRelative(-3.025f, -3.022f)
                close()
                moveTo(13.5f, 12.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
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
                close()
            }
        }
        .build()
        return _videoPlus!!
    }

private var _videoPlus: ImageVector? = null
