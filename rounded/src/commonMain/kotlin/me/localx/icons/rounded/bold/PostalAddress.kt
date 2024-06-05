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

public val Icons.Bold.PostalAddress: ImageVector
    get() {
        if (_postalAddress != null) {
            return _postalAddress!!
        }
        _postalAddress = Builder(name = "PostalAddress", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.671f, 21.562f)
                curveToRelative(0.518f, 0.647f, 0.413f, 1.591f, -0.234f, 2.108f)
                curveToRelative(-0.276f, 0.222f, -0.607f, 0.329f, -0.936f, 0.329f)
                curveToRelative(-0.44f, 0.0f, -0.876f, -0.192f, -1.172f, -0.562f)
                lineToRelative(-4.0f, -5.0f)
                curveTo(1.63f, 16.17f, 0.0f, 13.729f, 0.0f, 10.567f)
                curveTo(0.0f, 7.737f, 1.091f, 5.082f, 3.072f, 3.091f)
                curveTo(5.056f, 1.098f, 7.694f, 0.0f, 10.5f, 0.0f)
                reflectiveCurveToRelative(5.443f, 1.098f, 7.427f, 3.09f)
                curveToRelative(2.085f, 2.097f, 3.201f, 4.995f, 3.062f, 7.954f)
                curveToRelative(-0.01f, 0.204f, -0.025f, 0.408f, -0.046f, 0.61f)
                curveToRelative(-0.085f, 0.824f, -0.818f, 1.417f, -1.646f, 1.338f)
                curveToRelative(-0.824f, -0.085f, -1.423f, -0.822f, -1.338f, -1.646f)
                curveToRelative(0.015f, -0.147f, 0.027f, -0.295f, 0.034f, -0.442f)
                curveToRelative(0.1f, -2.12f, -0.699f, -4.197f, -2.191f, -5.697f)
                curveToRelative(-1.416f, -1.423f, -3.298f, -2.206f, -5.3f, -2.206f)
                reflectiveCurveToRelative(-3.885f, 0.783f, -5.301f, 2.207f)
                curveToRelative(-1.418f, 1.425f, -2.199f, 3.329f, -2.199f, 5.36f)
                curveToRelative(0.0f, 2.241f, 1.278f, 4.133f, 2.701f, 6.033f)
                lineToRelative(3.971f, 4.962f)
                close()
                moveTo(13.622f, 15.038f)
                lineToRelative(3.671f, 3.67f)
                curveToRelative(0.378f, 0.377f, 1.036f, 0.377f, 1.414f, 0.0f)
                lineToRelative(3.67f, -3.67f)
                curveToRelative(-0.122f, -0.023f, -0.248f, -0.038f, -0.377f, -0.038f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.129f, 0.0f, -0.255f, 0.015f, -0.378f, 0.038f)
                close()
                moveTo(23.885f, 16.358f)
                lineToRelative(-3.764f, 3.764f)
                curveToRelative(-0.585f, 0.585f, -1.353f, 0.877f, -2.121f, 0.877f)
                reflectiveCurveToRelative(-1.536f, -0.292f, -2.121f, -0.877f)
                lineToRelative(-3.764f, -3.764f)
                curveToRelative(-0.069f, 0.202f, -0.115f, 0.416f, -0.115f, 0.641f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.226f, -0.046f, -0.439f, -0.115f, -0.642f)
                close()
                moveTo(10.5f, 15.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.019f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(12.0f, 10.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _postalAddress!!
    }

private var _postalAddress: ImageVector? = null
