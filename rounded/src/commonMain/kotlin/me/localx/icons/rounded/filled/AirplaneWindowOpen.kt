package me.localx.icons.rounded.filled

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

public val Icons.Filled.AirplaneWindowOpen: ImageVector
    get() {
        if (_airplaneWindowOpen != null) {
            return _airplaneWindowOpen!!
        }
        _airplaneWindowOpen = Builder(name = "AirplaneWindowOpen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.525f, 6.0f)
                curveTo(4.765f, 2.51f, 8.091f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(7.235f, 2.51f, 8.475f, 6.0f)
                lineTo(3.525f, 6.0f)
                close()
                moveTo(16.077f, 15.117f)
                curveToRelative(-0.583f, -0.243f, -1.012f, -0.747f, -1.143f, -1.35f)
                curveToRelative(-0.23f, -1.058f, -1.137f, -1.768f, -2.186f, -1.768f)
                curveToRelative(-0.121f, 0.0f, -0.244f, 0.01f, -0.368f, 0.029f)
                curveToRelative(-0.593f, 0.093f, -1.157f, 0.485f, -1.509f, 1.051f)
                curveToRelative(-0.325f, 0.521f, -0.432f, 1.007f, -0.337f, 1.527f)
                curveToRelative(0.141f, 0.77f, -0.277f, 1.514f, -1.017f, 1.808f)
                curveToRelative(-0.3f, 0.119f, -0.585f, 0.459f, -0.501f, 0.922f)
                curveToRelative(0.068f, 0.378f, 0.453f, 0.663f, 0.895f, 0.663f)
                horizontalLineToRelative(5.005f)
                curveToRelative(1.144f, 0.0f, 1.934f, -0.472f, 2.062f, -1.232f)
                curveToRelative(0.118f, -0.701f, -0.252f, -1.38f, -0.9f, -1.65f)
                close()
                moveTo(20.941f, 8.0f)
                curveToRelative(0.037f, 0.329f, 0.059f, 0.662f, 0.059f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 19.963f, 3.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.338f, 0.022f, -0.671f, 0.059f, -1.0f)
                lineTo(20.941f, 8.0f)
                close()
                moveTo(16.875f, 13.283f)
                curveToRelative(-0.502f, -2.161f, -2.604f, -3.569f, -4.805f, -3.23f)
                curveToRelative(-1.159f, 0.182f, -2.242f, 0.918f, -2.896f, 1.97f)
                curveToRelative(-0.531f, 0.85f, -0.749f, 1.739f, -0.651f, 2.649f)
                curveToRelative(-1.102f, 0.566f, -1.703f, 1.771f, -1.476f, 3.021f)
                curveToRelative(0.242f, 1.337f, 1.446f, 2.307f, 2.863f, 2.307f)
                horizontalLineToRelative(5.005f)
                curveToRelative(2.154f, 0.0f, 3.738f, -1.139f, 4.034f, -2.9f)
                curveToRelative(0.271f, -1.613f, -0.581f, -3.178f, -2.075f, -3.816f)
                close()
            }
        }
        .build()
        return _airplaneWindowOpen!!
    }

private var _airplaneWindowOpen: ImageVector? = null
