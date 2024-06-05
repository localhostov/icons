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

public val Icons.Outline.BenefitDiamond: ImageVector
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
                moveTo(23.235f, 13.016f)
                lineToRelative(-9.787f, 10.984f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(9.857f)
                curveToRelative(1.139f, 0.0f, 2.139f, 0.609f, 2.689f, 1.519f)
                lineToRelative(3.217f, -3.534f)
                curveToRelative(0.54f, -0.595f, 1.281f, -0.944f, 2.085f, -0.981f)
                curveToRelative(0.812f, -0.039f, 1.574f, 0.24f, 2.169f, 0.782f)
                curveToRelative(1.214f, 1.107f, 1.312f, 3.005f, 0.218f, 4.23f)
                close()
                moveTo(21.67f, 10.264f)
                curveToRelative(-0.199f, -0.181f, -0.456f, -0.271f, -0.728f, -0.262f)
                curveToRelative(-0.27f, 0.013f, -0.519f, 0.129f, -0.699f, 0.329f)
                lineToRelative(-4.427f, 4.864f)
                curveToRelative(-0.385f, 1.07f, -1.339f, 1.891f, -2.514f, 2.059f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(-0.283f, -1.98f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(0.56f, -0.079f, 0.98f, -0.565f, 0.98f, -1.13f)
                curveToRelative(0.0f, -0.63f, -0.513f, -1.143f, -1.143f, -1.143f)
                lineTo(3.0f, 13.001f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.552f)
                lineToRelative(9.19f, -10.316f)
                curveToRelative(0.368f, -0.412f, 0.335f, -1.049f, -0.072f, -1.421f)
                close()
            }
        }
        .build()
        return _benefitDiamond!!
    }

private var _benefitDiamond: ImageVector? = null
