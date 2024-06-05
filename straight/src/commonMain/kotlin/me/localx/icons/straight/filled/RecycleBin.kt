package me.localx.icons.straight.filled

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

public val Icons.Filled.RecycleBin: ImageVector
    get() {
        if (_recycleBin != null) {
            return _recycleBin!!
        }
        _recycleBin = Builder(name = "RecycleBin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.671f, 22.652f)
                curveToRelative(-0.466f, 0.844f, -1.32f, 1.348f, -2.284f, 1.348f)
                horizontalLineToRelative(-2.387f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.387f)
                curveToRelative(0.325f, 0.0f, 0.481f, -0.221f, 0.534f, -0.315f)
                curveToRelative(0.052f, -0.095f, 0.155f, -0.345f, -0.017f, -0.619f)
                lineToRelative(-1.147f, -1.826f)
                lineToRelative(1.693f, -1.064f)
                lineToRelative(1.147f, 1.826f)
                curveToRelative(0.513f, 0.816f, 0.541f, 1.808f, 0.074f, 2.651f)
                close()
                moveTo(20.855f, 15.633f)
                lineToRelative(-1.182f, -1.881f)
                curveToRelative(-0.481f, -0.767f, -1.306f, -1.223f, -2.21f, -1.223f)
                horizontalLineToRelative(-0.011f)
                curveToRelative(-0.909f, 0.004f, -1.735f, 0.468f, -2.212f, 1.241f)
                lineToRelative(-1.138f, 1.848f)
                lineToRelative(1.703f, 1.049f)
                lineToRelative(1.138f, -1.848f)
                curveToRelative(0.161f, -0.261f, 0.416f, -0.29f, 0.518f, -0.29f)
                curveToRelative(0.127f, 0.008f, 0.356f, 0.026f, 0.519f, 0.286f)
                lineToRelative(1.182f, 1.882f)
                lineToRelative(1.693f, -1.064f)
                close()
                moveTo(13.08f, 21.687f)
                curveToRelative(-0.053f, -0.094f, -0.157f, -0.343f, 0.013f, -0.618f)
                lineToRelative(1.139f, -1.848f)
                lineToRelative(-1.702f, -1.049f)
                lineToRelative(-1.139f, 1.848f)
                curveToRelative(-0.503f, 0.817f, -0.524f, 1.805f, -0.056f, 2.643f)
                curveToRelative(0.468f, 0.837f, 1.32f, 1.337f, 2.279f, 1.337f)
                horizontalLineToRelative(2.387f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.387f)
                curveToRelative(-0.323f, 0.0f, -0.48f, -0.219f, -0.533f, -0.312f)
                close()
                moveTo(9.588f, 23.638f)
                curveToRelative(0.071f, 0.127f, 0.153f, 0.243f, 0.234f, 0.361f)
                horizontalLineToRelative(-3.494f)
                curveToRelative(-1.531f, 0.0f, -2.813f, -1.147f, -2.982f, -2.669f)
                lineTo(1.644f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.682f)
                lineToRelative(-0.563f, 5.142f)
                curveToRelative(-0.688f, -0.393f, -1.477f, -0.611f, -2.31f, -0.611f)
                curveToRelative(-1.604f, 0.007f, -3.064f, 0.826f, -3.906f, 2.192f)
                lineToRelative(-3.852f, 6.25f)
                curveToRelative(-0.887f, 1.442f, -0.924f, 3.187f, -0.098f, 4.666f)
                close()
                moveTo(8.0f, 3.999f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _recycleBin!!
    }

private var _recycleBin: ImageVector? = null
