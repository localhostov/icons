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

public val Icons.Bold.PlugCircleBolt: ImageVector
    get() {
        if (_plugCircleBolt != null) {
            return _plugCircleBolt!!
        }
        _plugCircleBolt = Builder(name = "PlugCircleBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(20.731f, 19.493f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-1.911f, 3.076f, -1.911f, 3.076f)
                curveToRelative(-0.311f, 0.45f, -0.926f, 0.566f, -1.379f, 0.261f)
                curveToRelative(-0.462f, -0.311f, -0.58f, -0.941f, -0.262f, -1.398f)
                lineToRelative(1.471f, -2.429f)
                horizontalLineToRelative(-2.035f)
                curveToRelative(-0.509f, 0.0f, -0.994f, -0.244f, -1.297f, -0.652f)
                curveToRelative(-0.303f, -0.409f, -0.462f, -0.969f, -0.249f, -1.431f)
                curveToRelative(0.314f, -0.68f, 1.451f, -2.565f, 2.08f, -3.48f)
                curveToRelative(0.315f, -0.458f, 0.937f, -0.576f, 1.399f, -0.268f)
                curveToRelative(0.463f, 0.309f, 0.591f, 0.933f, 0.287f, 1.4f)
                lineToRelative(-1.469f, 2.431f)
                horizontalLineToRelative(2.029f)
                curveToRelative(0.592f, 0.0f, 1.133f, 0.324f, 1.413f, 0.846f)
                curveToRelative(0.28f, 0.522f, 0.25f, 1.151f, -0.077f, 1.645f)
                close()
                moveTo(4.0f, 8.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-4.151f)
                curveToRelative(-3.419f, -0.697f, -6.0f, -3.727f, -6.0f, -7.349f)
                verticalLineToRelative(-3.092f)
                curveToRelative(-0.581f, -0.207f, -1.0f, -0.756f, -1.0f, -1.408f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                lineTo(4.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.652f, -0.419f, 1.201f, -1.0f, 1.408f)
                verticalLineToRelative(1.592f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                lineTo(4.0f, 8.0f)
                close()
            }
        }
        .build()
        return _plugCircleBolt!!
    }

private var _plugCircleBolt: ImageVector? = null
