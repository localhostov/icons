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

public val Icons.Filled.BookCircleArrowRight: ImageVector
    get() {
        if (_bookCircleArrowRight != null) {
            return _bookCircleArrowRight!!
        }
        _bookCircleArrowRight = Builder(name = "BookCircleArrowRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.395f, 16.061f)
                curveToRelative(-0.87f, 0.104f, -1.696f, 0.437f, -2.395f, 0.964f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.624f, 1.672f, 0.575f, 4.0f, 0.1f)
                verticalLineToRelative(15.9f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.203f, 0.0f, -0.406f, 0.02f, -0.605f, 0.061f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(0.691f, 0.0f, 1.361f, 0.088f, 2.0f, 0.252f)
                verticalLineToRelative(-5.252f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                lineTo(6.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(4.252f)
                curveToRelative(0.888f, -3.45f, 4.02f, -6.0f, 7.748f, -6.0f)
                close()
                moveTo(10.0f, 18.0f)
                lineTo(3.0f, 18.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(9.709f)
                curveToRelative(-1.661f, -1.466f, -2.709f, -3.61f, -2.709f, -6.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(20.998f, 16.758f)
                lineToRelative(-1.5f, -1.5f)
                curveToRelative(-0.251f, -0.252f, -0.629f, -0.329f, -0.957f, -0.19f)
                curveToRelative(-0.328f, 0.136f, -0.541f, 0.456f, -0.541f, 0.812f)
                verticalLineToRelative(1.121f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.121f)
                curveToRelative(0.0f, 0.355f, 0.213f, 0.676f, 0.541f, 0.812f)
                curveToRelative(0.109f, 0.045f, 0.223f, 0.067f, 0.336f, 0.067f)
                curveToRelative(0.229f, 0.0f, 0.453f, -0.089f, 0.621f, -0.257f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.685f, -0.685f, 0.685f, -1.8f, 0.0f, -2.485f)
                close()
            }
        }
        .build()
        return _bookCircleArrowRight!!
    }

private var _bookCircleArrowRight: ImageVector? = null
