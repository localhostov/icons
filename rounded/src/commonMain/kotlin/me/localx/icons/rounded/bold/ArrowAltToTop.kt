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

public val Icons.Bold.ArrowAltToTop: ImageVector
    get() {
        if (_arrowAltToTop != null) {
            return _arrowAltToTop!!
        }
        _arrowAltToTop = Builder(name = "ArrowAltToTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 0.0f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.247f)
                curveToRelative(-0.143f, 0.042f, -0.278f, 0.12f, -0.391f, 0.234f)
                lineToRelative(-5.087f, 5.191f)
                curveToRelative(-0.574f, 0.581f, -0.167f, 1.575f, 0.644f, 1.575f)
                horizontalLineToRelative(3.587f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(3.587f)
                curveToRelative(0.811f, 0.0f, 1.218f, -0.994f, 0.644f, -1.575f)
                lineTo(12.644f, 3.234f)
                curveToRelative(-0.113f, -0.114f, -0.248f, -0.192f, -0.391f, -0.234f)
                horizontalLineToRelative(7.247f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _arrowAltToTop!!
    }

private var _arrowAltToTop: ImageVector? = null
