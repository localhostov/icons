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

public val Icons.Outline.MortarPestle: ImageVector
    get() {
        if (_mortarPestle != null) {
            return _mortarPestle!!
        }
        _mortarPestle = Builder(name = "MortarPestle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 9.0f)
                horizontalLineToRelative(-1.683f)
                lineToRelative(3.657f, -3.025f)
                curveToRelative(0.661f, -0.661f, 1.025f, -1.54f, 1.025f, -2.475f)
                reflectiveCurveToRelative(-0.364f, -1.814f, -1.025f, -2.475f)
                curveToRelative(-1.322f, -1.322f, -3.563f, -1.393f, -5.013f, 0.07f)
                lineToRelative(-6.53f, 7.904f)
                lineTo(3.0f, 8.999f)
                curveToRelative(-0.917f, 0.0f, -1.77f, 0.411f, -2.339f, 1.128f)
                curveToRelative(-0.58f, 0.73f, -0.791f, 1.674f, -0.578f, 2.59f)
                curveToRelative(0.629f, 2.708f, 2.462f, 5.296f, 5.029f, 7.1f)
                curveToRelative(0.403f, 0.233f, 0.888f, 0.853f, 0.888f, 1.182f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, -0.449f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.329f, 0.484f, -0.949f, 0.888f, -1.182f)
                curveToRelative(2.567f, -1.804f, 4.4f, -4.392f, 5.029f, -7.101f)
                curveToRelative(0.213f, -0.915f, 0.002f, -1.859f, -0.578f, -2.589f)
                curveToRelative(-0.569f, -0.717f, -1.422f, -1.128f, -2.339f, -1.128f)
                close()
                moveTo(19.439f, 2.439f)
                curveToRelative(0.584f, -0.585f, 1.537f, -0.584f, 2.121f, 0.0f)
                curveToRelative(0.283f, 0.283f, 0.439f, 0.66f, 0.439f, 1.06f)
                reflectiveCurveToRelative(-0.156f, 0.777f, -0.369f, 0.997f)
                lineToRelative(-5.451f, 4.503f)
                horizontalLineToRelative(-2.156f)
                lineToRelative(5.416f, -6.561f)
                close()
                moveTo(16.172f, 22.0f)
                lineTo(7.828f, 22.0f)
                curveToRelative(0.111f, -0.313f, 0.172f, -0.649f, 0.172f, -1.0f)
                curveToRelative(0.0f, -0.341f, -0.075f, -0.679f, -0.202f, -1.0f)
                horizontalLineToRelative(8.405f)
                curveToRelative(-0.128f, 0.321f, -0.202f, 0.659f, -0.202f, 1.0f)
                curveToRelative(0.0f, 0.351f, 0.061f, 0.687f, 0.172f, 1.0f)
                close()
                moveTo(21.97f, 12.265f)
                curveToRelative(-0.5f, 2.148f, -1.943f, 4.223f, -3.98f, 5.735f)
                lineTo(6.011f, 18.0f)
                curveToRelative(-2.037f, -1.512f, -3.48f, -3.587f, -3.98f, -5.734f)
                curveToRelative(-0.073f, -0.318f, -0.002f, -0.643f, 0.196f, -0.893f)
                curveToRelative(0.111f, -0.139f, 0.358f, -0.373f, 0.773f, -0.373f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.415f, 0.0f, 0.662f, 0.233f, 0.773f, 0.373f)
                curveToRelative(0.198f, 0.25f, 0.27f, 0.575f, 0.196f, 0.893f)
                close()
            }
        }
        .build()
        return _mortarPestle!!
    }

private var _mortarPestle: ImageVector? = null
