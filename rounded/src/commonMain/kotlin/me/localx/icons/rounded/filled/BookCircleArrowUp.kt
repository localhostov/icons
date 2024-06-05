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

public val Icons.Filled.BookCircleArrowUp: ImageVector
    get() {
        if (_bookCircleArrowUp != null) {
            return _bookCircleArrowUp!!
        }
        _bookCircleArrowUp = Builder(name = "BookCircleArrowUp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.252f, 16.0f)
                horizontalLineToRelative(-4.252f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                verticalLineToRelative(5.252f)
                curveToRelative(-0.639f, -0.164f, -1.309f, -0.252f, -2.0f, -0.252f)
                curveToRelative(-3.728f, 0.0f, -6.86f, 2.55f, -7.748f, 6.0f)
                close()
                moveTo(2.395f, 16.061f)
                curveToRelative(-0.87f, 0.104f, -1.696f, 0.437f, -2.395f, 0.964f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.624f, 1.672f, 0.575f, 4.0f, 0.1f)
                verticalLineToRelative(15.9f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.203f, 0.0f, -0.406f, 0.02f, -0.605f, 0.061f)
                close()
                moveTo(12.709f, 24.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.39f, 1.048f, 4.534f, 2.709f, 6.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, 2.686f, 6.0f, 6.0f, 6.0f)
                curveToRelative(3.314f, 0.0f, 6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.686f, -6.0f, 6.0f)
                close()
                moveTo(19.242f, 15.002f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.168f, 0.168f, 0.257f, 0.393f, 0.257f, 0.621f)
                curveToRelative(0.0f, 0.113f, -0.021f, 0.227f, -0.067f, 0.336f)
                curveToRelative(-0.136f, 0.328f, -0.456f, 0.541f, -0.812f, 0.541f)
                horizontalLineToRelative(-1.121f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.121f)
                curveToRelative(-0.355f, 0.0f, -0.676f, -0.213f, -0.812f, -0.541f)
                curveToRelative(-0.138f, -0.329f, -0.062f, -0.706f, 0.19f, -0.957f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.685f, -0.685f, 1.8f, -0.685f, 2.485f, 0.0f)
                close()
            }
        }
        .build()
        return _bookCircleArrowUp!!
    }

private var _bookCircleArrowUp: ImageVector? = null
