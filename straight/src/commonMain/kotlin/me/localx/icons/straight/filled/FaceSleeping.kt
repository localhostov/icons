package me.localx.icons.straight.filled

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

public val Icons.Filled.FaceSleeping: ImageVector
    get() {
        if (_faceSleeping != null) {
            return _faceSleeping!!
        }
        _faceSleeping = Builder(name = "FaceSleeping", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.914f)
                lineToRelative(2.086f, -2.086f)
                horizontalLineToRelative(-2.086f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(5.0f)
                lineTo(24.0f, 1.914f)
                lineToRelative(-2.086f, 2.086f)
                horizontalLineToRelative(2.086f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(23.303f, 8.0f)
                curveToRelative(0.444f, 1.253f, 0.697f, 2.595f, 0.697f, 4.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                curveToRelative(1.787f, 0.0f, 3.476f, 0.401f, 5.0f, 1.102f)
                verticalLineToRelative(6.898f)
                horizontalLineToRelative(6.303f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.086f)
                lineToRelative(2.086f, -2.086f)
                verticalLineToRelative(-1.914f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.086f)
                lineToRelative(-2.086f, 2.086f)
                verticalLineToRelative(1.914f)
                close()
                moveTo(7.87f, 14.984f)
                curveToRelative(1.117f, 0.0f, 2.18f, -0.458f, 3.019f, -1.306f)
                lineToRelative(-1.422f, -1.406f)
                curveToRelative(-0.507f, 0.512f, -1.095f, 0.746f, -1.737f, 0.707f)
                curveToRelative(-0.557f, -0.037f, -1.127f, -0.295f, -1.526f, -0.69f)
                lineToRelative(-1.407f, 1.422f)
                curveToRelative(0.742f, 0.734f, 1.763f, 1.195f, 2.8f, 1.264f)
                curveToRelative(0.091f, 0.007f, 0.182f, 0.01f, 0.273f, 0.01f)
                close()
                moveTo(14.0f, 19.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
                moveTo(19.165f, 13.71f)
                lineToRelative(-1.406f, -1.422f)
                curveToRelative(-0.398f, 0.394f, -0.968f, 0.65f, -1.523f, 0.687f)
                curveToRelative(-0.647f, 0.05f, -1.228f, -0.194f, -1.733f, -0.707f)
                lineToRelative(-1.423f, 1.406f)
                curveToRelative(0.838f, 0.848f, 1.9f, 1.306f, 3.017f, 1.306f)
                curveToRelative(0.09f, 0.0f, 0.18f, -0.003f, 0.27f, -0.009f)
                curveToRelative(1.036f, -0.068f, 2.056f, -0.527f, 2.798f, -1.261f)
                close()
            }
        }
        .build()
        return _faceSleeping!!
    }

private var _faceSleeping: ImageVector? = null
