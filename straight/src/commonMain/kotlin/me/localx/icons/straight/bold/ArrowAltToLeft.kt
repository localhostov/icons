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

public val Icons.Bold.ArrowAltToLeft: ImageVector
    get() {
        if (_arrowAltToLeft != null) {
            return _arrowAltToLeft!!
        }
        _arrowAltToLeft = Builder(name = "ArrowAltToLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.5f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(4.5f)
                lineTo(3.445f, 12.983f)
                curveToRelative(-0.297f, -0.262f, -0.445f, -0.623f, -0.445f, -0.983f)
                reflectiveCurveToRelative(0.148f, -0.721f, 0.445f, -0.983f)
                lineToRelative(5.555f, -5.017f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(0.0f, 3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _arrowAltToLeft!!
    }

private var _arrowAltToLeft: ImageVector? = null
