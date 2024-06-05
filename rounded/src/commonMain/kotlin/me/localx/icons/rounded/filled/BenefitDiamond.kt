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
                moveToRelative(13.581f, 0.8f)
                lineToRelative(1.558f, 2.077f)
                curveToRelative(0.492f, 0.656f, 0.462f, 1.565f, -0.071f, 2.188f)
                lineToRelative(-5.568f, 5.935f)
                lineToRelative(2.06f, -6.0f)
                horizontalLineToRelative(-4.121f)
                lineToRelative(2.06f, 6.0f)
                lineTo(3.934f, 5.065f)
                curveToRelative(-0.534f, -0.623f, -0.563f, -1.532f, -0.071f, -2.188f)
                lineToRelative(1.558f, -2.077f)
                curveToRelative(0.378f, -0.504f, 0.97f, -0.8f, 1.6f, -0.8f)
                horizontalLineToRelative(1.605f)
                lineToRelative(-1.126f, 3.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-1.126f, -3.0f)
                horizontalLineToRelative(1.606f)
                curveToRelative(0.63f, 0.0f, 1.222f, 0.296f, 1.6f, 0.8f)
                close()
                moveTo(23.149f, 8.681f)
                curveToRelative(-0.515f, -0.469f, -1.186f, -0.712f, -1.878f, -0.678f)
                curveToRelative(-0.697f, 0.032f, -1.339f, 0.334f, -1.794f, 0.835f)
                lineToRelative(-3.541f, 3.737f)
                curveToRelative(0.032f, 0.21f, 0.065f, 0.42f, 0.065f, 0.638f)
                curveToRelative(0.0f, 2.083f, -1.555f, 3.876f, -3.617f, 4.17f)
                lineToRelative(-4.252f, 0.596f)
                curveToRelative(-0.547f, 0.078f, -1.053f, -0.302f, -1.131f, -0.848f)
                curveToRelative(-0.078f, -0.547f, 0.302f, -1.053f, 0.848f, -1.131f)
                lineToRelative(4.162f, -0.583f)
                curveToRelative(0.936f, -0.134f, 1.748f, -0.806f, 1.94f, -1.732f)
                curveToRelative(0.296f, -1.425f, -0.79f, -2.685f, -2.164f, -2.685f)
                horizontalLineToRelative(-7.787f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(4.262f)
                curveToRelative(2.805f, 0.0f, 5.48f, -1.178f, 7.374f, -3.246f)
                lineToRelative(7.702f, -8.409f)
                curveToRelative(0.948f, -1.062f, 0.862f, -2.707f, -0.189f, -3.665f)
                close()
            }
        }
        .build()
        return _benefitDiamond!!
    }

private var _benefitDiamond: ImageVector? = null
