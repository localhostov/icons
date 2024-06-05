package me.localx.icons.straight.bold

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

public val Icons.Bold.Customize: ImageVector
    get() {
        if (_customize != null) {
            return _customize!!
        }
        _customize = Builder(name = "Customize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.304f, 15.64f)
                lineToRelative(1.838f, 1.061f)
                lineToRelative(-1.5f, 2.598f)
                lineToRelative(-1.839f, -1.062f)
                curveToRelative(-1.537f, 1.919f, -3.765f, 3.253f, -6.303f, 3.638f)
                verticalLineToRelative(2.125f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.125f)
                curveToRelative(-2.539f, -0.385f, -4.766f, -1.719f, -6.303f, -3.638f)
                lineToRelative(-1.839f, 1.062f)
                lineToRelative(-1.5f, -2.598f)
                lineToRelative(1.839f, -1.061f)
                curveToRelative(-0.444f, -1.13f, -0.696f, -2.355f, -0.696f, -3.64f)
                reflectiveCurveToRelative(0.252f, -2.51f, 0.696f, -3.64f)
                lineToRelative(-1.839f, -1.061f)
                lineToRelative(1.5f, -2.598f)
                lineToRelative(1.839f, 1.062f)
                curveToRelative(1.537f, -1.919f, 3.765f, -3.253f, 6.303f, -3.638f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.125f)
                curveToRelative(0.676f, 0.106f, 1.331f, 0.272f, 1.957f, 0.503f)
                lineToRelative(-2.452f, 2.452f)
                curveToRelative(-0.329f, -0.048f, -0.663f, -0.081f, -1.005f, -0.081f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                curveToRelative(0.0f, -0.342f, -0.033f, -0.676f, -0.081f, -1.005f)
                lineToRelative(2.452f, -2.452f)
                curveToRelative(0.4f, 1.079f, 0.629f, 2.241f, 0.629f, 3.457f)
                curveToRelative(0.0f, 1.285f, -0.252f, 2.51f, -0.696f, 3.64f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(3.086f)
                lineToRelative(7.75f, -7.75f)
                lineToRelative(-3.086f, -3.086f)
                lineToRelative(-7.75f, 7.75f)
                verticalLineToRelative(3.086f)
                close()
                moveTo(23.361f, 0.639f)
                curveToRelative(-0.852f, -0.852f, -2.234f, -0.852f, -3.086f, 0.0f)
                lineToRelative(-1.111f, 1.111f)
                lineToRelative(3.086f, 3.086f)
                lineToRelative(1.111f, -1.111f)
                curveToRelative(0.852f, -0.852f, 0.852f, -2.234f, 0.0f, -3.086f)
                close()
            }
        }
        .build()
        return _customize!!
    }

private var _customize: ImageVector? = null
