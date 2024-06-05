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

public val Icons.Outline.BonusAlt: ImageVector
    get() {
        if (_bonusAlt != null) {
            return _bonusAlt!!
        }
        _bonusAlt = Builder(name = "BonusAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.769f, 6.309f)
                lineToRelative(-2.769f, -1.54f)
                verticalLineToRelative(-0.769f)
                horizontalLineToRelative(3.625f)
                lineToRelative(0.981f, -3.75f)
                horizontalLineToRelative(0.809f)
                lineToRelative(0.98f, 3.75f)
                horizontalLineToRelative(3.605f)
                verticalLineToRelative(0.764f)
                lineToRelative(-2.75f, 1.591f)
                lineToRelative(1.105f, 3.357f)
                lineToRelative(-0.625f, 0.436f)
                lineToRelative(-2.717f, -2.101f)
                lineToRelative(-2.729f, 2.11f)
                lineToRelative(-0.601f, -0.453f)
                lineToRelative(1.086f, -3.396f)
                close()
                moveTo(23.237f, 13.015f)
                lineToRelative(-9.788f, 10.985f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(9.858f)
                curveToRelative(1.139f, 0.0f, 2.138f, 0.609f, 2.689f, 1.519f)
                lineToRelative(3.216f, -3.534f)
                curveToRelative(0.542f, -0.595f, 1.282f, -0.943f, 2.086f, -0.981f)
                curveToRelative(0.804f, -0.034f, 1.574f, 0.24f, 2.168f, 0.782f)
                curveToRelative(1.213f, 1.105f, 1.312f, 3.003f, 0.219f, 4.229f)
                close()
                moveTo(21.671f, 10.264f)
                curveToRelative(-0.2f, -0.182f, -0.454f, -0.278f, -0.728f, -0.263f)
                curveToRelative(-0.27f, 0.013f, -0.519f, 0.13f, -0.7f, 0.329f)
                lineToRelative(-4.426f, 4.864f)
                curveToRelative(-0.385f, 1.071f, -1.339f, 1.891f, -2.515f, 2.059f)
                lineToRelative(-5.16f, 0.737f)
                lineToRelative(-0.283f, -1.98f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(0.56f, -0.079f, 0.981f, -0.565f, 0.981f, -1.13f)
                curveToRelative(0.0f, -0.63f, -0.512f, -1.143f, -1.142f, -1.143f)
                lineTo(3.0f, 13.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.552f)
                lineToRelative(9.191f, -10.315f)
                curveToRelative(0.367f, -0.412f, 0.334f, -1.05f, -0.073f, -1.421f)
                close()
            }
        }
        .build()
        return _bonusAlt!!
    }

private var _bonusAlt: ImageVector? = null
