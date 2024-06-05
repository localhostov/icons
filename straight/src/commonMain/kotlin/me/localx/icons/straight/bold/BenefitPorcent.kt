package me.localx.icons.straight.bold

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

public val Icons.Bold.BenefitPorcent: ImageVector
    get() {
        if (_benefitPorcent != null) {
            return _benefitPorcent!!
        }
        _benefitPorcent = Builder(name = "BenefitPorcent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.732f, 9.013f)
                curveToRelative(-0.767f, -0.698f, -1.761f, -1.058f, -2.796f, -1.008f)
                curveToRelative(-1.037f, 0.048f, -1.992f, 0.498f, -2.69f, 1.265f)
                lineToRelative(-2.438f, 2.68f)
                curveToRelative(-0.647f, -0.589f, -1.507f, -0.949f, -2.45f, -0.949f)
                lineTo(3.5f, 11.001f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11.181f)
                lineToRelative(8.333f, -9.532f)
                curveToRelative(1.411f, -1.581f, 1.284f, -4.028f, -0.282f, -5.455f)
                close()
                moveTo(20.765f, 12.482f)
                lineToRelative(-7.447f, 8.518f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.858f)
                curveToRelative(0.354f, 0.0f, 0.642f, 0.288f, 0.642f, 0.642f)
                curveToRelative(0.0f, 0.317f, -0.237f, 0.591f, -0.551f, 0.636f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.424f, 2.97f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(1.618f, -0.231f, 2.875f, -1.53f, 3.093f, -3.115f)
                lineToRelative(3.498f, -3.844f)
                curveToRelative(0.159f, -0.174f, 0.376f, -0.276f, 0.612f, -0.288f)
                curveToRelative(0.234f, -0.009f, 0.461f, 0.07f, 0.636f, 0.229f)
                curveToRelative(0.356f, 0.325f, 0.385f, 0.881f, 0.054f, 1.252f)
                close()
                moveTo(13.999f, 7.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(4.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(4.346f, 9.0f)
                lineTo(10.18f, 0.0f)
                horizontalLineToRelative(3.474f)
                lineToRelative(-5.833f, 9.0f)
                horizontalLineToRelative(-3.474f)
                close()
            }
        }
        .build()
        return _benefitPorcent!!
    }

private var _benefitPorcent: ImageVector? = null
