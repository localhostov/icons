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

public val Icons.Bold.VideoDuration: ImageVector
    get() {
        if (_videoDuration != null) {
            return _videoDuration!!
        }
        _videoDuration = Builder(name = "VideoDuration", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.5f)
                verticalLineToRelative(9.221f)
                curveToRelative(-0.815f, -0.926f, -1.838f, -1.663f, -3.0f, -2.134f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(7.069f)
                curveToRelative(-0.041f, 0.328f, -0.069f, 0.661f, -0.069f, 1.0f)
                curveToRelative(0.0f, 0.692f, 0.097f, 1.36f, 0.262f, 2.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(9.0f, 6.222f)
                verticalLineToRelative(7.778f)
                lineToRelative(7.0f, -3.889f)
                lineToRelative(-7.0f, -3.889f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(21.207f, 19.793f)
                lineToRelative(-2.207f, -2.207f)
                verticalLineToRelative(-3.586f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.414f)
                lineToRelative(2.793f, 2.793f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _videoDuration!!
    }

private var _videoDuration: ImageVector? = null
