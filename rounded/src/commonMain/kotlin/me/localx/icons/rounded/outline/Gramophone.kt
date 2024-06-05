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

public val Icons.Outline.Gramophone: ImageVector
    get() {
        if (_gramophone != null) {
            return _gramophone!!
        }
        _gramophone = Builder(name = "Gramophone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-2.776f)
                curveToRelative(-0.811f, -0.242f, -5.597f, -1.778f, -9.202f, -5.323f)
                curveTo(7.358f, 0.024f, 6.399f, -0.155f, 5.521f, 0.214f)
                curveToRelative(-0.924f, 0.387f, -1.521f, 1.276f, -1.521f, 2.264f)
                verticalLineToRelative(9.196f)
                curveToRelative(0.0f, 0.957f, 0.578f, 1.818f, 1.473f, 2.195f)
                curveToRelative(0.295f, 0.124f, 0.599f, 0.185f, 0.898f, 0.185f)
                curveToRelative(0.565f, 0.0f, 1.11f, -0.217f, 1.533f, -0.631f)
                curveToRelative(3.711f, -3.635f, 8.509f, -5.18f, 9.32f, -5.422f)
                horizontalLineToRelative(2.776f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 17.001f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(6.504f, 11.994f)
                curveToRelative(-0.029f, 0.028f, -0.099f, 0.097f, -0.256f, 0.032f)
                curveToRelative(-0.115f, -0.048f, -0.248f, -0.169f, -0.248f, -0.351f)
                lineTo(6.0f, 2.478f)
                curveToRelative(0.0f, -0.218f, 0.159f, -0.362f, 0.295f, -0.419f)
                curveToRelative(0.057f, -0.023f, 0.105f, -0.033f, 0.146f, -0.033f)
                curveToRelative(0.101f, 0.0f, 0.156f, 0.055f, 0.179f, 0.077f)
                curveToRelative(2.498f, 2.457f, 5.442f, 4.013f, 7.526f, 4.899f)
                curveToRelative(-2.096f, 0.896f, -5.073f, 2.476f, -7.641f, 4.992f)
                close()
                moveTo(4.0f, 21.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _gramophone!!
    }

private var _gramophone: ImageVector? = null
