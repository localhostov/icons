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

public val Icons.Filled.IdCardClipAlt: ImageVector
    get() {
        if (_idCardClipAlt != null) {
            return _idCardClipAlt!!
        }
        _idCardClipAlt = Builder(name = "IdCardClipAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(2.001f)
                lineTo(13.001f, 3.0f)
                curveToRelative(-0.001f, -0.552f, -0.45f, -1.0f, -1.001f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(9.5f, 12.5f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                close()
                moveTo(16.968f, 19.751f)
                curveToRelative(-0.559f, -2.174f, -2.648f, -3.751f, -4.968f, -3.751f)
                reflectiveCurveToRelative(-4.41f, 1.577f, -4.968f, 3.751f)
                curveToRelative(-0.138f, 0.535f, 0.184f, 1.08f, 0.719f, 1.218f)
                curveToRelative(0.537f, 0.139f, 1.08f, -0.186f, 1.217f, -0.72f)
                curveToRelative(0.33f, -1.282f, 1.633f, -2.249f, 3.032f, -2.249f)
                reflectiveCurveToRelative(2.702f, 0.967f, 3.032f, 2.249f)
                curveToRelative(0.116f, 0.451f, 0.522f, 0.751f, 0.968f, 0.751f)
                curveToRelative(0.082f, 0.0f, 0.166f, -0.01f, 0.25f, -0.031f)
                curveToRelative(0.535f, -0.138f, 0.857f, -0.683f, 0.719f, -1.218f)
                close()
            }
        }
        .build()
        return _idCardClipAlt!!
    }

private var _idCardClipAlt: ImageVector? = null
