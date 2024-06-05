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

public val Icons.Outline.HouseCrackAlt: ImageVector
    get() {
        if (_houseCrackAlt != null) {
            return _houseCrackAlt!!
        }
        _houseCrackAlt = Builder(name = "HouseCrackAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 5.735f)
                lineTo(14.797f, 0.855f)
                curveToRelative(-1.699f, -1.146f, -3.895f, -1.146f, -5.594f, 0.0f)
                lineTo(2.203f, 5.579f)
                curveToRelative(-1.379f, 0.931f, -2.203f, 2.48f, -2.203f, 4.145f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-9.276f)
                curveToRelative(0.0f, -1.579f, -0.748f, -3.047f, -2.0f, -3.989f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.586f)
                lineToRelative(-4.399f, -4.399f)
                curveToRelative(-0.055f, -0.056f, -0.055f, -0.146f, 0.027f, -0.229f)
                lineToRelative(3.33f, -3.606f)
                curveToRelative(0.404f, -0.405f, 0.628f, -0.942f, 0.628f, -1.515f)
                reflectiveCurveToRelative(-0.224f, -1.11f, -0.659f, -1.545f)
                lineToRelative(-2.665f, -2.442f)
                curveToRelative(-0.407f, -0.374f, -1.04f, -0.345f, -1.413f, 0.062f)
                curveToRelative(-0.373f, 0.407f, -0.346f, 1.04f, 0.062f, 1.413f)
                lineToRelative(2.634f, 2.413f)
                curveToRelative(0.034f, 0.034f, 0.041f, 0.073f, 0.041f, 0.1f)
                reflectiveCurveToRelative(-0.007f, 0.066f, -0.069f, 0.129f)
                lineToRelative(-3.33f, 3.606f)
                curveToRelative(-0.835f, 0.835f, -0.835f, 2.194f, 0.0f, 3.029f)
                lineToRelative(2.985f, 2.985f)
                horizontalLineToRelative(-7.586f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-9.276f)
                curveToRelative(0.0f, -0.999f, 0.494f, -1.928f, 1.322f, -2.487f)
                lineToRelative(7.0f, -4.724f)
                curveToRelative(0.51f, -0.344f, 1.094f, -0.516f, 1.678f, -0.516f)
                reflectiveCurveToRelative(1.168f, 0.172f, 1.678f, 0.516f)
                lineToRelative(7.0f, 4.724f)
                curveToRelative(0.828f, 0.558f, 1.322f, 1.488f, 1.322f, 2.487f)
                verticalLineToRelative(9.276f)
                close()
            }
        }
        .build()
        return _houseCrackAlt!!
    }

private var _houseCrackAlt: ImageVector? = null
