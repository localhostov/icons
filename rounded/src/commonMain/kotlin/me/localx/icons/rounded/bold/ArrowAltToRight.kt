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

public val Icons.Bold.ArrowAltToRight: ImageVector
    get() {
        if (_arrowAltToRight != null) {
            return _arrowAltToRight!!
        }
        _arrowAltToRight = Builder(name = "ArrowAltToRight", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(7.247f)
                curveToRelative(-0.042f, -0.143f, -0.12f, -0.278f, -0.234f, -0.391f)
                lineToRelative(-5.191f, -5.087f)
                curveToRelative(-0.581f, -0.574f, -1.575f, -0.167f, -1.575f, 0.644f)
                verticalLineToRelative(3.587f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(3.587f)
                curveToRelative(0.0f, 0.811f, 0.994f, 1.218f, 1.575f, 0.644f)
                lineToRelative(5.191f, -5.087f)
                curveToRelative(0.114f, -0.113f, 0.192f, -0.248f, 0.234f, -0.391f)
                verticalLineToRelative(7.247f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineTo(4.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _arrowAltToRight!!
    }

private var _arrowAltToRight: ImageVector? = null
