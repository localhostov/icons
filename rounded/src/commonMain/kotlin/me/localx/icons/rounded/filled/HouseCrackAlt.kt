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

public val Icons.Filled.HouseCrackAlt: ImageVector
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
                horizontalLineToRelative(8.663f)
                lineToRelative(-4.985f, -4.985f)
                curveToRelative(-0.835f, -0.835f, -0.835f, -2.194f, 0.0f, -3.029f)
                lineToRelative(3.33f, -3.606f)
                curveToRelative(0.062f, -0.063f, 0.069f, -0.102f, 0.069f, -0.129f)
                reflectiveCurveToRelative(-0.007f, -0.066f, -0.041f, -0.1f)
                lineToRelative(-2.634f, -2.413f)
                curveToRelative(-0.407f, -0.373f, -0.435f, -1.006f, -0.062f, -1.413f)
                curveToRelative(0.373f, -0.406f, 1.006f, -0.435f, 1.413f, -0.062f)
                lineToRelative(2.665f, 2.442f)
                curveToRelative(0.436f, 0.435f, 0.659f, 0.972f, 0.659f, 1.545f)
                reflectiveCurveToRelative(-0.224f, 1.11f, -0.628f, 1.515f)
                lineToRelative(-3.33f, 3.606f)
                curveToRelative(-0.083f, 0.084f, -0.083f, 0.174f, -0.027f, 0.229f)
                lineToRelative(6.399f, 6.399f)
                horizontalLineToRelative(2.509f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-9.276f)
                curveToRelative(0.0f, -1.579f, -0.748f, -3.047f, -2.0f, -3.989f)
                close()
            }
        }
        .build()
        return _houseCrackAlt!!
    }

private var _houseCrackAlt: ImageVector? = null
