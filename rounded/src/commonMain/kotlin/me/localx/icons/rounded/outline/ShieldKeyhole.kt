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

public val Icons.Outline.ShieldKeyhole: ImageVector
    get() {
        if (_shieldKeyhole != null) {
            return _shieldKeyhole!!
        }
        _shieldKeyhole = Builder(name = "ShieldKeyhole", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.573f, 2.126f)
                lineTo(12.314f, 0.051f)
                curveToRelative(-0.203f, -0.068f, -0.426f, -0.068f, -0.629f, 0.0f)
                lineToRelative(-6.259f, 2.075f)
                curveToRelative(-2.05f, 0.68f, -3.427f, 2.587f, -3.427f, 4.746f)
                verticalLineToRelative(5.171f)
                curveToRelative(0.0f, 6.563f, 7.005f, 10.577f, 9.152f, 11.65f)
                curveToRelative(0.0f, 0.0f, 0.43f, 0.307f, 0.85f, 0.307f)
                reflectiveCurveToRelative(0.791f, -0.24f, 0.791f, -0.24f)
                curveToRelative(2.16f, -0.869f, 9.207f, -4.281f, 9.207f, -11.717f)
                verticalLineToRelative(-5.171f)
                curveToRelative(0.0f, -2.159f, -1.377f, -4.066f, -3.427f, -4.746f)
                close()
                moveTo(20.0f, 12.043f)
                curveToRelative(0.0f, 6.182f, -6.088f, 9.111f, -7.953f, 9.861f)
                curveToRelative(-1.889f, -0.944f, -8.047f, -4.444f, -8.047f, -9.861f)
                verticalLineToRelative(-5.171f)
                curveToRelative(0.0f, -1.295f, 0.826f, -2.439f, 2.056f, -2.848f)
                lineToRelative(5.944f, -1.971f)
                lineToRelative(5.944f, 1.971f)
                curveToRelative(1.229f, 0.408f, 2.056f, 1.553f, 2.056f, 2.848f)
                verticalLineToRelative(5.171f)
                close()
                moveTo(14.5f, 9.5f)
                curveToRelative(0.0f, 1.025f, -0.617f, 1.906f, -1.5f, 2.291f)
                verticalLineToRelative(3.209f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-3.209f)
                curveToRelative(-0.883f, -0.386f, -1.5f, -1.266f, -1.5f, -2.291f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _shieldKeyhole!!
    }

private var _shieldKeyhole: ImageVector? = null
