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

public val Icons.Bold.ArrowAltFromTop: ImageVector
    get() {
        if (_arrowAltFromTop != null) {
            return _arrowAltFromTop!!
        }
        _arrowAltFromTop = Builder(name = "ArrowAltFromTop", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 0.0f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-3.587f)
                curveToRelative(-0.811f, 0.0f, -1.218f, 0.994f, -0.644f, 1.575f)
                lineToRelative(5.087f, 5.154f)
                curveToRelative(0.356f, 0.36f, 0.932f, 0.36f, 1.288f, 0.0f)
                lineToRelative(5.087f, -5.154f)
                curveToRelative(0.574f, -0.581f, 0.167f, -1.575f, -0.644f, -1.575f)
                horizontalLineToRelative(-3.587f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _arrowAltFromTop!!
    }

private var _arrowAltFromTop: ImageVector? = null
