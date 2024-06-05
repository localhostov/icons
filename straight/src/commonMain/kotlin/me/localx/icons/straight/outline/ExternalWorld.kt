package me.localx.icons.straight.outline

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

public val Icons.Outline.ExternalWorld: ImageVector
    get() {
        if (_externalWorld != null) {
            return _externalWorld!!
        }
        _externalWorld = Builder(name = "ExternalWorld", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 3.732f)
                curveToRelative(-0.598f, -0.346f, -1.0f, -0.992f, -1.0f, -1.732f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.74f, -0.402f, 1.386f, -1.0f, 1.732f)
                verticalLineToRelative(5.208f)
                lineToRelative(1.748f, -1.749f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.851f, 2.852f)
                curveToRelative(-0.362f, 0.361f, -0.837f, 0.541f, -1.312f, 0.541f)
                reflectiveCurveToRelative(-0.949f, -0.18f, -1.311f, -0.54f)
                lineToRelative(-2.852f, -2.853f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.748f, 1.749f)
                lineTo(10.998f, 3.732f)
                close()
                moveTo(23.0f, 13.0f)
                curveToRelative(0.0f, 6.065f, -4.935f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 19.065f, 1.0f, 13.0f)
                curveToRelative(0.0f, -4.68f, 2.938f, -8.686f, 7.066f, -10.272f)
                curveToRelative(0.125f, 0.682f, 0.424f, 1.304f, 0.848f, 1.817f)
                curveToRelative(-3.447f, 1.262f, -5.914f, 4.576f, -5.914f, 8.455f)
                curveToRelative(0.0f, 0.687f, 0.078f, 1.357f, 0.224f, 2.0f)
                horizontalLineToRelative(3.932f)
                curveToRelative(-0.099f, -0.647f, -0.156f, -1.315f, -0.156f, -2.0f)
                curveToRelative(0.0f, -0.76f, 0.07f, -1.5f, 0.191f, -2.212f)
                lineToRelative(1.817f, 1.818f)
                curveToRelative(-0.005f, 0.131f, -0.008f, 0.262f, -0.008f, 0.394f)
                curveToRelative(0.0f, 0.685f, 0.068f, 1.354f, 0.185f, 2.0f)
                horizontalLineToRelative(5.629f)
                curveToRelative(0.118f, -0.646f, 0.185f, -1.315f, 0.185f, -2.0f)
                curveToRelative(0.0f, -0.132f, -0.003f, -0.263f, -0.008f, -0.394f)
                lineToRelative(1.817f, -1.818f)
                curveToRelative(0.121f, 0.712f, 0.191f, 1.452f, 0.191f, 2.212f)
                curveToRelative(0.0f, 0.685f, -0.057f, 1.353f, -0.156f, 2.0f)
                horizontalLineToRelative(3.932f)
                curveToRelative(0.147f, -0.643f, 0.224f, -1.313f, 0.224f, -2.0f)
                curveToRelative(0.0f, -3.879f, -2.467f, -7.193f, -5.914f, -8.455f)
                curveToRelative(0.424f, -0.514f, 0.722f, -1.135f, 0.848f, -1.817f)
                curveToRelative(4.128f, 1.586f, 7.066f, 5.592f, 7.066f, 10.272f)
                close()
                moveTo(9.717f, 17.0f)
                curveToRelative(0.655f, 1.885f, 1.619f, 3.434f, 2.283f, 4.368f)
                curveToRelative(0.664f, -0.934f, 1.629f, -2.483f, 2.283f, -4.368f)
                horizontalLineToRelative(-4.567f)
                close()
                moveTo(9.825f, 21.734f)
                curveToRelative(-0.754f, -1.171f, -1.639f, -2.808f, -2.214f, -4.734f)
                horizontalLineToRelative(-3.671f)
                curveToRelative(1.161f, 2.331f, 3.305f, 4.091f, 5.885f, 4.734f)
                close()
                moveTo(20.061f, 17.0f)
                horizontalLineToRelative(-3.671f)
                curveToRelative(-0.576f, 1.925f, -1.46f, 3.563f, -2.214f, 4.734f)
                curveToRelative(2.58f, -0.643f, 4.724f, -2.402f, 5.885f, -4.734f)
                close()
            }
        }
        .build()
        return _externalWorld!!
    }

private var _externalWorld: ImageVector? = null
