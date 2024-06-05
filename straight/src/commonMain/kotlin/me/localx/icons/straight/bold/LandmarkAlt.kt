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

public val Icons.Bold.LandmarkAlt: ImageVector
    get() {
        if (_landmarkAlt != null) {
            return _landmarkAlt!!
        }
        _landmarkAlt = Builder(name = "LandmarkAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(24.0f, 21.0f)
                close()
                moveTo(23.0f, 19.0f)
                lineTo(1.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                lineTo(1.0f, 11.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.354f, 8.0f)
                curveToRelative(0.95f, -3.282f, 3.723f, -5.798f, 7.146f, -6.374f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 1.626f)
                curveToRelative(3.423f, 0.577f, 6.196f, 3.092f, 7.146f, 6.374f)
                horizontalLineToRelative(2.354f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(6.546f, 8.0f)
                horizontalLineToRelative(10.907f)
                curveToRelative(-0.95f, -2.064f, -3.037f, -3.5f, -5.454f, -3.5f)
                reflectiveCurveToRelative(-4.504f, 1.436f, -5.454f, 3.5f)
                close()
                moveTo(6.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _landmarkAlt!!
    }

private var _landmarkAlt: ImageVector? = null
