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

public val Icons.Filled.BenefitHand: ImageVector
    get() {
        if (_benefitHand != null) {
            return _benefitHand!!
        }
        _benefitHand = Builder(name = "BenefitHand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.341f, 12.345f)
                lineToRelative(-7.702f, 8.409f)
                curveToRelative(-1.894f, 2.068f, -4.57f, 3.246f, -7.374f, 3.246f)
                horizontalLineToRelative(-4.262f)
                curveTo(1.794f, 24.0f, 0.003f, 22.209f, 0.003f, 20.0f)
                verticalLineToRelative(-5.0f)
                curveTo(0.003f, 12.791f, 1.794f, 11.0f, 4.003f, 11.0f)
                horizontalLineToRelative(7.787f)
                curveToRelative(1.374f, 0.0f, 2.46f, 1.26f, 2.164f, 2.685f)
                curveToRelative(-0.193f, 0.926f, -1.004f, 1.598f, -1.94f, 1.732f)
                lineToRelative(-4.162f, 0.583f)
                curveToRelative(-0.547f, 0.078f, -0.927f, 0.585f, -0.848f, 1.131f)
                curveToRelative(0.078f, 0.547f, 0.585f, 0.926f, 1.131f, 0.848f)
                lineToRelative(4.252f, -0.596f)
                curveToRelative(2.062f, -0.294f, 3.617f, -2.087f, 3.617f, -4.17f)
                curveToRelative(0.0f, -0.219f, -0.032f, -0.429f, -0.065f, -0.638f)
                lineToRelative(3.541f, -3.737f)
                curveToRelative(0.455f, -0.5f, 1.097f, -0.803f, 1.794f, -0.835f)
                curveToRelative(0.692f, -0.034f, 1.363f, 0.209f, 1.878f, 0.678f)
                curveToRelative(1.052f, 0.958f, 1.138f, 2.602f, 0.189f, 3.665f)
                close()
                moveTo(3.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(11.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _benefitHand!!
    }

private var _benefitHand: ImageVector? = null
