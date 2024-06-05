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

public val Icons.Outline.HandHoldingDroplet: ImageVector
    get() {
        if (_handHoldingDroplet != null) {
            return _handHoldingDroplet!!
        }
        _handHoldingDroplet = Builder(name = "HandHoldingDroplet", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 10.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.743f, 4.0f, -3.885f)
                curveToRelative(0.0f, -2.245f, -2.765f, -4.929f, -3.319f, -5.443f)
                lineToRelative(-0.681f, -0.633f)
                lineToRelative(-0.681f, 0.633f)
                curveToRelative(-0.554f, 0.515f, -3.319f, 3.198f, -3.319f, 5.443f)
                curveToRelative(0.0f, 2.142f, 1.794f, 3.885f, 4.0f, 3.885f)
                close()
                moveTo(8.0f, 2.823f)
                curveToRelative(0.979f, 1.059f, 2.0f, 2.468f, 2.0f, 3.292f)
                curveToRelative(0.0f, 1.039f, -0.897f, 1.885f, -2.0f, 1.885f)
                reflectiveCurveToRelative(-2.0f, -0.846f, -2.0f, -1.885f)
                curveToRelative(0.0f, -0.824f, 1.021f, -2.233f, 2.0f, -3.292f)
                close()
                moveTo(23.017f, 8.785f)
                curveToRelative(-0.595f, -0.542f, -1.361f, -0.818f, -2.168f, -0.782f)
                curveToRelative(-0.804f, 0.038f, -1.544f, 0.387f, -2.086f, 0.981f)
                lineToRelative(-3.216f, 3.534f)
                curveToRelative(-0.551f, -0.909f, -1.55f, -1.519f, -2.689f, -1.519f)
                lineTo(3.0f, 10.999f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.448f)
                lineToRelative(9.788f, -10.985f)
                curveToRelative(1.093f, -1.227f, 0.994f, -3.124f, -0.219f, -4.229f)
                close()
                moveTo(21.743f, 11.684f)
                lineToRelative(-9.191f, 10.315f)
                lineTo(3.0f, 21.999f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(9.858f)
                curveToRelative(0.63f, 0.0f, 1.142f, 0.513f, 1.142f, 1.143f)
                curveToRelative(0.0f, 0.564f, -0.421f, 1.051f, -0.981f, 1.13f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.283f, 1.98f)
                lineToRelative(5.16f, -0.737f)
                curveToRelative(1.175f, -0.168f, 2.13f, -0.987f, 2.515f, -2.059f)
                lineToRelative(4.426f, -4.864f)
                curveToRelative(0.182f, -0.199f, 0.43f, -0.316f, 0.7f, -0.329f)
                curveToRelative(0.27f, -0.014f, 0.528f, 0.081f, 0.728f, 0.263f)
                curveToRelative(0.407f, 0.371f, 0.44f, 1.009f, 0.073f, 1.421f)
                close()
            }
        }
        .build()
        return _handHoldingDroplet!!
    }

private var _handHoldingDroplet: ImageVector? = null
