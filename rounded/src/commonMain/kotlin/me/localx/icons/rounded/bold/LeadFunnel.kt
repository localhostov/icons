package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.LeadFunnel: ImageVector
    get() {
        if (_leadFunnel != null) {
            return _leadFunnel!!
        }
        _leadFunnel = Builder(name = "LeadFunnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 2.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 2.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 8.5f)
                curveToRelative(0.005f, 0.026f, 0.0f, -0.076f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.685f, 16.267f)
                lineToRelative(-3.041f, -0.506f)
                curveToRelative(-0.373f, -0.062f, -0.644f, -0.382f, -0.644f, -0.761f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.268f)
                curveToRelative(0.356f, 0.0f, 0.688f, 0.191f, 0.867f, 0.501f)
                curveToRelative(0.277f, 0.479f, 0.89f, 0.644f, 1.366f, 0.364f)
                curveToRelative(0.479f, -0.276f, 0.642f, -0.888f, 0.365f, -1.366f)
                curveToRelative(-0.535f, -0.925f, -1.531f, -1.499f, -2.598f, -1.499f)
                horizontalLineToRelative(-0.268f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.359f, 0.974f, 2.51f, 2.315f, 2.733f)
                lineToRelative(3.041f, 0.506f)
                curveToRelative(0.373f, 0.062f, 0.644f, 0.382f, 0.644f, 0.761f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-0.356f, 0.0f, -0.688f, -0.191f, -0.867f, -0.501f)
                curveToRelative(-0.277f, -0.478f, -0.89f, -0.643f, -1.366f, -0.364f)
                curveToRelative(-0.479f, 0.276f, -0.642f, 0.888f, -0.365f, 1.366f)
                curveToRelative(0.535f, 0.925f, 1.531f, 1.499f, 2.598f, 1.499f)
                horizontalLineToRelative(0.268f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.359f, -0.974f, -2.51f, -2.315f, -2.733f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.572f, 15.534f)
                lineToRelative(-0.592f, 0.466f)
                horizontalLineToRelative(-1.961f)
                lineToRelative(-5.066f, -3.987f)
                curveToRelative(-0.605f, -0.477f, -0.953f, -1.192f, -0.953f, -1.964f)
                verticalLineToRelative(-0.058f)
                lineToRelative(15.499f, 0.009f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.499f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -2.0f, -1.67f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.393f, 0.0f, -2.585f, 0.82f, -3.149f, 1.997f)
                horizontalLineToRelative(-0.203f)
                curveToRelative(-0.564f, -1.178f, -1.756f, -1.997f, -3.149f, -1.997f)
                reflectiveCurveToRelative(-2.582f, 0.818f, -3.147f, 1.993f)
                horizontalLineToRelative(-0.207f)
                curveToRelative(-0.564f, -1.176f, -1.755f, -1.993f, -3.147f, -1.993f)
                curveToRelative(-1.826f, 0.0f, -3.5f, 1.5f, -3.5f, 3.49f)
                verticalLineToRelative(1.559f)
                curveToRelative(0.0f, 1.697f, 0.765f, 3.272f, 2.098f, 4.321f)
                lineToRelative(4.902f, 3.858f)
                verticalLineToRelative(2.332f)
                curveToRelative(0.0f, 0.727f, 0.411f, 1.391f, 1.06f, 1.716f)
                lineToRelative(3.19f, 1.595f)
                curveToRelative(0.804f, 0.402f, 1.749f, -0.183f, 1.749f, -1.081f)
                verticalLineToRelative(-4.561f)
                lineToRelative(0.428f, -0.337f)
                curveToRelative(0.651f, -0.513f, 0.763f, -1.455f, 0.251f, -2.106f)
                reflectiveCurveToRelative(-1.456f, -0.764f, -2.106f, -0.251f)
                close()
            }
        }
        .build()
        return _leadFunnel!!
    }

private var _leadFunnel: ImageVector? = null
