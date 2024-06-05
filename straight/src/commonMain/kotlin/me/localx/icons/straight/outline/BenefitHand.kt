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

public val Icons.Outline.BenefitHand: ImageVector
    get() {
        if (_benefitHand != null) {
            return _benefitHand!!
        }
        _benefitHand = Builder(name = "BenefitHand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(14.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(23.236f, 13.015f)
                lineToRelative(-9.788f, 10.985f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(9.858f)
                curveToRelative(1.139f, 0.0f, 2.138f, 0.609f, 2.689f, 1.519f)
                lineToRelative(3.216f, -3.534f)
                curveToRelative(0.542f, -0.595f, 1.282f, -0.944f, 2.086f, -0.981f)
                curveToRelative(0.808f, -0.042f, 1.574f, 0.24f, 2.168f, 0.782f)
                curveToRelative(1.214f, 1.107f, 1.312f, 3.004f, 0.219f, 4.229f)
                close()
                moveTo(21.67f, 10.264f)
                curveToRelative(-0.199f, -0.182f, -0.46f, -0.274f, -0.728f, -0.262f)
                curveToRelative(-0.27f, 0.013f, -0.518f, 0.129f, -0.7f, 0.329f)
                lineToRelative(-4.426f, 4.864f)
                curveToRelative(-0.385f, 1.071f, -1.339f, 1.891f, -2.515f, 2.059f)
                lineToRelative(-5.16f, 0.737f)
                lineToRelative(-0.283f, -1.98f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(0.56f, -0.079f, 0.981f, -0.565f, 0.981f, -1.13f)
                curveToRelative(0.0f, -0.63f, -0.512f, -1.143f, -1.142f, -1.143f)
                lineTo(3.0f, 13.001f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.552f)
                lineToRelative(9.191f, -10.316f)
                curveToRelative(0.367f, -0.412f, 0.334f, -1.049f, -0.073f, -1.421f)
                close()
            }
        }
        .build()
        return _benefitHand!!
    }

private var _benefitHand: ImageVector? = null
