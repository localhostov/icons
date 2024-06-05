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

public val Icons.Outline.Brand: ImageVector
    get() {
        if (_brand != null) {
            return _brand!!
        }
        _brand = Builder(name = "Brand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.576f, 12.52f)
                lineTo(13.849f, 3.85f)
                curveToRelative(-0.842f, -0.835f, -2.046f, -1.243f, -3.221f, -1.09f)
                lineToRelative(-5.803f, 0.651f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(3.118f, 3.118f)
                lineToRelative(-0.696f, 6.088f)
                curveToRelative(-0.091f, 1.142f, 0.323f, 2.258f, 1.136f, 3.062f)
                lineToRelative(8.713f, 8.645f)
                curveToRelative(0.91f, 0.906f, 2.118f, 1.404f, 3.4f, 1.404f)
                horizontalLineToRelative(0.02f)
                curveToRelative(1.29f, -0.005f, 2.5f, -0.513f, 3.408f, -1.431f)
                lineToRelative(3.21f, -3.242f)
                curveToRelative(1.87f, -1.89f, 1.859f, -4.955f, -0.025f, -6.832f)
                close()
                moveTo(21.18f, 17.946f)
                lineToRelative(-3.21f, 3.242f)
                curveToRelative(-0.531f, 0.537f, -1.239f, 0.834f, -1.994f, 0.837f)
                horizontalLineToRelative(-0.011f)
                curveToRelative(-0.751f, 0.0f, -1.458f, -0.292f, -1.992f, -0.823f)
                lineTo(5.259f, 12.555f)
                curveToRelative(-0.394f, -0.39f, -0.594f, -0.93f, -0.554f, -1.449f)
                lineToRelative(0.512f, -4.474f)
                lineToRelative(1.857f, 1.857f)
                curveToRelative(-0.044f, 0.164f, -0.074f, 0.334f, -0.074f, 0.512f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.178f, 0.0f, -0.347f, 0.031f, -0.512f, 0.074f)
                lineToRelative(-1.854f, -1.854f)
                lineToRelative(4.226f, -0.474f)
                lineToRelative(0.021f, -0.003f)
                curveToRelative(0.568f, -0.075f, 1.151f, 0.122f, 1.559f, 0.525f)
                lineToRelative(8.726f, 8.668f)
                curveToRelative(1.105f, 1.102f, 1.112f, 2.899f, 0.015f, 4.009f)
                close()
                moveTo(17.206f, 12.795f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(3.0f, -3.0f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-2.5f, -2.5f)
                close()
                moveTo(15.999f, 17.588f)
                lineToRelative(-1.086f, -1.086f)
                lineToRelative(1.586f, -1.586f)
                lineToRelative(1.086f, 1.086f)
                lineToRelative(-1.586f, 1.586f)
                close()
            }
        }
        .build()
        return _brand!!
    }

private var _brand: ImageVector? = null
