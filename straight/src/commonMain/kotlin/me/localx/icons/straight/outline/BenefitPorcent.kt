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

public val Icons.Outline.BenefitPorcent: ImageVector
    get() {
        if (_benefitPorcent != null) {
            return _benefitPorcent!!
        }
        _benefitPorcent = Builder(name = "BenefitPorcent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 7.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(5.5f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(6.82f, 9.0f)
                lineTo(12.654f, 0.0f)
                horizontalLineToRelative(-2.474f)
                lineToRelative(-5.833f, 9.0f)
                horizontalLineToRelative(2.474f)
                close()
                moveTo(23.235f, 13.015f)
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
                moveTo(21.669f, 10.264f)
                curveToRelative(-0.199f, -0.182f, -0.459f, -0.267f, -0.728f, -0.262f)
                curveToRelative(-0.27f, 0.013f, -0.518f, 0.129f, -0.7f, 0.329f)
                lineToRelative(-4.426f, 4.864f)
                curveToRelative(-0.385f, 1.071f, -1.339f, 1.891f, -2.514f, 2.059f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(-0.283f, -1.979f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(0.559f, -0.08f, 0.981f, -0.566f, 0.981f, -1.131f)
                curveToRelative(0.0f, -0.63f, -0.512f, -1.142f, -1.142f, -1.142f)
                lineTo(3.0f, 13.002f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.552f)
                lineToRelative(9.191f, -10.316f)
                curveToRelative(0.367f, -0.412f, 0.334f, -1.049f, -0.073f, -1.421f)
                close()
            }
        }
        .build()
        return _benefitPorcent!!
    }

private var _benefitPorcent: ImageVector? = null
