package me.localx.icons.rounded.filled

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

public val Icons.Filled.LeadFunnel: ImageVector
    get() {
        if (_leadFunnel != null) {
            return _leadFunnel!!
        }
        _leadFunnel = Builder(name = "LeadFunnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 7.0f)
                horizontalLineTo(0.0f)
                curveToRelative(0.44f, -1.163f, 1.611f, -2.0f, 3.0f, -2.0f)
                reflectiveCurveToRelative(2.56f, 0.837f, 3.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 5.0f)
                curveToRelative(-1.389f, 0.0f, -2.56f, 0.837f, -3.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(-0.44f, -1.163f, -1.611f, -2.0f, -3.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 5.0f)
                curveToRelative(-1.389f, 0.0f, -2.56f, 0.837f, -3.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(-0.44f, -1.163f, -1.611f, -2.0f, -3.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
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
                moveToRelative(14.0f, 15.0f)
                curveToRelative(0.0f, -2.07f, 1.265f, -3.851f, 3.062f, -4.609f)
                curveToRelative(0.061f, -0.293f, 0.172f, -0.566f, 0.311f, -0.82f)
                curveToRelative(-0.366f, -0.352f, -0.86f, -0.57f, -1.408f, -0.57f)
                horizontalLineTo(2.035f)
                curveToRelative(-1.124f, 0.0f, -2.035f, 0.911f, -2.035f, 2.035f)
                curveToRelative(0.0f, 0.611f, 0.274f, 1.189f, 0.748f, 1.576f)
                lineToRelative(6.252f, 5.107f)
                verticalLineToRelative(3.467f)
                curveToRelative(0.0f, 0.576f, 0.286f, 1.114f, 0.763f, 1.436f)
                lineToRelative(1.809f, 1.221f)
                curveToRelative(0.608f, 0.41f, 1.428f, -0.025f, 1.428f, -0.759f)
                verticalLineToRelative(-5.365f)
                lineToRelative(3.02f, -2.467f)
                curveToRelative(-0.004f, -0.084f, -0.02f, -0.165f, -0.02f, -0.251f)
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
        }
        .build()
        return _leadFunnel!!
    }

private var _leadFunnel: ImageVector? = null
