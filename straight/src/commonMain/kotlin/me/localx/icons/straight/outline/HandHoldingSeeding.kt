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

public val Icons.Outline.HandHoldingSeeding: ImageVector
    get() {
        if (_handHoldingSeeding != null) {
            return _handHoldingSeeding!!
        }
        _handHoldingSeeding = Builder(name = "HandHoldingSeeding", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.047f, 17.197f)
                lineToRelative(-4.318f, 3.935f)
                curveToRelative(-2.031f, 1.85f, -4.662f, 2.868f, -7.408f, 2.868f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(11.32f)
                curveToRelative(2.247f, 0.0f, 4.399f, -0.833f, 6.061f, -2.347f)
                lineToRelative(4.284f, -3.902f)
                curveToRelative(0.347f, -0.348f, 0.43f, -0.944f, 0.156f, -1.324f)
                curveToRelative(-0.18f, -0.249f, -0.442f, -0.399f, -0.74f, -0.424f)
                curveToRelative(-0.291f, -0.019f, -0.58f, 0.082f, -0.788f, 0.29f)
                lineToRelative(-4.234f, 3.886f)
                curveToRelative(-0.538f, 0.508f, -1.262f, 0.821f, -2.059f, 0.821f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.273f, 0.0f, 0.521f, -0.11f, 0.701f, -0.288f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(0.023f, -0.022f)
                curveToRelative(0.171f, -0.18f, 0.277f, -0.422f, 0.277f, -0.69f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.188f)
                curveToRelative(-2.403f, 0.0f, -4.664f, 0.937f, -6.364f, 2.636f)
                lineToRelative(-1.017f, 1.018f)
                lineTo(0.018f, 17.239f)
                lineToRelative(1.017f, -1.018f)
                curveToRelative(2.078f, -2.077f, 4.841f, -3.222f, 7.778f, -3.222f)
                horizontalLineToRelative(8.188f)
                verticalLineToRelative(1.601f)
                lineToRelative(1.91f, -1.752f)
                curveToRelative(0.591f, -0.593f, 1.456f, -0.915f, 2.331f, -0.839f)
                curveToRelative(0.88f, 0.07f, 1.683f, 0.525f, 2.203f, 1.248f)
                curveToRelative(0.844f, 1.174f, 0.673f, 2.866f, -0.397f, 3.939f)
                close()
                moveTo(4.0f, 1.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(3.528f, 0.0f, 5.81f, 1.004f, 7.0f, 3.166f)
                curveToRelative(1.19f, -2.162f, 3.472f, -3.166f, 7.0f, -3.166f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, 5.187f, -2.169f, 7.68f, -7.0f, 7.971f)
                verticalLineToRelative(2.029f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.029f)
                curveToRelative(-4.831f, -0.291f, -7.0f, -2.784f, -7.0f, -7.971f)
                close()
                moveTo(13.032f, 6.968f)
                curveToRelative(3.319f, -0.223f, 4.713f, -1.616f, 4.936f, -4.936f)
                curveToRelative(-3.319f, 0.223f, -4.713f, 1.616f, -4.936f, 4.936f)
                close()
                moveTo(6.032f, 2.032f)
                curveToRelative(0.223f, 3.319f, 1.616f, 4.713f, 4.936f, 4.936f)
                curveToRelative(-0.223f, -3.319f, -1.616f, -4.713f, -4.936f, -4.936f)
                close()
            }
        }
        .build()
        return _handHoldingSeeding!!
    }

private var _handHoldingSeeding: ImageVector? = null
