package me.localx.icons.rounded.outline

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

public val Icons.Outline.CallIncoming: ImageVector
    get() {
        if (_callIncoming != null) {
            return _callIncoming!!
        }
        _callIncoming = Builder(name = "CallIncoming", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.98f, 7.023f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(16.98f, 5.634f)
                curveTo(17.61f, 5.0f, 21.681f, 0.908f, 22.273f, 0.316f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 23.687f, 1.73f)
                curveToRelative(-0.592f, 0.592f, -4.642f, 4.665f, -5.268f, 5.293f)
                lineTo(20.98f, 7.023f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.98f, 7.023f)
                close()
                moveTo(23.075f, 16.762f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 0.0f, 4.378f)
                lineToRelative(-0.912f, 1.05f)
                curveToRelative(-8.191f, 7.838f, -28.119f, -12.084f, -20.4f, -20.3f)
                lineToRelative(1.15f, -1.0f)
                arcTo(3.081f, 3.081f, 0.0f, false, true, 7.24f, 0.929f)
                curveToRelative(0.031f, 0.03f, 1.883f, 2.438f, 1.883f, 2.438f)
                arcToRelative(3.109f, 3.109f, 0.0f, false, true, -0.006f, 4.282f)
                lineTo(7.959f, 9.105f)
                arcTo(12.784f, 12.784f, 0.0f, false, false, 14.89f, 16.05f)
                lineToRelative(1.465f, -1.165f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, true, 4.28f, -0.006f)
                reflectiveCurveTo(23.044f, 16.732f, 23.075f, 16.762f)
                close()
                moveTo(21.7f, 18.216f)
                reflectiveCurveToRelative(-2.393f, -1.842f, -2.424f, -1.872f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -1.549f, 0.0f)
                curveToRelative(-0.027f, 0.026f, -2.044f, 1.634f, -2.044f, 1.634f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.979f, 0.152f)
                arcTo(15.009f, 15.009f, 0.0f, false, true, 5.879f, 9.319f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.145f, -1.0f)
                reflectiveCurveTo(7.632f, 6.305f, 7.659f, 6.279f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, 0.0f, -1.549f)
                curveToRelative(-0.03f, -0.03f, -1.872f, -2.425f, -1.872f, -2.425f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -1.51f, 0.039f)
                lineToRelative(-1.15f, 1.0f)
                curveTo(-2.515f, 10.127f, 14.757f, 26.441f, 20.7f, 20.827f)
                lineToRelative(0.912f, -1.051f)
                arcTo(1.12f, 1.12f, 0.0f, false, false, 21.7f, 18.216f)
                close()
            }
        }
        .build()
        return _callIncoming!!
    }

private var _callIncoming: ImageVector? = null
