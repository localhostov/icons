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

public val Icons.Outline.ShieldXmark: ImageVector
    get() {
        if (_shieldXmark != null) {
            return _shieldXmark!!
        }
        _shieldXmark = Builder(name = "ShieldXmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.573f, 2.126f)
                lineTo(12.315f, 0.051f)
                curveToRelative(-0.205f, -0.068f, -0.425f, -0.068f, -0.63f, 0.0f)
                lineToRelative(-6.259f, 2.075f)
                curveToRelative(-2.049f, 0.68f, -3.426f, 2.587f, -3.426f, 4.746f)
                verticalLineToRelative(5.171f)
                curveToRelative(0.0f, 6.562f, 7.005f, 10.576f, 9.153f, 11.65f)
                curveToRelative(0.0f, 0.0f, 0.519f, 0.307f, 0.85f, 0.307f)
                reflectiveCurveToRelative(0.791f, -0.24f, 0.791f, -0.24f)
                curveToRelative(2.16f, -0.869f, 9.207f, -4.281f, 9.207f, -11.717f)
                verticalLineToRelative(-5.171f)
                curveToRelative(0.0f, -2.159f, -1.377f, -4.066f, -3.427f, -4.746f)
                close()
                moveTo(20.0f, 12.043f)
                curveToRelative(0.0f, 6.182f, -6.088f, 9.111f, -7.953f, 9.861f)
                curveToRelative(-1.888f, -0.944f, -8.047f, -4.445f, -8.047f, -9.861f)
                verticalLineToRelative(-5.171f)
                curveToRelative(0.0f, -1.295f, 0.826f, -2.439f, 2.056f, -2.848f)
                lineToRelative(5.944f, -1.971f)
                lineToRelative(5.944f, 1.971f)
                curveToRelative(1.229f, 0.408f, 2.056f, 1.553f, 2.056f, 2.848f)
                verticalLineToRelative(5.171f)
                close()
                moveTo(15.707f, 9.2f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(2.293f, 2.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(-2.293f, 2.293f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(-2.293f, -2.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(2.293f, -2.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _shieldXmark!!
    }

private var _shieldXmark: ImageVector? = null
