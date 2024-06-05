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

public val Icons.Outline.Onboarding: ImageVector
    get() {
        if (_onboarding != null) {
            return _onboarding!!
        }
        _onboarding = Builder(name = "Onboarding", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.018f, 8.785f)
                curveToRelative(-0.596f, -0.543f, -1.375f, -0.812f, -2.169f, -0.782f)
                curveToRelative(-0.804f, 0.038f, -1.544f, 0.387f, -2.085f, 0.981f)
                lineToRelative(-3.217f, 3.534f)
                curveToRelative(-0.551f, -0.909f, -1.551f, -1.519f, -2.689f, -1.519f)
                lineTo(3.0f, 10.999f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.448f)
                lineToRelative(9.787f, -10.984f)
                curveToRelative(1.094f, -1.227f, 0.996f, -3.124f, -0.218f, -4.23f)
                close()
                moveTo(21.743f, 11.684f)
                lineToRelative(-9.19f, 10.315f)
                lineTo(3.0f, 21.999f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(9.857f)
                curveToRelative(0.63f, 0.0f, 1.143f, 0.513f, 1.143f, 1.143f)
                curveToRelative(0.0f, 0.564f, -0.421f, 1.051f, -0.98f, 1.13f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.283f, 1.98f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(1.175f, -0.168f, 2.129f, -0.988f, 2.514f, -2.059f)
                lineToRelative(4.426f, -4.864f)
                curveToRelative(0.182f, -0.199f, 0.431f, -0.316f, 0.7f, -0.329f)
                curveToRelative(0.269f, -0.02f, 0.528f, 0.081f, 0.728f, 0.263f)
                curveToRelative(0.408f, 0.371f, 0.44f, 1.009f, 0.072f, 1.421f)
                close()
                moveTo(6.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                close()
            }
        }
        .build()
        return _onboarding!!
    }

private var _onboarding: ImageVector? = null
