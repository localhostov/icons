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
                moveToRelative(19.259f, 2.412f)
                lineTo(12.0f, 0.005f)
                lineToRelative(-7.259f, 2.407f)
                curveToRelative(-1.64f, 0.544f, -2.741f, 2.069f, -2.741f, 3.797f)
                verticalLineToRelative(5.755f)
                curveToRelative(0.0f, 6.567f, 7.006f, 10.577f, 9.15f, 11.648f)
                lineToRelative(0.806f, 0.404f)
                lineToRelative(0.838f, -0.336f)
                curveToRelative(2.159f, -0.87f, 9.206f, -4.285f, 9.206f, -11.717f)
                verticalLineToRelative(-5.755f)
                curveToRelative(0.0f, -1.728f, -1.102f, -3.253f, -2.741f, -3.797f)
                close()
                moveTo(20.0f, 11.964f)
                curveToRelative(0.0f, 6.178f, -6.086f, 9.109f, -7.952f, 9.861f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.888f, -0.944f, -8.047f, -4.441f, -8.047f, -9.861f)
                verticalLineToRelative(-5.755f)
                curveToRelative(0.0f, -0.863f, 0.551f, -1.627f, 1.37f, -1.898f)
                lineToRelative(6.63f, -2.198f)
                lineToRelative(6.63f, 2.198f)
                curveToRelative(0.819f, 0.271f, 1.37f, 1.035f, 1.37f, 1.898f)
                verticalLineToRelative(5.755f)
                close()
                moveTo(14.5f, 9.5f)
                curveToRelative(0.0f, 1.025f, -0.617f, 1.906f, -1.5f, 2.291f)
                verticalLineToRelative(4.209f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.209f)
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
