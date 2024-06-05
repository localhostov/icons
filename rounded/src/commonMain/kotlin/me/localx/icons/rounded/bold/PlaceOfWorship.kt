package me.localx.icons.rounded.bold

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

public val Icons.Bold.PlaceOfWorship: ImageVector
    get() {
        if (_placeOfWorship != null) {
            return _placeOfWorship!!
        }
        _placeOfWorship = Builder(name = "PlaceOfWorship", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 15.595f)
                verticalLineToRelative(3.405f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-3.405f)
                curveToRelative(0.0f, -1.754f, 0.847f, -3.417f, 2.266f, -4.448f)
                curveToRelative(0.0f, 0.0f, 0.003f, -0.002f, 0.005f, -0.003f)
                lineToRelative(4.729f, -3.411f)
                verticalLineToRelative(-3.142f)
                curveToRelative(0.0f, -1.116f, 0.538f, -2.173f, 1.44f, -2.83f)
                lineToRelative(1.5f, -1.091f)
                curveToRelative(1.232f, -0.895f, 2.887f, -0.895f, 4.117f, 0.0f)
                lineToRelative(1.502f, 1.092f)
                curveToRelative(0.902f, 0.657f, 1.44f, 1.714f, 1.44f, 2.83f)
                verticalLineToRelative(3.142f)
                lineToRelative(4.729f, 3.411f)
                curveToRelative(1.424f, 1.035f, 2.271f, 2.697f, 2.271f, 4.452f)
                close()
                moveTo(5.0f, 12.874f)
                lineToRelative(-0.972f, 0.701f)
                curveToRelative(-0.644f, 0.469f, -1.028f, 1.224f, -1.028f, 2.021f)
                verticalLineToRelative(3.405f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                verticalLineToRelative(-8.127f)
                close()
                moveTo(16.0f, 10.71f)
                lineToRelative(-1.377f, -0.993f)
                curveToRelative(-0.392f, -0.282f, -0.623f, -0.735f, -0.623f, -1.217f)
                verticalLineToRelative(-3.909f)
                curveToRelative(0.0f, -0.159f, -0.077f, -0.311f, -0.206f, -0.404f)
                lineToRelative(-1.5f, -1.091f)
                curveToRelative(-0.174f, -0.127f, -0.412f, -0.128f, -0.59f, 0.0f)
                lineToRelative(-1.498f, 1.09f)
                curveToRelative(-0.129f, 0.094f, -0.206f, 0.245f, -0.206f, 0.404f)
                verticalLineToRelative(3.909f)
                curveToRelative(0.0f, 0.482f, -0.231f, 0.935f, -0.623f, 1.217f)
                lineToRelative(-1.377f, 0.993f)
                verticalLineToRelative(10.29f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-10.29f)
                close()
                moveTo(21.0f, 15.595f)
                curveToRelative(0.0f, -0.797f, -0.385f, -1.553f, -1.029f, -2.021f)
                lineToRelative(-0.971f, -0.7f)
                verticalLineToRelative(8.127f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-3.405f)
                close()
            }
        }
        .build()
        return _placeOfWorship!!
    }

private var _placeOfWorship: ImageVector? = null
