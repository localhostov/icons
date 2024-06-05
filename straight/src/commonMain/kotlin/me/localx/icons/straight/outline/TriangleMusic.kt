package me.localx.icons.straight.outline

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

public val Icons.Outline.TriangleMusic: ImageVector
    get() {
        if (_triangleMusic != null) {
            return _triangleMusic!!
        }
        _triangleMusic = Builder(name = "TriangleMusic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.494f, 21.953f)
                curveToRelative(-0.713f, 1.281f, -2.014f, 2.047f, -3.48f, 2.047f)
                lineTo(3.986f, 24.0f)
                curveToRelative(-1.466f, 0.0f, -2.767f, -0.766f, -3.48f, -2.047f)
                curveToRelative(-0.712f, -1.281f, -0.676f, -2.791f, 0.098f, -4.036f)
                lineTo(8.704f, 4.881f)
                curveToRelative(0.551f, -0.887f, 1.359f, -1.493f, 2.296f, -1.747f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.135f)
                curveToRelative(0.94f, 0.255f, 1.746f, 0.86f, 2.296f, 1.745f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(0.54f, 0.869f)
                lineToRelative(-1.177f, 1.895f)
                lineToRelative(-1.061f, -1.708f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.378f, -0.608f, -0.933f, -0.933f, -1.604f, -0.936f)
                curveToRelative(-0.659f, 0.004f, -1.213f, 0.328f, -1.592f, 0.937f)
                lineTo(2.303f, 18.972f)
                curveToRelative(-0.385f, 0.62f, -0.403f, 1.371f, -0.049f, 2.01f)
                curveToRelative(0.355f, 0.638f, 1.002f, 1.019f, 1.732f, 1.019f)
                horizontalLineToRelative(16.027f)
                curveToRelative(0.73f, 0.0f, 1.377f, -0.381f, 1.732f, -1.019f)
                curveToRelative(0.354f, -0.639f, 0.336f, -1.39f, -0.049f, -2.01f)
                lineToRelative(-3.506f, -5.642f)
                lineToRelative(1.177f, -1.895f)
                lineToRelative(4.028f, 6.482f)
                curveToRelative(0.774f, 1.245f, 0.81f, 2.755f, 0.098f, 4.036f)
                close()
                moveTo(13.581f, 13.171f)
                lineToRelative(6.241f, -10.046f)
                lineToRelative(1.699f, 1.055f)
                lineToRelative(-6.293f, 10.13f)
                curveToRelative(0.483f, 0.6f, 0.772f, 1.362f, 0.772f, 2.19f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.377f, 0.0f, 0.74f, 0.06f, 1.081f, 0.171f)
                close()
                moveTo(14.0f, 16.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _triangleMusic!!
    }

private var _triangleMusic: ImageVector? = null
