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

public val Icons.Outline.HandHoldingSkull: ImageVector
    get() {
        if (_handHoldingSkull != null) {
            return _handHoldingSkull!!
        }
        _handHoldingSkull = Builder(name = "HandHoldingSkull", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.018f, 8.785f)
                curveToRelative(-0.595f, -0.542f, -1.356f, -0.821f, -2.169f, -0.782f)
                curveToRelative(-0.804f, 0.037f, -1.545f, 0.386f, -2.085f, 0.981f)
                lineToRelative(-3.217f, 3.534f)
                curveToRelative(-0.551f, -0.91f, -1.551f, -1.519f, -2.689f, -1.519f)
                lineTo(3.0f, 10.999f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                lineTo(13.448f, 23.999f)
                lineToRelative(9.787f, -10.985f)
                curveToRelative(1.094f, -1.225f, 0.996f, -3.123f, -0.218f, -4.23f)
                close()
                moveTo(21.743f, 11.684f)
                lineToRelative(-9.19f, 10.316f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                lineTo(12.857f, 13.0f)
                curveToRelative(0.63f, 0.0f, 1.143f, 0.512f, 1.143f, 1.142f)
                curveToRelative(0.0f, 0.564f, -0.422f, 1.051f, -0.98f, 1.131f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.283f, 1.979f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(1.175f, -0.168f, 2.129f, -0.988f, 2.514f, -2.059f)
                lineToRelative(4.427f, -4.864f)
                curveToRelative(0.181f, -0.2f, 0.43f, -0.316f, 0.699f, -0.329f)
                curveToRelative(0.271f, -0.005f, 0.528f, 0.082f, 0.728f, 0.262f)
                curveToRelative(0.407f, 0.372f, 0.44f, 1.009f, 0.072f, 1.421f)
                close()
                moveTo(6.001f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.001f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(9.001f, 3.0f)
                close()
                moveTo(5.001f, 5.0f)
                lineTo(5.001f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _handHoldingSkull!!
    }

private var _handHoldingSkull: ImageVector? = null
