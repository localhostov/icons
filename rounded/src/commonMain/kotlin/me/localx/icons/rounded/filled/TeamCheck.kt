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

public val Icons.Filled.TeamCheck: ImageVector
    get() {
        if (_teamCheck != null) {
            return _teamCheck!!
        }
        _teamCheck = Builder(name = "TeamCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.5f, 11.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(15.5f, 7.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(21.683f, 17.712f)
                lineToRelative(-2.703f, 2.614f)
                curveToRelative(-0.452f, 0.446f, -1.052f, 0.671f, -1.653f, 0.671f)
                reflectiveCurveToRelative(-1.203f, -0.225f, -1.663f, -0.674f)
                lineToRelative(-1.354f, -1.332f)
                curveToRelative(-0.395f, -0.387f, -0.4f, -1.02f, -0.014f, -1.414f)
                curveToRelative(0.386f, -0.395f, 1.019f, -0.401f, 1.414f, -0.014f)
                lineToRelative(1.354f, 1.331f)
                curveToRelative(0.144f, 0.142f, 0.38f, 0.139f, 0.522f, -0.002f)
                lineToRelative(2.713f, -2.624f)
                curveToRelative(0.397f, -0.381f, 1.031f, -0.37f, 1.414f, 0.029f)
                curveToRelative(0.382f, 0.398f, 0.369f, 1.031f, -0.029f, 1.414f)
                close()
                moveTo(10.502f, 15.206f)
                curveToRelative(-0.324f, 0.87f, -0.502f, 1.811f, -0.502f, 2.794f)
                curveToRelative(-0.009f, 0.0f, -0.018f, 0.0f, -0.027f, 0.0f)
                lineTo(1.027f, 18.0f)
                curveToRelative(-0.284f, 0.0f, -0.556f, -0.121f, -0.745f, -0.333f)
                reflectiveCurveToRelative(-0.28f, -0.494f, -0.249f, -0.777f)
                curveToRelative(0.309f, -2.787f, 2.659f, -4.89f, 5.467f, -4.89f)
                curveToRelative(2.206f, 0.0f, 4.129f, 1.298f, 5.002f, 3.206f)
                close()
                moveTo(11.626f, 13.166f)
                curveToRelative(-0.386f, -0.545f, -0.842f, -1.036f, -1.355f, -1.458f)
                curveToRelative(0.747f, -2.179f, 2.808f, -3.708f, 5.202f, -3.708f)
                curveToRelative(1.804f, 0.0f, 3.418f, 0.868f, 4.425f, 2.227f)
                curveToRelative(-0.608f, -0.148f, -1.244f, -0.227f, -1.897f, -0.227f)
                curveToRelative(-2.602f, 0.0f, -4.913f, 1.242f, -6.374f, 3.166f)
                close()
            }
        }
        .build()
        return _teamCheck!!
    }

private var _teamCheck: ImageVector? = null
