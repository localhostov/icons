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

public val Icons.Filled.VideoDuration: ImageVector
    get() {
        if (_videoDuration != null) {
            return _videoDuration!!
        }
        _videoDuration = Builder(name = "VideoDuration", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(19.079f, 20.441f)
                lineToRelative(-2.079f, -2.019f)
                verticalLineToRelative(-3.423f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.577f)
                lineToRelative(1.472f, 1.43f)
                lineToRelative(-1.393f, 1.435f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -4.418f, 3.582f, -8.0f, 8.0f, -8.0f)
                curveToRelative(1.893f, 0.0f, 3.63f, 0.661f, 5.0f, 1.76f)
                lineTo(23.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(10.069f)
                curveToRelative(-0.041f, -0.328f, -0.069f, -0.661f, -0.069f, -1.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineToRelative(7.0f, 3.889f)
                lineToRelative(-7.0f, 3.889f)
                verticalLineToRelative(-7.778f)
                close()
            }
        }
        .build()
        return _videoDuration!!
    }

private var _videoDuration: ImageVector? = null
