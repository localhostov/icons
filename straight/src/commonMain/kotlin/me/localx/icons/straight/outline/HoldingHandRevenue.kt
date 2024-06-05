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

public val Icons.Outline.HoldingHandRevenue: ImageVector
    get() {
        if (_holdingHandRevenue != null) {
            return _holdingHandRevenue!!
        }
        _holdingHandRevenue = Builder(name = "HoldingHandRevenue", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.017f, 8.785f)
                curveToRelative(-0.595f, -0.542f, -1.36f, -0.828f, -2.168f, -0.782f)
                curveToRelative(-0.804f, 0.037f, -1.544f, 0.386f, -2.086f, 0.981f)
                lineToRelative(-3.216f, 3.534f)
                curveToRelative(-0.551f, -0.91f, -1.55f, -1.519f, -2.689f, -1.519f)
                lineTo(3.0f, 10.999f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.448f)
                lineToRelative(9.788f, -10.985f)
                curveToRelative(1.093f, -1.226f, 0.995f, -3.123f, -0.219f, -4.229f)
                close()
                moveTo(21.743f, 11.684f)
                lineToRelative(-9.191f, 10.316f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(9.858f)
                curveToRelative(0.63f, 0.0f, 1.142f, 0.512f, 1.142f, 1.142f)
                curveToRelative(0.0f, 0.564f, -0.422f, 1.051f, -0.981f, 1.131f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.283f, 1.979f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(1.175f, -0.168f, 2.129f, -0.988f, 2.514f, -2.059f)
                lineToRelative(4.426f, -4.864f)
                curveToRelative(0.182f, -0.2f, 0.43f, -0.316f, 0.7f, -0.329f)
                curveToRelative(0.268f, -0.004f, 0.529f, 0.081f, 0.728f, 0.262f)
                curveToRelative(0.408f, 0.372f, 0.44f, 1.009f, 0.073f, 1.421f)
                close()
                moveTo(8.998f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.002f, -9.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-0.002f, 9.0f)
                close()
                moveTo(12.998f, 9.0f)
                horizontalLineToRelative(-2.0f)
                reflectiveCurveToRelative(0.002f, -7.001f, 0.002f, -7.001f)
                horizontalLineToRelative(2.0f)
                reflectiveCurveToRelative(-0.002f, 7.001f, -0.002f, 7.001f)
                close()
                moveTo(4.998f, 9.0f)
                horizontalLineToRelative(-2.0f)
                reflectiveCurveToRelative(0.002f, -5.001f, 0.002f, -5.001f)
                horizontalLineToRelative(2.0f)
                reflectiveCurveToRelative(-0.002f, 5.001f, -0.002f, 5.001f)
                close()
            }
        }
        .build()
        return _holdingHandRevenue!!
    }

private var _holdingHandRevenue: ImageVector? = null
