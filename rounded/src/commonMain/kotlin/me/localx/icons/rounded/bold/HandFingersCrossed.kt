package me.localx.icons.rounded.bold

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

public val Icons.Bold.HandFingersCrossed: ImageVector
    get() {
        if (_handFingersCrossed != null) {
            return _handFingersCrossed!!
        }
        _handFingersCrossed = Builder(name = "HandFingersCrossed", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.152f, 2.185f)
                curveToRelative(-0.377f, -0.737f, -0.085f, -1.641f, 0.652f, -2.019f)
                curveToRelative(0.743f, -0.38f, 1.642f, -0.086f, 2.019f, 0.652f)
                lineToRelative(1.049f, 2.072f)
                lineToRelative(-1.651f, 3.261f)
                lineToRelative(-2.069f, -3.966f)
                close()
                moveTo(11.818f, 9.465f)
                curveToRelative(0.051f, 0.051f, 0.087f, 0.111f, 0.134f, 0.164f)
                lineToRelative(3.883f, -7.443f)
                curveToRelative(0.377f, -0.737f, 0.085f, -1.641f, -0.652f, -2.019f)
                curveToRelative(-0.743f, -0.38f, -1.642f, -0.086f, -2.019f, 0.652f)
                lineToRelative(-3.799f, 7.501f)
                curveToRelative(0.925f, 0.093f, 1.787f, 0.479f, 2.453f, 1.145f)
                close()
                moveTo(15.001f, 9.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                close()
                moveTo(20.501f, 8.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.001f, 16.662f)
                verticalLineToRelative(0.838f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-3.23f)
                curveToRelative(-1.403f, 0.0f, -2.739f, -0.529f, -3.763f, -1.489f)
                lineToRelative(-1.92f, -1.8f)
                lineToRelative(3.764f, -3.906f)
                curveToRelative(0.797f, -0.797f, 0.797f, -2.089f, 0.0f, -2.886f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.797f, -0.797f, -2.089f, -0.797f, -2.886f, 0.0f)
                lineToRelative(-3.465f, 3.569f)
                lineToRelative(0.004f, 0.009f)
                curveToRelative(-0.646f, 0.658f, -1.004f, 1.525f, -1.004f, 2.449f)
                curveToRelative(0.0f, 0.935f, 0.364f, 1.814f, 1.06f, 2.508f)
                lineToRelative(2.395f, 2.246f)
                curveToRelative(1.581f, 1.484f, 3.646f, 2.301f, 5.815f, 2.301f)
                horizontalLineToRelative(3.23f)
                curveToRelative(3.584f, 0.0f, 6.5f, -2.916f, 6.5f, -6.5f)
                verticalLineToRelative(-0.838f)
                curveToRelative(-0.455f, 0.217f, -0.964f, 0.338f, -1.5f, 0.338f)
                reflectiveCurveToRelative(-1.045f, -0.122f, -1.5f, -0.338f)
                close()
            }
        }
        .build()
        return _handFingersCrossed!!
    }

private var _handFingersCrossed: ImageVector? = null
