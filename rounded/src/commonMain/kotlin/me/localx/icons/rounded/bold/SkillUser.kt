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

public val Icons.Bold.SkillUser: ImageVector
    get() {
        if (_skillUser != null) {
            return _skillUser!!
        }
        _skillUser = Builder(name = "SkillUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.5f, 12.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                reflectiveCurveTo(10.532f, 1.0f, 7.5f, 1.0f)
                reflectiveCurveTo(2.0f, 3.467f, 2.0f, 6.5f)
                reflectiveCurveToRelative(2.468f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(7.5f, 4.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(15.0f, 21.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.136f, 3.364f, -7.5f, 7.5f, -7.5f)
                reflectiveCurveToRelative(7.5f, 3.364f, 7.5f, 7.5f)
                close()
                moveTo(21.999f, 0.0f)
                lineToRelative(-5.999f, 0.002f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.901f, -2.0f, 2.001f)
                verticalLineToRelative(7.352f)
                curveToRelative(0.002f, 1.069f, 1.206f, 1.695f, 2.081f, 1.081f)
                lineToRelative(2.047f, -1.436f)
                horizontalLineToRelative(3.872f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                lineTo(24.0f, 2.0f)
                curveTo(24.0f, 0.895f, 23.104f, 0.0f, 21.999f, 0.0f)
                close()
                moveTo(21.983f, 4.24f)
                lineToRelative(-2.084f, 2.147f)
                curveToRelative(-0.796f, 0.823f, -2.118f, 0.817f, -2.905f, -0.015f)
                lineToRelative(-0.769f, -0.813f)
                curveToRelative(-0.367f, -0.388f, -0.364f, -0.995f, 0.006f, -1.379f)
                curveToRelative(0.395f, -0.411f, 1.054f, -0.408f, 1.445f, 0.006f)
                lineToRelative(0.777f, 0.821f)
                lineToRelative(2.092f, -2.156f)
                curveToRelative(0.391f, -0.405f, 1.04f, -0.407f, 1.433f, -0.004f)
                curveToRelative(0.378f, 0.387f, 0.38f, 1.004f, 0.004f, 1.394f)
                close()
            }
        }
        .build()
        return _skillUser!!
    }

private var _skillUser: ImageVector? = null
