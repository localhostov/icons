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

public val Icons.Outline.BlockMicrophone: ImageVector
    get() {
        if (_blockMicrophone != null) {
            return _blockMicrophone!!
        }
        _blockMicrophone = Builder(name = "BlockMicrophone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                verticalLineToRelative(-4.0f)
                curveTo(4.0f, 3.589f, 7.589f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.91f)
                curveToRelative(-0.478f, -2.833f, -2.942f, -5.0f, -5.91f, -5.0f)
                reflectiveCurveToRelative(-5.431f, 2.167f, -5.91f, 5.0f)
                horizontalLineToRelative(3.91f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.907f)
                curveToRelative(0.234f, 1.376f, 0.931f, 2.594f, 1.933f, 3.483f)
                curveToRelative(-0.01f, 0.172f, -0.026f, 0.342f, -0.026f, 0.517f)
                curveToRelative(0.0f, 0.71f, 0.091f, 1.398f, 0.246f, 2.06f)
                curveToRelative(-2.524f, -1.347f, -4.246f, -4.005f, -4.246f, -7.06f)
                close()
                moveTo(9.429f, 21.854f)
                curveToRelative(-4.215f, -0.747f, -7.429f, -4.428f, -7.429f, -8.854f)
                lineTo(0.0f, 13.0f)
                curveToRelative(0.0f, 6.065f, 4.935f, 11.0f, 11.0f, 11.0f)
                horizontalLineToRelative(0.349f)
                curveToRelative(-0.75f, -0.606f, -1.397f, -1.332f, -1.92f, -2.146f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.86f, -3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(-1.017f, 0.0f, -1.962f, 0.309f, -2.753f, 0.833f)
                lineToRelative(6.919f, 6.92f)
                curveToRelative(0.524f, -0.791f, 0.833f, -1.736f, 0.833f, -2.753f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(1.017f, 0.0f, 1.962f, -0.309f, 2.753f, -0.833f)
                lineToRelative(-6.92f, -6.92f)
                curveToRelative(-0.524f, 0.791f, -0.833f, 1.736f, -0.833f, 2.753f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _blockMicrophone!!
    }

private var _blockMicrophone: ImageVector? = null
