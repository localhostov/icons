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

public val Icons.Filled.DownLeft: ImageVector
    get() {
        if (_downLeft != null) {
            return _downLeft!!
        }
        _downLeft = Builder(name = "DownLeft", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.97f, 23.0f)
                horizontalLineTo(4.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.8f, 0.0f, -1.55f, -0.31f, -2.12f, -0.88f)
                curveToRelative(-0.57f, -0.57f, -0.88f, -1.32f, -0.88f, -2.13f)
                verticalLineTo(6.03f)
                reflectiveCurveToRelative(4.97f, 4.92f, 4.97f, 4.92f)
                lineTo(16.16f, 0.76f)
                lineToRelative(7.07f, 7.07f)
                lineToRelative(-10.19f, 10.19f)
                lineToRelative(4.94f, 4.98f)
                close()
            }
        }
        .build()
        return _downLeft!!
    }

private var _downLeft: ImageVector? = null
