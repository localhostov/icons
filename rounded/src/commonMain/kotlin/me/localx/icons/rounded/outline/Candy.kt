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

public val Icons.Outline.Candy: ImageVector
    get() {
        if (_candy != null) {
            return _candy!!
        }
        _candy = Builder(name = "Candy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.005f, 23.992f)
                curveToRelative(-2.021f, -0.1f, -3.872f, -2.077f, -4.74f, -3.761f)
                arcTo(3.049f, 3.049f, 0.0f, false, true, 3.413f, 16.0f)
                curveTo(0.841f, 9.025f, 9.03f, 0.845f, 16.0f, 3.413f)
                arcTo(3.049f, 3.049f, 0.0f, false, true, 20.231f, 0.265f)
                arcToRelative(7.972f, 7.972f, 0.0f, false, true, 3.488f, 3.5f)
                horizontalLineToRelative(0.0f)
                arcTo(3.046f, 3.046f, 0.0f, false, true, 20.587f, 8.0f)
                curveTo(23.158f, 14.973f, 14.971f, 23.158f, 8.0f, 20.587f)
                arcTo(3.076f, 3.076f, 0.0f, false, true, 5.005f, 23.992f)
                close()
                moveTo(3.005f, 17.992f)
                curveToRelative(-2.543f, 0.508f, 0.405f, 3.415f, 1.606f, 3.909f)
                arcTo(0.985f, 0.985f, 0.0f, false, false, 6.0f, 20.979f)
                curveToRelative(0.083f, -0.988f, -0.3f, -2.479f, 0.521f, -2.859f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.018f, 0.035f)
                curveTo(13.425f, 21.9f, 21.9f, 13.421f, 18.155f, 7.541f)
                arcTo(1.006f, 1.006f, 0.0f, false, true, 19.0f, 6.0f)
                horizontalLineToRelative(1.983f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, false, 0.926f, -1.392f)
                horizontalLineToRelative(0.0f)
                curveTo(21.415f, 3.41f, 18.5f, 0.462f, 18.0f, 3.005f)
                curveToRelative(-0.082f, 1.0f, 0.3f, 2.5f, -0.52f, 2.875f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, true, -1.018f, -0.035f)
                curveTo(13.879f, 4.2f, 10.114f, 4.891f, 7.5f, 7.5f)
                reflectiveCurveTo(4.2f, 13.881f, 5.845f, 16.458f)
                arcTo(1.007f, 1.007f, 0.0f, false, true, 5.0f, 18.0f)
                close()
                moveTo(14.643f, 15.482f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.288f, -1.528f)
                curveToRelative(-1.244f, 1.047f, -2.887f, 1.353f, -3.75f, 0.7f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 8.4f, 16.254f)
                curveTo(10.3f, 17.608f, 12.8f, 17.009f, 14.643f, 15.487f)
                close()
            }
        }
        .build()
        return _candy!!
    }

private var _candy: ImageVector? = null
