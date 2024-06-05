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

public val Icons.Filled.Deer: ImageVector
    get() {
        if (_deer != null) {
            return _deer!!
        }
        _deer = Builder(name = "Deer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.442f, 7.067f)
                curveToRelative(-0.318f, -0.323f, -1.483f, -1.454f, -2.909f, -2.248f)
                curveToRelative(0.827f, -0.742f, 1.431f, -1.61f, 1.431f, -2.995f)
                curveToRelative(-0.086f, -0.465f, -0.475f, -0.824f, -0.964f, -0.824f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(-0.212f, 1.596f, -1.171f, 1.878f, -2.238f, 1.987f)
                curveToRelative(-1.495f, 0.153f, -2.762f, -1.021f, -2.762f, -2.487f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.924f, 0.28f, 1.784f, 0.76f, 2.5f)
                horizontalLineToRelative(-1.26f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(2.074f)
                curveToRelative(-0.464f, 0.942f, -0.574f, 1.988f, -0.574f, 2.586f)
                verticalLineToRelative(0.414f)
                reflectiveCurveToRelative(0.023f, 1.0f, -0.998f, 1.0f)
                horizontalLineToRelative(-6.833f)
                curveToRelative(-1.099f, 0.0f, -2.181f, 0.452f, -2.968f, 1.24f)
                curveToRelative(-0.061f, 0.061f, -2.924f, 3.069f, -2.924f, 3.069f)
                curveToRelative(-0.381f, 0.399f, -0.367f, 1.032f, 0.033f, 1.414f)
                curveToRelative(0.193f, 0.185f, 0.442f, 0.276f, 0.69f, 0.276f)
                curveToRelative(0.264f, 0.0f, 0.527f, -0.104f, 0.723f, -0.31f)
                lineToRelative(0.312f, -0.326f)
                curveToRelative(0.105f, 0.823f, 0.311f, 1.63f, 0.624f, 2.399f)
                curveToRelative(0.152f, 0.373f, 0.288f, 0.715f, 0.341f, 0.885f)
                verticalLineToRelative(3.245f)
                curveToRelative(0.0f, 0.996f, 0.681f, 1.92f, 1.664f, 2.08f)
                curveToRelative(1.253f, 0.204f, 2.336f, -0.758f, 2.336f, -1.973f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.893f)
                curveToRelative(0.0f, 0.996f, 0.681f, 1.92f, 1.664f, 2.08f)
                curveToRelative(1.253f, 0.204f, 2.336f, -0.758f, 2.336f, -1.973f)
                verticalLineToRelative(-3.115f)
                curveToRelative(0.627f, -0.746f, 2.0f, -2.695f, 2.0f, -5.485f)
                verticalLineToRelative(-2.007f)
                horizontalLineToRelative(0.0f)
                lineToRelative(2.099f, -0.24f)
                curveToRelative(1.084f, -0.135f, 1.901f, -1.06f, 1.901f, -2.153f)
                curveToRelative(0.0f, -0.511f, -0.072f, -1.441f, -0.558f, -1.933f)
                close()
            }
        }
        .build()
        return _deer!!
    }

private var _deer: ImageVector? = null
