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

public val Icons.Outline.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) {
            return _fileCloud!!
        }
        _fileCloud = Builder(name = "FileCloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.949f, 5.535f)
                lineToRelative(-3.484f, -3.484f)
                curveToRelative(-1.322f, -1.322f, -3.08f, -2.051f, -4.95f, -2.051f)
                lineTo(7.0f, -0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(22.0f, 10.485f)
                curveToRelative(0.0f, -1.87f, -0.729f, -3.628f, -2.051f, -4.95f)
                close()
                moveTo(18.535f, 6.949f)
                curveToRelative(0.315f, 0.315f, 0.564f, 0.675f, 0.781f, 1.051f)
                horizontalLineToRelative(-4.316f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(14.0f, 2.684f)
                curveToRelative(0.376f, 0.217f, 0.736f, 0.466f, 1.051f, 0.781f)
                lineToRelative(3.484f, 3.484f)
                close()
                moveTo(20.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(7.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.165f, 0.0f, 0.323f, 0.032f, 0.485f, 0.047f)
                lineTo(12.0f, 7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.953f)
                curveToRelative(0.016f, 0.162f, 0.047f, 0.32f, 0.047f, 0.485f)
                verticalLineToRelative(8.515f)
                close()
                moveTo(15.213f, 13.533f)
                curveToRelative(-0.587f, -1.508f, -2.035f, -2.533f, -3.713f, -2.533f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 0.069f, 0.002f, 0.138f, 0.006f, 0.206f)
                curveToRelative(-0.885f, 0.386f, -1.506f, 1.269f, -1.506f, 2.294f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6.25f)
                curveToRelative(1.792f, 0.0f, 3.25f, -1.458f, 3.25f, -3.25f)
                curveToRelative(0.0f, -1.635f, -1.214f, -2.991f, -2.787f, -3.217f)
                close()
                moveTo(14.75f, 18.0f)
                horizontalLineToRelative(-6.25f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.224f, -0.5f, 0.565f, -0.508f)
                curveToRelative(0.345f, 0.039f, 0.688f, -0.097f, 0.906f, -0.368f)
                curveToRelative(0.217f, -0.272f, 0.277f, -0.638f, 0.158f, -0.965f)
                curveToRelative(-0.089f, -0.247f, -0.129f, -0.45f, -0.129f, -0.659f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.984f, 0.0f, 1.81f, 0.709f, 1.965f, 1.687f)
                curveToRelative(0.085f, 0.539f, 0.624f, 0.904f, 1.174f, 0.827f)
                curveToRelative(0.724f, -0.1f, 1.361f, 0.51f, 1.361f, 1.236f)
                curveToRelative(0.0f, 0.689f, -0.561f, 1.25f, -1.25f, 1.25f)
                close()
            }
        }
        .build()
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
