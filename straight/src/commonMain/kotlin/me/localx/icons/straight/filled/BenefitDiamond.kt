package me.localx.icons.straight.filled

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

public val Icons.Filled.BenefitDiamond: ImageVector
    get() {
        if (_benefitDiamond != null) {
            return _benefitDiamond!!
        }
        _benefitDiamond = Builder(name = "BenefitDiamond", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 4.0f)
                lineToRelative(-6.0f, 7.0f)
                lineToRelative(2.06f, -6.0f)
                horizontalLineToRelative(-4.121f)
                lineToRelative(2.06f, 6.0f)
                lineTo(3.5f, 4.0f)
                lineTo(6.5f, 0.0f)
                horizontalLineToRelative(2.126f)
                lineToRelative(-1.126f, 3.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-1.126f, -3.0f)
                horizontalLineToRelative(2.126f)
                lineToRelative(3.0f, 4.0f)
                close()
                moveTo(23.152f, 8.681f)
                curveToRelative(-0.515f, -0.469f, -1.186f, -0.712f, -1.878f, -0.678f)
                curveToRelative(-0.697f, 0.032f, -1.339f, 0.334f, -1.794f, 0.835f)
                lineToRelative(-3.541f, 3.737f)
                curveToRelative(0.032f, 0.21f, 0.065f, 0.42f, 0.065f, 0.638f)
                curveToRelative(0.0f, 2.083f, -1.555f, 3.876f, -3.617f, 4.17f)
                lineToRelative(-4.241f, 0.606f)
                lineToRelative(-0.283f, -1.979f)
                lineToRelative(4.241f, -0.606f)
                curveToRelative(1.084f, -0.155f, 1.9f, -1.097f, 1.9f, -2.191f)
                curveToRelative(0.0f, -1.22f, -0.993f, -2.213f, -2.213f, -2.213f)
                lineTo(3.003f, 11.0f)
                curveTo(1.349f, 11.0f, 0.003f, 12.346f, 0.003f, 14.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(9.664f)
                lineToRelative(10.674f, -11.655f)
                curveToRelative(0.948f, -1.062f, 0.862f, -2.707f, -0.189f, -3.665f)
                close()
            }
        }
        .build()
        return _benefitDiamond!!
    }

private var _benefitDiamond: ImageVector? = null
