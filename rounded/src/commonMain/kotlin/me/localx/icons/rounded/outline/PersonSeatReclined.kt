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

public val Icons.Outline.PersonSeatReclined: ImageVector
    get() {
        if (_personSeatReclined != null) {
            return _personSeatReclined!!
        }
        _personSeatReclined = Builder(name = "PersonSeatReclined", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-1.382f)
                lineToRelative(-2.671f, -5.342f)
                curveToRelative(-0.512f, -1.022f, -1.54f, -1.658f, -2.683f, -1.658f)
                horizontalLineToRelative(-5.703f)
                curveToRelative(-0.459f, 0.0f, -0.859f, -0.312f, -0.97f, -0.757f)
                lineToRelative(-0.561f, -2.243f)
                horizontalLineToRelative(5.969f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.469f)
                lineToRelative(-0.56f, -2.242f)
                curveToRelative(-0.134f, -0.537f, -0.677f, -0.86f, -1.213f, -0.728f)
                curveToRelative(-0.536f, 0.134f, -0.861f, 0.677f, -0.728f, 1.212f)
                lineToRelative(1.621f, 6.486f)
                curveToRelative(0.335f, 1.337f, 1.532f, 2.271f, 2.911f, 2.271f)
                horizontalLineToRelative(5.703f)
                curveToRelative(0.381f, 0.0f, 0.724f, 0.212f, 0.894f, 0.553f)
                lineToRelative(2.671f, 5.342f)
                curveToRelative(0.341f, 0.682f, 1.026f, 1.105f, 1.789f, 1.105f)
                horizontalLineToRelative(1.382f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(-4.354f)
                curveToRelative(-2.31f, 0.0f, -4.307f, -1.567f, -4.856f, -3.812f)
                lineToRelative(-1.819f, -7.427f)
                curveToRelative(-0.132f, -0.536f, -0.679f, -0.863f, -1.209f, -0.733f)
                curveToRelative(-0.537f, 0.132f, -0.865f, 0.673f, -0.733f, 1.21f)
                lineToRelative(1.819f, 7.426f)
                curveToRelative(0.769f, 3.142f, 3.565f, 5.336f, 6.799f, 5.336f)
                horizontalLineToRelative(4.354f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _personSeatReclined!!
    }

private var _personSeatReclined: ImageVector? = null
