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

public val Icons.Bold.SmokingBan: ImageVector
    get() {
        if (_smokingBan != null) {
            return _smokingBan!!
        }
        _smokingBan = Builder(name = "SmokingBan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 1.941f, -0.624f, 3.735f, -1.672f, 5.207f)
                lineToRelative(-2.207f, -2.207f)
                horizontalLineToRelative(0.879f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.879f)
                lineToRelative(-6.328f, -6.328f)
                curveToRelative(1.472f, -1.049f, 3.266f, -1.672f, 5.207f, -1.672f)
                curveToRelative(4.962f, 0.0f, 9.0f, 4.037f, 9.0f, 9.0f)
                close()
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, -1.941f, 0.624f, -3.735f, 1.672f, -5.207f)
                lineToRelative(12.534f, 12.534f)
                curveToRelative(-1.472f, 1.049f, -3.266f, 1.672f, -5.207f, 1.672f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.546f, 0.0f, 0.99f, 0.438f, 1.0f, 0.981f)
                curveToRelative(0.031f, 0.061f, 0.187f, 0.207f, 0.498f, 0.307f)
                lineToRelative(1.616f, 0.52f)
                curveToRelative(1.163f, 0.373f, 1.886f, 1.214f, 1.886f, 2.192f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(-0.017f, -0.028f, -0.172f, -0.184f, -0.498f, -0.288f)
                lineToRelative(-1.616f, -0.52f)
                curveToRelative(-1.163f, -0.373f, -1.886f, -1.214f, -1.886f, -2.192f)
                close()
                moveTo(6.05f, 11.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(-4.051f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.0f, 1.05f, -1.0f, 1.05f, -1.0f)
                close()
            }
        }
        .build()
        return _smokingBan!!
    }

private var _smokingBan: ImageVector? = null
