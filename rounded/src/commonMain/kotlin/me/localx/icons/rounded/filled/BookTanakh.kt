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

public val Icons.Filled.BookTanakh: ImageVector
    get() {
        if (_bookTanakh != null) {
            return _bookTanakh!!
        }
        _bookTanakh = Builder(name = "BookTanakh", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 4.973f)
                verticalLineToRelative(12.052f)
                curveToRelative(-0.699f, -0.527f, -1.525f, -0.86f, -2.395f, -0.964f)
                curveToRelative(-0.199f, -0.041f, -0.402f, -0.061f, -0.605f, -0.061f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 5.0f)
                curveTo(2.0f, 2.239f, 4.239f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(10.033f)
                curveToRelative(2.744f, 0.0f, 4.968f, 2.229f, 4.967f, 4.973f)
                close()
                moveTo(6.079f, 11.235f)
                curveToRelative(0.089f, 0.157f, 0.255f, 0.255f, 0.436f, 0.255f)
                horizontalLineToRelative(3.378f)
                lineToRelative(1.68f, 2.755f)
                curveToRelative(0.091f, 0.149f, 0.252f, 0.24f, 0.427f, 0.24f)
                reflectiveCurveToRelative(0.336f, -0.091f, 0.427f, -0.24f)
                lineToRelative(1.68f, -2.755f)
                horizontalLineToRelative(3.378f)
                curveToRelative(0.181f, 0.0f, 0.347f, -0.098f, 0.436f, -0.255f)
                curveToRelative(0.088f, -0.158f, 0.085f, -0.351f, -0.009f, -0.505f)
                lineToRelative(-1.67f, -2.742f)
                lineToRelative(1.669f, -2.738f)
                curveToRelative(0.094f, -0.154f, 0.098f, -0.348f, 0.009f, -0.505f)
                curveToRelative(-0.088f, -0.158f, -0.255f, -0.255f, -0.436f, -0.255f)
                horizontalLineToRelative(-3.373f)
                lineToRelative(-1.684f, -2.766f)
                curveToRelative(-0.182f, -0.298f, -0.673f, -0.298f, -0.854f, 0.0f)
                lineToRelative(-1.684f, 2.766f)
                horizontalLineToRelative(-3.373f)
                curveToRelative(-0.181f, 0.0f, -0.348f, 0.098f, -0.436f, 0.255f)
                curveToRelative(-0.088f, 0.157f, -0.085f, 0.351f, 0.009f, 0.505f)
                lineToRelative(1.669f, 2.738f)
                lineToRelative(-1.67f, 2.742f)
                curveToRelative(-0.094f, 0.154f, -0.097f, 0.348f, -0.009f, 0.505f)
                close()
                moveTo(12.0f, 13.024f)
                lineToRelative(-0.936f, -1.534f)
                horizontalLineToRelative(1.871f)
                lineToRelative(-0.936f, 1.534f)
                close()
                moveTo(10.455f, 10.49f)
                lineToRelative(-1.526f, -2.502f)
                lineToRelative(1.521f, -2.498f)
                horizontalLineToRelative(3.099f)
                lineToRelative(1.521f, 2.498f)
                lineToRelative(-1.526f, 2.502f)
                horizontalLineToRelative(-3.091f)
                close()
                moveTo(16.595f, 10.49f)
                horizontalLineToRelative(-1.878f)
                lineToRelative(0.94f, -1.541f)
                lineToRelative(0.939f, 1.541f)
                close()
                moveTo(16.595f, 5.49f)
                lineToRelative(-0.937f, 1.537f)
                lineToRelative(-0.936f, -1.537f)
                horizontalLineToRelative(1.873f)
                close()
                moveTo(12.001f, 2.946f)
                lineToRelative(0.94f, 1.544f)
                horizontalLineToRelative(-1.881f)
                lineToRelative(0.94f, -1.544f)
                close()
                moveTo(7.407f, 5.49f)
                horizontalLineToRelative(1.873f)
                lineToRelative(-0.936f, 1.537f)
                lineToRelative(-0.937f, -1.537f)
                close()
                moveTo(8.345f, 8.949f)
                lineToRelative(0.94f, 1.541f)
                horizontalLineToRelative(-1.878f)
                lineToRelative(0.939f, -1.541f)
                close()
            }
        }
        .build()
        return _bookTanakh!!
    }

private var _bookTanakh: ImageVector? = null
