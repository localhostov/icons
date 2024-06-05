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

public val Icons.Filled.Ornament: ImageVector
    get() {
        if (_ornament != null) {
            return _ornament!!
        }
        _ornament = Builder(name = "Ornament", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.021f, 14.415f)
                curveToRelative(-0.006f, -0.139f, -0.021f, -0.275f, -0.021f, -0.415f)
                curveToRelative(0.0f, -4.092f, 2.473f, -7.613f, 6.0f, -9.159f)
                verticalLineToRelative(-0.341f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.775f)
                curveToRelative(-0.172f, -0.295f, -0.277f, -0.634f, -0.277f, -1.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.366f, -0.106f, 0.705f, -0.277f, 1.0f)
                horizontalLineToRelative(0.78f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(0.341f)
                curveToRelative(3.527f, 1.547f, 6.0f, 5.068f, 6.0f, 9.159f)
                curveToRelative(0.0f, 0.143f, -0.016f, 0.283f, -0.021f, 0.425f)
                lineToRelative(-2.571f, -2.571f)
                curveToRelative(-0.55f, -0.55f, -1.282f, -0.854f, -2.061f, -0.854f)
                reflectiveCurveToRelative(-1.51f, 0.303f, -2.019f, 0.814f)
                lineToRelative(-2.705f, 2.418f)
                curveToRelative(-0.17f, 0.169f, -0.395f, 0.265f, -0.634f, 0.268f)
                curveToRelative(-0.219f, 0.0f, -0.487f, -0.093f, -0.704f, -0.312f)
                lineToRelative(-2.559f, -2.314f)
                curveToRelative(-0.547f, -0.556f, -1.278f, -0.864f, -2.059f, -0.869f)
                horizontalLineToRelative(-0.017f)
                curveToRelative(-0.774f, 0.0f, -1.502f, 0.3f, -2.053f, 0.846f)
                lineToRelative(-2.577f, 2.563f)
                close()
                moveTo(17.993f, 13.268f)
                curveToRelative(-0.346f, -0.345f, -0.946f, -0.346f, -1.291f, 0.0f)
                lineToRelative(-2.706f, 2.418f)
                curveToRelative(-0.5f, 0.502f, -1.219f, 0.805f, -1.983f, 0.814f)
                curveToRelative(-0.803f, 0.006f, -1.551f, -0.299f, -2.111f, -0.869f)
                lineToRelative(-2.559f, -2.314f)
                curveToRelative(-0.213f, -0.213f, -0.442f, -0.31f, -0.687f, -0.312f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(-0.243f, 0.0f, -0.471f, 0.094f, -0.644f, 0.265f)
                lineToRelative(-3.59f, 3.571f)
                curveToRelative(1.228f, 4.133f, 5.056f, 7.159f, 9.583f, 7.159f)
                reflectiveCurveToRelative(8.348f, -3.019f, 9.58f, -7.146f)
                lineToRelative(-3.587f, -3.587f)
                close()
            }
        }
        .build()
        return _ornament!!
    }

private var _ornament: ImageVector? = null
